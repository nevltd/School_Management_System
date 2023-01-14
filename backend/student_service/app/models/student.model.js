module.exports = (mongoose) => {
      let student_schema = mongoose.Schema({
        uuid: String,
        firstname: String,
        motherId: String,
        payingtermId:String,
      },
      { timestamps: true }
      )
  const Student = mongoose.model('student',student_schema);
  return Student;
}