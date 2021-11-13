package com.rohmanseo.orderservice.repository;


import com.rohmanseo.orderservice.model.Order;

import java.util.List;


public interface OrderRepository {

    List<Order> findAll();
    void add(Order product);

}
