package com.quester.registryservice.entity;

import lombok.Getter;

import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "schoolId")
    private School school;

    @OneToMany(mappedBy = "section")
    private Set<Form> forms;


}
