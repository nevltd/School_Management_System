const DueFees = require('../models/due_fees.model');
const requestTermAmount = require('../transactions/sender').requestTermAmount;
const recieveTermAmount = require('../transactions/reciever').recieveTermAmount;
const requestUpdatePaymentTerm = require('../transactions/sender').requestUpdatePaymentTerm;
const recieveUpdatePaymentTermStatus = require('../transactions/reciever').recieveUpdatePaymentTermStatus;
const requestForUpdatedFee = require('../transactions/sender').requestForUpdatedFee;
const recieveUpdatedSchoolFee = require('../transactions/reciever').recieveUpdatedSchoolFee;
const requestForNotUpdateFee = require('../transactions/sender').requestForNotUpdateFee;
const recieveNotUpdatedSchoolFee = require('../transactions/reciever').recieveNotUpdatedSchoolFee;
const requestStudentsOfParent = require('../transactions/sender').requestStudentsOfParent;
const recieveStudentsOfParent = require('../transactions/reciever').recieveStudentsOfParent;

module.exports = {
    updatePaymentTerm: async (studentId, termId, excessPayment) => {
        requestTermAmount(termId)
        const amount = await recieveTermAmount();
        const newPaymentRecord = await DueFees.create({
            termId: termId,
            studentId: studentId,
            paidAmount: excessPayment,
            amount:amount
        })
        await requestUpdatePaymentTerm(studentId, termId,)
        const paymentTermStatus = await recieveUpdatePaymentTermStatus();
        if (paymentTermStatus.status === 200) {
            return newPaymentRecord
        }
        //error handlers
    },

    updatePayment: async (studentId, termId, paymentAmount) => {
        const newPaymentRecord = DueFees.findOne({
            where: {
                studentId: studentId,
                termId: termId,
            }
        });
        newPaymentRecord.paidAmount += paymentAmount;
        return newPaymentRecord;
    },

    checkFee: async (currentTermId, payTermId, classId,studentId) => {
        /*if pay in advance we get the current fee for the payment term
            and also update the amount in the DueFees model(if theres is a change), else
            we use the previous amount (amount on the DueFees model), this is done incase of a school fee change.
            The fee on the Due table is updated on term change
        */
        let feeAmount;
        if (payTermId > currentTermId) {
            await requestForUpdatedFee(classId,payTermId)
            return feeAmount = await recieveUpdatedSchoolFee();
        }
        
        return feeAmount = DueFees.findOne({
            where:{
                studentId:studentId,
                termId:currentTermId
            }
        }).amount;
    },

    payFeesPerStudentManually: async (student) => {
        let report, newPaymentRecord;
        const name = student.firstName
        const studentId = student.id;
        const paymentAmount = student.paymentAmount;
        const payTermId = student.payTermId
        const currentTermId = student.currentTermId
        const classId = student.classId
        const remainingFeeToBePaid = feeAmount - alreadyPaidFees;
        const excessPayment = paymentAmount - remainingFeeToBePaid;

        //get total fee amount for paying term
        feeAmount = await checkFee(currentTermId, payTermId, classId,studentId);

        //get How much has already been payed
        const alreadyPaidFees = DueFees.findOrCreate({
            where: {
                termId: payTermId,
                studentId: studentId
            }
        })
            .paidAmount;

        /*update payment term(if payment is greater or equal to the amount required to complete term payment)or 
        amount paid(if payment is less than the amount required to complete term payment)*/
        if (paymentAmount >= remainingFeeToBePaid) {
            newPaymentRecord = requestUpdatePaymentTerm(studentId, TermId, excessPayment);
            return newPaymentRecord;
        }
        newPaymentRecord = updatePayment(studentId, termId, paymentAmount);
        return newPaymentRecord;
    },

    payFeesPerStudentInstallment: async (student) => {
        const studentId = student.id;
        const paymentAmount = totalPaymentAmount * student.installmentPercent
        const classId = student.classId;
        const paymentTermId = student.PaymentTermId;
        let feeAmount, newPaymentRecord;
        const remainingFeeToBePaid = feeAmount - alreadyPaidFees;
        const excessPayment = paymentAmount - remainingFeeToBePaid;

        //get total fee amount for paying term
        feeAmount = await checkFee(currentTermId, payTermId, classId,studentId);
    
        //get How much has already been payed
        const alreadyPaidFees = DueFees.findOrCreate({
            where: {
                termId: payTermId,
                studentId: studentId
            }
        })
            .paidAmount;

        /*update payment term(if payment is greater or equal to the amount required to 
        complete term payment)or amount paid(if payment is less than the amount
         required to complete term payment)*/
        if (paymentAmount >= remainingFeeToBePaid) {
            newPaymentRecord = requestUpdatePaymentTerm(studentId, TermId, excessPayment);
            return newPaymentRecord;
        }
        newPaymentRecord = updatePayment(studentId, termId, paymentAmount);
        return newPaymentRecord;
    },

    payFeesManuallyCollectively: (request, response) => {
        const students = request.body.students
        try {
            for (student in students) {
                this.payFeesPerStudentManually(student)
            }
        }
        catch (error) {
            console.log(error)
        } finally {
            response.send().status
        }
    },

    payFeesInstallmentCollectively: async (request, response) => {
        try {
            const totalPaymentAmount = request.body.amount
            const parentId = request.body.parentId
            let students = []

            requestStudentsOfParent(parentId)
            students = await recieveStudentsOfParent()

            for (student in studentList) {
                payFeesPerStudent(student)
            }
        }
        catch (error) {
            console.log(error)
        } finally {
            response.send().status
            //*todo: end function properly
        }
    }
}