package com.lcw.kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

    @Autowired
    private  KafkaTemplate<String, String> kafkaTemplate;
    //we dont need to create manually constrctur, will be provided by above annotation

    public void sendMessage(String msg){
        log.info(String.format("sending message to topic:: %s", msg));
        kafkaTemplate.send("topic1",msg);

    }
}
