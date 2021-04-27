package com.codegym;

import java.util.Random;

import static com.codegym.Main.DISTANCE;
import static com.codegym.Main.STEP;

public class Car implements Runnable {
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            int speed = (new Random()).nextInt(20);
            runDistance += speed;
            String result = "|";
            int percentTravel = (runDistance * 200) / DISTANCE;
            for (int i = 0; i < DISTANCE; i += STEP) {
                if (percentTravel >= i && percentTravel < i + STEP) {
                    result += "o";
                } else if (percentTravel >= i + STEP) {
                    result += "=";
                } else {
                    result += "-";
                }
            }
            result += "|";
            System.out.println("Car" + name + ": " + result + " " + Math.min(runDistance, DISTANCE) + "KM");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + name + " broke down");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        long timeToFinish = (endTime - startTime) / 1000;
        System.out.println("Car" + this.name + " finish in " + timeToFinish + "second");
    }
}
