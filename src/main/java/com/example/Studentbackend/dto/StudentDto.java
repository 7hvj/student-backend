package com.example.Studentbackend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Long id;
//    this variable used for PostMan
    private String firstName;
    private String lastName;
    private String email;

}
