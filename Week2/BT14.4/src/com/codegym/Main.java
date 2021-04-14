package com.codegym;

import java.util.Scanner;

public class Main {
    static Scanner src = new Scanner(System.in);

    public static void main(String[] args) {
        //Nhap du lieu dau vao
        System.out.println("Nhap so khach tro:");
        int n = src.nextInt();
        Room[] rooms = new Room[n];
        RoomManagement roomManagement = new RoomManagement(rooms);

        int choice;
        do{
            showMenu();
            System.out.println("Nhap vao lua chon cua ban:");
            choice = src.nextInt();
            System.out.println(choice);
            switch(choice){
                case 1:
                    roomManagement.nhapThongTinKhachTro();
                    break;
                case 2:
                    roomManagement.display();
                    break;
                case 3:
                    roomManagement.deleteKhach();
                    break;
                case 4:
                    roomManagement.calculateMoney();
                    break;
                case 5:
                    roomManagement.themKhachMoi();
            }
            if(choice<0 || choice>4){
                System.out.println("Lua chon khong hop le");
            }
        }while (choice!=0 || choice>4);

    }
    public static void showMenu(){
        System.out.println("1. Nhập thông tin khách trọ");
        System.out.println("2. Hiển thị thông tin khách trọ");
        System.out.println("3. Xóa thông tin khách trọ");
        System.out.println("4. Tính tiền cần thanh toán");
        System.out.println("5. Thêm khách mới");
        System.out.println("0. Thoát");
    }

}
