package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Name is empty")
    private String name;
    @NotBlank(message="Email is empty")
    @Email(message="Invalid Email Format")
    private String email;
    @Size(Min=6,Max=10,message="The minimum value has to be 6")
    private float cgpa;

    public StudentEntity(Long id,@NotBlank(message="Name is empty") String name,@Email(message="Invalid Email Format"),@NotBlank(message="Email is empty") String email,@Size(Min=6,Max=10,message="The minimum value has to be 6") float cgpa) {
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public StudentEntity() {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return this.cgpa;
    }
}