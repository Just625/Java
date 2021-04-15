package com.codegym;

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
        return (this.oldIndex - this.newIndex) * 750;
    }

    public void displayReceipt() {
        this.customer.displayCustomerInfo();
        System.out.printf(", Old index: %f, New index: %f, Money calculated: %f", this.oldIndex, this.newIndex, this.calculateMoney());
    }
    public void inputReceiptInfo(Customer customer, double oldIndex, double newIndex){
        this.customer.inputCustomerInfo();
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }
}
