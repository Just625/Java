package com.codegym;

public class Chicken extends Animal implements Edible{
    public Chicken(){

    }
    @Override
    public String makeSound(){
        return "Cuc tac";
    }
    @Override
    public String howtoEat(){
        return "fried";
    }
}
