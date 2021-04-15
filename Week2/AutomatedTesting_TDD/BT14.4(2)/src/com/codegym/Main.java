package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao so ho su dung dien:");
        int n = src.nextInt();
        Receipt[] receipts = new Receipt[n];
        ReceiptManagement receiptManagement = new ReceiptManagement(receipts);
        int choice;
        do {
            showMenu();
            System.out.println("enter your choice:");
            choice = src.nextInt();
            if (choice < 0 || choice > 3) {
                System.out.println("Lua chon khong hop le");
            }
            switch (choice) {
                case 1:
                    receiptManagement.initReceipt();
                    break;
                case 2:
                    receiptManagement.showAllReceipt();
                    break;
                case 3:
                    receiptManagement.calculateMoneyFromCode();
                    break;
            }
        } while (choice != 0 || choice > 3);
    }

    private static void showMenu() {
        System.out.println("1. Nhap du lieu ban dau cho receipt");
        System.out.println("2. Hien thi thong tin ");
        System.out.println("3. Tinh tien cho customer");
        System.out.println("0. Thoat chuong trinh");
    }


}
