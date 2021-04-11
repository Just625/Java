package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int count = 0;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi:");
        String str = src.nextLine();
        System.out.println("Nhập vào kí tự cần kiểm tra số lần xuất hiện:");
        char kyTu = src.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==(kyTu)) {
                count++;
            }
        }
        System.out.printf("Số lần xuất hiện của %s là %d", kyTu, count);
    }
}
