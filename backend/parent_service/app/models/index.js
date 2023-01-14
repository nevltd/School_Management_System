const DB_URI = require("../config/db.config").DB_URI;
const mongoose = require("mongoose");

let db = {};
db.mongoose = mongoose;
db.url = DB_URI;
db.Father = require("./father.model");
db.mother = require('./mother.model')(mongoose);
module.exports = db;