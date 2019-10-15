package com.example.demo;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.Set;

@Builder
@ToString
public class StudentBuilder {
    @Builder.Default private long created = System.currentTimeMillis();
    private final String name;
    private final int age;
    @Singular final Set<String> courses;
}
