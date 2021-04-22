package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        showArr(list);
        selectionSort(list);
        showArr(list);
    }

    private static void showArr(double[] list) {
        for(int i = 0; i< list.length; i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(double[] list){
        for(int j = 0; j <list.length-1;j++){
            int indexMax = j;

            for(int i = j+1; i < list.length;i++){
                if(list[i]>list[indexMax]){
                    indexMax = i;
                }
            }
            if(indexMax!=j){
                double temp = list[indexMax];
                list[indexMax] = list[j];
                list[j] = temp;
            }
        }
    }
}
