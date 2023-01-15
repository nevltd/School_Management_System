const db = require("../index")
const Sequelize = require('sequelize')
    const ExtenalExam= db.define("extenalExamFee", {
        id: {
            type: Sequelize.INTEGER,
            autoIncrement: true,
            primaryKey: true
        },
        examount: {
            type: Sequelize.INTEGER
        },
        
    })

    module.exports = ExtenalExam;
