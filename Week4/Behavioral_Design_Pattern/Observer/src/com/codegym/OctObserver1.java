package com.codegym;

public class OctObserver1 implements Observer1 {
    @Override
    public void update(int number) {
        System.out.println("Chuyen doi sang he thap phan " + Integer.toOctalString(number));
    }
}
