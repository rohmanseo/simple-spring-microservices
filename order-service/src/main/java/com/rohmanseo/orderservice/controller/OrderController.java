package com.rohmanseo.orderservice.controller;


import com.rohmanseo.orderservice.model.Order;
import com.rohmanseo.orderservice.repository.OrderRepository;
import com.rohmanseo.orderservice.repository.OrderRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository = OrderRepositoryImpl.getInstance();

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Order product) {
        orderRepository.add(product);

    }
}
