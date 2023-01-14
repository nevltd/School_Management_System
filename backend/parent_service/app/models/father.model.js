const mongoose = require('mongoose')
  const father_schema =  mongoose.Schema({
    firstName : String,
    lastName : String,
  })
  const Father = mongoose.model('father',father_schema)

  module.exports = Father;