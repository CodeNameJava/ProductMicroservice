package com.example.product;

import com.example.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    RestTemplateService restTemplateService;
    @GetMapping(value = "/products")
    public List<Product> getProducts(){
        Product product = new Product("product1","specification1","id1");
        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        return products;
    }


    //Here we will be calling SKU Microservice API
    @GetMapping(value = "/skusForProduct")
    public ResponseEntity<List<Object>> getSkusForProduct(){
       return restTemplateService.getRequestSku();
    }

}
