package com.quester.registryservice.entity;

import javax.persistence.*;

public class Fee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private Double amount;

    @ManyToOne
    @JoinColumn(name = "termId")
    private Term term;

    @ManyToOne
    @JoinColumn(name = "formId")
    private Term form;

    @ManyToOne
    @JoinColumn(name = "sectionId")
    private Section section;
}
