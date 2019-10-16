package com.example.demo;

import lombok.SneakyThrows;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;


@SpringBootApplication
@Slf4j
public class LombokDemoApplication {

    @SneakyThrows
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


        // MARK: Bijan's 42
        // Lombok student builder
        StudentBuilder studentA = StudentBuilder.builder()
                .name("Bijan")
                .age(28)
                .course("CS5320")
                .course("CS3220")
                .build();

        System.out.println(studentA);

//        CAN I DO THIS.....??? hmmmmmmmmmmmm
//        studentA.courses.add("FIRE");
        
       //Paul Getter(lazy=true)
        val bank = new LombokBank("The Bank of Paul", "123 Fake St", "(310) 555-9478", 94567.98);
        
        System.out.println(bank);
        
        LombokBank bank2 = bank.withPhoneNumber("(310) 555-9999");
        
        System.out.println(bank2);
        
        var number = 10;
        System.out.printf("number is set to int based on %d being the value\n", number);
        
        @Cleanup Scanner input = new Scanner(System.in);
        System.out.println("Input anything!");
        String userInput = input.next();
        System.out.println(userInput);
        
        
        
    }
}
