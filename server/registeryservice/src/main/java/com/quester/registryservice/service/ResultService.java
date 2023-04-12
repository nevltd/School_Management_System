package com.quester.registryservice.service;

import com.quester.registryservice.entity.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class ResultService {
    @Autowired
    SubjectsOfferedService subjectsOfferedService;
    @Autowired
    SubjectResultService subjectResultService;
    @Autowired
    private ScoreService scoreService;
    public void initializeResult(Long studentId, TheSession theSession, Term term,List<Assessment>assessments) {
        Result result = new Result(studentId, theSession, term);
        SubjectsOffered subjectsOffered = subjectsOfferedService.getSubjectsOffered(studentId, theSession, term);
        List<SubjectResult> subjectResults = subjectResultService.initializeSubjectResult(subjectsOffered, result);
        for (SubjectResult subjectResult : subjectResults) {
            for (Assessment assessment : assessments) {
                Score score = new Score(assessment, subjectResult);
                scoreService.save(score);
            }

            subjectResultService.save(subjectresult);
        }
        resultService.save(result);
    }

     public void calculateAverage(Form form,Arm arm){
        int i,k;
        Long formId = form.getId();
        Long armId = arm.getId();
        Double maxScore =0.0;

        //get the standard assessment for the form and arm;
        List <Assessment> assessments = assessmentService.getAssessments(formId, armId);

        // calculate the maximum
        for(k=0; k< assessments.size(); k++){
            maxScore+= assessments.get(k).getMaxScore();
        }
        //get all the results for that form,arm and term
        List<Result>results = repository.findByFormIdAndArmIdAndTermId(formId,armId,termId);

        //loop through the results and get the subjects' results and total the scores
        for(i=0;i<results.size();i++) {
            Double totalScore = 0.00;
            Result result = results.get(i);
            Set<SubjectResult> initialSubjectResults = (List) result.getSubjectresults();
            int count = initialSubjectResults.toArray().length;
            int a;
            for (a = 0; a < subjectResults.size(); a++) {
                totalScore += subjectResults.get(a).getTotalScore();
            }
            Double average = (totalScore / maxScore * count) * 100.0;
            result.setAverage(average);
        }
    }

    public void setFormArmPosition(Form form,Arm arm,Term term){
        Long formId = form.getId();
        Long armId = arm.getId();
        Long termId = term.getId();
        List<Result>results=repository.findByFormIdAndArmIdAndTermId(formId,armId,termId);
        Collections.sort(results, Comparator.comparingDouble(Result::getAverage).reversed());
        int count;
        for(count=1;count<results.size();){
            if(results.get(count)==results.get(count+1)){
                results.get(count).setPosition(count);
                results.get(count+1).setPosition(count);
                count+=2;
            }
            else{
                results.get(count).setPosition(count);
                count+=1;
            }
        }
    }
    public void setFormPosition(Form form, Term term){
        Long formId = form.getId();
        Long termId = term.getId();
        List<Result>results = repository.findByFormIdAndTermId(formId,termId);
        Collections.sort(results,Comparator.comparingDouble(Result::getAverage).reversed());
        int count;
        for(count=1;count<results.size();){
            if(results.get(count)==results.get(count+1)){
                results.get(count).setFormPosition(count);
                results.get(count+1).setFormPosition(count);
                count+=2;
            }
            else{
                results.get(count).setFormPosition(count);
                count+=1;
            }
        }
    }
    public void  autoPromote(Form form,Arm arm,Term term){
        Long formId = form.getId();
        Long armId = arm.getId();
        Long termId = term.getId();

        List <Result> results = repository.findByFormIdAndArmIdAndTermId(formId,armId,termId);
        int resultCount;

        for (resultCount=0;resultCount<results.size();resultCount++){

            Boolean notBePromoted = false;
            Result result = results.get(resultCount);
            Student student = result.getStudent();
            Set <SubjectResult> initSubjectResults = result.getSubjectResults();
            List<SubjectResult> subjectResults = new ArrayList<>();
            subjectResults.addAll(initSubjectResults);
            int subjectResultCount;
            for(subjectResultCount = 0;subjectResultCount<subjectResults.size();subjectResultCount++){
                SubjectResult subjectResult = subjectResults.get(subjectResultCount);
                Long SubjectId = subjectResult.getSubject().getId();
                PromotionCriteria promotionCriteria = promotionRepository.findByFormdAndArmIdAndSubjectId(formId,armId,subjectId);
                if (promotionCriteria != null) {
                    if (subjectResult.getScores() < promotionCriteria.getScore) {
                        notBePromoted = true;
                    }
                }
            }
            if (!notBePromoted){
                promote(student);
            }
            else{
                notPromote(student);
            }

        }
    }
}
