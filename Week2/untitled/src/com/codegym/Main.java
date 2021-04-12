package com.codegym;

import java.util.Arrays;
import java.util.stream.Collector;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle[] circles = new Circle[5];
        for(int i = 0; i < circles.length;i++){
            circles[i] = new Circle(Math.floor(Math.random()*20));
            System.out.println(circles[i]);
        }
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("Sau khi sort");
        for(int j = 0; j < circles.length;j++){
            System.out.println(circles[j]);
        }
    }
}
