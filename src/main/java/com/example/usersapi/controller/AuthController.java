package com.example.usersapi.controller;

import com.example.usersapi.dto.LoginRequest;
import com.example.usersapi.dto.LoginResponse;
import com.example.usersapi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {
        boolean valid = userService.validateLogin(request.getLogin(), request.getPassword());
        return new LoginResponse(valid);
    }
}



