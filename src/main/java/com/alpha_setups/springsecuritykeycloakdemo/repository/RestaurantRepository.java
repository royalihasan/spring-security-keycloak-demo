package com.alpha_setups.springsecuritykeycloakdemo.repository;

import com.alpha_setups.springsecuritykeycloakdemo.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
