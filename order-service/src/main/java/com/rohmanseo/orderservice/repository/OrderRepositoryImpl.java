package com.rohmanseo.orderservice.repository;

import com.rohmanseo.orderservice.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    private static OrderRepositoryImpl orderRepository;
    private final List<Order> orders = new ArrayList<>();
    public static OrderRepositoryImpl getInstance(){
        if (orderRepository == null){
            orderRepository = new OrderRepositoryImpl();
        }
        return orderRepository;
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public void add(Order product) {
        orders.add(product);
    }
}
