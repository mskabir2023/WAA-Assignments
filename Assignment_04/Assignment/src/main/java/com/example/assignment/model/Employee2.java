package com.example.assignment.model;

import jakarta.persistence.*;

@Entity
public class Employee2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Office office;

}

