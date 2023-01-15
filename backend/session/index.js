const express = require("express");
const cors = require("cors");
const bodyParser = require('body-parser')

const app = express();
app.use(cors());
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

const db = require("./app/models");


db.sync({force:true})
  .then(() => {
    console.log("Synced db.");
  })
  .catch((err) => {
    console.log("Failed to sync db: " + err.message);
  });

// // drop the table if it already exists
// db.sequelize.sync({ force: true }).then(() => {
//   console.log("Drop and re-sync db.");
// });

// simple route
app.get("/", (req, res) => {
  res.json({ message: "Welcome to bezkoder application." });

});
app.get("/fees", (req, res) => {
  res.json({ message: "Welcome to bezkoder application." });

});

app.post('/fees',require('./app/controller/session.controller').createFee)

app.post('/sessions',require('./app/controller/session.controller').createSession)

// set port, listen for requests
const PORT = process.env.PORT || 8086;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}.`);
});