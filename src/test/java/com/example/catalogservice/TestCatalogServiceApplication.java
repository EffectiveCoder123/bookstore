package com.example.catalogservice;

import org.springframework.boot.SpringApplication;

public class TestCatalogServiceApplication {

    public static void main(String[] args) {
        System.out.println(" test stared 5");
        SpringApplication.from(CatalogServiceApplication::main)
                .with(TestcontainersConfiguration.class)
                .run(args);
    }
}
