module.exports = (sequelize, Sequelize) => {
    const paidFees = sequelize.define('paidFees', {
      termId: {
        type: Sequelize.INTEGER
      },
      studentId: {
        type: Sequelize.INTEGER
      },
      amount: {
        type: Sequelize.INTEGER,
        defaultValue : 0,
      },
      status: {
        type: Sequelize.STRING,
        defaultValue:'unpaid',
      }

    });
  
    return paidFees;
  };