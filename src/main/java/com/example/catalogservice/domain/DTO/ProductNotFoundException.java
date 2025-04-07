package com.example.catalogservice.domain.DTO;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String message) {
        super(message);
    }

    public static ProductNotFoundException forCode(String code){
        return new ProductNotFoundException("Product not found with code:"+ code);
    }
}
