package com.codegym;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Dao nguoc mang
        int[] arr = {5, 6, 7, 8, 9, 10};
        displayArr(arr);
        arr = reverse(arr);
        System.out.println("\nSau khi dao nguoc");
        displayArr(arr);

        //Dao nguoc chuoi
        String str = "Hello";
        System.out.println("\nTruoc khi dao nguoc");
        System.out.println(str);
        str = reverseArray(str);
        System.out.println("Sau khi dao nguoc");
        System.out.println(str);
    }

    private static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static int[] reverse(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
//            stack.push(arr[i]);
            stack.add(arr[i]);
        }
        int[] newArr = new int[arr.length];
        for (int j = 0; j < newArr.length; j++) {
            newArr[j] = stack.pop();
        }
        return newArr;
    }

    public static String reverseArray(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += stack.pop();
        }
        return newStr;
    }
}
