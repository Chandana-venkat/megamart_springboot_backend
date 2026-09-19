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


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }



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
//                        .requestMatchers(
//                                "/users"
//                        ).permitAll()
                        .requestMatchers(
                                "/users",
                                "/users/reset-password"
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



    @Bean
    public CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration configuration =
                new CorsConfiguration();



        configuration.setAllowedOriginPatterns(
                Arrays.asList(
                        "http://localhost:5173",
                        "https://*.vercel.app"
                )
        );



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



        configuration.setAllowedHeaders(
                Arrays.asList("*")
        );



        configuration.setExposedHeaders(
                Arrays.asList(
                        "Authorization"
                )
        );



        configuration.setAllowCredentials(true);


      
        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();

        source.registerCorsConfiguration(
                "/**",
                configuration
        );

        return source;
    }
}