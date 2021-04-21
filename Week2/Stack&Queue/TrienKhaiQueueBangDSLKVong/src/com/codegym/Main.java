package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(14);
        myQueue.enQueue(22);
        myQueue.enQueue(-6);
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.enQueue(9);
        myQueue.enQueue(20);
        myQueue.displayQueue();
    }
}
