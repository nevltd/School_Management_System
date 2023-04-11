package com.quester.schoolmanagementsystem.payments.dataAccessLayer;

import com.quester.schoolmanagementsystem.payments.entity.DueFee;

import java.util.List;
public class DueFeesDALImpl implements DueFeesDAL {
    @Override
    List<DueFee> getPaymentOfAlltime(){

    }
    @Override
    List<DueFee> getPaymentPerSession(int sessionId){

    }
    @Override
    List<DueFee> getPaymentPerTerm(int termId){

    }
    @Override
    public List <DueFee> getStudentPaymentAllTime(int studentId){

    }

    @Override
    public DueFee getStudentPaymentPerSession(int studentId, int sessionId) {
        return null;
    }

    @Override
    DueFee getStudentPaymentPerTerm(int studentId, int termId);

    void updatePayment (int studentId,int termId, int paymentAmount);
    void updatePayingTerm(int studentId, int nextPayingTermId, int excessAmount);

    public void payFees() {

    }

}
