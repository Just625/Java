package com.codegym;

public class TacoMeal extends Meal{
    @Override
    public void cook() {
        System.out.println("Cooking taco");
    }
    @Override
    public void eat(){
        System.out.println("Eating taco");
    }
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing Taco, i guess");
    }
}
