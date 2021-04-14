package com.codegym;

import java.util.Scanner;

public class Room {
    private Person person = new Person();
    private double day;
    private String type;
    private double price;

    public Room() {

    }

    public Room(Person person, double day, String type, double price) {
        this.person = person;
        this.day = day;
        this.type = type;
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addNewRoom() {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap so ngay tro:");
        this.day = src.nextDouble();
        src.nextLine();
        System.out.println("Nhap loai phong tro:");
        this.type = src.nextLine();
        System.out.println("Nhap gia phong:");
        this.price = src.nextDouble();
        this.person.addInfo();
    }

    public void showRom() {
        System.out.printf("Day: %f, Type: %s, Price: %f ", this.day, this.type, this.price);
        this.person.showInfo();
    }
}
