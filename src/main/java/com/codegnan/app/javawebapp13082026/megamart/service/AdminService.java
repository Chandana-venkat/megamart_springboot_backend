package com.codegnan.app.javawebapp13082026.megamart.service;



import com.codegnan.app.javawebapp13082026.megamart.entity.Admin;
import com.codegnan.app.javawebapp13082026.megamart.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Admin registerAdmin(Admin admin) {

        if (adminRepository.findByEmail(admin.getEmail()).isPresent()) {
            throw new RuntimeException("Admin email already registered");
        }

        admin.setPassword(
                passwordEncoder.encode(admin.getPassword())
        );

        return adminRepository.save(admin);
    }

    public Admin loginAdmin(String email, String password) {

        Admin admin = adminRepository.findByEmail(email)
                .orElseThrow(() ->
                        new RuntimeException("Invalid Admin Email or Password")
                );

        if (!passwordEncoder.matches(
                password,
                admin.getPassword())) {

            throw new RuntimeException(
                    "Invalid Admin Email or Password"
            );
        }

        return admin;
    }
}