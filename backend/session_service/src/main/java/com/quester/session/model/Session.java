package com.quester.session.model;

import lombok.Data;
import com.quester.session.model.Term;
import lombok.RequiredArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
@Data
@RequiredArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer From;
    private Integer To;
    private Boolean current;
    @OneToMany(mappedBy = "session")
    private Set<Term> terms;
    private Integer termNumber;
}
