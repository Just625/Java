package com.codegym;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
    private String code;
    private String name;
    private String manufacturer;
    private int price;

    public Product() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String code, String name, String manufacturer, int price) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
    public void inputInfo(){
        Scanner src = new Scanner(System.in);
        System.out.println("enter product's code:");
        this.code = src.nextLine();
        System.out.println("enter product's name:");
        this.name = src.nextLine();
        System.out.println("enter manufacturer:");
        this.manufacturer = src.nextLine();
        System.out.println("enter product's price:");
        this.price = src.nextInt();
    }
}
