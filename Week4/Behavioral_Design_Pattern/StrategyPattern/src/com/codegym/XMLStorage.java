package com.codegym;

public class XMLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("Store in XML");
    }
}
