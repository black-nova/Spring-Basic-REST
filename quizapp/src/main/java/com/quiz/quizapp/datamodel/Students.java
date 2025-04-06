package com.quiz.quizapp.datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Student;
    String name;


    @Override
    public String toString() {
        return "Students [Student=" + Student + ", name=" + name + "]";
    }
    public int getStudent() {
        return Student;
    }
    public Students() {
    }
    public Students(int student, String name) {
        Student = student;
        this.name = name;
    }
    public void setStudent(int student) {
        Student = student;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
