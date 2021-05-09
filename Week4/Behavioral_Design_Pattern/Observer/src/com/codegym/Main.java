package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Subject subject = new Subject();
        subject.attach(new OctObserver1());
        subject.attach(new HexObserver1());
        subject.attach(new BinObserver1());
        subject.notifyChange(10);
    }
}
