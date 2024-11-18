package com.webapp.WebAppSample.controller;

import com.webapp.WebAppSample.model.Product;
import com.webapp.WebAppSample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public boolean addProduct(@RequestBody Product prod) {
        return productService.addProduct(prod);
    }

    @PutMapping("/products")
    public boolean updateProduct(@RequestBody Product prod) {
        return productService.updateProduct(prod);
    }

    @DeleteMapping("/products/{id}")
    public boolean deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

}
