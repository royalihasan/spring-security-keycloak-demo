package com.alpha_setups.springsecuritykeycloakdemo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IndexController {
    @PreAuthorize("hasRole('default-roles-dive-dev')")
    @GetMapping("/")
    public String index() {
        return "Hello";
    }
}
