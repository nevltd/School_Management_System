package com.quester.registryservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import com.quester.registryservice.entity.Form;

@Entity
@Getter
@Setter
public class ExternalExamFee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String exam;

    private Double amount;

    @OneToOne
    @JoinColumn(name = "formId", referencedColumnName = "id")
    private Form form;
}
