package com.example.ss6jwt.config;

import com.example.ss6jwt.services.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Autowired
    private DatabaseService databaseService;

    @Bean
    public void initializeDatabase() {
        databaseService.initializeDatabase();
    }

}
