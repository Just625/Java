package com.codegym;

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime() {

    }

    public NhanVienPartTime(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public NhanVienPartTime(String maNhanVien, String hoTen, int tuoi, int soDienThoai, String email, int gioLamViec) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email);
        this.gioLamViec = gioLamViec;
    }
    public int getGioLamViec(){
        return this.gioLamViec;
    }
    public void setGioLamViec(int gioLamViec){
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String toString() {
        return "NhanVienPartTime{" + super.toString()+
                ", gioLamViec=" + gioLamViec +
                '}';
    }
}
