package com.example.Studentbackend.controller;

import com.example.Studentbackend.dto.StudentDto;
import com.example.Studentbackend.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

//    add Student REST API
    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto){
       StudentDto savedStudent= studentService.createStudent(studentDto);
       return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

//    Get Student By id REST API
    @GetMapping("{id}")
    public ResponseEntity<StudentDto>getStudent(@PathVariable("id") Long studentId){
        StudentDto studentDto= studentService.getStudentById(studentId);
        return  ResponseEntity.ok(studentDto);
    }
    //    Edit Student By id REST API
    @PutMapping("{id}")
    public ResponseEntity<StudentDto> updatedStudent(@PathVariable("id") Long studentId ,@RequestBody StudentDto updateStudentDto){
        StudentDto studentDto= studentService.updateStudent(studentId,updateStudentDto);
        return ResponseEntity.ok(studentDto);
    }
}
