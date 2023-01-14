const router = require('express').Router();
const controller = require('../controllers/parent.controller')

router.get('/',(request,response)=>{
       response.send('hello from parent service')
})
router.post('/register',controller.registerFather)
module.exports = router;