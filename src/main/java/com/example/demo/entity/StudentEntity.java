package com.example.demo.entity;

import jakarta.persistence.Entity;


@Entity
public class StudentEntity{


    @Id
    @GeneratedValue(stratergy=GeneratedValue)
    private Long id;
    private String name;
    private String email;
    private int cgpa;



}