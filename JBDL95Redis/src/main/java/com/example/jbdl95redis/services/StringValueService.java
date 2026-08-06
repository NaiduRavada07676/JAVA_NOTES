package com.example.jbdl95redis.services;

import com.example.jbdl95redis.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class StringValueService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    private static final String PREFIX_KEY = "person::";

    private static final Long EXPIRY = 10L;


    public String getKey(String id){
        return PREFIX_KEY + id;
    }


    public Person create(Person person) {
        String key = getKey(person.getId());
        this.redisTemplate.opsForValue().set(key,person,EXPIRY, TimeUnit.MINUTES);
        return person;

    }

    public Person get(String id) {
        return (Person) this.redisTemplate.opsForValue().get(getKey(id));
    }
}
