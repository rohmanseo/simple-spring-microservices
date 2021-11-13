package com.rohmanseo.productservice.repository;

import com.rohmanseo.productservice.model.Product;

import java.util.List;


public interface ProductRepository{

    List<Product> findAll();
    void add(Product product);

}
