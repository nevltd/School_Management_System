package com.quester.registryservice.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class SubjectService {
    @Autowired
    SectionService sectionService;

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
            boolean allSection  = updateSectionDto.getAllSections(;s
            Set<Subject> initialSubjects = updateSubjectSectionDto.getSubjects();
            Long sectionId = updateSubjectSectionDto.getSectionId();
            Section section = SectionService.findSection(sectionId)
            List <Subject> subjects = new ArrayList<>();
            subjects.addAll(initialSubjects);

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

    }*/

   /* public void changeSubjectName(Long subjectId String newSubjectName){}*/
    
}
