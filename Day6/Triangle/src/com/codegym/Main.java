package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
//        Shape shape = new Shape("blue");
//        System.out.println(shape);
//        shape.setColor("yellow");
//        System.out.println(shape);
        System.out.println("Nhập màu sắc của tam giác:");
        String color = src.nextLine();
        double side1, side3, side2;
        do {
            System.out.println("Nhập độ dài cạnh thứ nhất:");
            side1 = src.nextDouble();
            System.out.println("Nhập độ dài cạnh thứ hai:");
            side2 = src.nextDouble();
            System.out.println("Nhập độ dài cạnh thứ ba:");
            side3 = src.nextDouble();
            if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
                System.out.println("3 cạnh trên không tạo thành 1 tam giác được. Vui lòng nhập lại!");
            }
        } while (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1);
        Triangle triangle = new Triangle(color, side1, side2, side3);
        System.out.println(triangle);
    }
}
