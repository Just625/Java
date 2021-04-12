package com.codegym;

import java.util.Scanner;

public class NhanVienManagement {
    Scanner src = new Scanner(System.in);
    private NhanVien[] nhanViens;

    public NhanVienManagement() {

    }

    public NhanVienManagement(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public NhanVien[] getNhanViens() {
        return this.nhanViens;
    }

    public void setNhanViens(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public void showNhanViens() {
        System.out.println("Danh sách nhân viên:");
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i]);
        }
    }
    public int tinhLuong1NV(int index){
        int luong = 0;
        if (nhanViens[index] instanceof NhanVienFullTime) {
            luong = ((NhanVienFullTime) nhanViens[index]).getLuongCung() + ((NhanVienFullTime) nhanViens[index]).getSoTienThuong() - ((NhanVienFullTime) nhanViens[index]).getSoTienPhat();
        } else if (nhanViens[index] instanceof NhanVienPartTime) {
            luong = ((NhanVienPartTime) nhanViens[index]).getGioLamViec() * 100000;
        }
        return luong;
    }

    public String tinhLuong1NVTheoMa(String maNhanVien) {
        int index = -1;
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i].getMaNhanVien() == maNhanVien) {
                index = i;
            }
        }
        if (index == -1) {
            return "Nhân viên không có trong danh sách";
        } else {
            return "Lương thực lĩnh = " + this.tinhLuong1NV(index);

        }
    }
    public int tinhLuongToanBoNV(){
        int result = 0;
        for(int i = 0; i<nhanViens.length;i++){
            result+= this.tinhLuong1NV(i);
        }
        return result;
    }
    public int tinhLuongTB(){
        return  this.tinhLuongToanBoNV() / this.nhanViens.length;

    }
    public NhanVien layThongTin(){
        System.out.println("Nhập vào mã nhân viên:");
        String maNhanVien = src.nextLine();
        System.out.println("Nhập vào họ tên nhân viên:");
        String hoTen = src.nextLine();
        System.out.println("Nhập vào tuổi nhân viên:");
        int tuoi = src.nextInt();
        System.out.println("Nhập vào số điện thoại:");
        int soDienThoai = src.nextInt();
        src.nextLine();
        System.out.println("Nhập vào email:");
        String email = src.nextLine();
        System.out.println("Thêm nhân viên fulltime(1) hay partime(2)?\nNhập sự lựa chọn của bạn:");
        int choice = src.nextInt();
        if(choice ==1 ){
            System.out.println("Nhập số tiền thưởng:");
            int soTienThuong = src.nextInt();
            System.out.println("Nhập số tiền phạt:");
            int soTienPhat = src.nextInt();
            System.out.println("Nhập lương cứng:");
            int luongCung = src.nextInt();
            return new NhanVienFullTime(maNhanVien, hoTen, tuoi, soDienThoai, email, soTienThuong, soTienPhat, luongCung);
        } else{
            System.out.println("Nhập số giờ làm việc:");
            int gioLamViec = src.nextInt();
            return new NhanVienPartTime(maNhanVien, hoTen, tuoi, soDienThoai, email, gioLamViec);
        }


    }
    public void themNhanVien(){
        NhanVien[] newNhanViens = new NhanVien[this.nhanViens.length+1];
        for(int i = 0; i<this.nhanViens.length;i++){
            newNhanViens[i] = this.nhanViens[i];
        }
        newNhanViens[newNhanViens.length-1] = this.layThongTin();
        this.nhanViens = newNhanViens;
        System.out.println("Danh sach sau khi them:");
        this.showNhanViens();
    }
    public void lietKe(){
        System.out.println("Danh sách nhân viên toàn thời gian có mức lương thấp hơn trung bình:");
        int count = 0;
        for(int i = 0; i<this.nhanViens.length;i++){
            if(this.nhanViens[i] instanceof  NhanVienFullTime){
                if(this.tinhLuong1NV(i) <this.tinhLuongTB()){
                    System.out.println(nhanViens[i]);
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("Không có nhân viên nào phù hợp");
        }
    }
    public void tinhLuongNVPartTime(){
        int luong = 0;
        for(int i = 0; i<nhanViens.length;i++){
            if(nhanViens[i] instanceof  NhanVienPartTime){
                luong +=this.tinhLuong1NV(i);
            }
        }
        System.out.printf("Số lương phải trả cho tất cả các nhân viên bán thời gian là: %d", luong);
    }
}
