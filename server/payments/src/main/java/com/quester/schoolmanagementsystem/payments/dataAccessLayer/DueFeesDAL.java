package com.quester.schoolmanagementsystem.payments.dataAccessLayer;

import com.quester.schoolmanagementsystem.payments.entity.DueFee;

import java.util.List;

public interface DueFeesDAL {
    List<DueFee> getPaymentOfAlltime();
    List<DueFee> getPaymentPerSession(int sessionId);
    List<DueFee> getPaymentPerTerm(int termId);
    List <DueFee> getStudentPaymentAllTime(int studentId);
    DueFee getStudentPaymentPerSession(int studentId, int sessionId);

    DueFee getStudentPaymentPerTerm(int studentId, int termId);

    void updatePayment (int studentId,int termId, int paymentAmount);
    void updatePayingTerm(int studentId, int nextPayingTermId, int excessAmount);
    void payFees();

}
