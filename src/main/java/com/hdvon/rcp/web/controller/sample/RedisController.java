package com.hdvon.rcp.web.controller.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by Toby on 2017/6/26.
 */
@Slf4j
@RestController
@RequestMapping(value = "/redis")
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/{key}", method = RequestMethod.PUT)
    public void addKeyValue(@PathVariable String key) {
        ValueOperations<String, String> valueops = redisTemplate.opsForValue();
        valueops.set(key, UUID.randomUUID().toString(), 120, TimeUnit.SECONDS);
    }

    @RequestMapping(value = "/{key}", method = RequestMethod.GET)
    public String getValueByKey(@PathVariable String key) {
        ValueOperations<String, String> valueops = redisTemplate.opsForValue();
        return valueops.get(key);
    }
}
