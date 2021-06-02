package com.codegym.dao;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDao {
    boolean insertUser(User user) ;
    User findByID(int id);
    List<User> selectAllUsers();
    boolean deleteUser(int id) throws SQLException;
    boolean editUser(int id, User user) throws SQLException;
    List<User> searchByCountry(String country);
    List<User> sortByName();
}
