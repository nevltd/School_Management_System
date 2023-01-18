const Father = require('../models/father.model')
const sender = require('../transaction/sender')

module.exports = {

    registerFather: async (request ,response)=>{
       const father = await Father({firstName:request.firstName,
        lastName:request.lastName

    })
    console.log(father)
    father.save()
    sender("parent",father)
 
    response.send(JSON.stringify('father'))

    },

    updateChildName: async (req,res)=>{

    },
}