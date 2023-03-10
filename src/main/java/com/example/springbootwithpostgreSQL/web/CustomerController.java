package com.example.springbootwithpostgreSQL.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springbootwithpostgreSQL.entity.Customer;
import com.example.springbootwithpostgreSQL.service.CustomerServiceImpl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class CustomerController {

    CustomerServiceImpl customerService;

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getCustomer() {
        return new ResponseEntity<>(customerService.getCustomers(), HttpStatus.OK);
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> saveCustomer(@javax.validation.Valid @RequestBody Customer customer) {
        customerService.saveCustomer(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}