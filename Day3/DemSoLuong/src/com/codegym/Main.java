package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        int count = 0;
        int soLuongSV;
        do {
            System.out.println("Nhập vào số lượng sinh viên (tối đa 30):");
            soLuongSV = src.nextInt();
            if(soLuongSV < 0 || soLuongSV > 30){
                System.out.println("Số lượng không hợp lệ. Vui lòng nhập lại!");
            }
        } while (soLuongSV < 0 || soLuongSV > 30);
        float[] arr = new float[soLuongSV];
        for(int i = 0; i<arr.length;i++){
            do{
            System.out.printf("Nhập điểm của sinh viên thứ %d: ", i);
            arr[i] = src.nextFloat();
            if(arr[i]<0 || arr[i]>10){
                System.out.println("Điểm không hợp lệ. Vui lòng nhập lại!");
            }
            } while (arr[i]<0 || arr[i]>10);
        }
        for(int j =0; j<arr.length;j++){
            if(arr[j] >=5){
                count++;
            }
        }
        System.out.printf("Số lượng sinh viên thi đỗ là: %d", count);

    }
}
