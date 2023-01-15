module.exports = {
    HOST: "localhost",
    USER: "postgres",
    PASSWORD: "97chocho",
    DB: "session",
    dialect: "postgres",
    pool: {
      max: 5,
      min: 0,
      acquire: 30000,
      idle: 10000
    }
  };