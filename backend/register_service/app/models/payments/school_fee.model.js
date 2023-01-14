   const Sequelize = require('sequelize')
   const db = require ('../index')
    const SchoolFee = db.define("schoolFee", {
        id: {
            type: Sequelize.INTEGER,
            autoIncrement: true,
            primaryKey: true
        },
        amount: {
            type: Sequelize.INTEGER
        },
        
    })

    module.exports = SchoolFee;
