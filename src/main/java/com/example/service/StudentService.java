package com.example.service;

import com.example.repository.StudentEntity;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentEntity createStudent(StudentEntity studentEntity);
    List<StudentEntity> getAllStudents();
    Optional<StudentEntity> getStudentById(int roll);
    StudentEntity updateStudent(StudentEntity studentEntity);
    void deleteStudent(int roll);
}
