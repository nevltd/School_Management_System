const Session = require("../models/session_details/session.model")
const Fee = require('../models/payments/school_fee.model')


module.exports = {
    createFee: async (request, response)=>{
      try{ 
        console.log(request) 
        const fee =await  Fee.create({
        amount:request.body.amount,
        classId:request.body.classId,
        termId:request.body.termId
    })
    response.json(fee)
}catch(error){
    console.log(error)
}
    },

    createSession: async (request, response) => {
        const from = request.from
        const to = request.to
        const numberOfTerms = request.body.numberOfTerms
        const session = await Session.create({
            from: from,
            to: to,
        })
        for(i = 1;i<=numberOfTerms,i++){}
        if (i%3 == 1){
        const firstTerm = await Term.create({
            term: 'First',
            sessionId: session.id
        })
    }
        else if//use Switch statement
        const secondTerm = await Term.create({
            term: 'Second',
            sessionId: session.id
        })

        const thirdTerm = await  Term.create({
            term: 'Third',
            sessionId: session.id
        })
        console.log([firstTerm,secondTerm,thirdTerm])
        response.send(session);


    },
    createSessionAuto: async () => {
        const lastCreatedSessionId = await Session.count()
        const lastCreatedSession = await Session.findOne({
            where: {
                id: lastCreatedSessionId
            }
        })
        this.createSessionHelper(lastCreatedSession)
    },

    createSessionHelper:(previousSession)=>{
        const newSession = Session.create({
            from: previousSession.to,
            to: previouslastCreatedSession.to + 1
        })

        const firstTerm = Term.create({
            term: 'First',
            sessionId: newSession.id
        })

        const secondTerm = Term.create({
            term: 'Second',
            sessionId: newSession.id
        })

        const thirdTerm = Term.create({
            term: 'Third',
            sessionId: newSession.id
        })
        console.log([firstTerm,secondTerm,thirdTerm])
        return newSession;
    },

    updateCurrentSession: async () => {
        const completedSession = await Session.findOne({
            where: {
                current: true
            }
        })

        let nextSession = await Session.findOne({
            where:{
               id:completedSession.id + 1,
               from:completedSession.to,
               to:completedSession.to+1
            }
        })

        if (!nextSession){
           nextSession = this.createSessionHelper(completedSession)
        }
        completedSession.current = 'false';
        nextSession.current = 'true'

    }
}