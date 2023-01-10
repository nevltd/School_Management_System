module.exports = (sequelize, Sequelize) => {
    const BankAccount = sequelize.define('bankAccount', {
      bankAccount: {
        type: Sequelize.STRING
      },
      bankId: {
        type: Sequelize.INTEGER
      },
      
    });
  
    return BankAccount;
  };