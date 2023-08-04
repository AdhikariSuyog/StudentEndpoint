package com.example.repository;

import com.example.model.Student;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
@Builder
@MappedEntity
@Serdeable.Deserializable
public class StudentEntity {

    @Id
    private int roll;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String phone;

    @Column
    private int grade;

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}


