package com.quester.registryservice.entity;

import com.quester.registryservice.dataTransferObject.SubjectsOffered;
import lombok.Getter;

import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Entity
@Getter
@Setter

public class TheSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer start;
    private Integer finish;
    private String current;
    @OneToMany(mappedBy = "theSession")
    private Set<Term> terms;



}
