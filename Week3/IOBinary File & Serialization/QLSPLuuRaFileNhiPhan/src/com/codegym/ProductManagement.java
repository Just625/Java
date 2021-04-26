package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    private List<Product> productList = new ArrayList<>();
    private String filePath = "Products list.txt";

    public ProductManagement() {
    }

    public ProductManagement(List<Product> productList, String filePath) {
        this.productList = productList;
        this.filePath = filePath;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void addNewProduct() {
        Product product = new Product();
        product.inputInfo();
        productList.add(product);
        this.writeDataToFile();
    }

    public void readDataFromFile() {
        try {
            FileInputStream fos = new FileInputStream(filePath);
            ObjectInputStream oos = new ObjectInputStream(fos);
            productList = (List<Product>) oos.readObject();
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayList() {
        this.readDataFromFile();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void writeDataToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
            fos.close();
            System.out.println("Write to file completed");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int findProductIndexByCode(String code) {
        this.readDataFromFile();
        int index = -1;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCode().equals(code)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void displayProductUsingIndex(String code) {
        int index = findProductIndexByCode(code);
        if (index == -1) {
            System.out.println("Product can not be found");
        } else {
            System.out.println(productList.get(index));
        }
    }
}
