package com.alpha_setups.springsecuritykeycloakdemo;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SecurityScheme(
        name = "Keycloak"
        , openIdConnectUrl = "http://127.0.0.1:9081/realms/dive-dev/.well-known/openid-configuration"
        , scheme = "bearer"
        , type = SecuritySchemeType.OPENIDCONNECT
        , in = SecuritySchemeIn.HEADER
)
public class SpringSecurityKeycloakDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityKeycloakDemoApplication.class, args);
    }

}
