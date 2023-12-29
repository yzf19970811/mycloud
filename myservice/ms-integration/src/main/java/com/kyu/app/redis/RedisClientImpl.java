package com.kyu.app.redis;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author kyu.yzf
 * @date 2023/12/24 21:11
 */
@Service
public class RedisClientImpl implements RedisClient {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void setKV() {
        stringRedisTemplate.setKeySerializer(StringRedisSerializer.UTF_8);
        stringRedisTemplate.opsForValue().set("name", "yuzhifa", 60, TimeUnit.SECONDS);
    }
}
