package com.quester.registryservice.entity;

import com.quester.registryservice.dataTransferObject.Student;

import javax.persistence.*;

public class Fine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private Double amount;

    private String status;

    private Student student;
}
