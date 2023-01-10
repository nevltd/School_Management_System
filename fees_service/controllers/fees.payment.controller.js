const publisher = require('../transactions/publisher')
module.exports = {
    updatePaymentTerm:'',//create function
    updatePayment: (studentId)=>{
        console.log(studentId);
    },//create function
    //handler to pay fees

    payFeesPerStudent: async (student) => {
    
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

    //collective payment for every student in the payload
    payFees: (request, response, payFeesPerStudent) => {
        this.response = response;
        this.request = request;
        const studentList = request.body.students;
        for (student in studentList) {
            payFeesPerStudent(student)
        }
    }
}