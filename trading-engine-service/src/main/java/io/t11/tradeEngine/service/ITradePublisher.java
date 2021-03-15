package io.t11.tradeEngine.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface ITradePublisher {

    void publishTrade(String message) throws JsonProcessingException;
}
