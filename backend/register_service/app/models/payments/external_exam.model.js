const db = require("../index")
const Sequelize = require('sequelize')
    const ExtenalExam= sequelize.define("extenalExamFee", {
        id: {
            type: Sequelize.INTEGER,
            autoIncrement: true,
            primaryKey: true
        },
        amount: {
            type: Sequelize.INTEGER
        },
        
    })

    module.exports = ExtenalExam;
