package com.codegym;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Map<String, String> dictionary = new HashMap<>();
//        dictionary.put("Dog", "Cho");
//        dictionary.put("Cat", "Meo");
//        dictionary.put("Book", "Sach");
//        dictionary.put("Clock", "Ho");
////        show(dictionary);
////        dictionary.replace("Clock","Dong ho");
////        show(dictionary);
////        dictionary.remove("Cat");
////        show(dictionary);
//        String inputWord = new Scanner(System.in).nextLine();
//        for (Map.Entry<String, String> word : dictionary.entrySet()) {
//            if (word.getKey().equals(inputWord)) {
//                System.out.println(word.getValue());
//            } else if (word.getValue().equals(inputWord)) {
//                System.out.println(word.getKey());
//            }
//        }

        Node bst = new Node(60);
        bst.setLeft(55);
        bst.setRight(100);
        bst.getLeft().setLeft(47);
        System.out.println(bst.search(47, bst));

    }

    private static void show(Map<String, String> dictionary) {
        for (Map.Entry<String, String> word : dictionary.entrySet()) {
            System.out.println("Tu tieng anh:" + word.getKey() + " - Tu tieng viet: " + word.getValue());
        }
    }
}
