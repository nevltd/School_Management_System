const getStudents = require('../transaction/sender').getStudents;
module.exports = {
    updatePaymentTerm:'',//create function
    updatePayment: (studentId)=>{
        console.log(studentId);
    },//create function
    //handler to pay fees
    payFeesPerStudentManually: async (student) => {
        try {
            const feedback = report;//feedback after term updating paying term
            let report;
            const studentId = student.id;
            const paymentAmount = student.amount;
           
            //firstly,send a request to get the term to be payed for from register service
            await getFeePaymentTerm(studentId).id;

            //get the fee amount for the term in the previous step from session microsevice
            const feeAmount = parseInt(await recieveSchoolFee().amount)
            const payingTermId = parseInt(await recieveSchoolFee().termId)
            //get How much has already been payed
            const alreadyPaidFees = PaidFees.findOrCreate({
                where: {
                    termId: payingTermId,
                    studentId: studentId
                }
            })
            .amount;

            const remainingFeeToBePaid = feeAmount - alreadyPaidFees;

            //update payment term or amount(if the amount paid is less than the fees for the payment term)
            if (paymentAmount >= remainingFeeToBePaid) {
                const excessPayment = paymentAmount - remainingFeeToBePaid;
                report = await updatePaymentTerm(studentId, excessPayment);
                return response.end(feedback).status(200);
                //todo:end the function properly
            }

            report = await this.updatePayment(studentId, paymentAmount);
            return response.end(feedback).status(200);


        } catch (error) {
            console.log(error);
        }
    },

    payFeesManually: (request,response) => {
        const students = request.body.students
        for (student in students) {
            payFeesPerStudent(student)
        }
    },

    payFeesPerStudentInstallment: async (student) => {
    
        try {
            //
            const feedback = report;
            let report;
            const studentId = student.id;
            const paymentAmount = student.amount;
           
            //firstly,get the term payed for
            const payingTermId = await publisher.getFeeTerm(studentId).id;

            //get the fee amount for the term in the previous step
            const feeAmount = await Fee.findOne({
                where: {
                    termId: payingTermId
                }
            })
            .fee

            //get How much has already been payed
            const alreadyPaidFees = PaidFees.findOrCreate({
                where: {
                    termId: payingTermId,
                    studentId: studentId
                }
            })
            .amount;

            const remainingFeeToBePaid = feeAmount - alreadyPaidFees;

            //update payment term or amount(if the amount paid is less than the fees for the payment term)
            if (paymentAmount >= remainingFeeToBePaid) {
                const excessPayment = paymentAmount - remainingFeeToBePaid;
                report = await updatePaymentTerm(studentId, excessPayment);
                return response.end(feedback).status(200);
                //todo:end the function properly
            }

            report = await this.updatePayment(studentId, paymentAmount);
            return response.end(feedback).status(200);


        } catch (error) {
            console.log(error);
        }
    },

    payFeesInstallment: (request,response) => {
        const parentId = request.params.id
        getStudents(parentId)
        const students = recieveStudent()
        for (student in studentList) {
            payFeesPerStudent(student)
        }
    }
}