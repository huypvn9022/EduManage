
package com.duan1.entity;
import com.duan1.ultils.XDate;
import java.util.Date;

public class SinhVien {
    private String maSV;
    private String tenSV;
    private String matKhauSV;
    private Date ngaySinh = XDate.addDays(new Date(), -365 * 20);;
    private boolean gioiTinh;   
    private String diaChi;
    private String SDT;
    private String email;
    private String hinh;
    private String moTa;
    private String maLop;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String matKhauSV, boolean gioiTinh, String diaChi, String SDT, String email, String hinh, String moTa, String maLop) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.matKhauSV = matKhauSV;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.email = email;
        this.hinh = hinh;
        this.moTa = moTa;
        this.maLop = maLop;
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

    public String getMatKhauSV() {
        return matKhauSV;
    }

    public void setMatKhauSV(String matKhauSV) {
        this.matKhauSV = matKhauSV;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    
    

    
    
}
