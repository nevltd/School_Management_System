const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const PORT = process.env.port || 8080;
const cors = require('cors');
const reciever = require('./app/transactions/reciever')
reciever()
app.use(cors());
app.use(bodyParser.json());
app.use(express.json());
app.use(bodyParser.urlencoded({extended : true}));
app.use(express.urlencoded({extended : true}));
app.use(require('./routes'));
app.listen(PORT,()=>console.log("fee service listening on port " + PORT))
