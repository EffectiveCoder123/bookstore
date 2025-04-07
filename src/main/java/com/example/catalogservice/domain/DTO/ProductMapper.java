package com.example.catalogservice.domain.DTO;

import com.example.catalogservice.domain.ProductEntity;

public class ProductMapper {
    public static Product toProduct(ProductEntity productEntity){

        return new Product(
                productEntity.getCode(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getImageUrl(),
                productEntity.getPrice()
        );
    }
}
