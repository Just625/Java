package com.codegym;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //HashMap se sap xep theo 1 thu tu nao day
        Map<String, Integer> students= new HashMap<>();
        students.put("Commander", 15);
        students.put("Axe",25);
        students.put("BeastMaster", 30);
        System.out.println(students);
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("Commander", 15);
//        treeMap.put("Axe",25);
//        treeMap.put("BeastMaster", 30);
//        System.out.println(treeMap);
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
//        linkedHashMap.put("Commander", 15);
//        linkedHashMap.put("Axe",25);
//        linkedHashMap.put("BeastMaster", 30);
//        System.out.println(linkedHashMap);
        Map<String, Integer> treeMap = new TreeMap<>(students);
        System.out.println(treeMap);

        //ko viet gi trong ngoac thi se add theo thu tu nhap vao
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for" + " Lewis is "+ linkedHashMap.get("Lewis"));
        System.out.println(linkedHashMap);
    }
}
