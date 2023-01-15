const dbConfig = require("../config/db.config.js");
const Sequelize = require("sequelize");

const db = new Sequelize(dbConfig.DB, dbConfig.USER, dbConfig.PASSWORD, {
  host: dbConfig.HOST,
  dialect: dbConfig.dialect,
  operatorsAliases: false,

  pool: {
    max: dbConfig.pool.max,
    min: dbConfig.pool.min,
    acquire: dbConfig.pool.acquire,
    idle: dbConfig.pool.idle
  }
});

module.exports = db;
const Session = require("./session_details/session.model");
const Term = require ("./session_details/term.model");
const SchoolFee = require('./payments/school_fee.model');
const Class = require('./session_details/class.model')
const ExtenalExam = require('./payments/external_exam.model')