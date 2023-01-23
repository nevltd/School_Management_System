package com.quester.academic_records.Model;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.*;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;

    @OneToMany(mappedBy = "student")
    private Set<Result> results;
    @ManyToMany
    @JoinTable(name = "Student_Subject",
    joinColumns = @JoinColumn(name ="subjectId"),
    inverseJoinColumns =@JoinColumn(name= "studentId"))
    private Set<Subject> subjects;





}
