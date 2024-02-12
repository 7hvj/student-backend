package com.example.Studentbackend.service.implemtation;

import com.example.Studentbackend.dto.StudentDto;
import com.example.Studentbackend.entity.Student;
import com.example.Studentbackend.exception.NotFoundException;
import com.example.Studentbackend.mapper.StudentMapper;
import com.example.Studentbackend.repository.StudentRepository;
import com.example.Studentbackend.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    @Override
    public StudentDto createStudent(StudentDto studentDto) {
//        convert Dto into entity to store
        Student student= StudentMapper.mapToStudent(studentDto);
        Student savedStudent= studentRepository.save(student);

//        convert saved entity into dto
        return StudentMapper.mapToStudentDto(savedStudent);
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
//        convert Dto into entity to store
      Student student= studentRepository.findById(studentId)
                .orElseThrow(()-> new NotFoundException("Not Found!!! id: "+studentId));


        return StudentMapper.mapToStudentDto(student);
    }

    @Override
    public StudentDto updateStudent(Long studentId, StudentDto updateStudentDto) {

        Student student=studentRepository.findById(studentId)
                .orElseThrow(
                        ()-> new NotFoundException("The given id not found!")
                );
        student.setFirstName(updateStudentDto.getFirstName());
        student.setLastName(updateStudentDto.getLastName());
        student.setEmail(updateStudentDto.getEmail());

        Student updatedStudentObj= studentRepository.save(student);

        return StudentMapper.mapToStudentDto(updatedStudentObj);
    }
}
