package com.codegym;

import java.util.Scanner;

public class Receipt {
    private Customer customer = new Customer();
    private double oldIndex;
    private double newIndex;

    public Receipt() {

    }

    public Receipt(Customer customer, double oldIndex, double newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(double oldIndex) {
        this.oldIndex = oldIndex;
    }

    public double getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(double newIndex) {
        this.newIndex = newIndex;
    }

    public double calculateMoney() {
        return (this.newIndex - this.oldIndex) * 750;
    }

    public void displayReceipt() {
        this.customer.displayCustomerInfo();
        System.out.printf(", Old index: %f, New index: %f\n", this.oldIndex, this.newIndex);
    }
    public void inputReceiptInfo(){
        Scanner src = new Scanner(System.in);
        this.customer.inputCustomerInfo();
        System.out.printf("Enter old index:");
        this.oldIndex = src.nextDouble();
        System.out.printf("Enter new index:");
        this.newIndex = src.nextDouble();
    }
}
