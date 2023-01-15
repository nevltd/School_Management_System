const ExtenalExam = require("../payments/external_exam.model");
const  SchoolFee = require("../payments/school_fee.model");
const db = require('../index')
const Sequelize = require('sequelize')

    const Class = db.define("class", {
        id: {
            type: Sequelize.INTEGER,
            autoIncrement: true,
            primaryKey: true
        },
        class: {
            type: Sequelize.INTEGER
        },
        arm: {
            type: Sequelize.STRING
        }
    })
    Class.hasMany(SchoolFee,{
        foriegnkey:'classId',
    })
    Class.hasMany(ExtenalExam,{
        foriegnkey:'classId',
    })
    

    module.exports=Class;
