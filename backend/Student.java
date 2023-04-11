package com.quester.registryservice.model;
import lombok.Getter;

import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.*;
@Entity
@Getter
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    @OneToMany(mappedBy = "student")
    Set<SubjectsOffered> subjectsOffered;
    @OneToMany(mappedBy = "student")
    private Set<Result> results;
    @ManyToOne
    private Form form;
    @ManyToOne
    @JoinColumn(name = "armId")
    private Arm arm;
    @ManyToMany
    @JoinColumn(name ="termId")
    private Set<Term>terms;
    @ManyToMany
    @JoinTable(name = "Student_Subject",
    joinColumns = @JoinColumn(name ="subjectId"),
    inverseJoinColumns =@JoinColumn(name= "studentId"))
    private Set<Subject> subjects;

}
