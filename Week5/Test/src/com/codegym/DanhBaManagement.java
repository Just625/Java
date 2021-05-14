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
        if (personList.size() <= 5) {
            for (Person person : personList) {
                System.out.println(person);
            }
        } else if (personList.size() == 0) {
            System.out.println("There is no person in the list right now");
        } else {
            int count = 0;
            for (Person person : personList) {
                if (count%5!=0 || count == 0) {
                    System.out.println(person);
                    count++;
                }else{
                    System.out.println("Press enter to show next 5 info");
                    src.nextLine();
                    count = 1;
                    System.out.println(person);
                }
            }
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

    public void findCloseExactName(String name) {
        name = name.toLowerCase();
        boolean isFind = false;
        for (Person person : personList) {
            if (person.getName().toLowerCase().contains(name)) {
                System.out.println(person);
                isFind = true;
            }
        }
        if (!isFind) {
            System.out.println("Can not find that name");
        }
    }
}
