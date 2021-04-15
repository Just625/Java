package com.codegym;

import java.util.Scanner;

public class ReceiptManagement {
    private Receipt[] receipts;
    public ReceiptManagement(){

    }
    public ReceiptManagement(Receipt[] receipts) {
        this.receipts = receipts;
    }

    public Receipt[] getReceipts() {
        return receipts;
    }

    public void setReceipts(Receipt[] receipts) {
        this.receipts = receipts;
    }
    public void initReceipt(){
        for(int i = 0; i< this.receipts.length; i++){
            this.receipts[i] = new Receipt();
            this.receipts[i].inputReceiptInfo();
        }
    }
    public void showAllReceipt() {
        for(int j = 0; j < this.receipts.length; j++){
            this.receipts[j].displayReceipt();
        }
    }
    public int getIndexFromCode(String code) {
        int index = -1;
        for(int i = 0; i < receipts.length; i++){
            if(receipts[i].getCustomer().getCode().equals(code)){
                index = i;
                break;
            }
        }
        return index;
    }
    public void calculateMoneyFromCode() {
        Scanner src = new Scanner(System.in);
        System.out.printf("Nhap vao code ho dan can tinh tien:");
        String code  = src.nextLine();
        int index = getIndexFromCode(code);
        if(index == -1){
            System.out.println("Money calculate: 0");
        }else{
            double money = receipts[index].calculateMoney();
            System.out.printf("Money calculate: %f\n", money);
        }
    }
}
