package com.codegym;

import java.util.Arrays;

public class MyList<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public T[] elements;

    //Khi khoi tao se cho elements tham chieu toi 1 doi tuong co do dai tuong ung
    public MyList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.elements = (T[]) new Object[capacity];

    }

    public void add(int index, T t) {
        ensureCapacity(this.elements.length);
        if (index > this.size) {
            throw new IndexOutOfBoundsException("Vi tri khong hop le");
        }
        for (int i = size; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = t;
        this.size++;
    }

    public T remove(int index) {
        checkIndexInRange(index);
        T removedEle = this.elements[index];
        for (int i = index; i < size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[size - 1] = null;
        this.size--;
        return removedEle;
    }

    private void checkIndexInRange(int index) {
        if (index < 0 || index > this.size - 1) {
            throw new IndexOutOfBoundsException("Vi tri khong hop le");
        }
    }

    public int size() {
        return this.size;
    }

    public T[] clone() {
        return this.elements;
    }

    public boolean contains(T t) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(t)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T t) {
        int index = -1;
        if (this.contains(t)) {
            for (int i = 0; i < this.size; i++) {
                if (this.elements[i].equals(t)) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    //Add vao cuoi,
    public boolean add(T t) {
        this.add(this.size, t);
        return true;
        //Co the la do list ke thua tu Collection (list cho phep trung lap, set thi ko)
    }

    public void ensureCapacity(int minCapacity) {
        if (size >= minCapacity) {
            T[] newElements = (T[]) new Object[this.elements.length + 1];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public T get(int i) {
        checkIndexInRange(i);
        return this.elements[i];

    }

    public void clear() {
        this.elements = (T[]) new Object[this.elements.length];
    }


    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
