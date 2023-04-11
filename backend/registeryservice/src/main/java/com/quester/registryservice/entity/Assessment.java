package com.quester.registryservice.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;
@Entity
@Getter
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    @JoinTable(name = "assessment_subjects",
    joinColumns = @JoinColumn(name = "classId"),
    inverseJoinColumns = @JoinColumn(name = "assessment"))
    private Set<Subject> subjects;

    private Integer maxScore;
}
