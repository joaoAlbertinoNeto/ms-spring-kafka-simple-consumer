package com.net.ms.msspringkafkasimpleconsumer.adapter.in.kafka;



import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {

    @KafkaListener(topics = "msgs")
    public void readEvent(String event){
        System.out.println(event);
    }
}
