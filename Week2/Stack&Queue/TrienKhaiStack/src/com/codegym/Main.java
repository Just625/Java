package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GenericStackClient stackClient = new GenericStackClient();
        stackClient.stackOfString();
        GenericStackClient stackClient1 = new GenericStackClient();
        stackClient1.stackOfIntegers();
    }
}
