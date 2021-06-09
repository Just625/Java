package com.codegym.dao;

import com.codegym.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDAO {
    boolean insertProduct(Product product) ;
    Product findByID(int id);
    List<Product> selectAllProducts();
    boolean deleteProduct(int id);
    boolean editProduct(int id, Product product) ;
    List<Product> searchByName(String product);
}
