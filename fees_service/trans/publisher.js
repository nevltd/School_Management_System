
const amqp = require('amqplib/callback_api');

module.exports = {
    getFeeTerm: (studentId) => {
        amqp.connect('amqp://localhost', function (error0, connection) {
            if (error0) {
                throw error0;
            }
            connection.createChannel(function (error1, channel) {
                if (error1) {
                    throw error1;
                }
                let queue = 'studentPaymentTerm';
                let msg = studentId;

                channel.assertQueue(queue, {
                    durable: false
                });

                channel.sendToQueue(queue, Buffer.from(msg));
                console.log(" [x] Sent %", msg);
                return 1;
            });
        })
    }

}