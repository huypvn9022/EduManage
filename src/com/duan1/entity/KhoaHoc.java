package com.duan1.entity;


import java.util.Date;

public class KhoaHoc {

    private String maKH;
    private String tenKH;
    private float hocPhi;
    private int thoiLuong;
    private Date ngayTao = new Date();
    private String moTa;

    public KhoaHoc() {
    }

    public KhoaHoc(String maKH, String tenKH, float hocPhi, int thoiLuong, String moTa) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.moTa = moTa;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    // đổ dữ liệu vào combobox

    @Override
    public String toString() {
        return this.tenKH;
    }

    @Override
    public boolean equals(Object obj) {
        KhoaHoc other = (KhoaHoc) obj;
        return other.getMaKH().equals(this.getMaKH());
    }
    
    
    
    
    

    

}
