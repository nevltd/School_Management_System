package com.quester.registryservice.service;


import com.quester.registryservice.entity.Arm;
import com.quester.registryservice.entity.Section;
import org.springframework.beans.factory.annotation.Autowired;
import com.quester.registryservice.repository.ArmRepository;

import java.util.Set;

public class ArmService {
    @Autowired
    public void registerArm (ArmRepository repositorySet, Section section,Set Arms arms){
        //get get forms from sectionid
        //use for loop to save each member of the set
    }
    @Autowired
    public void deleteArm (ArmRepository repository){
        //use for loop to delete arm
        //to be implemented as a chec box
    }
    @Autowired
    public void updateArm(ArmRepository repository) {
        //search for arm via id
        // if armDto not equal to arm implement changes

    }

    @Autowired
    public  viewSectionArms(ArmRepository repository){
        //use section id to search for arms in repository

    }
    @Autowired
    public Set Arm viewAllArms(ArmRepository repository){
       //use repository to return arms

    }


}

