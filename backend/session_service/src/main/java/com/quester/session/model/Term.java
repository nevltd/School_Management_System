package com.quester.session.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
@Data
@RequiredArgsConstructor
@Component
@Scope(value = "prototype")
public class Term {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String term;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    @JoinColumn(name="sessionId", nullable = false)
    private Session session;

}
