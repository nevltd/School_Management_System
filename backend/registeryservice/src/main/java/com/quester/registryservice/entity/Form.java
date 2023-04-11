package com.quester.registryservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Form{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "form")
    private Set<CompulsorySubject> compulsorySubjects;
    @ManyToOne
    @JoinColumn(name = "sectionId")
    private Section section;
    @ManyToMany
    @JoinTable(name = "class_arm",
    joinColumns = @JoinColumn(name="armId"),
    inverseJoinColumns = @JoinColumn(name="classId"))
    private Set<Arm> arms;

    @OneToOne(mappedBy = "form")
    private ExternalExamFee charge;

    @ManyToOne
    @JoinColumn(name =  "lessonFee")
    private LessonFee lessonFee;
    /*public Form(Set<Arm> arms ,Section section,String formName){
        this.arms.addAll(arms);
        this.section = section;
        this.name = formName;

    }*/
}
