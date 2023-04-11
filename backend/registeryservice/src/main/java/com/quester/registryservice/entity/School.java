package com.quester.registryservice.entity;

import lombok.Getter;

import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name="schoolGroupId")
    private SchoolGroup schoolGroup;

    @OneToMany(mappedBy = "school")
    private Set<Section> sections;

    /*public School(String schoolName, SchoolGroup schoolGroup){
        this.name = schoolName;
        this.schoolGroup = schoolGroup;
    }*/
}
