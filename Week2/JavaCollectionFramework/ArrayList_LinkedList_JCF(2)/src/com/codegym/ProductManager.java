package com.codegym;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static final String NOT_VALID_PRODUCT = "Khong tim thay san pham";
    public static final String DELETE_SUCCESS = "Xoa thanh cong";
    public static final String ID_REQUEST = "Nhap vao id";
    public static final String PRICE_REQUEST = "Nhap vao price";
    public static final String NAME_REQUEST = "Nhap vao name";
    public static final String ADD_SUCCESS = "Them thanh cong";
    static Scanner src = new Scanner(System.in);
    private List<Product> product;

    public ProductManager() {

    }

    public ProductManager(List<Product> product) {
        this.product = product;
    }

    public void display() {
        for (int i = 0; i < product.size(); i++) {
            System.out.println(product.get(i));
        }
    }

    public void edit() {
        System.out.println(ID_REQUEST+" can chinh sua:");
        String id = src.nextLine();
        int index = findIndexById(id);
        if (index == -1) {
            System.out.println(NOT_VALID_PRODUCT);
        } else {
            System.out.println("Sua price(1) hoac sua name(2):");
            int choice = src.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println(PRICE_REQUEST);
                    int price = src.nextInt();
                    product.get(index).setPrice(price);
                    break;
                }
                case 2: {
                    System.out.println(NAME_REQUEST);
                    String name = src.nextLine();
                    product.get(index).setName(name);
                    break;
                }
            }
        }
    }

    private int findIndexById(String id) {
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void addProduct() {
        System.out.println(ID_REQUEST);
        String id = src.nextLine();
        System.out.println(PRICE_REQUEST);
        int price = src.nextInt();
        src.nextLine();
        System.out.println(NAME_REQUEST);
        String name = src.nextLine();
        product.add(new Product(id, price, name));
        System.out.println(ADD_SUCCESS);
    }

    public void removeProduct() {
        System.out.println(ID_REQUEST+" can xoa");
        String id = src.nextLine();
        int index = this.findIndexById(id);
        if (index == -1) {
            System.out.println(NOT_VALID_PRODUCT);
        } else {
            this.product.remove(index);
            System.out.println(DELETE_SUCCESS);
        }
    }

    public void displayProductByName() {
        System.out.println(NAME_REQUEST);
        String name = src.nextLine();
        int index = findIndexByName(name);
        if (index == -1) {
            System.out.println(NOT_VALID_PRODUCT);
        } else {
            System.out.println("Thong tin cua san pham can tim:");
            System.out.println(this.product.get(index));
        }
    }

    private int findIndexByName(String name) {
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void sortAscending() {
        Collections.sort(this.product);
    }

    public void sortDescending() {
        Collections.sort(this.product);
        Collections.reverse(this.product);
    }
}
