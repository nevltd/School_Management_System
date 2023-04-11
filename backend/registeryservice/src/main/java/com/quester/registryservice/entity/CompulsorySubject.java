package com.quester.registryservice.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
public class CompulsorySubject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "compulsorySubject")
    private Set<Subject> subjects;
    @ManyToOne
    @JoinColumn(name = "formId")
    private Form form;
    @OneToOne
    @JoinColumn(name = "armId")
    private Arm arm;
}
