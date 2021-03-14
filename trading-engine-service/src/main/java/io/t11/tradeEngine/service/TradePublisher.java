package io.t11.tradeEngine.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Component;

@Component
public class TradePublisher implements ITradePublisher {

    private static Logger logger = LoggerFactory.getLogger((TradePublisher.class));

    @Autowired
    private ChannelTopic topic;

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    public TradePublisher(RedisTemplate<String,Object> redisTemplate, ChannelTopic topic) {
        this.topic = topic;
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void publishTrade(String message) throws JsonProcessingException {
        logger.info("Publishing: {}",message);
        redisTemplate.convertAndSend(topic.getTopic(),message);
    }

}
