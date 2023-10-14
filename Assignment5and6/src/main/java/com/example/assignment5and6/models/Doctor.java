package com.example.assignment5and6.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
    @Id
    private Long id;
    private String doctortype;
    private String firstname;
    private String lastname;
}