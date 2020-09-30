package com.example.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "price")
    private float price;
    @Column(name = "type")
    private String type;
    @Column(name = "quantity")
    private int quantity;
}

