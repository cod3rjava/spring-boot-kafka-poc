package com.cod3rjava.bootkafka.kafka;

import com.cod3rjava.bootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.z.consumer.group-id}")
    public void consume(User user){
        LOGGER.info(String.format("Message recieved -> %s", user.toString()));
    }
}
