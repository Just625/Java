package com.codegym;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle circl1, Circle circle2){
        if(circl1.getRadius()> circle2.getRadius()){
            return 1;
        }else if(circl1.getRadius()<circle2.getRadius()){
            return -1;
        }else{
            return 0;
        }
    }
}
