package com.codegnan.app.javawebapp13082026.megamart.config;

import com.codegnan.app.javawebapp13082026.megamart.security.JwtAuthenticationFilter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
public class SecurityConfig {

    // =========================
    // PASSWORD ENCODER
    // =========================
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    // =========================
    // SECURITY FILTER CHAIN
    // =========================
    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http,
            JwtAuthenticationFilter jwtAuthenticationFilter) throws Exception {

        http

                // Enable CORS
                .cors(cors ->
                        cors.configurationSource(
                                corsConfigurationSource()
                        )
                )

                // Disable CSRF because we are using JWT
                .csrf(csrf -> csrf.disable())

                // Stateless session
                .sessionManagement(session ->
                        session.sessionCreationPolicy(
                                SessionCreationPolicy.STATELESS
                        )
                )

                // =========================
                // AUTHORIZATION
                // =========================
                .authorizeHttpRequests(auth -> auth

                        // Allow CORS preflight requests
                        .requestMatchers(
                                HttpMethod.OPTIONS,
                                "/**"
                        ).permitAll()


                        // Authentication APIs
                        .requestMatchers(
                                "/auth/**"
                        ).permitAll()


                        // User registration/access
                        .requestMatchers(
                                "/users"
                        ).permitAll()


                        // Product APIs are public
                        .requestMatchers(
                                "/products/**"
                        ).permitAll()


                        // Cart APIs
                        .requestMatchers(
                                "/cart/**"
                        ).permitAll()


                        // Wishlist APIs
                        .requestMatchers(
                                "/wishlist/**"
                        ).permitAll()


                        // Everything else requires authentication
                        .anyRequest().authenticated()
                )


                // JWT filter
                .addFilterBefore(
                        jwtAuthenticationFilter,
                        UsernamePasswordAuthenticationFilter.class
                );

        return http.build();
    }


    // =========================
    // CORS CONFIGURATION
    // =========================
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration configuration =
                new CorsConfiguration();


        // =========================
        // ALLOWED FRONTENDS
        // =========================
        configuration.setAllowedOriginPatterns(
                Arrays.asList(
                        "http://localhost:5173",
                        "https://*.vercel.app"
                )
        );


        // =========================
        // ALLOWED HTTP METHODS
        // =========================
        configuration.setAllowedMethods(
                Arrays.asList(
                        "GET",
                        "POST",
                        "PUT",
                        "PATCH",
                        "DELETE",
                        "OPTIONS"
                )
        );


        // =========================
        // ALLOWED HEADERS
        // =========================
        configuration.setAllowedHeaders(
                Arrays.asList("*")
        );


        // =========================
        // EXPOSED HEADERS
        // =========================
        configuration.setExposedHeaders(
                Arrays.asList(
                        "Authorization"
                )
        );


        // =========================
        // CREDENTIALS
        // =========================
        configuration.setAllowCredentials(true);


        // =========================
        // REGISTER CORS CONFIG
        // =========================
        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();

        source.registerCorsConfiguration(
                "/**",
                configuration
        );

        return source;
    }
}