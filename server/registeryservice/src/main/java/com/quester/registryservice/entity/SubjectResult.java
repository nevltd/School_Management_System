package com.quester.registryservice.entity;

import com.quester.registryservice.entity.Subject;
import com.quester.registryservice.model.Result;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class SubjectResult{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "resultId")
    private Result result;

    @ManyToOne
    @JoinColumn(name="subjectId")
    private Subject subject;

    @OneToMany(mappedBy = "subjectResult")
    private Set<Score> scores;
    private Integer subjectPosition;
    private Integer totalScore;

    public SubjectResult(Subject subject, Result result) {
        this.subject =  subject;
        this.result = result;
    }
}
