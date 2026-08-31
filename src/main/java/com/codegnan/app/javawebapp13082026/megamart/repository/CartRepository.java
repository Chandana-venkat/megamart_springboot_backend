package com.codegnan.app.javawebapp13082026.megamart.repository;

import com.codegnan.app.javawebapp13082026.megamart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {

    List<Cart> findByUserEmail(String userEmail);

    List<Cart> findByUserEmailAndProductId(String userEmail, Long productId);
}