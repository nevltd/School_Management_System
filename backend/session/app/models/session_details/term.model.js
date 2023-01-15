const SchoolFee = require("../payments/school_fee.model");
const Session = require('./session.model')
const Sequelize = require('sequelize')
const db = require('../index')

 Term = db.define("term", {
    id: {
        type: Sequelize.INTEGER,
        autoIncrement: true,
        primaryKey: true
    },
    term: {
        type: Sequelize.STRING
    },
    startdate: {
        type: Sequelize.DATE
    },
    enddate: {
        type: Sequelize.DATE
    }
});
Term.hasMany(SchoolFee, {
    foreignKey: 'termId'
})


module.export = Term;

















