package com.codegym;

import java.util.Scanner;

public class RoomManagement {
    private Room[] rooms;

    public RoomManagement() {

    }

    public RoomManagement(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void display() {
        for (int i = 0; i < this.rooms.length; i++) {
            rooms[i].showRom();
        }
    }

    public void themKhachMoi() {
        System.out.println("Nhap vao thong tin khach moi:");
        Room newRoom = new Room();
        newRoom.addNewRoom();
        Room[] newRooms = new Room[this.rooms.length + 1];
        for (int i = 0; i < this.rooms.length; i++) {
            newRooms[i] = this.rooms[i];
        }
        newRooms[this.rooms.length] = newRoom;
        this.rooms = newRooms;
    }
    public void nhapThongTinKhachTro(){
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
            rooms[i].addNewRoom();
        }
    }

    public void deleteKhach() {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao CMT cua khach muon xoa:");
        String identityCard = src.nextLine();
        int index = getIndexFromIdentity(identityCard);
        if (index == -1) {
            System.out.println("Khong xoa duoc");
        } else {
            Room[] newRooms = new Room[this.rooms.length - 1];
            for (int i = 0; i < index; i++) {
                newRooms[i] = this.rooms[i];
            }
            for (int i = index; i < rooms.length - 1; i++) {
                newRooms[i] = rooms[i + 1];
            }
            this.rooms = newRooms;
        }
    }

    public int getIndexFromIdentity(String identityCard) {
        int index = -1;
        for (int i = 0; i < this.rooms.length; i++) {
            if(this.rooms[i].getPerson().getIdentityCard().equals(identityCard)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void calculateMoney() {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao CMT cua khach muon tinh tien:");
        String identityCard = src.nextLine();
        int index = getIndexFromIdentity(identityCard);
        Double money = 0.0;
        if (index != -1) {
            money = rooms[index].getDay() * rooms[index].getPrice();
        }
        System.out.printf("So tien phai tra: %f\n", money);
        Room[] newRooms = new Room[rooms.length - 1];
        for (int i = 0; i < index; i++) {
            newRooms[i] = rooms[i];
        }
        for (int i = index; i < rooms.length - 1; i++) {
            newRooms[i] = rooms[i + 1];
        }
        this.rooms = newRooms;
    }
}
