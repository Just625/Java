package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private static List<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "a", 1, "a", "a"));
        products.add(new Product(2, "b", 1, "b", "b"));
        products.add(new Product(3, "c", 1, "c", "c"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        int id1 = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                id1=i;
                break;
            }
        }
        products.set(id1, product);
    }

    @Override
    public void delete(Product product) {
        products.remove(product);
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                product = products.get(i);
                break;
            }
        }
        return product;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                productList.add(product);
            }
        }
        return productList;
    }
}
