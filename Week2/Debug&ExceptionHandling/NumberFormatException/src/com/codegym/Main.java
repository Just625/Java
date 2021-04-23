package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("enter x:");
        int x = src.nextInt();
        System.out.println("enter y:");
        int y = src.nextInt();
        System.out.println();
        calculate(x, y);
    }

    public static void calculate(int x, int y) {
        try {
            int sum = x + y;
            int subtraction = x - y;
            int multiple = x * y;
            int division = x / y;
            System.out.printf("Sum of %d and %d: %d\n", x, y, sum);
            System.out.printf("Subtraction of %d and %d: %d\n", x, y, subtraction);
            System.out.printf("Multiple of %d and %d: %d\n", x, y, multiple);
            System.out.printf("Division of %d and %d: %d\n", x, y, division);
            //Bat ArithmeticException
        } catch (Exception e) {
            System.out.println("Exception occur:" + e.getMessage());
        }
    }
}