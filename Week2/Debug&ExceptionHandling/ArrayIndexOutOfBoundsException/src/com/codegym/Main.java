package com.codegym;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("enter index of number:");
        //Cho lenh o dong 21 vao` trong try cung duoc
        int index = src.nextInt();
        try {
            System.out.printf("The number of index %d: %d", index, arr[index]);
        } catch (Exception e){
            System.out.printf("Index %d is out of range (0-100)", index);
        }
    }
}
