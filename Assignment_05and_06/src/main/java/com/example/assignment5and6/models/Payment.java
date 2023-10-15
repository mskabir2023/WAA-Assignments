package com.example.assignment5and6.models;

import jakarta.persistence.Embeddable;

@Embeddable
public class Payment {

    private String paydate;
    private double amount;
}
