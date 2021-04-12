package com.codegym;

public class ComparableSquare extends Square implements Comparable<ComparableSquare>{
    public ComparableSquare() {
    }

    public ComparableSquare(double side) {
        super(side);
    }

    public ComparableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }
    @Override
    public int compareTo(ComparableSquare square){
        if(this.getArea()>square.getArea()){
            return 1;
        }else if(this.getArea()<square.getArea()){
            return -1;
        }else{
            return 0;
        }
    }
}
