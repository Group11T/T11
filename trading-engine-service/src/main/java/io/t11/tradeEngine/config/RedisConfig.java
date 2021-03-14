package io.t11.tradeEngine.config;

import io.t11.tradeEngine.service.ITradePublisher;
import io.t11.tradeEngine.service.TradePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

@Configuration
public class RedisConfig {

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Bean
    RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        redisTemplate.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
        return redisTemplate;
    }

    //
    @Bean
    ChannelTopic topic() {
        return new ChannelTopic("trade-orders");
    }

    @Bean
    ITradePublisher tradeObjectPublisher(){
        return new TradePublisher(redisTemplate(redisConnectionFactory),topic());
    }
}
