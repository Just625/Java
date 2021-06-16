package com.codegym.service;

import com.codegym.model.Product;


import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void edit(int id, Product product) {
        for(Product product1:products){
            if(product1.getId()==id){
                product1 = product;
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for(Product product:products){
            if(product.getId()==id){
                products.remove(product);
                break;
            }
        }
    }
}
