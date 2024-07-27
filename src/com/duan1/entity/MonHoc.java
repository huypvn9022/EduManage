
package com.duan1.entity;

import java.util.Date;

public class MonHoc {
    private String maMH;
    private String tenMH;
    private Date ngayBD = new Date();
    private Date ngayKT = new Date();
    private String moTa;
    private String maKH;

    public MonHoc() {
        
    }

    public MonHoc(String maMH, String tenMH, String moTa, String maKH) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.moTa = moTa;
        this.maKH = maKH;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    @Override
    public String toString() {
        return this.maMH;
    }
    
    
    
    
}
