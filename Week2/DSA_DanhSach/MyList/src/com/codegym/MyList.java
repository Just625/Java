package com.codegym;

import java.util.Arrays;

public class MyList<T> {
    public int size = 0;
    private int DEFAULT_CAPACITY = 2;
    private T[] elements;

    public MyList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T t) {
        damBaoChoTrong();
        this.elements[size] = t;
        size++;
    }

    private void damBaoChoTrong() {
        if (this.size == this.elements.length) {
            T[] newElements = (T[]) new Object[this.size + 1];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public T get(int index) {
        if(index<0 || index >this.size){
            throw new IndexOutOfBoundsException("Vi tri thu "+ index+ " khong hop le");
        }else{
            return this.elements[index];
        }
    }
}
