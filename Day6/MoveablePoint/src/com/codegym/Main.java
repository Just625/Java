package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point point = new Point();
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(2,2,2,3);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
        System.out.println(movablePoint.move());
    }
}x
