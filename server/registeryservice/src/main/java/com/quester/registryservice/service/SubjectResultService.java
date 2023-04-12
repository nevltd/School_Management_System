package com.quester.registryservice.service;

import com.quester.registryservice.entity.Subject;
import com.quester.registryservice.entity.SubjectsOffered;
import com.quester.registryservice.entity.Result;
import com.quester.registryservice.entity.SubjectResult;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SubjectResultService {
    public List<SubjectResult> initializeSubjectResult(SubjectsOffered subjectsOffered, Result result){
        Set<Subject> subjects = subjectsOffered.getSubjects();
        Iterator<Subject> iterator = subjects.iterator();
        while(iterator.hasNext()){
            new SubjectResult(iterator.next(),result)

        }
    }
}
