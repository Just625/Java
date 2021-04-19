package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", 10,"Dota2"));
        products.add(new Product("4", 40,"Genshin Impact"));
        products.add(new Product("3", 30, "Puzzle Agent"));
        ProductManager productManager = new ProductManager(products);
        int choice;
        do {
            showMenu();
            choice = src.nextInt();
            if (choice < 0 || choice > 7) {
                System.out.println("Lua chon khong hop le");
            }
            switch (choice){
                case 1:{
                    productManager.addProduct();
                    break;
                }
                case 2:{
                    productManager.edit();
                    break;
                }
                case 3:{
                    productManager.removeProduct();
                    break;
                }
                case 4:{
                    productManager.display();
                    break;
                }
                case 5:{
                    productManager.displayProductByName();
                    break;
                }
                case 6:{
                    productManager.sortAscending();
                    break;
                }
                case 7:{
                    productManager.sortDescending();
                    break;
                }
            }
        } while (choice != 0 || choice > 7);
    }

    private static void showMenu() {
        System.out.println("1. Them san pham");
        System.out.println("2. Sua thong tin san pham theo id");
        System.out.println("3. Xoa san pham theo id");
        System.out.println("4. Hien thi danh sach san pham");
        System.out.println("5. Tim kiem san pham theo ten");
        System.out.println("6. Sap xep san pham tang dan theo gia");
        System.out.println("7. Sap xep san pham giam dan theo gia");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("Nhap lua chon cua ban: ");
    }
}
