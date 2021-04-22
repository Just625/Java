package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] list = {1, 9, 6, -8, 0, 4};
        displayArr(list);
        insertionSort(list);
//        displayArr(list);
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
                    list[position] = list[position - 1];
                } else {
                    break;
                }
                position--;
            }
            if (position != i) {
                System.out.printf("Swap %d with %d\n",temp , list[position]);
                list[position] = temp;
            }
            System.out.printf("Array after %d times sorting\n", i);
            displayArr(list);
        }
    }
}
