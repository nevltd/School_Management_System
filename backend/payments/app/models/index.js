const mongoose = require('mongoose');
const DB_URI = require('../config/db.config')
const DueFees = require('./due_fees.model');
let db ={}
db.mongoose = mongoose;
db.url = DB_URI.url;
db.DueFees = DueFees
module.exports = db;