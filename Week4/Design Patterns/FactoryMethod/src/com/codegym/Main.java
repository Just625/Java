package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner src = new Scanner(System.in);
        do{
            System.out.println("Enter animal type");
            String animalType = src.nextLine();
            AnimalFactory animalFactory = new AnimalFactory();
            Animal newAnimal = animalFactory.createAnimal(animalType);
            newAnimal.makeSound();
        }while(true);
    }
}
