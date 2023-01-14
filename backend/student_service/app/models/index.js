const DB_URI = require("../config/db.config").DB_URI;
const mongoose = require("mongoose");

let db = {};
db.mongoose = mongoose;
db.url = DB_URI;
db.student = require("../models/student.model")(mongoose);
module.exports = db;