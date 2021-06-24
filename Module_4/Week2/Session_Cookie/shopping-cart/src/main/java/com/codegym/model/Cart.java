package com.codegym.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> shoppingCart = new HashMap<>();

    public Cart(Map<Product, Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Map<Product, Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Cart() {
    }
    public boolean checkItemInCart(Product product){
        for(Map.Entry<Product, Integer> entry:shoppingCart.entrySet()){
            if(entry.getKey().equals(product)){
                return true;
            }
        }
        return false;
    }

    public Map.Entry<Product, Integer> selectItemInCart(Product product){
        for(Map.Entry<Product, Integer>entry:shoppingCart.entrySet()){
            if(entry.getKey().equals(product)){
                return entry;
            }
        }
        return null;
    }

    public void addProductToCart(Product product){
        if(checkItemInCart(product)){
            Integer quantity = shoppingCart.get(product);
            shoppingCart.put(product,quantity+1);
        }else{
            shoppingCart.put(product,1);
        }
    }

    public Integer countProductQuantity(){
        Integer productQuantity = 0 ;
        for(Map.Entry<Product,Integer> entry:shoppingCart.entrySet()){
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Integer countItemQuantity(){
        return shoppingCart.size();
    }
    public Double totalPayment(){
        Double payment = 0.0 ;
        for(Map.Entry<Product, Integer> entry:shoppingCart.entrySet()){
            payment+= entry.getKey().getPrice() * entry.getValue();
        }
        return payment;
    }
}
