package com.example.springbootwithpostgreSQL.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppRepository {
    public String message(String firstName) {
        return "Hello " + firstName + "!";
    }
}
