package com.quester.academic_records.Model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Score {
    private int score;

    @ManyToOne
    @JoinColumn(name = "resultId",nullable = false)
    private Result result;
    @ManyToOne
    @JoinColumn(name = "assessmentId",nullable = false)
    private Result assessment;
}
