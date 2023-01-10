module.exports = (sequelize, Sequelize) => {
    const Fee = sequelize.define( 'fees', {
        amount: {
            type: Sequelize.INTEGER
        },
        termId: {
            type: Sequelize.INTEGER
        },
        classId: {
            type: Sequelize.INTEGER
        }

    });


    return Fee;
}
