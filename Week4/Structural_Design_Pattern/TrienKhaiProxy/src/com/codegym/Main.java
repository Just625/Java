package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        MathCalculatorProxy mathCalculatorProxy = new MathCalculatorProxy();
        System.out.println("Nhap vao 2 so can tinh");
        double firstNumber = src.nextDouble();
        double secondNumber = src.nextDouble();
        System.out.println("Ket qua phep cong: " + mathCalculatorProxy.add(firstNumber, secondNumber));
        System.out.println("Ket qua phep tru: " + mathCalculatorProxy.sub(firstNumber, secondNumber));
        System.out.println("Ket qua phep nhan: " + mathCalculatorProxy.mul(firstNumber, secondNumber));
        System.out.println("Ket qua phep chia: " + mathCalculatorProxy.div(firstNumber, secondNumber));
    }
}
