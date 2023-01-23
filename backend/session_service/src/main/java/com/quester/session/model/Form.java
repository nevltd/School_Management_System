package com.quester.session.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String form;
    private String arm;

    @ManyToOne
    @JoinColumn(name = "sectionId")
    private Section section;

    @ManyToMany
    @JoinTable(
            name = "Class_Arm",
            joinColumns = { @JoinColumn(name = "armId") },
            inverseJoinColumns = { @JoinColumn(name = "FormId")})
    private Set<Arm> arms;

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
