package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MyList<Integer> myList = new MyList<>(1);
        myList.add(0,2);
        myList.add(1,3);
        myList.add(2,4);
        System.out.println(myList);
        System.out.println(myList.remove(1));
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        System.out.println(myList.contains(5));
        System.out.println(myList.contains(null));
        System.out.println(myList.contains(2));
        System.out.println(myList.indexOf(2));
        System.out.println(myList.indexOf(3));
        System.out.println(myList.add(3));
        System.out.println(myList);
        System.out.println(myList.get(1));
        myList.clear();
        System.out.println(myList);
    }
}
