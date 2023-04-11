package com.quester.registryservice.entity;

import com.quester.registryservice.entity.Assessment;
import com.quester.registryservice.model.SubjectResult;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Score{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer score;
    @ManyToOne
    @JoinColumn(name = "resultId",nullable = false)
    private SubjectResult subjectResult;
    @ManyToOne
    @JoinColumn(name = "assessmentId",nullable = false)
    private Assessment assessment;
}
