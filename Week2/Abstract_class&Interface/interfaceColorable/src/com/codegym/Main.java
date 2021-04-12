package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Shape[] shapes = new Shape[5];
      shapes[0] = new Circle(Math.floor(Math.random()*(12-1)+1));
      shapes[1] = new Square(Math.floor(Math.random()*(12-1)+1));
      shapes[2] = new Rectangle(Math.floor(Math.random()*(12-1)+1), Math.floor(Math.random()*(12-1)+1));
      shapes[3] = new Circle(Math.floor(Math.random()*(12-1)+1));
      shapes[4] = new Square(Math.floor(Math.random()*(12-1)+1));
      for(int i = 0; i< shapes.length;i++){
          shapes[i].showArea();
          if(shapes[i] instanceof Square){
              ((Square) shapes[i]).howToColor();
          }
      }


    }
}
