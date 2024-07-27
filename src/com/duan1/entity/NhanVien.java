
package com.duan1.entity;
import com.duan1.ultils.XDate;
import java.util.Date;

public class NhanVien {

    private String MaNV;
    private String TenNV;
    private Date NgaySinh = XDate.addDays(new Date(), -365 * 20);
    private boolean VaiTro;
    private String MatKhau;
    private boolean GioiTinh;
    private String SDT;
    private String Email;
    private String DiaChi;
    private String Hinh;
    private String MoTa;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, boolean VaiTro, String MatKhau, boolean GioiTinh, String SDT, String Email, String DiaChi, String Hinh, String MoTa) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.VaiTro = VaiTro;
        this.MatKhau = MatKhau;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.Hinh = Hinh;
        this.MoTa = MoTa;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    @Override
    public String toString() {
        return this.MaNV;
    }
    
    

    

}
