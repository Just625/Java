package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        float ketQua = 0;
//        float[][] arr = {
//                {1, 3, 2},
//                {5, 4, 6},
//                {8, 9, 7}
//        };
        System.out.println("Nhập vào số dòng của mảng được tạo ra:");
        int soDong = src.nextInt();
        System.out.println("Nhập vào số cột của mảng được tạo ra:");
        int soCot = src.nextInt();
        float[][] arr = new float[soDong][soCot];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("Nhập vào phần tử ở vị trí [%d][%d]:", i, j);
                arr[i][j] = src.nextFloat();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%f ", arr[i][j]);
            }
            System.out.println("");
        }
        int cot;
        do {
            System.out.println("Chọn cột muốn tính:");
            cot = src.nextInt();
            if (cot < 0 || cot > arr.length - 1) {
                System.out.println("Lựa chọn ko hợp lệ");
            }
        } while (cot < 0 || cot > arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            ketQua += arr[i][cot];
        }
        System.out.printf("Tổng của cột thứ %d là %.2f", cot, ketQua);
    }
}
