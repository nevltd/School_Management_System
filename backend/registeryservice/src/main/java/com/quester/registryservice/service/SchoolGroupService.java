package com.quester.registryservice.service;

import com.quester.registryservice.entity.SchoolGroup;
import com.quester.registryservice.repository.SchoolGroupRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SchoolGroupService {
    private final SchoolGroupRepository repository;


    public SchoolGroup createSchoolGroup (String schoolGroupName){
        SchoolGroup schoolGroup  = new SchoolGroup(schoolGroupName);
        SchoolGroup savedSchoolGroup = repository.save(schoolGroup);
        return savedSchoolGroup;
    }

    /*public SchoolGroup registerSchoolGroup(String schoolGroupName){
        SchoolGroup schoolGroup = new SchoolGroup(schoolGroupName);
        return schoolGroup;
    }
    public void changeSchoolGroupName(SchoolGroup schoolGroup,String name){
        schoolGroup.setName(name);
    }*/
}
