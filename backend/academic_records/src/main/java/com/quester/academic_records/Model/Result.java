package com.quester.academic_records.Model;

import javax.persistence.*;
import java.util.Set;

public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    //each result has many scores
    @OneToMany(mappedBy = "result")
    private Set<Score> scores;
}
