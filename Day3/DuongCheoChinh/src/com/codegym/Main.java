package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        //Cho nguoi dung nhap vao mang
        System.out.println("Nhập vào số dòng của mảng:");
        int soDong = src.nextInt();
        float[][] arr = new float[soDong][soDong];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập vào phần tử ở vị trí [%d][%d]:", i, j);
                arr[i][j] = src.nextFloat();
            }
        }

        //In ra mang
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%.2f ", arr[i][j]);
            }
            System.out.println("");
        }

        //Tinh tong cac so o duong cheo chinh
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.printf("Tổng đường chéo chính của mảng là: %.2f",sum);
}
}
