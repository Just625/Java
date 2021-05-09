package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();
        System.out.println();
        Meal meal2 = new TacoMeal();
        meal2.doMeal();
    }
}
