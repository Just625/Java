package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        NhanVien[] nhanViens = new NhanVien[4];
        NhanVien nhanVien1 = new NhanVienFullTime("01", "A", 10, 1, "A@gmail.com", 100000, 400000, 1000000);
        NhanVien nhanVien2 = new NhanVienFullTime("03", "C", 30, 3, "C@gmail.com", 600000, 300000, 5000000);
        NhanVien nhanVien3 = new NhanVienPartTime("02", "B", 20, 2, "D@gmail.com", 10);
        NhanVien nhanVien4 = new NhanVienPartTime("04", "D", 40, 4, "E@gmail.com", 20);
        nhanViens[0] = nhanVien1;
        nhanViens[1] = nhanVien2;
        nhanViens[2] = nhanVien3;
        nhanViens[3] = nhanVien4;

        NhanVienManagement nhanVienManagement = new NhanVienManagement(nhanViens);
        //Hien thi tat ca nhan vien
        nhanVienManagement.showNhanViens();

        //Tinh luong 1nv khi biet ma
        System.out.println(nhanVienManagement.tinhLuong1NVTheoMa("01"));
        System.out.println(nhanVienManagement.tinhLuong1NVTheoMa("03"));
        System.out.println(nhanVienManagement.tinhLuong1NVTheoMa("02"));
        System.out.println(nhanVienManagement.tinhLuong1NVTheoMa("04"));

        //Tinh luong toan bo NV
        System.out.printf("\nLương toàn bộ nhân viên:%d\n", nhanVienManagement.tinhLuongToanBoNV());

        //Them 1 nhan vien
//        nhanVienManagement.themNhanVien();

        //liệt kê danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
        nhanVienManagement.lietKe();

        //Tính lương phải trả cho tất cả nhân viên bán thời gian
        nhanVienManagement.tinhLuongNVPartTime();
    }
}
