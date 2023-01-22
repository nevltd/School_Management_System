package com.quester.session.model;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

public class Section {
    private String section;
    @OneToMany(mappedBy = "section")
    private Set<Class> classes;
}
