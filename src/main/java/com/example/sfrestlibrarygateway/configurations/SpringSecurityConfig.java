package com.example.sfrestlibrarygateway.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SpringSecurityConfig {
    @Bean
    public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity httpSecurity) {
         httpSecurity.csrf().disable()
                .authorizeExchange()
                .anyExchange().authenticated()
                .and()
                .oauth2ResourceServer().jwt();

         return httpSecurity.build();
    }
}
