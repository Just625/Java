package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            drawTriangle(4, -2, 3);
            System.out.println("Triangle draw successfully");
        } catch (MyException e) {
            System.out.println("Cannot draw triangle");
        }
        try {
            drawTriangle(4, 2, 3);
            System.out.println("Triangle draw successfully");
        } catch (MyException e) {
            System.out.println("Cannot draw triangle");
        }
    }

    private static void drawTriangle(int size1, int size2, int size3) throws MyException {
        if (size1 + size2 < size3 || size2 + size3 < size1 || size1 + size3 < size2 || size1 < 0 || size2 < 0 || size3 < 0)
            throw new MyException();
    }
}
