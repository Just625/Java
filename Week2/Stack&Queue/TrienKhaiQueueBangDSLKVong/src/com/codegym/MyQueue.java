package com.codegym;

public class MyQueue {
    public Node front;
    public Node rear;

    private class Node {
        public int data;
        public Node link;

        public Node() {

        }

        public Node(int data) {
            this.data = data;
        }
    }

    public MyQueue() {

    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            newNode.link = newNode;
        } else {
            this.rear.link = newNode;
            newNode.link = this.front;
            this.rear = newNode;
        }
    }

    public void deQueue() {
        if (this.front == null) {
            System.out.println("Khong xoa duoc");
        } else if (this.front == this.rear) {
            this.front = this.rear = null;
        } else {
            this.rear.link = this.front.link;
            this.front = this.front.link;
        }
    }

    public void displayQueue() {
        Node current = this.front;
        do {
            System.out.print(current.data + " ");
            current = current.link;
        } while (current != this.front);
    }
}
