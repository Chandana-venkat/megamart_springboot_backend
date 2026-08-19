package com.codegnan.app.javawebapp13082026.megamart.service;

import com.codegnan.app.javawebapp13082026.megamart.entity.Order;
import com.codegnan.app.javawebapp13082026.megamart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }

    public List<Order> getOrdersByEmail(String email) {

        return orderRepository.findByEmail(email);
    }
    public Order getOrderById(String id) {

        return orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found"));
    }

    public Order createOrder(Order order) {

        if (order.getStatus() == null || order.getStatus().isEmpty()) {
            order.setStatus("Order Confirmed");
        }

        return orderRepository.save(order);
    }

    public Order updateStatus(String id, String status) {

        Order order = orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found"));

        if (!status.equals("Order Confirmed")
                && !status.equals("Packed")
                && !status.equals("Shipped")
                && !status.equals("Out for Delivery")
                && !status.equals("Delivered")
                && !status.equals("Cancelled")) {

            throw new RuntimeException("Invalid order status");
        }

        order.setStatus(status);

        return orderRepository.save(order);
    }

    public void deleteOrder(String id) {

        Order order = orderRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Order not found"));

        orderRepository.delete(order);
    }
}