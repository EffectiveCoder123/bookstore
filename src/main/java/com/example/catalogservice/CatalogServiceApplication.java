package com.example.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CatalogServiceApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(CatalogServiceApplication.class, args);

        for (String name : context.getBeanDefinitionNames())
            System.out.println("Bean name name = " + name);
    }
}
