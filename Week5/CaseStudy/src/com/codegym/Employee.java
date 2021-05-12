package com.codegym;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public abstract class Employee implements Serializable {
    private String id;
    private String name;
    private String role;
    private int age;
    private String address;
    private int workDaysInMonth = 0;
    private int hardSalary;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", workDaysInMonth=" + workDaysInMonth +
                ", hardSalary=" + hardSalary +
                '}';
    }

    public int getWorkDaysInMonth() {
        return workDaysInMonth;
    }

    public void attend() {
        workDaysInMonth++;
    }

    public abstract int calculateFinalSalary();

    public int calculateFine() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int day = localDate.getDayOfMonth();
        return (day - workDaysInMonth) * 30000;
    }

    public void setWorkDaysInMonth(int workDaysInMonth) {
        this.workDaysInMonth = workDaysInMonth;
    }

    public Employee() {
    }

    public Employee(String id, String name, String role, int age, String address, int hardSalary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.age = age;
        this.address = address;
        this.hardSalary = hardSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }
}
