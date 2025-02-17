package com.gmail.merikbest2015.broker.producer;

import com.gmail.merikbest2015.commons.constants.KafkaTopicConstants;
import com.gmail.merikbest2015.commons.event.UpdateUserEvent;
import com.gmail.merikbest2015.mapper.ProducerMapper;
import com.gmail.merikbest2015.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateUserProducer {

    private final KafkaTemplate<String, UpdateUserEvent> kafkaTemplate;
    private final ProducerMapper producerMapper;

    public void sendUpdateUserEvent(User user) {
        UpdateUserEvent updateUserEvent = producerMapper.toUpdateUserEvent(user);
        kafkaTemplate.send(KafkaTopicConstants.UPDATE_USER_TOPIC, updateUserEvent);
    }
}
