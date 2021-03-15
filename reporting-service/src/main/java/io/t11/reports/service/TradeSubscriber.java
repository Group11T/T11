package io.t11.reports.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TradeSubscriber implements MessageListener {

    private final Logger logger = LoggerFactory.getLogger((TradeSubscriber.class));

    public static List<String> messageList = new ArrayList<>();

    @Override
    public void onMessage(Message message, byte[] pattern) {
        logger.info("Message Received: {}", message.toString());
        messageList.add(message.toString());
        System.out.println(message.toString());
    }
}
