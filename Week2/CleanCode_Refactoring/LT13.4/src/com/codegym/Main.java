package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao so can kiem tra:");
        int inputNumb = src.nextInt();
        NumbProcessing processNumb = new NumbProcessing(inputNumb);
        processNumb.checkNumber();
    }
}
