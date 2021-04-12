package com.codegym;

public class NhanVienFullTime extends NhanVien {
    private int soTienThuong;
    private int soTienPhat;
    private int luongCung;

    public NhanVienFullTime() {

    }

    public NhanVienFullTime(int soTienThuong, int soTienPhat, int luongCung) {
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }
    public NhanVienFullTime(String maNhanVien, String hoTen, int tuoi, int soDienThoai, String email, int soTienThuong, int soTienPhat, int luongCung){
        super(maNhanVien, hoTen, tuoi, soDienThoai, email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public int getSoTienThuong() {
        return this.soTienThuong;
    }

    public int getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(int soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public void setSoTienThuong(int soTienThuong) {
        this.soTienThuong = soTienThuong;
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" + super.toString()+
                ", soTienThuong=" + soTienThuong +
                ", soTienPhat=" + soTienPhat +
                ", luongCung=" + luongCung +
                '}';
    }
}
