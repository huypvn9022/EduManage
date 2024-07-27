
package com.duan1.entity;

import java.util.Date;

public class DangKyThiLai {
    
    private int ID;
    private String maSV;
    private String hoTen;
    private String maMH;
    private float soTien;
    private Date ngayDK = new Date();

    public DangKyThiLai() {
    }

    public DangKyThiLai(int ID, String maSV, String hoTen, String maMH, float soTien) {
        this.ID = ID;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.maMH = maMH;
        this.soTien = soTien;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }

    

    
    
    
}
