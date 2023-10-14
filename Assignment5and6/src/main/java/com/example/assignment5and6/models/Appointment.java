package com.example.assignment5and6.models;

import jakarta.persistence.*;

@Entity

public class Appointment {
    @Id
    @GeneratedValue
    private Long id;
    private String appdate;

    @Embedded
    private Payment payment;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
}
