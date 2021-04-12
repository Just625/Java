package com.codegym;

public class Orange extends Fruit implements Edible{
    public Orange(){

    }
    @Override
    public String howtoEat(){
        return "juiced";
    }
}
