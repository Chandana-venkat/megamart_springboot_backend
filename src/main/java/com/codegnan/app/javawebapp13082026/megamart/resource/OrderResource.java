package com.codegnan.app.javawebapp13082026.megamart.resource;

import com.codegnan.app.javawebapp13082026.megamart.entity.Order;
import com.codegnan.app.javawebapp13082026.megamart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "http://localhost:5173")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getOrders(
            @RequestParam(required = false) String email) {

        if (email != null && !email.isEmpty()) {
            return orderService.getOrdersByEmail(email);
        }

        return orderService.getAllOrders();
    }
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable String id) {

        return orderService.getOrderById(id);
    }

    @PostMapping
    public Order createOrder(@Valid @RequestBody Order order) {

        return orderService.createOrder(order);
    }

    @PatchMapping("/{id}")
    public Order updateStatus(
            @PathVariable String id,
            @RequestBody Map<String, String> request) {

        String status = request.get("status");

        if (status == null || status.isBlank()) {
            throw new RuntimeException("Status is required");
        }

        return orderService.updateStatus(id, status);
    }
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable String id) {

        orderService.deleteOrder(id);
    }
}