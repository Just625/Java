package com.codegym;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = src.nextLine();
        List<String> list = tachChuoiThanhCacChuoiLienTiep(str);
        int index = getIndex(list);
        System.out.println(list.get(index));

//        Viet chay de suy ra vong lap for
//        String strNumber = "";
//        int index = 0;
//        for (int i = index; i < str.length(); i++) {
//            if (i == index || str.charAt(i) > str.charAt(i - 1)) {
//                strNumber += str.charAt(i);
//            } else {
//                list.add(strNumber);
//                index = i;
//                break;
//            }
//            if(i==str.length()-1){
//                list.add(strNumber);
//            }
//        }
//        String strNumber2 ="";
//        for (int i = index; i < str.length(); i++) {
//            if (i == index || str.charAt(i) > str.charAt(i - 1)) {
//                strNumber2 += str.charAt(i);
//            } else {
//                list.add(strNumber2);
//                index = i;
//                break;
//            }
//            if(i==str.length()-1){
//                list.add(strNumber2);
//            }
//        }
//        String strNumber3 ="";
//        for (int i = index; i < str.length(); i++) {
//            if (i == index || str.charAt(i) > str.charAt(i - 1)) {
//                strNumber3 += str.charAt(i);
//            } else {
//                list.add(strNumber3);
//                index = i;
//                break;
//            }
//            if(i==str.length()-1){
//                list.add(strNumber3);
//            }
//        }
    }

    private static List<String> tachChuoiThanhCacChuoiLienTiep(String str) {
        List<String> list = new ArrayList<>();
        int increment = 0;
        for (int i = 0; i < str.length(); i = i + increment) {
            String strNumber = "";
            for (int j = increment; j < str.length(); j++) {
                if (j == increment || str.charAt(j) > str.charAt(j - 1)) {
                    strNumber += str.charAt(j);
                } else {
                    list.add(strNumber);
                    increment = j;
                    break;
                }
                if (j == str.length() - 1) {
                    list.add(strNumber);
                    increment=j;
                }
            }
        }
        return list;
    }

    private static int getIndex(List<String> list) {
        int max = list.get(0).length();
        int index = 0;
        for(int i = 0; i< list.size(); i++){
            if(max< list.get(i).length()){
                max = list.get(i).length();
                index = i;
            }
        }
        return index;
    }
}
