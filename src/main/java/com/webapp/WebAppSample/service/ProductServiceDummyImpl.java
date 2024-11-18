package com.webapp.WebAppSample.service;

import com.webapp.WebAppSample.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductServiceDummyImpl implements ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Product1", 50000),
            new Product(102, "Product2", 3560),
            new Product(103, "Product3", 49800),
            new Product(104, "Product4", 1000),
            new Product(105, "Product5", 2500)
    ));

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product getProductById(int productId) {
        return products.stream().filter(p ->  p.getProdId() == productId).findFirst().orElse(new Product(0, "No Product available", 0));
    }

    @Override
    public boolean addProduct(Product product) {
        return products.add(product);
    }

    @Override
    public boolean updateProduct(Product product) {
        int index = -1;
        for (int i = 0; i< products.size(); i++) {
            if (products.get(i).getProdId() == product.getProdId()) {
                index = i;
            }
        }
        if (index != -1) {
            products.set(index, product);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteProduct(int productId) {
        int index = -1;
        for (int i = 0; i< products.size(); i++) {
            if (products.get(i).getProdId() == productId) {
                index = i;
            }
        }
        if (index != -1) {
            products.remove(index);
        } else {
            return false;
        }
        return true;
    }
}