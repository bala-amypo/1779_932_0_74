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
    @NotBlank(message="Name is empty")
    private String name;
    @NotBlank(message="Email is empty")
    @Email(message="Invalid Email Format")
    private String email;
    @Size(min=0,max=60,message="The minimum value has to be 0")
    private int age;
    //@Min(value=8,message="The password has to be long")same for max

    public StudentEntity(Long id,@NotBlank(message="Name is empty") String name,@Email(message="Invalid Email Format"),@NotBlank(message="Email is empty") String email,@Size(Min=6,Max=10,message="The minimum value has to be 6") int age) {
        this.name = name;
        this.email = email;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    public float getAge() {
        return this.age;
    }
}