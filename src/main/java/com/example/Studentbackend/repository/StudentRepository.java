package com.example.Studentbackend.repository;

import com.example.Studentbackend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


//Extends <Entity, id "Primary Key" used for Crud Methods "database operation"

public interface StudentRepository extends JpaRepository<Student,Long> {
}
