package com.codegym;

public class LinkedListQueueClient {

    public static void main(String[] args) {
	// write your code here
        MyLinkedListQueue myQueue = new MyLinkedListQueue();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        System.out.println("Dequeue item is "+ myQueue.dequeue().key);
    }
}
