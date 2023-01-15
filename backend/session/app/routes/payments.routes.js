const  r = require('express').Router();
const paymentController = require('../controller/payment.controller')
r.get('/fees',(req,res)=>{
    res.json({ message: "Welcome to bezkoder application." });
})
r.post('/fees',paymentController.createFee)

module.exports= r