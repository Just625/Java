package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void addCustomer(Customer customer);
    int findByID(int id);
    boolean editCustomer(int id, Customer customer);
    void deleteCustomer(int id);

}
