package com.codegym;

public class TestMyLinkedList {

    public static void main(String[] args) {
        // write your code here
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        System.out.println("Test begin in");
        System.out.println("3..");
        System.out.println("2..");
        System.out.println("1..");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        myLinkedList.add(4,9);
        myLinkedList.add(4,9);
        myLinkedList.printList();
    }
}
