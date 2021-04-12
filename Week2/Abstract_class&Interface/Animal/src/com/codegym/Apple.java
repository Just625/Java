package com.codegym;

public class Apple extends Fruit implements Edible{
    public Apple(){

    }
    @Override
    public String howtoEat(){
        return "Slided";
    }
}
