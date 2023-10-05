package com.example.assignment3.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {

//    : Id(int), title(string), isbn(string), price(double).
    private  int id;
    private  String title;
    private  double price;
    private  String isbn;


}
