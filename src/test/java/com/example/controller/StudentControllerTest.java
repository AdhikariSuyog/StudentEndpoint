package com.example.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test

    public void dummy() {
        Mood actual = StudentController.function1("I am Suyog");
        Assert.assertEquals(Mood.Happy,actual);
    }
}