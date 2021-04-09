package com.codegym;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    @Override
    public double getArea(){
        return super.getArea()*this.height;
    }
    @Override
    public String toString(){
       return super.toString() + this.height;
    }
}
