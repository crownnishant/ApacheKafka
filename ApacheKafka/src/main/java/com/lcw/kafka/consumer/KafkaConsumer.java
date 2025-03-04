package com.lcw.kafka.consumer;

import com.lcw.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

   // @KafkaListener(topics="topic1", groupId="myGroup")
    /*public void consumeMsg(String msg){
        log.info("consuming the message:: {}", msg);

    }*/
    @KafkaListener(topics="topic1", groupId="myGroup")
    public void jsonConsumeMsg(Student student){
        log.info("consuming the message from topic topic1:: {}", student.toString());
    }
}
