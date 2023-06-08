package com.quester.registryservice.entity;

import javax.persistence.*;
import java.util.Set;

public class LessonFee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private Double amount;

    @OneToMany(mappedBy = "lessonFee")
    private Set<Form> forms;

    @ManyToOne
    @JoinColumn(name = "term")
    private Term term;
}
