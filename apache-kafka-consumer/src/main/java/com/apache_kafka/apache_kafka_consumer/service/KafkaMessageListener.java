package com.apache_kafka.apache_kafka_consumer.service;

import com.apache_kafka.apache_kafka_consumer.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageListener {


    @KafkaListener(topics = "messaging-topic-group", groupId = "my-group")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }

//    @KafkaListener(topics = "messaging-topic-group",groupId = "my-group")
//    public void consume2(String message) {
//        log.info("consumer2 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "messaging-topic-group",groupId = "my-group")
//    public void consume3(String message) {
//        log.info("consumer3 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "messaging-topic-group",groupId = "my-group")
//    public void consume4(String message) {
//        log.info("consumer4 consume the message {} ", message);
//    }
}
