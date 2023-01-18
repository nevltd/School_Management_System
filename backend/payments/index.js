const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const PORT = process.env.port || 8081;
const cors = require('cors');
const reciever = require('./app/transactions/reciever');
const db = require('./app/models/index');
const { DB } = require('../session/app/config/db.config');
reciever()
app.use(cors());
app.use(bodyParser.json());
app.use(express.json());
app.use(bodyParser.urlencoded({extended : true}));
app.use(express.urlencoded({extended : true}));
db.mongoose.set("strictQuery", false);
db.mongoose.connect(db.url,{
    useNewUrlParser: true,
    useUnifiedTopology: true
})


app.listen(PORT,()=>console.log("fee service listening on port " + PORT))