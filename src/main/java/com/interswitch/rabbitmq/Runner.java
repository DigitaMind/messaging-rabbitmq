package com.interswitch.rabbitmq;

import com.interswitch.rabbitmq.consumer.Consumer;
import com.interswitch.rabbitmq.producer.Producer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final Consumer consumer;
    private final Producer producer;

    public Runner(Consumer consumer, Producer producer) {
        this.consumer = consumer;
        this.producer = producer;
    }

    @Override
    public void run(String... args){
        System.out.println("Sending message...");
        producer.send();
    }

}
