package com.codegym;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("enter string:");
        String str = src.nextLine();

        Map<Character, Integer> chars = new TreeMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (chars.containsKey(currentChar)) {
                chars.replace(currentChar, chars.get(currentChar), chars.get(currentChar) + 1);
            } else {
                chars.put(currentChar, 1);
            }
        }
        System.out.println(chars);
    }
}
