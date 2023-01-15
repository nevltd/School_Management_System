const express = require('express')
const router = express.Router();
const sessionController = require('../controller/session.controller')

router.post('/sessions',sessionController.createSession)

module.exports = router;