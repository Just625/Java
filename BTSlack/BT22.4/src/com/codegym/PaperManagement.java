package com.codegym;

import java.util.List;
import java.util.Scanner;

public class PaperManagement {
    public static final String ENTER_CODE = "Enter code";
    public static final String NOT_FOUND_MSG = "Paper not found";
    public static final String ENTER_TYPE_OF_PAPER = "Enter type of paper: book(1), magazine(2), newspaper(3)";
    public static final String ADD_COMPLETED = "Add completed";
    private List<Paper> list;

    public PaperManagement() {
    }

    public PaperManagement(List<Paper> list) {
        this.list = list;
    }

    public List<Paper> getList() {
        return list;
    }

    public void setList(List<Paper> list) {
        this.list = list;
    }

    public int getUserChoice() {
        Scanner src = new Scanner(System.in);
        System.out.println(ENTER_TYPE_OF_PAPER);
        return src.nextInt();
    }

    public void addPaper() {
        int userChoice = this.getUserChoice();
        switch (userChoice) {
            case 1: {
                Book newBook = new Book();
                newBook.bookInfo();
                this.list.add(newBook);
                break;
            }
            case 2: {
                Magazine newMagazine = new Magazine();
                newMagazine.magazineInfo();
                this.list.add(newMagazine);
                break;
            }
            case 3: {
                NewsPaper newNewsPaper = new NewsPaper();
                newNewsPaper.newsPaperInfo();
                this.list.add(newNewsPaper);
                break;
            }
        }
        System.out.println(ADD_COMPLETED);
    }

    public void displayList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void searchPaperByType() {
        int userChoice = this.getUserChoice();
        for (int i = 0; i < list.size(); i++) {
            if (userChoice == 1) {
                if (list.get(i) instanceof Book) {
                    System.out.println(list.get(i));
                }
            } else if (userChoice == 2) {
                if (list.get(i) instanceof Magazine) {
                    System.out.println(list.get(i));
                }
            } else if (userChoice == 3) {
                if (list.get(i) instanceof NewsPaper) {
                    System.out.println(list.get(i));
                }
            }
        }
    }

    public void sortList() {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                String comparedCode = list.get(j).getCode();
                String minCode = list.get(minIndex).getCode();
                if (minCode.charAt(0) > comparedCode.charAt(0)) {
                    minIndex = j;
                } else if (minCode.charAt(0) == comparedCode.charAt(0)) {
                    for (int k = 1; k < list.get(j).getCode().length(); k++) {
                        if (minCode.charAt(k) > comparedCode.charAt(k)) {
                            minIndex = j;
                        }
                    }
                }
            }
            if (minIndex != i) {
                Paper temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);
            }
        }
    }

    public int binarySearch(int left, int right, String code) {
        int middle = (left + right) / 2;
        while (left <= right) {
            if (list.get(middle).getCode().equals(code)) {
                return middle;
            } else if (list.get(middle).getCode().charAt(0) < code.charAt(0)) {
                return binarySearch(middle + 1, right, code);
            } else {
                return binarySearch(left, middle - 1, code);
            }
        }
        return -1;
    }

    public void searchPaperByCode() {
        Scanner src = new Scanner(System.in);
        this.sortList();
        System.out.println(ENTER_CODE);
        String code = src.nextLine();
        int index = binarySearch(0, list.size() - 1, code);
        if (index == -1) {
            System.out.println(NOT_FOUND_MSG);
        } else {
            System.out.println(list.get(index));
        }
    }

    public void insertionSort() {
        for (int i = 1; i < list.size(); i++) {
            int position = i;
            Paper temp = list.get(position);
            while (position > 0 && temp.getPublisher().charAt(0) < list.get(position - 1).getPublisher().charAt(0)) {
                list.set(position, list.get(position - 1));
                position--;
            }
            list.set(position, temp);
        }
    }
}
