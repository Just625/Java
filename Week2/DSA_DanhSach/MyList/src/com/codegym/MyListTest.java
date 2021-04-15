package com.codegym;

public class MyListTest {

    public static void main(String[] args) {
	// write your code here
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        System.out.printf("phan tu o vi tri thu 0: %d\n",listInteger.get(0));
        System.out.printf("phan tu o vi tri thu 1: %d\n",listInteger.get(1));
        System.out.printf("phan tu o vi tri thu 2: %d\n",listInteger.get(2));
        System.out.printf("phan tu o vi tri thu 3: %d\n",listInteger.get(3));

//        listInteger.get(6);
//        System.out.printf("phan tu o vi tri thu 6: %d\n",listInteger.get(6));
        listInteger.get(-1);
        System.out.printf("phan tu o vi tri thu -1: %d\n",listInteger.get(-1));
    }
}
