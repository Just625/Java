package com.codegym;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentComparator> {
    private String name;
    private int age;
    private String address;

    public StudentComparator() {

    }

    public StudentComparator(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

//    @Override
//    public int compare(StudentComparator o1, StudentComparator o2) {
//        return o1.age-o2.age;
//    }
    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        return o1.name.compareTo(o2.name);
    }
}
