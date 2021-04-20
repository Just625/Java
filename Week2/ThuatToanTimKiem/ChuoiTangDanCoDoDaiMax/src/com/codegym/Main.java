package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = src.nextLine();
        List<Character> finalList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            List<Character> middleList = new ArrayList<>();
            middleList.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                //So sanh voi phan tu cuoi cung cua middlelist, add them neu thoa man
                if (str.charAt(j) > middleList.get(middleList.size() - 1)) {
                    middleList.add(str.charAt(j));
                }
                if(middleList.size()>finalList.size()){
                    finalList.clear();
                    finalList.addAll(middleList);
                }
            }
        }
        for(Character item:finalList){
            System.out.print(item);
        }
    }

}

