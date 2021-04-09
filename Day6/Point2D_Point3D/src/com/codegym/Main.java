package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        Point2D point2D1 = new Point2D(1,1);
        System.out.println(point2D1);
        point2D1.setXY(2,2);
        System.out.println(point2D1);
        //Gan gia tri cho 1 bien, roi dung vong lap for in ra. Ko thi se chi in ra dia chi o nho
        float[] arr = point2D1.getXY();
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i] +" ");
        }
        //Neu ko gan
        System.out.println(point2D1.getXY());
    }
}
