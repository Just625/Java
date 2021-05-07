package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SortedList sortedList =  new SortedList();
        sortedList.add("Java");
        sortedList.add("PHP");
        sortedList.add("C#");
        sortedList.add("Python");

        sortedList.setSortStrategy(new MergeSortStrategy());
        sortedList.sort();
        sortedList.setSortStrategy(new QuickSortStrategy());
        sortedList.sort();
        sortedList.setSortStrategy(new SelectionSortStrategy());
        sortedList.sort();
    }
}
