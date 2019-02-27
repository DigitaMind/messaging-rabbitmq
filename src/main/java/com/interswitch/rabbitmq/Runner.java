package com.interswitch.rabbitmq;

import com.interswitch.rabbitmq.consumer.Consumer;
import com.interswitch.rabbitmq.producer.Producer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final Producer producer;

    public Runner(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run(String... args){
        System.out.println("Sending message...");
        producer.send();
    }

}
