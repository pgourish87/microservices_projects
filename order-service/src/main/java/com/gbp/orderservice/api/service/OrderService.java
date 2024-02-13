package com.gbp.orderservice.api.service;

import com.gbp.orderservice.api.entity.Order;
import com.gbp.orderservice.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public Order saveOrder(Order order) {
        return repository.save(order);
    }
}
