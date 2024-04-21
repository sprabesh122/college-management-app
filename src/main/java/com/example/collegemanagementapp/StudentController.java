package com.example.collegemanagementapp;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer, Student> studenDb = new HashMap<>();

//    api to add a student, api = code+endpoint
    @PostMapping("/student/add")
    public String addStudent(@RequestBody Student student){
        if(studenDb.containsKey(student.getId())){
            return "Student already Registered";
        }

        studenDb.put(student.getId(),student);
        return "Student registered succesfully";
    }

    @GetMapping("/student/get")
    public Student getStudent(@RequestParam("id") int id){
        return studenDb.get(id);
    }

    //passing name itself in the endpoint
    @GetMapping("/student/get/{name}/{age}")
    public Student getStudentByName(@PathVariable("name") String name, @PathVariable("age") int age){
        for(Integer x:studenDb.keySet()){
            if(studenDb.get(x).getName().equals(name)){
                studenDb.get(x).setAge(age);
                return studenDb.get(x);
            }
        }

        return null;
    }
}
