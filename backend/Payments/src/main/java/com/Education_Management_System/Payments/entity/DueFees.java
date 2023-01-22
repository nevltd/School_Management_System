package com.Education_Management_System.Payments.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
@RequiredArgsConstructor
@Document
public class DueFees {
    private Integer studentId;
    private Integer termId;
    private Integer amountPaid;
    private Date lastPaydate;
}
