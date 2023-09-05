package com.projeOne.studentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeOne.studentsystem.model.Student;
import com.projeOne.studentsystem.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

  @Autowired
  public StudentService studentService;

  @PostMapping("/add")
  public String add(@RequestBody Student student){
    studentService.saveStudent(student);
    return "New student is added";
  }

  @GetMapping("/all")
  public List<Student> getAll(){
    
    return studentService.getAllStudents();
  }
  
}
