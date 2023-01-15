const router = require("express").Router();

router.get('/',(request,response)=>{
    response.send('helloworld')
})
module.exports=router;