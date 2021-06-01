package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductService implements IProductService {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iron branch", 50, "A seemingly ordinary branch, its ironlike qualities are bestowed upon the bearer."));
        productList.add(new Product(2, "Tango", 90, "Forage to survive on the battlefield."));
        productList.add(new Product(3, "Javelin", 1100, "A rather typical spear that can sometimes pierce through an enemy's armor when used to attack."));
        productList.add(new Product(4, "Blink Dagger", 2250, "The fabled dagger used by the fastest assassin ever to walk the lands."));
        productList.add(new Product(5, "Hyperstone", 2000, "A mystical, carved stone that boosts the fervor of the holder."));
    }

    @Override
    public List<Product> showAll() {
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }
    @Override
    public int findById(int id){
        for(int i=0;i<productList.size();i++){
            if(productList.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean editProduct(int id, Product product) {
        int index = findById(id);
        if(index!=-1){
            productList.set(index, product);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        int index = findById(id);
        if(index!=-1){
            productList.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Product viewAProduct(int id) {
        int index = findById(id);
        if(index!=-1){
            return productList.get(index);
        }
        return null;
    }

    @Override
    public List<Product> searchByName(String name) {
        name = name.toLowerCase(Locale.ROOT);
        List<Product> searchList = new ArrayList<>();
        for (Product product:productList) {
            if(product.getName().toLowerCase(Locale.ROOT).contains(name)){
                searchList.add(product);
            }
        }
        return searchList;
    }
}
