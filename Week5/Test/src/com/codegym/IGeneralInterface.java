package com.codegym;

public interface IGeneralInterface<T> {
    public void add(T t);
    public void display();
    public void update(int index, T t);
    public void delete(int index);
}
