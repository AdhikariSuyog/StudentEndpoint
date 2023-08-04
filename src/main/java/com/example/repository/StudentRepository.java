package com.example.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
}
