//package com.codegnan.app.javawebapp13082026.megamart.config;
//
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//import org.springframework.core.annotation.Order;
//
//import java.util.Arrays;
//
//@Configuration
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class CorsConfig {
//
//    @Bean
//    public CorsFilter corsFilter() {
//
//        CorsConfiguration config = new CorsConfiguration();
//
//        config.setAllowedOrigins(Arrays.asList(
//                "http://localhost:5173",
//                "https://megamart-frontend-4v0k4pzoj-chandana-venkats-projects.vercel.app",
//                "https://megamart-frontend-six.vercel.app",
//                "https://megamart-frontend-git-main-chandana-venkats-projects.vercel.app"
//        ));
//
//        config.setAllowedMethods(Arrays.asList(
//                "GET",
//                "POST",
//                "PUT",
//                "PATCH",
//                "DELETE",
//                "OPTIONS"
//        ));
//
//        config.setAllowedHeaders(Arrays.asList(
//                "Authorization",
//                "Content-Type",
//                "Accept",
//                "Origin"
//        ));
//
//        config.setExposedHeaders(Arrays.asList(
//                "Authorization"
//        ));
//
//        config.setAllowCredentials(true);
//
//        UrlBasedCorsConfigurationSource source =
//                new UrlBasedCorsConfigurationSource();
//
//        source.registerCorsConfiguration("/**", config);
//
//        return new CorsFilter(source);
//    }
//}