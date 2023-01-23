package com.quester.academic_records.Model;

import javax.persistence.*;
import java.util.Set;

public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "subject")
    private Set<Topic> topics;
    @ManyToMany
    @JoinTable(name = "student_subject",
    joinColumns = @JoinColumn(name ="studentId"),
    inverseJoinColumns = @JoinColumn(name = "subjectId"))
    private Set<Student> students;

    @ManyToMany
    @JoinTable(name = "subject_assessment",
            joinColumns = @JoinColumn(name ="assessmentId"),
            inverseJoinColumns = @JoinColumn(name = "subjectId"))
    private Set<Assessment> assessments;

}
