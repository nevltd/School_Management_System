package com.quester.registryservice.service;

//import com.quester.registryservice.entity.Score;
import org.springframework.stereotype.Service;

@Service
public class AssessementService {

/*
    public void combineAssessment(CombineAssessmentsDtO assessmentsDtO){
        int i;
        Long termId = asssessmentsDto.getTerm().getId();
        Long formId= assessmentsDtO.getForm.getId();
        Long armId = assessmentsDtO.getArm().getId();
        Long subjectId= assessmentsDtO.getSubject().getId();
        Long standardAssessmentId = assessmentsDtO.getStandardAssessment().getId();

        List<Assessment> assessmentsToBeMerged = assessmentDto.getAssessmentsToBeMerged();

        List<SubjectResult> subjectResults = subjectResultRepository
                .findBySubjectIdAndTermIdAndFormIdAndArmId(subjectId,termId,formId,armId);
        for(i=0;i<subjectResults.size();i++){
            Long subjectResultId = subjectResults.get(i).getId();
            int j;
            for(j=0;j<assessmentsToBeMerged.size();j++){
                Long assessmentTobeMergedId = assessmentsToBeMerged.get(j).getId();
                Score scoreToBeMerged = scoreRepository
                        .findBySubjectResultIdAndAssessmentToBeMerged
                                (subjectResultId,assessmentTobeMergedId);
                Score standardScore = scoreRepository.findBySubjectResultIdAndAssessmentId
                        (subjectResultId,standardAssessmentId);
                standardScore.setScore(scoreToBeMerged.getScore());
                scoreRepository.delete(scoreToBeMerged);

            }// delete assessments to be merged       }
        assessmentsToBeMerged.clear();
    }

    public void createStandardAssessment(AssessmentCreationDto assessmentCreationDto){
        assessmentCreationDto.setType("standard");
        assessmentCreationDto.save(assessmentCreationDto);
    }
    public void createTeacherAssessment(AssessmentCreationDto assessmentCreationDto){
        assessmentCreationDto.setType("teacher");
        assessmentCreationDto.save(assessmentCreationDto);
    }
    List <Assessment> getStandardAssessment(){
        List <Assessment> assessments = repository.find by form arm where type is standard;
    }
    List <Assessment> getTeacherAssessment(){
        List <Assessment> assessments = repository.find by form arm where type is standard;
    }*/


}
