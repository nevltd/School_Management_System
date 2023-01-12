const express = require("express")
const bodyParser = require("body-parser");
const db = require("./models/index")
const cors = require("cors");
const PORT = process.env.port || 8082;

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
app.use('/',require("./student.routes"))

app.listen(PORT,()=>
console.log('app listening on port '+ PORT)
)