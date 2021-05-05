package com.codegym;

public class AnimalFactory {
    public Animal createAnimal(String animalType){
        Animal animal;
        switch(animalType){
            case "Dog":{
                animal = new Dog();
                break;
            }
            case "Cat":{
                animal = new Cat();
                break;
            }
            case "Lion":{
                animal = new Lion();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + animalType);
        }
        return  animal;
    }
}
