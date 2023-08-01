package com.quester.registryservice.entity;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity
@Getter
@Setter
public class Arm{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String arm;
    @OneToOne(mappedBy="arm")
    private CompulsorySubject compulsorySubjects;
    @ManyToMany
    @JoinColumn(name = "electiveSubjectId")
    private Set <Subject> electiveSubjects;
    @ManyToMany
    @JoinColumn(name = "classId")
    private Set<Form> forms;
}
