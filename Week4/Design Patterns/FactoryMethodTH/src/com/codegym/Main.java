package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("Enter shape");
        String shapeInput = src.nextLine();
        ShapeFactory.getShape(shapeInput).draw();
    }
}
