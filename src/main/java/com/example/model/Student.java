package com.example.model;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;

@Builder
@Serdeable.Serializable
public record Student(int roll,
                      String name,
                      String address,
                      String phone,
                      int grade) {

}
