package com.example.assignment.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;



@Data
@Entity
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany()
    private List<Employee2> employee2;

}

