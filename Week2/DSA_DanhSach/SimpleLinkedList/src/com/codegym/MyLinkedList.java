package com.codegym;

public class MyLinkedList<T> {
    private Node head;
    private int numNodesFrom0 = 0;

    private class Node {
        private Node next;
        private T data;

        public Node() {

        }

        public Node(T t) {
            this.data = t;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    public MyLinkedList() {

    }

    public MyLinkedList(T t) {
        this.head = new Node(t);
    }

    public void add(int index, T t) {
        if (index < 0 || index > this.numNodesFrom0 +1) {
            throw new IndexOutOfBoundsException("Khong them vao vi tri duoc");
        }
        Node current = this.head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node middle = current.next;
        current.next = new Node(t);
        (current.next).next = middle;
        this.numNodesFrom0++;
    }

    public void addFirst(T t) {
        Node newHead = new Node(t);
        newHead.next = this.head;
        this.head = newHead;
        this.numNodesFrom0++;
    }

    public Node get(int index) {
        if (index < 0 || index > this.numNodesFrom0 ) {
            throw new IndexOutOfBoundsException("Vi tri khong hop le");
        }
        Node current = this.head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void printList() {
        Node current = this.head;
        int index = 0;
        while (current != null) {
            System.out.println("Vi tri thu " + index + ": " + current.getData());
            current = current.next;
            index++;
        }
    }
}



