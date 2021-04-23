package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String INPUT_CHOICE_MSG = "Enter your choice:";
    public static final String INVALID_CHOICE = "Invalid choice";
    public static final String EXIT = "0. Thoát chương trình";
    public static final String SORT_BY_PUBLISHER_CHOICE = "5. Sắp xếp tài liệu theo tên nhà xuất bản";
    public static final String FIND_BY_CODE_CHOICE = "4. Tìm kiếm tài liệu theo mã tài liệu";
    public static final String FIND_BY_TYPE_CHOICE = "3. Tìm kiếm tài liệu theo mã loại (book, magazine, newspaper";
    public static final String SHOW_ALL_CHOICE = "2. Hiển thị thông tin về các tài liệu";
    public static final String INPUT_PAPER_CHOICE = "1. Nhập thông tin về các tài liệu";

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        List<Paper> list = new ArrayList<>();
        init(list);
        PaperManagement paperManagement = new PaperManagement(list);
        int choice;
        do {
            showMenu();
            System.out.println(INPUT_CHOICE_MSG);
            choice = src.nextInt();
            if (choice < 0 || choice > 5) {
                System.out.println(INVALID_CHOICE);
            }
            switch (choice) {
                case 1: {
                    paperManagement.addPaper();
                    break;
                }
                case 2: {
                    paperManagement.displayList();
                    break;
                }
                case 3: {
                    paperManagement.searchPaperByType();
                    break;
                }
                case 4: {
                    paperManagement.searchPaperByCode();
                    break;
                }
                case 5: {
                    paperManagement.insertionSort();
                    break;
                }
            }
        } while (choice != 0);

    }

    private static void init(List<Paper> list) {
        list.add(new Magazine("M1", "Kim Dong", 20, "15", "February"));
        list.add(new Book("B1", "Valve", 10, "BeastMaster", 25));
        list.add(new NewsPaper("N1", "Nha Nam", 15, 25));
    }

    private static void showMenu() {
        System.out.println(INPUT_PAPER_CHOICE);
        System.out.println(SHOW_ALL_CHOICE);
        System.out.println(FIND_BY_TYPE_CHOICE);
        System.out.println(FIND_BY_CODE_CHOICE);
        System.out.println(SORT_BY_PUBLISHER_CHOICE);
        System.out.println(EXIT);
    }
}
