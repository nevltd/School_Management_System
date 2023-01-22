package com.quester.session.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Class{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String form;
    private String arm;

    @ManyToOne
    @JoinColumn(name = "sectionId")
    private Section section;

    @ManyToMany(mappedBy = "classes")
    Set<Arm> arms = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getArm() {
        return arm;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }

    public String getForm() {
        return form;
    }
    public void setForm(String aClass) {
        form= aClass;
    }

}
