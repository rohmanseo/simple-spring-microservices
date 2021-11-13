package com.rohmanseo.productservice.repository;

import com.rohmanseo.productservice.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private static ProductRepositoryImpl productRepository;
    private final List<Product> products = new ArrayList<>();
    public static ProductRepositoryImpl getInstance(){
        if (productRepository == null){
            productRepository = new ProductRepositoryImpl();
        }
        return productRepository;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }
}
