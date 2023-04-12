package com.quester.registryservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String notePath;


    private String[] textLearningResourcePath;

    private String[] useCaseVideoResourcePath;

    private String[] videoLearningResourcePath;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subject;


}
