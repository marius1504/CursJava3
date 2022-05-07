package com.example.curs15.controllers;

import model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeworkController {
    private static final String AUTHENTICATION = "authentication";
    private static final String API_KEY = "devmind-api-key";

    @PostMapping(value = "/messages", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <Message>postMessages(
            @RequestBody Message message,
            @RequestHeader(value = AUTHENTICATION) String header) {

        if (header.equals(API_KEY)) {
            return new ResponseEntity<>(message, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(message, HttpStatus.UNAUTHORIZED);
    }


}