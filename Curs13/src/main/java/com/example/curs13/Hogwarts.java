package com.example.curs13;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

@Component
public class Hogwarts {

    Faker faker = new Faker();
    public String getName() {
        return faker.harryPotter().character();
    }
}
