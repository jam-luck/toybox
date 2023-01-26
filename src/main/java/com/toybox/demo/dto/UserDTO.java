package com.toybox.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String email;

    public UserDTO(String email){
        this.email = email;
    }
}
