module.exports = (sequelize, Sequelize) => {
    const Father = sequelize.define('father', {
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
  
    return Father;
  };