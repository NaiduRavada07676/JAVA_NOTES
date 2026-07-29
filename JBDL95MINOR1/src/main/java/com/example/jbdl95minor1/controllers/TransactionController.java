package com.example.jbdl95minor1.controllers;

import com.example.jbdl95minor1.models.TransactionType;
import com.example.jbdl95minor1.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/txn")
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    @PostMapping("/initiate")
    public String createTxn(@RequestParam Integer studentId,
                            @RequestParam Integer bookId,
                            @RequestParam TransactionType transactionType) throws Exception {

        return transactionService.initiate(studentId,bookId,transactionType);

    }
}
