package com.example.demo;

import lombok.*;

@Getter 
@Setter 
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor //Generates constructor that takes one arg per final/@NonNull class
@AllArgsConstructor//Generates constructor that takes one argument for every field
public class LombokStudent {
	
	private final int id;
	private String name;	
	private String major;
	

}
