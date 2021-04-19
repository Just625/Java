package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0,1);
        myLinkedList.add(0,2);
        myLinkedList.add(2,3);
        myLinkedList.add(1,4);
        myLinkedList.addFirst(5);
        myLinkedList.addLast(6);
        myLinkedList.display();
//        myLinkedList.remove(0);
//        myLinkedList.display();
//        myLinkedList.remove(4);
//        myLinkedList.display();
//        System.out.println(myLinkedList.remove(1));
//        myLinkedList.display();
//        Integer a = 1;
//        Integer b =5;
//        System.out.println(myLinkedList.remove(a));
//        System.out.println(myLinkedList.remove(b));
//        myLinkedList.display();
//        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contains(5));
//        System.out.println(myLinkedList.indexOf());
        System.out.println(myLinkedList.indexOf(2));
        System.out.println(myLinkedList.indexOf(7));
        System.out.println(myLinkedList.get(1));
    }
}
