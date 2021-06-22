package com.codegym.service;

import com.codegym.model.User;

import java.util.List;

public interface IUserService {
    void saveUser(User user);
    List<User> findAll();
}
