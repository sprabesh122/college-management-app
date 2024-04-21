package com.example.collegemanagementapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollegeManagementAppApplication {

	public static void main(String[] args) {
		Student s = new Student();
		SpringApplication.run(CollegeManagementAppApplication.class, args);
	}

}
