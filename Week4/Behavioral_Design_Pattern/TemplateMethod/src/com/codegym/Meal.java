package com.codegym;

public abstract class Meal {
    public Meal() {
    }
    public void doMeal(){
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }

    public abstract void cook();


    public void eat() {
        System.out.println("Eating");
    }

    public void cleanUp() {
        System.out.println("Wash the dish");
    }

    public abstract void prepareIngredients();
}
