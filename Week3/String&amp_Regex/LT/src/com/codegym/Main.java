package com.codegym;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Cach luu tru
        String msg = "c02h";
        System.out.println(msg.charAt(0));
        System.out.println(msg.length());
        System.out.println(msg.equals("C02H"));
        System.out.println(msg.concat("1"));
        System.out.println(msg.startsWith("C"));
        System.out.println(msg.endsWith("H"));
        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.indexOf("2"));
        String s = new String("Welcome"); // Tạo 2 đối tượng và 1 biến tham chiếu
        //Ta co the su dung .hashCode() de chung minh la dung
        //doi tuong String luu trong Heap co gia tri tam goi la  Value,
        // 1 doi tuong "Welcome" duoc Value chi den,  duoc luu trong string constant pool
        //1 bien tham chieu s
    }
}
