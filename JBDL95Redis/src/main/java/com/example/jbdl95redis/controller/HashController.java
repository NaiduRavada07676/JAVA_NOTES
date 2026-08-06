package com.example.jbdl95redis.controller;

import com.example.jbdl95redis.dtos.CreatePersonRequest;
import com.example.jbdl95redis.model.Person;
import com.example.jbdl95redis.services.HashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hash")
public class HashController {

    @Autowired
    private HashService hashService;

    @PostMapping("/hset")
    public Person hset(@RequestBody CreatePersonRequest createPersonRequest){
        return this.hashService.hset(createPersonRequest.toPerson());
    }

    @GetMapping("/getAll")
    public Person getAll(@RequestParam String id){
        return this.hashService.hgetAll(id);
    }

    @GetMapping("/hget")
    public Object get(@RequestParam String id,@RequestParam String field){
        return this.hashService.hget(id,field);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam String id,@RequestParam String field){
        this.hashService.delete(id,field);
    }
}
