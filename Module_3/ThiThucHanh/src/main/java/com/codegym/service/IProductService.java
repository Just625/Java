package com.codegym.service;

import com.codegym.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    boolean insertProduct(Product product) ;
    Product findByID(int id);
    List<Product> selectAllProducts();
    boolean deleteProduct(int id) ;
    boolean editProduct(int id, Product product);
    List<Product> searchByName(String product);
}
