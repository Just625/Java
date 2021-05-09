package com.codegym;

public class HamburgerMeal extends Meal{

    @Override
    public void cook() {
        System.out.println("Cooking hamburger");
    }

    @Override
    public void prepareIngredients() {
        System.out.println("Preparing beef,bread, cucumber, tomato, cheese");
    }
}
