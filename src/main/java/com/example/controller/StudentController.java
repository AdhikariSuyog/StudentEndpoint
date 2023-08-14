package com.example.controller;

import com.example.mapper.StudentMapper;
import com.example.model.Student;
import com.example.repository.StudentEntity;
import com.example.service.StudentService;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Named;

import java.util.List;

@Controller("/std")
public class StudentController {

    private final StudentService studentService;


    public StudentController(@Named("StudentServiceImplementation") StudentService studentServiceImplementation) {
        this.studentService = studentServiceImplementation;
    }

    @Get(value = "/hello")
    public String function1() {
        return "Hello world";
    }


    @Get()
    public List<Student> getAllStudent() {
        return studentService.getAllStudents()
                .stream()
                .map(entity -> StudentMapper.fromEntity(entity))
                .toList();
    }

    @Get("/{roll}")
    public Student getStudentById(@PathVariable int roll) {
        return studentService.getStudentById(roll)
                .map(entity -> StudentMapper.fromEntity(entity)).orElse(null);
    }


    @Post(value = "/insert", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    public Student addStudent(@Body StudentEntity studentEntity) {
        var entity = studentService.createStudent(studentEntity);
        return StudentMapper.fromEntity(entity);
    }


    @Put("/update")
    public Student updateBook(@Body StudentEntity student) {
        var studentEntity = studentService.updateStudent(student);
        return StudentMapper.fromEntity(studentEntity);
    }

    @Delete("/{roll}")
    public HttpStatus deleteBook(@PathVariable Integer roll) {
        studentService.deleteStudent(roll);
        return HttpStatus.NO_CONTENT;
    }
}
