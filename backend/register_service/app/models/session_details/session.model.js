const Sequelize = require('sequelize')
const db = require('../index')
const term = require('./term.model');

    const Session = db.define("session", {
        id: {
            type: Sequelize.INTEGER,
            autoIncrement: true,
            primaryKey: true
        },
        from: {
            type: Sequelize.INTEGER
        },
        to: {
            type: Sequelize.INTEGER
        }
    })
    Session.hasMany(Term,{
        foriegnkey:'sessionId',
    })

module.exports = Session;