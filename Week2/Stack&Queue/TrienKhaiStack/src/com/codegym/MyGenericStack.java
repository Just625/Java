package com.codegym;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        this.stack = new LinkedList<>();
    }

    public void push(T t) {
        this.stack.addFirst(t);
    }

    public T pop() {
        if(this.isEmpty()){
            return null;
        }
        return this.stack.removeFirst();
    }

    public int size() {
        return this.stack.size();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
}
