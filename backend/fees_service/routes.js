const express = require('express');
const router = express.Router();

router.use('/',(request,response)=>{
    response.send('hello')
})
module.exports = router;