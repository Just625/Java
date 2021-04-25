package com.codegym;

import java.util.Scanner;

public class Student {
    private int ID;
    private String name;
    private String address;
    private boolean isPrioritized;

    public Student() {
    }

    public Student(int ID, String name, String address, boolean isPrioritized) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.isPrioritized = isPrioritized;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPrioritized() {
        return isPrioritized;
    }

    public void setPrioritized(boolean prioritized) {
        isPrioritized = prioritized;
    }

    public void inputStudentInfo() {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter identification number");
        this.ID = src.nextInt();
        src.nextLine();
        System.out.println("Enter name");
        this.name = src.nextLine();
        System.out.println("Enter address");
        this.address = src.nextLine();
        System.out.println("Is this student prioritized?(true or false)");
        this.isPrioritized = src.nextBoolean();
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", isPrioritized=" + isPrioritized +
                '}';
    }

    public void displayInfo() {
        System.out.printf("%-3s %-15s  %-10s %-5s %-5s %-7s %-7s %-7s\n", "ID", "Name", "Address", "Prioritized", "Group", "Score 1", "Score 2", "Score 3");
    }
}
