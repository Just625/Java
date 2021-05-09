package com.codegym;

public class BinObserver1 implements Observer1 {

    @Override
    public void update(int number) {
        System.out.println("Chuyen doi sang he nhi phan "+Integer.toBinaryString(number));
    }
}
