module.exports = (sequelize, Sequelize) => {
    const Mother = sequelize.define('mother', {
      firstName: {
        type: Sequelize.STRING
      },
      lastName: {
        type: Sequelize.STRING
      },
      middleName: {
        type: Sequelize.STRING
      },
      email : {
        type: Sequelize.STRING
      },
      phoneNumber : {
        type: Sequelize.STRING
      },
      address : {
        type: Sequelize.STRING
      },
      status : {
        type: Sequelize.STRING
      },
      
      
    });
  
    return Mother;
  };