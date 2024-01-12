package com.alpha_setups.springsecuritykeycloakdemo.repository;

import com.alpha_setups.springsecuritykeycloakdemo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByRestaurantId(Long restaurantId);

}
