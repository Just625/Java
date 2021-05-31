package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    private static List<Customer> customerList = new ArrayList<>();

    static{
        customerList.add(new Customer(1,"Weaver", "weaver@codegym.vn","Dire"));
        customerList.add(new Customer(2,"Phantom Lancer", "phantomlancer@codegym.vn","Radiant"));
        customerList.add(new Customer(3,"Hoodwink", "hoodwink@codegym.vn","Radiant"));
        customerList.add(new Customer(4,"Riki", "riki@codegym.vn","Dire"));
        customerList.add(new Customer(5,"Morphling", "morphling@codegym.vn","Radiant"));
    }
    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public int findByID(int id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean editCustomer(int id, Customer customer) {
        int index = findByID(id);
        if(index!=-1){
            customerList.set(index, customer);
            return true;
        }
        return false;
    }

    @Override
    public void deleteCustomer(int id) {
        int index = findByID(id);
        if(index!=-1){
            customerList.remove(index);
        }
    }
}
