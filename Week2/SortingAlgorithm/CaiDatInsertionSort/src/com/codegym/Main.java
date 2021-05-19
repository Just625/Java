package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] list = {1, 9, 6, -8, 0, 4};
        display(list);
        insertionSort(list);
        display(list);
    }

    public static void display(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int index = i;
            int temp = list[index];
            while (index > 0) {
                //Muon thay doi thu tu thi thay doi dau la duoc
                if (temp < list[index - 1]) {
                    list[index] = list[index - 1];
                } else {
                    break;
                }
                index--;
            }
            if (index != i) {
                list[index] = temp;
            }
        }
    }
}
