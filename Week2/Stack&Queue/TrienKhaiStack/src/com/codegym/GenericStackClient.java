package com.codegym;

public class GenericStackClient {
    public void stackOfString() {
        MyGenericStack<String> stringStack = new MyGenericStack<>();
        stringStack.push("Five");
        stringStack.push("Four");
        stringStack.push("Three");
        stringStack.push("Two");
        stringStack.push("One");
        System.out.println("1.1 Size of stack after pushing: " + stringStack.size());
        System.out.println("1.2 Pop elements from stack");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
        System.out.println("1.3 After poping out all elements, size: " + stringStack.size());
    }

    public void stackOfIntegers() {
        MyGenericStack<Integer> integerStack = new MyGenericStack<>();
        integerStack.push(5);
        integerStack.push(4);
        integerStack.push(3);
        integerStack.push(2);
        integerStack.push(1);
        System.out.println("2.1 Size of stack after pushing: " + integerStack.size());
        System.out.println("2.2 Pop elements from stack");
        while (!integerStack.isEmpty()) {
            System.out.println(integerStack.pop());
        }
        System.out.println("2.3 After poping out all elements, size: " + integerStack.size());
    }
}

