package com.example.catalogservice.web.Controllers;

import com.example.catalogservice.domain.DTO.Product;
import com.example.catalogservice.domain.DTO.ProductNotFoundException;
import com.example.catalogservice.domain.PagedResult;
import com.example.catalogservice.domain.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
 class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);
    private final ProductService   productService;

     ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping
    PagedResult<Product> getProducts(@RequestParam(name="page",defaultValue = "1") int pageNo){


    return productService.getProducts(pageNo);



    }

    @GetMapping("/{code}")
    ResponseEntity<Product> getProductByCode(@PathVariable String code){

         return productService.getProductByCode(code)
                 .map(ResponseEntity::ok)
                 .orElseThrow(() -> ProductNotFoundException.forCode(code));
    }

    @GetMapping("/log")
    String logging(){
         logger.info("log info");
         logger.debug("log debug");
         logger.trace("log trace");
         logger.warn("log warn");
         logger.error("log error");

         return "logging done";
    }

}
