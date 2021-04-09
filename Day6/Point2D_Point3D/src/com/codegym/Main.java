package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        Point2D point2D1 = new Point2D(1,1);
        System.out.println(point2D1);
        point2D1.setXY(2,2);
        System.out.println(point2D1);
        System.out.println(point2D1.getXY());
    }
}
