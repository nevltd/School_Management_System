const assert = require('assert');
const payfees = require("../controllers/fees.payment.controller").payFeesPerStudent;

describe("function to pay fees", ()=>{
    it("should return paid",()=>{
        const payfees = payfees(student)
        assert.equal(200,payfees)
    })
})