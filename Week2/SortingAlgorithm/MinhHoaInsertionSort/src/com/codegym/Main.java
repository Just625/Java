package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] list = {8,6,34,22,11};
        displayArr(list);
        insertionSort(list);
    }

    private static void displayArr(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int position = i;
            int temp = list[position];
            while (position > 0) {
                if (temp < list[position - 1]) {
                    System.out.printf("%d <%d\n", temp, list[position - 1]);
                    System.out.printf("Push %d to index %d\n", list[position-1], position);
                    list[position] = list[position - 1];
                    displayArr(list);
                } else {
                    break;
                }
                position--;
            }
            if (position != i) {
                System.out.printf("Add %d to %d\n",temp , list[position]);
                list[position] = temp;
            }
            System.out.printf("Array after %d times sorting\n", i);
            displayArr(list);
        }
    }
}
