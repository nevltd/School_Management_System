module.exports = {
    HOST: "localhost",
    USER: "postgres",
    PASSWORD: "97chocho",
    DB: "academic_records",
    dialect: "postgres",
    pool: {
      max: 5,
      min: 0,
      acquire: 30000,
      idle: 10000
    }
  };