const mongoose = require('mongoose')
    const dueFees_schema = mongoose.Schema({
        termId:Number,
        studentId:Number,
        amount:Number,
        paidAmount: Number
    })
    const DueFees = mongoose.model('DueFees',dueFees_schema)
    module.exports=DueFees;
