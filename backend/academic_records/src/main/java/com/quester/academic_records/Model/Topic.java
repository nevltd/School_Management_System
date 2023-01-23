package com.quester.academic_records.Model;

import javax.persistence.*;

public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @ManyToOne
    @JoinColumn(name = "subjectId",nullable = false)
    private Subject subject;
    private Integer termId;

}
