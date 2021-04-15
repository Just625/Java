package com.codegym;

import java.util.Scanner;

public class Customer {
    private String name;
    private String address;
    private String code;
    public Customer(){

    }
    public Customer(String name, String address, String code){
        this.name = name;
        this.address = address;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void displayCustomerInfo(){
        System.out.printf("Name: %s, Address: %s, Code: %s", this.name, this.address, this.code);
    }
    public void inputCustomerInfo(){
        Scanner src = new Scanner(System.in);
        System.out.printf("Enter name:");
        this.name = src.nextLine();
        System.out.printf("Enter address:");
        this.address = src.nextLine();
        System.out.printf("Enter code:");
        this.code = src.nextLine();
//        return new Customer(this.name, this.address, this.code);
    }
}
