package com.example.Studentbackend.service;

import com.example.Studentbackend.dto.StudentDto;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    StudentDto getStudentById(Long studentId);
    StudentDto updateStudent(Long studentId, StudentDto updateStudentDto);
}
