package com.codegym;

import java.util.Scanner;

public class Person {
    private String name;
    private String date;
    private String identityCard;
    public Person(){

    }
    public Person(String name, String date, String identityCard) {
        this.name = name;
        this.date = date;
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
    public void addInfo(){
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap ten:");
        this.name = src.nextLine();
        System.out.println("Nhap ngay sinh:");
        this.date = src.nextLine();
        System.out.println("Nhap CMT:");
        this.identityCard = src.nextLine();
    }
    public void showInfo(){
        System.out.printf("Name: %s, Date of birth: %s, CMT: %s\n", this.name, this.date, this.identityCard);
    }
}
