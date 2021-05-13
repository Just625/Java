package com.codegym;

public class Person {
    private String phoneNumber;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String dOB;
    private String email;

    public Person() {
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void set(int index, String ele){
        if(index == 0){
            this.setPhoneNumber(ele);
        }else if(index == 1){
            this.setGroup(ele);
        }else if(index == 2){
            this.setName(ele);
        }else if(index == 3){
            this.setGender(ele);
        }else if(index == 4){
            this.setAddress(ele);
        }else if(index == 5){
            this.setdOB(ele);
        }else if(index == 6){
            this.setEmail(ele);
        }
    }

    public Person(String phoneNumber, String group, String name, String gender, String address, String dOB, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dOB = dOB;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "soDienThoai=" + phoneNumber +
                ", NhomDanhBa='" + group + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dOB='" + dOB + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(){

    }
}
