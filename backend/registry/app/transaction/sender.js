#!/usr/bin/env node


const amqp = require("amqplib");

 const send = (exchange,message)=>{
    amqp.connect("amqp://localhost",(error0,connection)=>{
        if(error0){
            throw error0;
        }
        connection.createChannel((error1,channel)=>{
            if(error1){
                throw error1;            
            }
            channel.assertExchange(exchange,fanout,{
                durable:false
            })
            channel.publish(exchange,'',Buffer.from(message))

            console.log('sent ')   
        })
        setTimeout(function() {
            connection.close();
        }, 500);


    })
}
send('myex','world');