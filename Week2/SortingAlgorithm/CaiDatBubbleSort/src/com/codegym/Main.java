package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] list = {1, 9, 6, -8, 0, 4};
        displayArr(list);
        bubbleSort(list);
        displayArr(list);
        int[] list1 = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        displayArr(list1);
        bubbleSort(list1);
        displayArr(list1);
    }

    private static void displayArr(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 0; i < list.length - 1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
