package com.example.demo.student;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String neptun;
    private String name;
    private LocalDate birthDate;
    private String course;

    public Student() {
    }

    public Student(String neptun, String name, LocalDate birthDate, String course) {
        this.neptun = neptun;
        this.name = name;
        this.birthDate = birthDate;
        this.course = course;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", neptun='" + neptun + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", course='" + course + '\'' +
                '}';
    }
}
