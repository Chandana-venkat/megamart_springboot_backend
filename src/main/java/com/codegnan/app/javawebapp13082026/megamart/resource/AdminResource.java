package com.codegnan.app.javawebapp13082026.megamart.resource;
import com.codegnan.app.javawebapp13082026.megamart.entity.Admin;
import com.codegnan.app.javawebapp13082026.megamart.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:5173")
public class AdminResource {

    @Autowired
    private AdminService adminService;

    @PostMapping("/register")
    public Admin registerAdmin(@Valid @RequestBody Admin admin) {
        return adminService.registerAdmin(admin);
    }

    @PostMapping("/login")
    public Admin loginAdmin(
            @RequestParam String email,
            @RequestParam String password) {

        return adminService.loginAdmin(email, password);
    }
}