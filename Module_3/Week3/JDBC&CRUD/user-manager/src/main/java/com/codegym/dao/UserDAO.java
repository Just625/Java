package com.codegym.dao;

import com.codegym.model.SQLConnection;
import com.codegym.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDao {
    public static final String INSERT_USER = "insert into users(name, email, country) values(?,?,?)";
    public static final String SELECT_ALL_USERS = "SELECT * FROM USERS";
    public static final String SELECT__USERS_BY_ID = "select * from users where id=?";
    public static final String DELETE_USERS_BY_ID = "delete from users where id = ?";
    public static final String UPDATE_USERS_BY_ID = "update users set name= ?,email=?,country=? where id =?;";

    public UserDAO() {
    }


    @Override
    public boolean insertUser(User user) {
        Connection connection = SQLConnection.getConnection();
        PreparedStatement preparedStatement = null;
        int rowInserted = 0;
        try {
            preparedStatement = connection.prepareStatement(INSERT_USER);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            rowInserted = preparedStatement.executeUpdate();
            //Trả về số bản ghi được thêm vào ( ở đây là 1)
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //Kiem tra xem co add thanh cong hay ko
        return rowInserted != 0;
    }

    @Override
    public User findByID(int id) {
        User user = null;
        Connection connection = SQLConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT__USERS_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        Connection connection = SQLConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        int rowDeleted = 0;
        Connection connection = SQLConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_BY_ID);
        preparedStatement.setInt(1, id);
        rowDeleted = preparedStatement.executeUpdate();
        return rowDeleted != 0;
    }

    @Override
    public boolean editUser(int id, User user) throws SQLException {
        int rowUpdated = 0;
        Connection connection = SQLConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_BY_ID);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getCountry());
        preparedStatement.setInt(4, id);
        rowUpdated = preparedStatement.executeUpdate();
        return rowUpdated != 0;
    }

    public void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState:" + ((SQLException) e).getSQLState());
                System.err.println("Error code:" + ((SQLException) e).getErrorCode());
                System.err.println("Message:" + e.getMessage());
                Throwable t = ex.getCause();
                while(t!=null){
                    System.out.println("Cause: "+t);
                    t=t.getCause();
                }
            }
        }
    }
}
