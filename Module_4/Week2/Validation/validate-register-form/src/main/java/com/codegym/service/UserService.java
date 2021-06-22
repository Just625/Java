package com.codegym.service;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;


public class UserService implements IUserService{
    private static List<User> users = new ArrayList<>();

    @Override
    public void saveUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
