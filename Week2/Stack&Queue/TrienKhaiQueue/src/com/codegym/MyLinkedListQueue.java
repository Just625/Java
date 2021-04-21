package com.codegym;

public class MyLinkedListQueue {
    public Node head;
    public Node tail;

    public class Node {
        public int key;
        public Node next;

        public Node(int key) {
            this.key = key;
        }
    }

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node newNode = new Node(key);
        //Neu Queue rong
        if (this.tail == null) {
            this.head = this.tail = newNode;
            return;
        }
        this.tail.next = newNode;
        this.tail = newNode;
    }

    public Node dequeue() {
        //Neu Queue rong
        if(this.head==null){
            return null;
        }
        Node holder = this.head;
        this.head = this.head.next;
        //Neu Queue chi co 1 phan tu, phai gan lai tail ko thi tail van la holder
        if(this.head==null){
            this.tail=null;
        }
        return holder;
    }
}
