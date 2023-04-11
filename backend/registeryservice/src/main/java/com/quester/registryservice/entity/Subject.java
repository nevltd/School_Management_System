package com.quester.registryservice.entity;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Set;
@Entity
@Getter
@Setter
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "subject")
    Set<Topic> topics;
    @ManyToMany
    @JoinColumn(name ="assessmentId")
    private Set<Assessment> assessments;
    //M:N relationship with different assessment

    @ManyToOne
    @JoinColumn(name="compulsorySubjectId")
    private CompulsorySubject compulsorySubject;
    @ManyToMany
    @JoinTable(name = "subjects_forms",
            joinColumns = @JoinColumn(name ="formId"),
            inverseJoinColumns = @JoinColumn(name = "subjectId"))
    private Set<Form>forms;

}
