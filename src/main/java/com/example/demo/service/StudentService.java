package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto saveStudent(StudentDto dto);

    void deleteStudent(Long id);
    StudentDto getStudent(Long id);
    StudentDto update(StudentDto dto, Long id);

}
