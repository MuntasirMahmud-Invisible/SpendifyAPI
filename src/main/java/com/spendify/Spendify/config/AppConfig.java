package com.spendify.Spendify.config;


import com.spendify.Spendify.security.JwtRequestFilter;
import com.spendify.Spendify.security.JwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public JwtRequestFilter jwtRequestFilter(JwtUtil jwtUtil) {
        return new JwtRequestFilter(jwtUtil);
    }
}