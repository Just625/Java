package com.codegym;

import java.util.Scanner;

public class CanBo {
    private String name;
    private String date;
    private String homeTown;
    public CanBo(){

    }

    public CanBo(String name, String date, String homeTown) {
        this.name = name;
        this.date = date;
        this.homeTown = homeTown;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", homeTown='" + homeTown + '\'';
    }
    public CanBo inputCanBoInfo(){
        Scanner src = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = src.nextLine();
        System.out.println("enter date: ");
        String date = src.nextLine();
        System.out.println("enter hometown: ");
        String homeTown = src.nextLine();
        return new CanBo(name, date, homeTown);
    }
}