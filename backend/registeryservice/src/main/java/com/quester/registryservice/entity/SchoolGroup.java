package com.quester.registryservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.internal.build.AllowPrintStacktrace;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class SchoolGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    @OneToMany(mappedBy = "schoolGroup")
    private Set<School> schools;

    public SchoolGroup(String schoolGroupName) {
        this.name = schoolGroupName;
    }
    public void setSchools(Collection<School> schools) {
        this.schools = (HashSet<School>) schools;
    }
}
