module.exports = (sequelize, Sequelize) => {
    const Levy = sequelize.define("levy", {
        id: {
            type: Sequelize.INTEGER,
            autoIncrement: true,
            primaryKey: true
        },
        amount: {
            type: Sequelize.INTEGER
        },
        
    })

    return Levy;
};