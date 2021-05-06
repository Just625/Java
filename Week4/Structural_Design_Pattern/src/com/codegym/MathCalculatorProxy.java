package com.codegym;

public class MathCalculatorProxy implements Subject{
    private MathSubject mathSubject;

    public MathCalculatorProxy() {
        this.mathSubject = new MathSubject();
    }

    @Override
    public double add(double firstNumb, double secondNumb) {
        return mathSubject.add(firstNumb, secondNumb);
    }

    @Override
    public double sub(double firstNumb, double secondNumb) {
        return mathSubject.sub(firstNumb, secondNumb);
    }

    @Override
    public double mul(double firstNumb, double secondNumb) {
        return mathSubject.mul(firstNumb,secondNumb);
    }

    @Override
    public double div(double firstNumb, double secondNumb) {
        if(secondNumb==0){
            throw new RuntimeException("Can't divide by zero");
        }else{
            return mathSubject.div(firstNumb,secondNumb);
        }
    }
}
