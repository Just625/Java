package com.codegym;

public class TestStaticProperty {

    public static void main(String[] args) {
        System.out.println(Car.numberofCars);
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberofCars);
        System.out.println(car1.numberofCars);
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberofCars);
        System.out.println(car1.numberofCars);
        System.out.println(car2.numberofCars);
        System.out.println(Car.getNumberofCars());
    }
}
