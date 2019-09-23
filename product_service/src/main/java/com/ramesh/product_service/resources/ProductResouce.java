package com.ramesh.product_service.resources;

import com.ramesh.product_service.models.Product;
import com.ramesh.product_service.models.ProductList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResouce {

    @RequestMapping("getProducts")
    public ProductList getProductInfo() {
        List<Product> products=Arrays.asList(
                new Product("Trimmer", "Electronic", "$5.0", "1"),
                new Product("Power Bank", "Electronic", "$5.0", "2"),
                new Product("Ear phones", "Electronic", "$5.0", "2"),
                new Product("Laptop", "Electronic", "$5.0", "4"),
                new Product("Monitor", "Electronic", "$5.0", "5"),
                new Product("Mirror", "Accessories", "$5.0", "6"),
                new Product("Bat", "Sports", "$5.0", "7")
        );
        return new ProductList(products);
    }
}
