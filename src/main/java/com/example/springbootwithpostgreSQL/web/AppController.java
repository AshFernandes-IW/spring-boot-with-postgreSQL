package com.example.springbootwithpostgreSQL.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootwithpostgreSQL.service.AppServiceImpl;

import lombok.*;

@AllArgsConstructor
@RestController
public class AppController{

    AppServiceImpl appService;
    
    @GetMapping("/")
    public  ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @GetMapping("/message/{name}")
    public  ResponseEntity<String> getMessage(@PathVariable String name){
        
        return new ResponseEntity<>(appService.message(name), HttpStatus.OK);
    }

}