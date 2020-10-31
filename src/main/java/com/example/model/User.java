package com.example.model;


import lombok.Data;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Data
@Service
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "address")
    private String address;
    @Column(name = "phoneNumber")
    private int phoneNumber;
    @Column(name = "email")
    private String email;
}
