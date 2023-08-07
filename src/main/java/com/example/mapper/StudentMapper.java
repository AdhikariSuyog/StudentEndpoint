package com.example.mapper;

import com.example.model.Student;
import com.example.repository.StudentEntity;

public class StudentMapper {


    public static Student fromEntity(StudentEntity studentEntity) {
        return Student.builder()
                .roll(studentEntity.getRoll())
                .name(studentEntity.getName())
                .address(studentEntity.getAddress())
                .phone(studentEntity.getPhone())
                .grade(studentEntity.getGrade())
                .build();
    }

    public static StudentEntity toEntity(Student student) {
        return StudentEntity.builder()
                /* todo : look into builder pattern */
                .roll(student.roll())
                .address(student.address())
                .name(student.name())
                .phone(student.phone())
                .grade(student.grade())
                .build();


    }
}
