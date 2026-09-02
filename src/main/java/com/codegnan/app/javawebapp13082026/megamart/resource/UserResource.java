package com.codegnan.app.javawebapp13082026.megamart.resource;

import com.codegnan.app.javawebapp13082026.megamart.entity.User;
import com.codegnan.app.javawebapp13082026.megamart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://megamart-frontend-six.vercel.app"
})
public class UserResource {
    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }


    @PostMapping
    public User saveUser(@RequestBody User user) {

        return userService.registerUser(user);
    }
    @PatchMapping("/reset-password")
    public User resetPassword(
            @RequestParam String email,
            @RequestParam String newPassword) {

        return userService.resetPassword(email, newPassword);
    }

    @PostMapping("/login")
    public User login(
            @RequestParam String email,
            @RequestParam String password) {

        return userService.loginUser(email, password);
    }
}