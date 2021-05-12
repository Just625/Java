package com.codegym;

import java.io.Serializable;

public class Account implements Serializable {
    private String userName;
    private String passWord;
    private String id;
    private String role;

    public Account(String userName, String passWord, String id, String role) {
        this.userName = userName;
        this.passWord = passWord;
        this.id = id;
        this.role = role;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", id='" + id + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
