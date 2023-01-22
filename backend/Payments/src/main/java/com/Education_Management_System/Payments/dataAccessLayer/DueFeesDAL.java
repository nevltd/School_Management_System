package com.Education_Management_System.Payments.dataAccessLayer;

import com.Education_Management_System.Payments.entity.DueFees;

import java.util.List;

public interface DueFeesDAL {
    List<DueFees> getPaymentOfAlltime();
    List<DueFees> getPaymentPerSession(int sessionId);
    List<DueFees> getPaymentPerTerm(int termId);
    List <DueFees> getStudentPaymentAllTime(int studentId);
    DueFees getStudentPaymentPerSession(int studentId,int sessionId);

    DueFees getStudentPaymentPerTerm(int studentId,int termId);

    void updatePayment (int studentId,int termId, int paymentAmount);
    void updatePayingTerm(int studentId, int nextPayingTermId, int excessAmount);
    void payFees();

}
