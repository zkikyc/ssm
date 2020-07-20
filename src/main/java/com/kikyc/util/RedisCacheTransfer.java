package com.kikyc.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * 静态注入中间类
 */
public class RedisCacheTransfer {
    @Autowired
    public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
        System.out.println("jedisConnectionFactory注入成功"+jedisConnectionFactory.getClass());
        RedisCache.setJedisConnectionFactory(jedisConnectionFactory);
    }

}
