package com.Education_Management_System.Payments.dataAccessLayer;

import com.Education_Management_System.Payments.entity.DueFees;

import java.util.List;
public class DueFeesDALImpl implements DueFeesDAL {
    @Override
    List<DueFees> getPaymentOfAlltime(){

    }
    @Override
    List<DueFees> getPaymentPerSession(int sessionId){

    }
    @Override
    List<DueFees> getPaymentPerTerm(int termId){

    }
    @Override
    List <DueFees> getStudentPaymentAllTime(int studentId){

    }

    @Override
    DueFees getStudentPaymentPerSession(int studentId,int sessionId);

    @Override
    DueFees getStudentPaymentPerTerm(int studentId,int termId);

    void updatePayment (int studentId,int termId, int paymentAmount);
    void updatePayingTerm(int studentId, int nextPayingTermId, int excessAmount);
    void payFees();

}
