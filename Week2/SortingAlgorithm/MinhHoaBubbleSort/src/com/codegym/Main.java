package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] list = {1, 9, 6, -8, 0, 4};
        System.out.println("Arr before");
        displayList(list);
        System.out.println("Begin sorting in 3.. 2... 1...");
        bubbleSort(list);
//        displayList(list);
    }

    private static void displayList(int[] list) {
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
                    System.out.printf("Swap %d with %d\n", list[j], list[j - 1]);
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("No need to sort");
                break;
            }
            System.out.printf("Arr after %d sort\n", i+1);
            displayList(list);
        }
    }
}
