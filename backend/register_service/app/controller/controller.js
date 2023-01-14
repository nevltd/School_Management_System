const Fee = require('../models/payments/school_fee.model')
const ExtenalExam = require("../models/payments/external_exam.model ");
const Levy = require('../models/payments/levy.model');
const sendFeeAmount =require('../transactions/sender');

module.exports = {

    createFee: async ()=>{
    const fee = Fee.Create({
        classId:classId,
        termId:termId
    })
    },

    updateFee : async ()=>{
        let fee = Fee.findOne({
            where:{
                id:feeId
            }
        })
        fee.amount = amount
    },

    getFeeAmount : async (classId,termId)=>{
        const feeAmount = Fee.findOne({
            where : {
                classId:classId,
                termId:termId
            }
        })
        .amount;
        sendFeeAmount(feeAmount);
    },

    getExternalFeeAmount : async (externalfeeId)=>{
        const externalFeeAmount = ExternalExam.findOne({
            where : {
                id :externalfeeId,
            }
        })
        .amount;
    },

    createExternaFee: async ()=>{
        const externalFee = Fee.Create({
            classId:classId,
            termId:termId
        })
        },
    
        updateExternalFee : async ()=>{
            let externaFee = Fee.findOne({
                where:{
                    id:externalFeeId
                }
            })
            externaFee.amount = amount
        },
    
    getLevyAmount : async (externalfeeId)=>{
        const levyAmount = Levy.findOne({
            where : {
                id :externalfeeId,
            }
        })
        .amount;
    }
}