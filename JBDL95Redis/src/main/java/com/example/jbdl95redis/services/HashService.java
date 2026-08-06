package com.example.jbdl95redis.services;

import com.example.jbdl95redis.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

@Service
public class HashService {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Autowired
    ObjectMapper objectMapper;

    private static final String KEY_PREFIX = "person_hash";

    private String getKey(String id){
        return KEY_PREFIX + id;
    }

    public Person hset(Person person) {
        Map<String,Object> map = this.objectMapper.convertValue(person, Map.class);
        this.redisTemplate.opsForHash().putAll(getKey(person.getId()),map);
        return person;
    }


    public Person hgetAll(String id) {
//        return this.redisTemplate.opsForHash().entries(getKey(id));

       return this.objectMapper.convertValue(this.redisTemplate.opsForHash().entries(getKey(id)), Person.class);
    }

    public Object hget(String id, String field) {
        return this.redisTemplate.opsForHash().get(getKey(id),field);
    }

    public void delete(String id, String field) {
        this.redisTemplate.opsForHash().delete(getKey(id),field);
    }
}
