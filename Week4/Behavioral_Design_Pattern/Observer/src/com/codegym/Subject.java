package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer1> list = new ArrayList<>();
    public void attach(Observer1 observer1){
        list.add(observer1);
    }
    public void detach(Observer1 observer1){
        list.remove(observer1);
        System.out.println("Detach success");
    }
    public void notifyChange(int number){
        for(Observer1 obs:list){
            obs.update(number);
        }
    }
}
