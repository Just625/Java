package com.codegym;

public class Car {
    private String name;
    private String engine;
    public static int numberofCars;
    Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberofCars++;
    }
    static int getNumberofCars(){
        numberofCars++;
        return numberofCars;
    }

}
