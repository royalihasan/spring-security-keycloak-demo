package com.alpha_setups.springsecuritykeycloakdemo.controllers;

import com.alpha_setups.springsecuritykeycloakdemo.entities.Order;
import com.alpha_setups.springsecuritykeycloakdemo.entities.OrderItem;
import com.alpha_setups.springsecuritykeycloakdemo.repository.OrderItemRepository;
import com.alpha_setups.springsecuritykeycloakdemo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    OrderItemRepository orderItemRepository;

    @GetMapping
    @RequestMapping("/{restaurantId}/list")
    // manager can access (suresh)
    public List<Order> getOrders(@PathVariable Long restaurantId) {
        return orderRepository.findByRestaurantId(restaurantId);
    }

    @GetMapping
    @RequestMapping("/{orderId}")
    // manager can access (suresh)
    public Order getOrderDetails(@PathVariable Long orderId) {
        Order order = orderRepository.findById(orderId).get();
        order.setOrderItems(orderItemRepository.findByOrderId(order.getId()));
        return order;
    }

    @PostMapping
    // authenticated users can access
    public Order createOrder(Order order) {
        orderRepository.save(order);
        List<OrderItem> orderItems = order.getOrderItems();
        orderItems.forEach(orderItem -> {
            orderItem.setOrderId(order.id);
            orderItemRepository.save(orderItem);
        });
        return order;
    }

}
