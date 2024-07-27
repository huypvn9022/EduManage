package com.duan1.entity;

public class Diem {

    private int IDDiem;
    private float diemLyThuyet;
    private float diemThucHanh;
    private float diemThi;
    private String maSV;
    private String tenSV;
    private String maMH;
    private float diemTB = (float) Math.ceil(((diemLyThuyet + diemThucHanh + diemThi) / 3) * 10) / 10;
    private String XepLoai;

    public Diem() {
    }

    public Diem(int IDDiem, float diemLyThuyet, float diemThucHanh, float diemThi, String maSV, String tenSV, String maMH, String XepLoai) {
        this.IDDiem = IDDiem;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
        this.diemThi = diemThi;
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.maMH = maMH;
        this.XepLoai = XepLoai;
    }

    public int getIDDiem() {
        return IDDiem;
    }

    public void setIDDiem(int IDDiem) {
        this.IDDiem = IDDiem;
    }

    public float getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(float diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public float getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(float diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public float getDiemTB() {
        return (float) Math.ceil(((diemLyThuyet + diemThucHanh + diemThi) / 3) * 10) / 10;
    }

    public void setDiemTB(float diemTB) {
        getDiemTB();
    }

    public String getXepLoai(float DiemTB) {
        if (DiemTB < 5) {
            return "Thi lại";
        }
        return "Đậu";
    }

    public void setXepLoai(String XepLoai) {
        this.XepLoai = XepLoai;
    }
}
