package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    void edit(int id,Product product);
    void delete(Product product);
    Product findById(int id);
    List<Product>  findByName(String name);
}
