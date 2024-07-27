package com.duan1.dao;

import com.duan1.entity.KhoaHoc;
import com.duan1.ultils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KhoaHocDAO extends DuAn1DAO<KhoaHoc, String> {

    String insertSQL = "INSERT INTO KHOAHOC (MaKH, TenKH, HocPhi, ThoiLuong, NgayTao, MoTa) VALUES (?,?,?,?,?,?)";
    String updateSQL = "UPDATE KHOAHOC SET TenKH = ?, HocPhi = ?, ThoiLuong = ?, NgayTao = ?, MoTa = ? WHERE MaKH = ?";
    String deleteSQL = "DELETE KHOAHOC WHERE MaKH = ? ";
    String selectAllSQL = "SELECT * FROM KHOAHOC";
    String selectByIdSQL = "SELECT * FROM KHOAHOC WHERE MAKH = ? ";

    @Override
    public boolean insert(KhoaHoc entity) {
        XJdbc.update(insertSQL,
                entity.getMaKH(),
                entity.getTenKH(),
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getNgayTao(),
                entity.getMoTa());
        return insert(entity);
    }

    @Override
    public boolean update(KhoaHoc entity) {
        XJdbc.update(updateSQL,
                entity.getTenKH(),
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getNgayTao(),
                entity.getMoTa(),
                entity.getMaKH());
        return update(entity);
    }

    @Override
    public boolean delete(String id) {
        XJdbc.update(deleteSQL, id);
        return delete(id);
    }

    @Override
    public KhoaHoc selectById(String id) {
        List<KhoaHoc> list = this.selectBySql(selectByIdSQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return this.selectBySql(selectAllSQL);
    }

    @Override
    protected List<KhoaHoc> selectBySql(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                KhoaHoc kh = new KhoaHoc();
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setHocPhi(rs.getFloat("HocPhi"));
                kh.setThoiLuong(rs.getInt("ThoiLuong"));
                kh.setNgayTao(rs.getDate("NgayTao"));
                kh.setMoTa(rs.getString("MoTa"));
                list.add(kh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    
    // hàm tìm
    public List<KhoaHoc> selectByKeyword(String keyword){
        String sql = "SELECT * FROM KHOAHOC WHERE TenKH LIKE ? or MaKH LIKE ? or HocPhi LIKE ? or ThoiLuong LIKE ? or NgayTao LIKE ?" ;
        return  selectBySql(sql, "%" + keyword  +"%",  "%" + keyword +  "%", "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
    }

}
