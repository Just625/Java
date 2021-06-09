package com.codegym.service;

import com.codegym.dao.ProductDAO;
import com.codegym.model.Product;
import com.codegym.model.SQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    ProductDAO productDAO = new ProductDAO();
    @Override
    public boolean insertProduct(Product product) {
        return productDAO.insertProduct(product);
    }

    @Override
    public Product findByID(int id) {
        return productDAO.findByID(id);
    }

    @Override
    public List<Product> selectAllProducts() {
        return productDAO.selectAllProducts();
    }

    @Override
    public boolean deleteProduct(int id)  {
        return productDAO.deleteProduct(id);
    }

    @Override
    public boolean editProduct(int id, Product product)  {
        return productDAO.editProduct(id,product);
    }

    @Override
    public List<Product> searchByName(String product) {
        return null;
    }
    public Map<Integer, String> getCategoryName() {
        return productDAO.getCategoryName();
    }
}
