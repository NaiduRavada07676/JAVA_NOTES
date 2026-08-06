package com.example.jbdl95redis.controller;

import com.example.jbdl95redis.dtos.CreatePersonRequest;
import com.example.jbdl95redis.model.Person;
import com.example.jbdl95redis.services.ListValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ListValueController {

    @Autowired
    private ListValueService listValueService;


    @PostMapping("/lpush")
    public Long lpush(@RequestBody CreatePersonRequest createPersonRequest) {
        return this.listValueService.lpush(createPersonRequest.toPerson());
    }

    @PostMapping("/lpop")
    public List<Person> lpop(@RequestParam(name = "count",required = false,defaultValue = "1")Integer count) {
        return this.listValueService.lpop(count);
    }

    @PostMapping("/rpush")
    public Long rpush(@RequestBody CreatePersonRequest createPersonRequest) {
        return this.listValueService.rpush(createPersonRequest.toPerson());
    }

    @PostMapping("/rpop")
    public List<Person> rpop(@RequestParam(name = "count",required = false,defaultValue = "1")Integer count) {
        return this.listValueService.rpop(count);
    }

    @GetMapping("/lrange")
    public List<Person> lrange(@RequestParam(name = "start",required = false,defaultValue = "0")Integer start,
                               @RequestParam(name = "end",required = false,defaultValue = "-1")Integer end){
        return this.listValueService.lrange(start,end);
    }
}
