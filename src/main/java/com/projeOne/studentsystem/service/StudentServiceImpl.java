package com.projeOne.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.projeOne.studentsystem.model.Student;
import com.projeOne.studentsystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

  @Autowired
  public StudentRepository studentRepository;


  @Override
  public Student saveStudent(Student student) {
   return  studentRepository.save(student);
  }


  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }



  
}
