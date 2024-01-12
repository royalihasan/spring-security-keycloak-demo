package com.alpha_setups.springsecuritykeycloakdemo.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private Long orderId;

    private Long menuItemId;

    private BigDecimal price;


    
}
