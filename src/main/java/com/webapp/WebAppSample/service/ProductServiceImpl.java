package com.webapp.WebAppSample.service;

import com.webapp.WebAppSample.model.Product;
import com.webapp.WebAppSample.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepo;

    @Override
    public List<Product> getProducts() {
        return  productRepo.findAll();
    }

    @Override
    public Product getProductById(int productId) {
        return productRepo.findById(productId).orElse(new Product(0, "No Product available", 0));
    }

    @Override
    public boolean addProduct(Product product) {
        productRepo.save(product);
        return true;
    }

    @Override
    public boolean updateProduct(Product product) {
        productRepo.save(product);
        return true;
    }

    @Override
    public boolean deleteProduct(int productId) {
        productRepo.deleteById(productId);
        return true;
    }
}