package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LombokDemoApplication.class, args);

        System.out.println("Hell world");
    }

}
