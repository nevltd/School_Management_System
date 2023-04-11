package com.quester.registryservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class ExtraCharge{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double amount;

    @ManyToMany
    @JoinTable(name = "extraCharge_form",
            joinColumns = @JoinColumn(name="formId"),
            inverseJoinColumns = @JoinColumn(name="extraChargeId"))
    Set<Form> forms;
    @ManyToMany
    @JoinTable(name = "extraCharge-arm",
            joinColumns = @JoinColumn(name="armId"),
            inverseJoinColumns = @JoinColumn(name="extraChargeId"))

    Set<Arm> arms;


}
