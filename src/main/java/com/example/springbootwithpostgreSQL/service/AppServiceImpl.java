package com.example.springbootwithpostgreSQL.service;

import org.springframework.stereotype.Service;
import com.example.springbootwithpostgreSQL.repository.AppRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AppServiceImpl implements AppService {

    AppRepository appRepository;

    public String message(String firstName) {
        return appRepository.message(firstName);
    }
}
