package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    List<Product> productList = new ArrayList<>();
    List<Product> showAll();
    void addProduct(Product product);
    boolean editProduct(int id, Product product);
    boolean deleteProduct(int id);
    Product viewAProduct(int id);
    List<Product> searchByName(String name);
    public int findById(int id);
}
