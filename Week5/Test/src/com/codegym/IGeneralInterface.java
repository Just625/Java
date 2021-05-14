package com.codegym;

public interface IGeneralInterface<T> {
    void add(T t);

    void display();

    void update(int index, T t);

    void delete(int index);
}
