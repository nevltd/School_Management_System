const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const db = require('./app/models/index');
const PORT = process.env.port || 8084;

const app = express();
db.mongoose.set("strictQuery", false);
db.mongoose.connect(db.url,{
    useNewUrlParser: true,
    useUnifiedTopology: true
})
.then(()=>{
    console.log('connected to db cluster')
})
.catch((error)=>{
    console.error(error)
})


app.use(cors())
app.use(express.json());
app.use (express.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use (bodyParser.urlencoded({ extended: true }));
app.use('/',require("./app/routes/route"))
app.use('/register',require("./app/routes/route"))



app.listen(PORT,()=>
console.log('app listening on port '+ PORT)
)