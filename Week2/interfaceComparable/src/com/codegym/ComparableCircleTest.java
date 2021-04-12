package com.codegym;

import java.util.Arrays;

public class ComparableCircleTest {

    public static void main(String[] args) {
	// write your code here
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.6);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle(3.5, "indigo", false);
        System.out.println("Truoc khi sort:");
        for(ComparableCircle comparableCircle: comparableCircles){
            System.out.println(comparableCircle);
        }

        Arrays.sort(comparableCircles);

        System.out.println("Sau khi sort:");
        for(ComparableCircle comparableCircle: comparableCircles){
            System.out.println(comparableCircle);
        }

    }
}
