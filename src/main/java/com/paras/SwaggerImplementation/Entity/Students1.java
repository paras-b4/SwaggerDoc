package com.paras.SwaggerImplementation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String Rollno;
    private String marks;
    private String subject;

    public Students1() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return Rollno;
    }

    public void setRollno(String rollno) {
        Rollno = rollno;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Students1(int id, String name, String rollno, String marks, String subject) {
        this.id = id;
        this.name = name;
        Rollno = rollno;
        this.marks = marks;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Students1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Rollno='" + Rollno + '\'' +
                ", marks='" + marks + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
