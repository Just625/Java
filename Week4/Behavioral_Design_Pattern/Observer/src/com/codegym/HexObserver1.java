package com.codegym;

public class HexObserver1 implements Observer1 {
    @Override
    public void update(int number) {
        System.out.println("Chuyen doi sang he thap luc phan "+Integer.toHexString(number));
    }
}
