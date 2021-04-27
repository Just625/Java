package com.codegym;

public class Main {
    public static int DISTANCE = 200;
    public static int STEP = 5;

    public static void main(String[] args) {
        // write your code here
        Thread car1 = new Thread(new Car("Car1"));
        Thread car2 = new Thread(new Car("Car2"));
        Thread car3 = new Thread(new Car("Car3"));
        System.out.println("Distance: "+DISTANCE+"KM");
        car1.start();
        car2.start();
        car3.start();
    }
}
