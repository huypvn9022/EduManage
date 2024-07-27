package com.duan1.entity;

public class LopHoc {

    private String maLop;
    private String tenLop;
    private int SoLuongSV;
    private String maNV;
    private String maMH;

    @Override
    public String toString() {
        return this.maLop;
    } // chuyển chuỗi
   
    public LopHoc() {
    }

    public LopHoc(String maLop, String tenLop, int SoLuongSV, String maNV, String maMH) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.SoLuongSV = SoLuongSV;
        this.maNV = maNV;
        this.maMH = maMH;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSoLuongSV() {
        return SoLuongSV;
    }

    public void setSoLuongSV(int SoLuongSV) {
        this.SoLuongSV = SoLuongSV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

}
