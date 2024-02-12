package com.example.Studentbackend.mapper;

import com.example.Studentbackend.dto.StudentDto;
import com.example.Studentbackend.entity.Student;

public class StudentMapper {
//    This is Mapper from entity to Dto
    public static StudentDto mapToStudentDto(Student student){
        return new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
    }
//    This is Mapper From Dto to Entity
    public static Student mapToStudent(StudentDto studentDto){
        return new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail()
        );
    }
}
