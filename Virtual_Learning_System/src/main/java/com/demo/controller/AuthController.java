package com.demo.controller;

import com.demo.entity.LoginEntity;
import com.demo.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginEntity loginEntity) {
        if (authService.authenticate(loginEntity.getLoginId(), loginEntity.getPassword())) {
            return "Login Successful";
        }
        return "Login Failed";
    }

}

