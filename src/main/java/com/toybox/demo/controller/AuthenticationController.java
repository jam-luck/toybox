package com.toybox.demo.controller;

import com.toybox.demo.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AuthenticationController {
    private static final long EXPIRATION_TIME = 10240;
    private static final String SECRET = "this is secret";
    @PostMapping("/login")
    public String login(@RequestBody User user){
        if(isValid(user)){
            String token = Jwts.builder()
                    .setSubject(user.getEmail())
                    .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                    .signWith(SignatureAlgorithm.HS512, SECRET)
                    .compact();
            return token;
        }
        return "Invalid Token";
    }
    public boolean isValid(User user){
        // DB유저 확인
        return true;
        // else
        // return false;
    }
}
