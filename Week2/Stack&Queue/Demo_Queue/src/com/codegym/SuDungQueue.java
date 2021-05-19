package com.codegym;

import java.util.LinkedList;
import java.util.Queue;

public class SuDungQueue {

    public static void main(String[] args) {
	// write your code here
        Queue<String> queue = new LinkedList<>();
        queue.add("Quan");
        queue.add("Hieu");
        queue.add("Vu");
        queue.add("Tu");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
