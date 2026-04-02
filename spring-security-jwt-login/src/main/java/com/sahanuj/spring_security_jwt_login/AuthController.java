package com.sahanuj.spring_security_jwt_login;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AuthController {

    @PostMapping("login")
    public String login(@RequestBody AuthRequest request) {

        if ("admin".equals(request.username) && "admin123".equals(request.password)) {
            return JwtUtil.generateToken(request.username);
        }

        return "Invalid Credentials";
    }
}