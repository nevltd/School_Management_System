const Assessment = db.define("assessment", {
    id: {
        type: Sequelize.INTEGER,
        autoIncrement: true,
        primaryKey: true
    },
    type: {
        type: Sequelize.INTEGER
    },
    maximumScore:{
        type:Sequelize.INTEGER
    }
})
Assessment.hasMany(SchoolFee,{
    foriegnkey:'AssessmentId',
})
Assessment.hasMany(ExtenalExam,{
    foriegnkey:'AssessmentId',
})


module.exports=Assessment;
