const Score = db.define("assessment", {
    score : {
        type:Sequelize.INTEGER
    },
    subject_assesmentId: {
        type: Sequelize.INTEGER
    },
    maximumScore:{
        type:Sequelize.INTEGER
    }
})