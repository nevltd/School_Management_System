package com.quester.session.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Arm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany(mappedBy = "arms")
    private Set <Form> forms;

}
