
package com.duan1.dao;

import com.duan1.entity.SinhVien;
import com.duan1.ultils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SinhVienDAO extends DuAn1DAO<SinhVien, String> {

    String INSSERT_SQL = "INSERT INTO SINHVIEN (MaSV, TenSV, MatKhauSV, NgaySinh, GioiTinh, DiaChi, SDT, Email, Hinh, MoTa, MaLop) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE SINHVIEN SET TenSV=?,MatKhauSV=?,NgaySinh=?,GioiTinh=?,DiaChi=?,SDT=?,Email=?,Hinh=?,MoTa=?,MaLop=? WHERE MaSV=?";
    String DELETE_SQL = "DELETE FROM SINHVIEN WHERE MaSV=?";
    String SELECT_ALL_SQL = "SELECT * FROM SINHVIEN";
    String SELECT_BY_ID_SQL = "SELECT * FROM SINHVIEN WHERE MaSV=?";

    @Override
    public boolean insert(SinhVien entity) {
        XJdbc.update(INSSERT_SQL,
                entity.getMaSV(),
                entity.getTenSV(),
                entity.getMatKhauSV(),
                entity.getNgaySinh(),
                entity.isGioiTinh(),
                entity.getDiaChi(),
                entity.getSDT(),
                entity.getEmail(),
                entity.getHinh(),
                entity.getMoTa(),
                entity.getMaLop()
        );
        return insert(entity);
    }

    @Override
    public boolean update(SinhVien entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getTenSV(),
                entity.getMatKhauSV(),
                entity.getNgaySinh(),
                entity.isGioiTinh(),
                entity.getDiaChi(),
                entity.getSDT(),
                entity.getEmail(),
                entity.getHinh(),
                entity.getMoTa(),
                entity.getMaLop(),
                entity.getMaSV()
        );
        return update(entity);
                
    }

    @Override
    public boolean delete(String id) {
        XJdbc.update(DELETE_SQL, id);
        return delete(id);
    }

    @Override
    public SinhVien selectById(String id) {

        List<SinhVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<SinhVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<SinhVien> selectBySql(String sql, Object... args) {
        List<SinhVien> list = new ArrayList<SinhVien>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString("MaSV"));
                sv.setTenSV(rs.getString("TenSV"));
                sv.setMatKhauSV(rs.getString("MatKhauSV"));
                sv.setNgaySinh(rs.getDate("NgaySinh"));
                sv.setGioiTinh(rs.getBoolean("GioiTinh"));
                sv.setDiaChi(rs.getString("DiaChi"));
                sv.setSDT(rs.getString("SDT"));
                sv.setEmail(rs.getString("Email"));
                sv.setHinh(rs.getString("Hinh"));
                sv.setMoTa(rs.getString("MoTa"));
                sv.setMaLop(rs.getString("MaLop"));
                list.add(sv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<SinhVien> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM SinhVien WHERE TenSV LIKE ? or SDT LIKE ? or MaSV LIKE ? or MaLop LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
    }
    
    public List<SinhVien> selectByLopHoc(String malop) {
        String sql = "SELECT * FROM SINHVIEN WHERE MaLop = ?";
        return this.selectBySql(sql, malop);
    }

}
