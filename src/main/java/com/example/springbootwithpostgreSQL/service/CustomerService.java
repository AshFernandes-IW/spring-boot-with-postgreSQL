package com.example.springbootwithpostgreSQL.service;

import java.util.List;
import com.example.springbootwithpostgreSQL.entity.Customer;

public interface CustomerService {

    List<Customer> getCustomers();
    Customer getCustomerById(Long id);

    void saveCustomer(Customer customer);
    void deleteCustomer(Long id);
}