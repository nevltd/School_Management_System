package com.quester.registryservice.service;

import com.quester.registryservice.entity.SchoolGroup;
import com.quester.registryservice.repository.SchoolGroupRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class SchoolGroupService {
    private final SchoolGroupRepository repository;


    public SchoolGroup registerSchoolGroup (String schoolGroupName){
        SchoolGroup schoolGroup  = new SchoolGroup(schoolGroupName);
        SchoolGroup savedSchoolGroup = repository.save(schoolGroup);
        return savedSchoolGroup;
    }


    public void changeSchoolGroupName(SchoolGroup schoolGroup,String name){
        //get schoolGroup from  repository
        schoolGroup.setName(name);
    }


    /*public Set SchoolGroup viewSchoolGroup (){
        //search schoolgroups and return
    }*/
}
