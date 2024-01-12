package com.alpha_setups.springsecuritykeycloakdemo.repository;

import java.util.List;

import com.alpha_setups.springsecuritykeycloakdemo.entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long>{

	List<MenuItem> findAllByMenuId(Long id);

}
