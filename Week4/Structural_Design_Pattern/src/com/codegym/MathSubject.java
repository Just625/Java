package com.codegym;

public class MathSubject implements Subject {
    public MathSubject() {
    }

    @Override
    public double add(double firstNumb, double secondNumb) {
        return  firstNumb + secondNumb;
    }

    @Override
    public double sub(double firstNumb, double secondNumb) {
        return firstNumb - secondNumb;
    }

    @Override
    public double mul(double firstNumb, double secondNumb) {
        return firstNumb * secondNumb;
    }

    @Override
    public double div(double firstNumb, double secondNumb) {
        return firstNumb/secondNumb;
    }
}
