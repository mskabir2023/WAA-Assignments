package com.example.homework2.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Product {
    private int id;
    private String title;
    private  String description;
    private  double price;

}
