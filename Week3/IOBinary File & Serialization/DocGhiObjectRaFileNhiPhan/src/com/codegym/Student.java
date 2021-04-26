package com.codegym;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String Name;
    private String address;

    public Student() {
    }

    public Student(int id, String name, String address) {
        this.id = id;
        Name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
