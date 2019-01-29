package edu.mrd.mgenerator.mailgeneratormainservice.controllers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${m-generator.rabbitmq.exchange}")
    private String exchange;

    @Value("${m-generator.rabbitmq.routingkey}")
    private String routingKey;



    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return discoveryClient.getInstances(applicationName);
    }

    @RequestMapping("/invoke/{message}")
    public void invokeRabbitMq(@PathVariable String message){
        amqpTemplate.convertAndSend(exchange, routingKey, message);
    }
}
