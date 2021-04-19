package com.codegym;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String address;
    public Student(){

    }
    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
//    So sanh tuoi
//    @Override
//    public int compareTo(Student o) {
//    c1
//        if(this.age>o.age){
//            return 1;
//        }else if(this.age<o.age){
//            return -1;
//        }else{
//            return 0;
//        }
//    c2:
//    return this.age - o.age;
//    }
    //So sanh name (String)
    @Override
    public int compareTo(Student o) {
       return this.name.compareTo(o.name);
    }
}
