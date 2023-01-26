package com.toybox.demo.entity;

import com.toybox.demo.dto.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Builder
    public User(String email){
        this.email = email;
    }
}