package com.codegym;

import java.util.List;

public class AccountManagement {
    private List<Account> accountList;

    public AccountManagement() {
    }

    public AccountManagement(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public boolean checkDuplicate(Account account) {
        boolean isDuplicate = false;
        for (Account ele : accountList) {
            if (ele.getUserName().equals(account.getUserName())
                    || ele.getId().equals(account.getId())) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }

    public int checkAccountInList(String userName, String passWord) {
        int index = -1;
        for (int i = 0; i < accountList.size(); i++) {
            Account currentAccount = accountList.get(i);
            if (currentAccount.getUserName().equals(userName) && currentAccount.getPassWord().equals(passWord)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public String getRoleById(String userName, String passWord) {
        int index = this.checkAccountInList(userName, passWord);
        if (index != -1) {
            return accountList.get(index).getRole();
        } else {
            return "Wrong password or username";
        }
    }
    public void showAll(){
        for(Account account:accountList){
            System.out.println(account);
        }
    }
    public String getIdByIndex(int index){
        return  accountList.get(index).getId();
    }
}
