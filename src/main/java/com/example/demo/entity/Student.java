package com.example.demo.entity;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class Student{
    @Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    private LocalDate dob;
    private String email;
    private float cgpa;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    
    public Student(long id, String name, LocalDate dob, String email, float cgpa) {
    this.id = id;
    this.name = name;
    this.dob = dob;
    this.email = email;
    this.cgpa = cgpa;
   }


    
    
}