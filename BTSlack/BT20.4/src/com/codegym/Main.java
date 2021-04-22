package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);

        List<CBGV> cbgvs = new ArrayList<>();
        cbgvs.add(new CBGV(2000000, 500000,200000,new CanBo("a","15/11/1996","Ha Noi")));
        cbgvs.add(new CBGV(3000000, 300000,100000,new CanBo("b","16/11/1999","Hue")));
        cbgvs.add(new CBGV(4000000, 400000,300000,new CanBo("c","17/11/2000","Ho Chi Minh")));

        CBGVManagment cbgvManagment = new CBGVManagment(cbgvs);
        int choice;
        do {
            showMenu();
            choice = src.nextInt();
            if(choice>3||choice<0){
                System.out.println("Invalid choice");
            }
            switch (choice){
                case 1:{
                    cbgvManagment.add();
                    break;
                }
                case 2:{
                    System.out.println(cbgvManagment);
                    break;
                }
                case 3:{
                    cbgvManagment.showGreaterAvg();
                    break;
                }
            }
        } while (choice != 0);
    }

    private static void showMenu() {
        System.out.println("1. Nhap thong tin cac giao vien: ");
        System.out.println("2. Hien thi thong tin ca nhan can bo giao vien:");
        System.out.println("3. Hien thi can bo co luong thuc linh lon hon 8 trieu:");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("Nhap vao lua chon cua ban:");
    }
}
