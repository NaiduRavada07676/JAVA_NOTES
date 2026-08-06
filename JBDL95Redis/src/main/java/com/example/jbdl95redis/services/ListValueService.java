package com.example.jbdl95redis.services;

import com.example.jbdl95redis.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListValueService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String KEY = "person_list";

    public Long lpush(Person person) {
        return this.redisTemplate.opsForList().leftPush(KEY, person);
    }


    List<Person> l1 = new ArrayList<>();



    public List<Person> lpop(Integer count) {
        return this.redisTemplate.opsForList().leftPop(KEY, count)
                .stream()
                .map(x -> (Person)x)
                .collect(Collectors.toList());

//        for(Object obj:res){
//            l1.add((Person)obj);
//        }
//        return l1;
    }

    public Long rpush(Person person) {
        return this.redisTemplate.opsForList().rightPush(KEY, person);
    }

    public List<Person> rpop(Integer count) {
        return this.redisTemplate.opsForList().rightPop(KEY,count)
                .stream()
                .map(x -> (Person)x)
                .collect(Collectors.toList());
    }

    public List<Person> lrange(Integer start, Integer end) {
        return this.redisTemplate.opsForList().range(KEY,start,end)
                .stream()
                .map(x -> (Person)x)
                .collect(Collectors.toList());
    }
}
