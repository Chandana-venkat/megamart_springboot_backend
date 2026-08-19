package com.codegnan.app.javawebapp13082026.megamart.repository;



import com.codegnan.app.javawebapp13082026.megamart.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {

    Optional<Admin> findByEmail(String email);
}