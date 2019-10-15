package com.example.demo;

import lombok.Data;

// If you want all the methods for Alien
// Specify @Data in between public and class
// Other wise use the annotations for what you want
public @Data class Alien {
    private int age;
    private String name;
    private String tech;
}


