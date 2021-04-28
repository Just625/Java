package com.codegym;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private String id;
    private String name;
    private String homeTown;
    private String clazz;
    private double mark;

    public Student() {
    }

    public Student(String id, String name, String homeTown, String clazz, double mark) {
        this.id = id;
        this.name = name;
        this.homeTown = homeTown;
        this.clazz = clazz;
        this.mark = mark;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", clazz='" + clazz + '\'' +
                ", mark=" + mark +
                '}';
    }
    public void inputInfo(){
        Scanner src = new Scanner(System.in);
        System.out.println("enter id:");
        this.id = src.nextLine();
        System.out.println("enter name:");
        this.name = src.nextLine();
        System.out.println("enter home town:");
        this.homeTown = src.nextLine();
        System.out.println("enter class");
        this.clazz = src.nextLine();
        System.out.println("enter mark:");
        this.mark = src.nextFloat();
    }
}
