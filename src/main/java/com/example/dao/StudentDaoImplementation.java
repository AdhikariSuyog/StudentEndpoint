//package com.example.dao;
//
//import com.example.mapper.StudentMapper;
//import com.example.model.Student;
//import com.example.repository.StudentEntity;
//import com.example.repository.StudentRepository;
//import jakarta.inject.Inject;
//import jakarta.inject.Singleton;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Singleton
//class StudentDaoImplementation implements StudentFinder {
//
//    @Inject
//    private StudentRepository studentRepository;
//
//    @Override
//    public List<Student> findAll() {
//        return studentRepository.findAll().stream()
//                .map(StudentEntity::toStudent)
//                .collect(Collectors.toList());
//    }
//}
