package com.codegym;

import java.util.*;

public class AlgorithmComplexityText {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("enter string:");
        String str = src.nextLine();
        Map<Character, Integer> chars = new TreeMap<Character, Integer>();
        chars = countWordFrequency(str, chars);
        System.out.println(chars);
        getCharMaxFrequency(str, chars);
    }

    private static void getCharMaxFrequency(String str, Map<Character, Integer> chars) {
        int maxFrequeny = chars.get(str.charAt(0));
        Character max = str.charAt(0);
        for (Map.Entry<Character, Integer> item : chars.entrySet()) {
            if (maxFrequeny < item.getValue()) {
                maxFrequeny = item.getValue();
                max = item.getKey();
            }
        }
        System.out.println("Chu xuat hien nhieu nhat la: " + max + ", frequency: " + maxFrequeny);
    }

    private static Map<Character, Integer> countWordFrequency(String str, Map<Character, Integer> chars) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (chars.containsKey(currentChar)) {
                chars.replace(currentChar, chars.get(currentChar), chars.get(currentChar) + 1);
            } else {
                chars.put(currentChar, 1);
            }
        }
        return chars;
    }
}
