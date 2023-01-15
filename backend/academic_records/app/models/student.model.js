const Score = require('./score')
const Student = db.define("student", {
  id: {
      type: Sequelize.INTEGER,
      autoIncrement: true,
      primaryKey: true
  },
 firstName: {
      type: Sequelize.STRING
  },
  arm: {
      type: Sequelize.STRING
  }
})
Student.hasMany(Score,{
  foriegnkey:'StudentId',
})


module.exports=Student;
