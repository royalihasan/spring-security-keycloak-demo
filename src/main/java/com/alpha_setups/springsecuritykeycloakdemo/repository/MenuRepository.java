package com.alpha_setups.springsecuritykeycloakdemo.repository;

import com.alpha_setups.springsecuritykeycloakdemo.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MenuRepository  extends JpaRepository<Menu, Long>{

	Menu findByRestaurantId(Long restaurantId);
}
