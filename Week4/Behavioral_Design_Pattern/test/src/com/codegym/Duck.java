package com.codegym;



public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;
    public  Duck(){
        System.out.println("goi den ham constructor cua lop cha");
    }
    public  Duck(String a){
        System.out.println("goi den ham a");
    }
    public void setQuackBehavior(QuackBehavior inQuackBehavior) {
        quackBehavior = inQuackBehavior;
    }
    public void setFlyBehavior(FlyBehavior inFlyBehavior) {
        flyBehavior = inFlyBehavior;
    }
    public void quack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("I'm swimming");
    }
    public void fly() {
        flyBehavior.fly();
    }
    public abstract void display();
}