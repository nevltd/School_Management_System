package com.quester.registryservice.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class SubjectService {

    /*public void createSubject(createSubjectDto createSubjectDto) {
        Set<String> initialSubjects = createSubjectsDtO.getSubjects();
        List<String> subjects = new ArrayList<>();
        subjects.addAll(initialSubjects);
        int count;
        for (count = 0; count < subjects.size(); count++) {
            String subject = subjects.get(count);
            Subject newSubject = new Subject(subject);
            repository.save(newSubject);
        }
    }
    public void updateSubjectSection(UpdateSubjectSectionDto updateSubjectSectionDto){
            Set<Subject> initialSubjects = updateSubjectSectionDto.getSubjects();
            Section section = updateSubjectSectionDto.getSection();
            List <Subject> subjects = new ArrayList<>();
            subjects.addAll(initialSubjects);
            String sectionName = updateSubjectSectionDto.getSection().getName();
            int count;
            for(count=0;count<subjects.size();count++) {
                Subject subject = subjects.get(count);
                subject.setSection(section);
            }
        }
            //get the subject iterate through forms then arms in the section and add the subject


    public Subject getSubjectForTerm(Integer studentId, Integer termId) {
        subjectsOffered =
        return ret;
    }

    public void registerSubjects
            (Long studentId,Long sessionId, Long formId,Long armId, Set<String> subjects){
        Session session = sessionRepository.findById(sessionId);
        SubjectsOffered subjectOffered = new SubjectsOffered(session,formId,subjects);
        //create subjects offered

    }*/
}
