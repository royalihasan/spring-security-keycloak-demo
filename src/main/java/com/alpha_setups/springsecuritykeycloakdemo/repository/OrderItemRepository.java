package com.alpha_setups.springsecuritykeycloakdemo.repository;

import java.util.List;

import com.alpha_setups.springsecuritykeycloakdemo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	List<OrderItem> findByOrderId(Long id);

}
