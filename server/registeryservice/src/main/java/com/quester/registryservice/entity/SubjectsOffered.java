package com.quester.registryservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Entity
@Getter
@Setter
public class SubjectsOffered {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long studentId;
    @ManyToOne
    @JoinColumn(name = "sessionId")
    private TheSession theSession;
    @ManyToOne
    @JoinColumn(name ="termId")
    private Term term;
    @ManyToMany
    @JoinTable(name = "subjects-subjectsOffered",
            joinColumns = @JoinColumn(name = "subjectId"),
            inverseJoinColumns = @JoinColumn(name = "subject offered"))
    private Set<Subject> subjects;

}
