package edu.mrd.mgenerator.mailgeneratorrabbitmq.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MGeneratorRabbitListener {

    @RabbitListener(queues="${m-generator.rabbitmq.queue}")
    public void receivedMessage(String msg) {
        System.out.println("Recieved Message: " + msg);
    }
}
