module.exports = mongoose =>{
  const mother_schema = mongoose.Schema({
    firstName: String,
    lastName: String,
  })
const Mother = mongoose.model('mother',mother_schema);
    return Mother;
  }; 