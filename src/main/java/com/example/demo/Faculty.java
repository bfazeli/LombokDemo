package com.example.demo;

import lombok.*;

//same as having implicit @Getter, @Setter, @ToString, 
//@EqualsAndHashCode and @RequiredArgsConstructor
@Data
public class Faculty {
	private final int id;
	//@NonNull generates a null-check statement in the constructor (in this case) or at the
	//top of a method when a method parameter is annotated with @NonNull
	private @NonNull String name;
	private String department;
}
