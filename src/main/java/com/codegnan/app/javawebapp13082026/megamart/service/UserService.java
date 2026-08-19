package com.codegnan.app.javawebapp13082026.megamart.service;

import com.codegnan.app.javawebapp13082026.megamart.entity.User;
import com.codegnan.app.javawebapp13082026.megamart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.codegnan.app.javawebapp13082026.megamart.exception.UnauthorizedException;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    // Get all users
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }


    // Register user
//    public User registerUser(User user) {
//
//        user.setPassword(
//                passwordEncoder.encode(user.getPassword())
//        );
//
//        return userRepository.save(user);
//    }
    public User registerUser(User user) {

        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email already registered");
        }

        user.setPassword(
                passwordEncoder.encode(user.getPassword())
        );

        return userRepository.save(user);
    }
    public User resetPassword(String email, String newPassword) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));

        user.setPassword(
                passwordEncoder.encode(newPassword)
        );

        return userRepository.save(user);
    }

    // Login user
//    public User loginUser(String email, String password) {
//
//        User user = userRepository.findByEmail(email)
//                .orElseThrow(() ->
//                        new RuntimeException("Invalid Email Or Password")
//                );
//
//        if (!passwordEncoder.matches(
//                password,
//                user.getPassword()
//        )) {
//
//            throw new RuntimeException("Invalid Email Or Password");
//        }
//
//        return user;
//    }
    public User loginUser(String email, String password) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UnauthorizedException(
                                "Invalid Email Or Password"
                        )
                );

        if (!passwordEncoder.matches(
                password,
                user.getPassword())) {

            throw new UnauthorizedException(
                    "Invalid Email Or Password"
            );
        }

        return user;
    }
}