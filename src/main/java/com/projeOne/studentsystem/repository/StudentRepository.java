package com.projeOne.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeOne.studentsystem.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
  
}
