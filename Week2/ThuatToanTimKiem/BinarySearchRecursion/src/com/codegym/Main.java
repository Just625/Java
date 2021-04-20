package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ComparatorNumber comparatorNumber = new ComparatorNumber();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(2);
        numbers.add(8);
        numbers.add(12);
        numbers.add(6);
        Collections.sort(numbers,comparatorNumber);
        System.out.println(numbers);
        System.out.println(binarySearch(numbers,0,numbers.size()-1,8));
        System.out.println(binarySearch(numbers,0,numbers.size()-1,15));
    }
    public static int binarySearch(List<Integer> numbers, int left, int right, int value){
        int index = -1;
        int middle = (left + right)/2;
        if(left > right){
            return index;
        }
        if(value == numbers.get(middle)){
            return middle;
        }else if(value>numbers.get(middle)){
            return binarySearch(numbers, middle +1, right, value);
        }else{
            return binarySearch(numbers, left, middle -1, value);
        }
    }
}
