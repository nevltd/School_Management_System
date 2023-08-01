package com.quester.registryservice.entity;

import com.quester.registryservice.dataTransferObject.SubjectsOffered;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Term {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String termType;
    private Date start;
    private Date finish;
    private String current;
    private Boolean receivedFirstPayment;
    @ManyToOne
    @JoinColumn(name="theSessionId",nullable = false)
    private TheSession theSession;
    @ManyToMany
    @JoinTable(
            name = "term_subject",
            joinColumns = @JoinColumn(name="subjectId"),
            inverseJoinColumns = @JoinColumn(name="termId"))
    private Set<Subject> subjects;


    public Term(String type, TheSession theSession,Integer count){
        this.termType = type;
        this.theSession = theSession;
    }
}
