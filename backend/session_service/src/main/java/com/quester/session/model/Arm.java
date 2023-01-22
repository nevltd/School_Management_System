package com.quester.session.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Arm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Form_Arm",
            joinColumns = { @JoinColumn(name = "arm_id") },
            inverseJoinColumns = { @JoinColumn(name = "form_id")})
            Set <Class> classes = new HashSet<>();

}
