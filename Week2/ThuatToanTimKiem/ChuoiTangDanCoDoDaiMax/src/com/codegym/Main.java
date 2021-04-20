package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Muc dich: Tao ra 1 mang ma` theo bang ma ASCII cac phan tu trong mang do tang dan,
// phan tu dau tien la chu cai dau tien nhap vao, them vao cac chu cai trong input neu chu cai do lon hon phan tu cuoi cung cua mang
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = src.nextLine();
        List<Character> finalList = new ArrayList<>();
        finalList = findEle(str, finalList);
        for(Character item:finalList){
            System.out.print(item);
        }
    }

    private static List<Character> findEle(String str, List<Character> finalList) {
        for (int i = 0; i < str.length(); i++) {
            List<Character> middleList = new ArrayList<>();
            middleList.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                //So sanh voi phan tu cuoi cung cua middlelist, add them neu thoa man
                if (str.charAt(j) > middleList.get(middleList.size() - 1)) {
                    middleList.add(str.charAt(j));
                }
                if(middleList.size()> finalList.size()){
                    finalList.clear();
                    finalList.addAll(middleList);
                }
            }
        }
        return finalList;
    }
}
//C la 1 hang so thoi gian?
//*Phan tich su phuc tap ve thoi gian
//str.length = n;
//Vong lap ngoai chay O(str.length) -> O(n)
//Gan O(1)
//Add O(1)
//Vong lap trong chay 0(str.length-1) - > 0(n-1)
//if O(1)
//Ben trong O(1)
//if O(1)
//Ben trong O(1)
//Ben trong O(1)
//T = [[O(3) + O(2)]*O(n) + O(1)]*O(n)
//T = [O(5)*O(n)+O(1)]*O(n)
//T = O(n)*O(n)
//T = O(n^2)


