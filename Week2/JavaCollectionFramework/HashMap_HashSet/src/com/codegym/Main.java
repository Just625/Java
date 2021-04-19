package com.codegym;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student("Axe", 18, "Radiant");
        Student student2 = new Student("TideHunter", 20, "Dire");
        Student student3 = new Student("DawnBreaker", 5, "Radiant");

        System.out.println("HashMap");
        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(4, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);
        //Phong doan: sap xep theo key chu ko phai thu tu truyen vao
        for(Map.Entry<Integer,Student> student:hashMap.entrySet()){
            System.out.println(student);
        }

        System.out.println("HashSet");
        Set<Student> hashSet = new HashSet<>();
        hashSet.add(student3);
        hashSet.add(student1);
        hashSet.add(student2);
        //add vao dau` ?
        for(Student student:hashSet){
            System.out.println(student);
        }
    }
}
