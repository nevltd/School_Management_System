const  SchoolFee = require("../payments/school_fee.model");
const Student = require("../student/student.model");

module.exports = (sequelize, Sequelize) => {
    const Class = sequelize.define("class", {
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
    Class.hasOne(SchoolFee,{
        foriegnkey:'classId',
    })
    Class.hasMany(Student,{
        foriegnkey:'classId',
    })
    

    return Class;
};