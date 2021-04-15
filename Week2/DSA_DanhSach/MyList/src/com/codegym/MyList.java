package com.codegym;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList(){
        this.elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length *2;
        this.elements = Arrays.copyOf(this.elements,newSize);
    }
    //Them phan tu vao cuoi danh sach
    public void add(E e){
        if(size == elements.length){
            this.ensureCapa();
        }
        elements[size] = e;
        size++;
    }
    //Tra ve phan tu o vi tri thu i
    public E get(int i){
        if(i>=size || i <0){
//            System.out.println("Vi tri khong hop le");
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

}
