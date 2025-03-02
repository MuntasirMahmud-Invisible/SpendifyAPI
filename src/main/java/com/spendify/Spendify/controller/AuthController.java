package com.spendify.Spendify.controller;


import com.spendify.Spendify.dto.LoginRequestDto;
import com.spendify.Spendify.model.User;
import com.spendify.Spendify.service.impl.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

//    @PostMapping("/login")
//    public String login(@RequestParam String username, @RequestParam String password) {
//        return authService.login(username, password);
//    }
    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDto loginRequest) {
        return authService.login(loginRequest.getUsername(), loginRequest.getPassword());
    }

}