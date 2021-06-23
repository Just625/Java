package com.codegym.model;

public class Email {
    private  String language;
    private int pageSize;
    private boolean isFilterSpammed;
    private String signature;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isFilterSpammed() {
        return isFilterSpammed;
    }

    public void setFilterSpammed(boolean filterSpammed) {
        isFilterSpammed = filterSpammed;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Email(String language, int pageSize, boolean isFilterSpammed, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.isFilterSpammed = isFilterSpammed;
        this.signature = signature;
    }

    public Email() {
    }
}
