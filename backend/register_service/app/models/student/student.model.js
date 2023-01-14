const Sequelize = require('sequelize')
   const db = require ('../index')
    const Student = db.define("student", {
        id: {
            type: Sequelize.INTEGER,
            autoIncrement: true,
            primaryKey: true
        },
        firstName: {
            type: Sequelize.STRING
        },
        payingTermId: {
            type: Sequelize.INTEGER
        },
        
    })

    module.exports = Student;
