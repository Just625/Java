package com.codegym;

import com.sun.glass.ui.Size;

public class MyLinkedList {
    private Node head;
    private int size;

    private class Node {
        private Node next;
        private Object data;

        public Node() {

        }

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {

    }

    public MyLinkedList(Object data) {
        this.head = new Node(data);
        size++;
    }

    public void add(int index, Object data) {
        Node current = head;
        //Bat dau o head nen chi lap (i-1)lan
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }
        Node middle = current.next;
        current.next = new Node(data);
        current.next.next = middle;
        size++;
    }

    public void addFirst(Object data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        size++;
    }

    public Node get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void printList() {
        //Cach 1:
        for (int i = 0; i < size; i++) {
            System.out.println(this.get(i).data);
        }
        //Cach 2:
//        Node current = head;
//        while (current != null) {
//            System.out.println(current);
//            current = current.next;
//        }
    }
}
