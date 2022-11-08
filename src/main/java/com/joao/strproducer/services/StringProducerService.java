package com.joao.strproducer.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Log4j2
@RequiredArgsConstructor
@Service
public class StringProducerService {
    public final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        log.info("Send message {}", message);
        kafkaTemplate.send("str-topic", message);
    }
}
