package com.codegym;

import java.io.*;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
//        List<Product> productList = new ArrayList<>();
//        productList.add(new Product("Moba1", "Dota2", "Valve", 15000));
//        productList.add(new Product("Moba2", "LOL", "Riot", 15000));
//        productList.add(new Product("FPS1", "CS:GO", "Valve", 16000));
        List<Product> productList = new ArrayList<>();
        ProductManagement productManagement = new ProductManagement();
        productManagement.readDataFromFile();
        int choice;
        do {
            showMenu();
            choice = src.nextInt();
            if (choice > 3 || choice < 0) {
                System.out.println("Invalid choice");
            }
            switch (choice) {
                case 1: {
                    productManagement.addNewProduct();
                    break;
                }
                case 2: {
                    productManagement.displayList();
                    break;
                }
                case 3: {
                    src.nextLine();
                    System.out.println("enter code");
                    String code = src.nextLine();
                    productManagement.displayProductUsingIndex(code);
                    break;
                }
            }
        } while (choice != 0);
    }

    private static void showMenu() {
        System.out.println("1.Add new product");
        System.out.println("2.Show all product");
        System.out.println("3.Find product");
        System.out.println("0.Exit");
        System.out.println("Enter choice:");
    }
}
