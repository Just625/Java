package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy sortStrategy;
    private List<String> items = new ArrayList<>();

    public SortedList() {
    }

    public SortedList(SortStrategy sortStrategy, List<String> items) {
        this.sortStrategy = sortStrategy;
        this.items = items;
    }
    public void setSortStrategy(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }
    public void add(String item){
        this.items.add(item);
    }
    public void sort(){
        this.sortStrategy.sort(items);
    }
}
