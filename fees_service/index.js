const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const PORT = process.env.port || 8080;
const cors = require('cors');

app.use(cors());
app.use(bodyParser.json());
app.use(express.json());
app.use(bodyParser.urlencoded({extended : true}));
app.use(express.urlencoded({extended : true}));
app.use(require('./routes'));
app.get('/', (req, res) => {
    res.send('Hello World!')
  })
app.listen(PORT,()=>console.log("fee service listening on port " + PORT))
