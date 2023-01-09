package com.example.springbootwithpostgreSQL.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.springbootwithpostgreSQL.entity.Customer;
import com.example.springbootwithpostgreSQL.repository.CustomerRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {
        // TODO Auto-generated method stub
        
    }
}