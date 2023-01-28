package com.toybox.demo.controller;

import com.toybox.demo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @PostMapping("/login")
    public String login(@RequestBody User user){
        if(isValid(user)){

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
