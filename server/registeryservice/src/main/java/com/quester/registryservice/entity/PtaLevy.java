package com.quester.registryservice.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PtaLevy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private Double amount;
}
