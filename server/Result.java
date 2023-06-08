package com.quester.registryservice.entity;

import com.quester.registryservice.dataTransferObject.Student;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Entity
@Getter
@Setter
public class Result{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private Long StudentId;

    private Double average;
    private Integer position;
    private Integer formPosition;

    //each result has many scores
    @OneToMany(mappedBy = "result")
    private Set<SubjectResult> subjectResults;

    @ManyToOne
    @JoinColumn(name="formId")
    private Form form;

    @ManyToOne
    @JoinColumn(name="armId")
    private Arm arm;



    @ManyToMany
    @JoinTable(
            name= "result_Assessment",
            joinColumns = @JoinColumn(name="standardAssessment"),
            inverseJoinColumns = @JoinColumn(name="resultId"))
    private Set<Assessment> standardAssessment;
}
