package com.example.onetomanytest;

import com.example.onetomanytest.service.IDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyTestApplication {
    private final IDatabase iDatabase;

    public OneToManyTestApplication(IDatabase database) {
        this.iDatabase = database;
    }

    public static void main(String[] args) {
        SpringApplication.run(OneToManyTestApplication.class, args);
    }

}
