module.exports = (sequelize, Sequelize) => {
  const Bank = sequelize.define('bank', {
    bank: {
      type: Sequelize.STRING
    },
    accountNumber: {
      type: Sequelize.STRING
    },
  });

  return Bank;
};