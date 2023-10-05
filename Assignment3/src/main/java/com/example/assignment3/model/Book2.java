package com.example.assignment3.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book2 {
    private int isbn;
    private String title;
    private String author;
    private String edition;
}
