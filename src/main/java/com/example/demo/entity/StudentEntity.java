package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is empty")
    private String name;

    @NotBlank(message = "Email is empty")
    @Email(message = "Invalid Email Format")
    private String email;

    @Min(value = 0, message = "Age cannot be less than 0")
    @Max(value = 60, message = "Age cannot be greater than 60")
    private int age;

    @NotBlank(message = "Password is empty")
    @Size(min = 8, max = 16, message = "Password must be between 8 and 16 characters")
    private String password;

    // Default constructor (required by JPA)
    public StudentEntity() {
    }

    // Parameterized constructor (NO validation annotations here)
    public StudentEntity(String name, String email, int age, String password) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
