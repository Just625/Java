package com.codegym;

public class XayDungQueue<T> {
    private Node head;
    private Node tail;

    private class Node {
        private T t;
        private Node next;

        public Node(T t) {
            this.t = t;
            this.next = null;
        }
    }

    public XayDungQueue() {

    }

    public void enqueue(T t) {
        Node newNode = new Node(t);
        if (this.tail == null) {
            this.head = this.tail = newNode;
        }
        this.tail.next = newNode;
        this.tail = newNode;
    }

    public Node dequeue() {
        if (this.head == null) {
            this.tail = null;
        }
        Node temp = head;
        this.head = head.next;
        if (temp.next == null) {
            this.tail = null;
        }
        return temp;
    }
}
