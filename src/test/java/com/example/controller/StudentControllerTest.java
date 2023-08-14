package com.example.controller;

import com.example.mapper.StudentMapper;
import com.example.model.Student;
import com.example.repository.StudentEntity;
import com.example.service.StudentService;
import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.serde.annotation.Serdeable;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;


import java.util.List;

import static io.micronaut.core.type.Argument.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@MicronautTest
public class StudentControllerTest {
        @Inject
        @Client("/")
        HttpClient httpClient;


        @Test
        void testHelllo() {
            HttpResponse<StudentEntity> result = httpClient.toBlocking().exchange(HttpRequest.GET("/std/23"), StudentEntity.class);
            assertEquals("sa", result.body().getName());
        }

        @Test
        void addStudentTest() {
            var student = StudentEntity.builder()
                    .roll(20)
                    .address("jk")
                    .name("sa")
                    .grade(12)
                    .phone("98097")
                    .build();
            HttpResponse<StudentEntity> students = httpClient.toBlocking().exchange(HttpRequest.POST("/std/insert", student));
            assertEquals(200, students.getStatus().getCode());

        }


        @Test
        void getAllStudentTest() {
            List<StudentEntity> students = httpClient.toBlocking()
                    .retrieve(HttpRequest.GET("/std"), of(List.class, StudentEntity.class));
            assertNotNull(students);
        }




}