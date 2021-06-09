package com.codegym.dao;

import com.codegym.model.Product;
import com.codegym.model.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDAO implements IProductDAO {

    public static final String SELECT_ALL_PRODUCT = "select * from product";
    public static final String INSERT_PRODUCT = "insert into product(name, price, quantity, color, category_id,description) values(?,?,?,?,?,?)";
    private static final String SELECT_ALL_CATEGORY ="select * from category;" ;
    private static final String UPDATE_PRODUCT_BY_ID = "update product set name= ?,price=?,quantity=?,color=?,category_id=?,description=? where id =?";
    private static final String SELECT_PRODUCT_BY_ID = "select * from product where id =?";
    private static final String DELETE_PRODUCT_BY_ID = "Delete from product where id = ?";

    @Override
    public boolean insertProduct(Product product) {
        int rowInserted = 0;
        Connection connection = SQLConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setInt(5, product.getCategory_id());
            preparedStatement.setString(6, product.getDescription());
            rowInserted = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowInserted != 0;
    }

    @Override
    public Product findByID(int id) {
        Product product=null;
        Connection connection = SQLConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                int category_id = resultSet.getInt("category_id");
                String description = resultSet.getString("description");
                product = new Product(id,name,price,quantity,color,category_id,description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public List<Product> selectAllProducts() {
        List<Product> productList = new ArrayList<>();
        Connection connection = SQLConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                String color = resultSet.getString("color");
                int category_id = resultSet.getInt("category_id");
                String description = resultSet.getString("description");
                productList.add(new Product(id, name, price, quantity, color, category_id,description));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public boolean deleteProduct(int id) {
        Connection connection = SQLConnection.getConnection();
        int rowDeleted = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);
            rowDeleted = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
        }
        return rowDeleted != 0;
    }

    @Override
    public boolean editProduct(int id, Product product)  {
        Connection connection = SQLConnection.getConnection();
        int rowUpdated = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT_BY_ID);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setInt(5, product.getCategory_id());
            preparedStatement.setString(6, product.getDescription());
            preparedStatement.setInt(7, id);
            rowUpdated = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdated != 0;
    }

    @Override
    public List<Product> searchByName(String product) {
        return null;
    }

    public Map<Integer, String> getCategoryName() {
        Map<Integer, String> categoryList = new HashMap<>();
        Connection connection = SQLConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CATEGORY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("category_id");
                String name = resultSet.getString("name");
                categoryList.put(id, name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return categoryList;
    }
}
