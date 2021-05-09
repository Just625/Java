package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UserController userController = new UserController(new MySQLStorage());
        User user1 = new User("A", 18);
        userController.store(user1);
        UserController userController2 = new UserController(new XMLStorage());
        User user2 = new User("B", 20);
        userController2.store(user2);
    }
}
