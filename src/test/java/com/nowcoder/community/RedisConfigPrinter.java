package com.nowcoder.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Component
public class RedisConfigPrinter {

    @Value("${spring.redis.database}")
    private int redisDatabase;

    @Value("${spring.redis.host}")
    private String redisHost;

    @Value("${spring.redis.port}")
    private int redisPort;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void printRedisConfig() {
        System.out.println("Redis Database: " + redisTemplate);
        System.out.println("Redis Host: " + redisHost);
        System.out.println("Redis Port: " + redisPort);
    }
}

