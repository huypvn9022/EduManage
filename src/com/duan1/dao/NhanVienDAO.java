
package com.duan1.dao;

import com.duan1.entity.NhanVien;
import com.duan1.ultils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class NhanVienDAO extends DuAn1DAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NHANVIEN (MaNV, TenNV, NgaySinh, VaiTro, MatKhau, GioiTinh, SDT, Email, DiaChi, Hinh, MoTa) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NHANVIEN SET TenNV=?, NgaySinh=?, VaiTro=?, MatKhau=?, GioiTinh=?, SDT=?, Email=?, DiaChi=?, Hinh=?, MoTa=?  WHERE MaNV=?";
    String DELETE_SQL = "DELETE FROM NHANVIEN WHERE MaNV=?";
    String SELECT_ALL_SQL = "SELECT * FROM NHANVIEN";
    String SELECT_BY_ID_SQL = "SELECT * FROM NHANVIEN WHERE MaNV=?";

    @Override
    public boolean insert(NhanVien entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaNV(),
                entity.getTenNV(),
                entity.getNgaySinh(),
                entity.isVaiTro(),
                entity.getMatKhau(),
                entity.isGioiTinh(),
                entity.getSDT(),
                entity.getEmail(),
                entity.getDiaChi(),
                entity.getHinh(),
                entity.getMoTa());
        return insert(entity);
    }

    @Override
    public boolean update(NhanVien entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getTenNV(),
                entity.getNgaySinh(),
                entity.isVaiTro(),
                entity.getMatKhau(),
                entity.isGioiTinh(),
                entity.getSDT(),
                entity.getEmail(),
                entity.getDiaChi(),
                entity.getHinh(),
                entity.getMoTa(),
                entity.getMaNV());
        return update(entity);
    }

    @Override
    public boolean delete(String key) {
        XJdbc.update(DELETE_SQL, key);
        return delete(key);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setSDT(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setMoTa(rs.getString("MoTa"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<NhanVien> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NHANVIEN WHERE TenNV LIKE ? or SDT LIKE ? or MaNV LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
    }

    
}
