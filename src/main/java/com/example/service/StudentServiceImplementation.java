package com.example.service;

import com.example.repository.StudentEntity;
import com.example.repository.StudentRepository;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton
@Named("StudentServiceImplementation")
class StudentServiceImplementation implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentEntity createStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentEntity> getStudentById(int roll) {
        return studentRepository.findById(roll);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity studentEntity) {
        return studentRepository.update(studentEntity);
    }

    @Override
    public void deleteStudent(int roll) {
        studentRepository.deleteById(roll);
    }

    public StudentEntity saveStudent(int roll, String name, String address, String phone, int grade) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setRoll(roll);
        studentEntity.setName(name);
        studentEntity.setAddress(address);
        studentEntity.setPhone(phone);
        studentEntity.setGrade(grade);

        return studentRepository.save(studentEntity);
    }


}
