package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhBaManagement implements IGeneralInterface<Person> {
    List<Person> personList = new ArrayList<>();

    public DanhBaManagement() {
    }

    public DanhBaManagement(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getDanhBaList() {
        return personList;
    }

    public void setDanhBaList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "DanhBaManagement{" +
                "personList=" + personList +
                '}';
    }

    @Override
    public void add(Person person) {
        personList.add(person);
        System.out.println("Person added");
    }

    @Override
    public void display() {
        Scanner src = new Scanner(System.in);
        for (Person person : personList) {
            System.out.println("Phone number: " + person.getPhoneNumber());
        }
        src.nextLine();
        for (Person person : personList) {
            System.out.println("Group: " + person.getGroup());
        }
        src.nextLine();
        for (Person person : personList) {
            System.out.println("Name: " + person.getName());
        }
        src.nextLine();
        for (Person person : personList) {
            System.out.println("Gender: " + person.getGender());
        }
        src.nextLine();
        for (Person person : personList) {
            System.out.println("Address: " + person.getAddress());
        }
    }

    @Override
    public void update(int index, Person person) {
        personList.set(index, person);
        System.out.println("Edit completed");
    }

    @Override
    public void delete(int index) {
        personList.remove(index);
        System.out.println("Delete completed");
    }

    public int findIndexByPhoneNumber(String phoneNumber) {
        int index = -1;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getPhoneNumber().equals(phoneNumber)) {
                index = i;
                break;
            }
        }
        return index;
    }
    public void findCloseExactName(String name){
        name = name.toLowerCase();
        boolean isFind = false;
        for(Person person:personList){
            if(person.getName().toLowerCase().contains(name)){
                System.out.println(person);
                isFind = true;
            }
        }
        if(!isFind){
            System.out.println("Can not find that name");
        }
    }
}
