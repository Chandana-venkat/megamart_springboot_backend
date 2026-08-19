package com.codegnan.app.javawebapp13082026.megamart.repository;



import com.codegnan.app.javawebapp13082026.megamart.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


import com.codegnan.app.javawebapp13082026.megamart.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {

    List<Order> findByEmail(String email);
}
