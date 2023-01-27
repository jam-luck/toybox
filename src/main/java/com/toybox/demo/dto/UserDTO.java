package com.toybox.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private String email;

    public UserDTO(String email){
        this.email = email;
    }
}
