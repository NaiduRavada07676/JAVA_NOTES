package com.example.jbdl95redis.controller;

import com.example.jbdl95redis.dtos.CreatePersonRequest;
import com.example.jbdl95redis.model.Person;
import com.example.jbdl95redis.services.StringValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/string")
public class StringValueController {

    @Autowired
    private StringValueService stringValueService;

    @PostMapping("/create")
    public Person create(@RequestBody CreatePersonRequest createPersonRequest) {

        return this.stringValueService.create(createPersonRequest.toPerson());
    }

    @GetMapping("/get")
    public Person get(@RequestParam String id) {
        return this.stringValueService.get(id);
    }
}
