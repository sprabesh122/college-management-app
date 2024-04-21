package com.example.collegemanagementapp;

import lombok.*;
import lombok.experimental.FieldDefaults;

//to optimise the code using annotation
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor //to generate default constructor
@AllArgsConstructor //to generate all args constructor
@Getter //to generate getters and setters
@Setter

public class Student {
//    step1: specify the variables needed
     int id;
     String name;
     int age;
     long mobile;
     String department;

    //    step2: create default constructor
    //  step3:  generate all arc constructors
    //    step4: getters and setters
}
