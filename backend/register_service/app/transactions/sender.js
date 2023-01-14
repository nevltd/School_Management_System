#!/usr/bin/env node
var amqp = require('amqplib/callback_api');

const sendFeeAmount = (feeAmount) => {
amqp.connect('amqp://localhost', function(error0, connection) {
    if (error0) {
        throw error0;
    }
    connection.createChannel(function(error1, channel) {
        if (error1) {
            throw error1;
        }

        var msg = feeAmount;
        var exchange = 'fee_details'
        
        channel.assertExchange(exchange,'fanout',{
            durable:false
        })
        channel.publish(exchange,'',Buffer.from(msg))

        console.log(" [x] Sent %s", msg);
    });
    setTimeout(function() {
        connection.close();
        process.exit(0);
    }, 500);
});
}
sendFeeAmount('34')
module.exports=sendFeeAmount