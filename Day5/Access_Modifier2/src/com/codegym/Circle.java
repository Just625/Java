package com.codegym;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }
    protected void printA(){
        System.out.println("A");
    }
    public void printB(){
        System.out.println("B");
    }
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    protected void radius() {
    }
}
