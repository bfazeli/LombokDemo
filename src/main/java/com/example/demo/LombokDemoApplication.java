package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LombokDemoApplication.class, args);
        
        //Create a LombokStudent using @RequiredArgsConstructor
        LombokStudent alex = new LombokStudent(1);
        alex.setName("Alex");
        alex.setMajor("Computer Science");
       
        //Print student info Using @ToString
        System.out.println("Alex's info using @ToString -> " + alex);
        
        //Create a LombokStudent using @AllArgsConstructor
        LombokStudent james = new LombokStudent(2, "James", " Math");
        
        //Print student info using @Getter
        System.out.println("James' info using @Getter -> id: " +
        		james.getId() + " name: " + james.getName() 
        		+ " major: " + james.getMajor());
   
        //Create a clone of alex to test @EqualsAndHashCode
        LombokStudent alexClone = new LombokStudent(1, "Alex", "Computer Science");
        if(alex.equals(alexClone)) {
        	System.out.println("Alex's hash code: " + alex.hashCode());
        	System.out.println("Alex's clone's hash code: " + alexClone.hashCode());
        	System.out.println("James' hash code: " + james.hashCode());
        }     
        
        //Create Faculty and test @Data and @NonNull
        try
        { 
        	//Will throw NPE because Faculty.name is annotated with @NonNull
        	Faculty joe = new Faculty(3, null);             
        } 
        catch(NullPointerException e) 
        { 
            System.out.println(e); 
            Faculty joe = new Faculty(3, "Joe");
            joe.setDepartment(null);
            System.out.println(joe);
        } 
        
     
      
    }
}
