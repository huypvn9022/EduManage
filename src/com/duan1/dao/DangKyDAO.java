package com.duan1.dao;

import com.duan1.entity.DangKyThiLai;
import com.duan1.ultils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DangKyDAO extends DuAn1DAO<DangKyThiLai, Object> {

    String INSERT_SQL = "INSERT INTO DANGKYTHILAI(MaSV, HoTen, MaMH, SoTien, NgayDK) VALUES (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE DANGKYTHILAI SET MaSV=?, HoTen = ?, MaMH = ?, SoTien = ?, NgayDK = ? WHERE ID=?";
    String DELETE_SQL = "DELETE FROM DANGKYTHILAI WHERE ID = ? ";
    String SELECT_ALL_SQL = "SELECT * FROM DANGKYTHILAI";
    String SELECT_BY_ID_SQL = "SELECT * FROM DANGKYTHILAI WHERE ID=?";

    @Override
    public boolean insert(DangKyThiLai entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaSV(),
                entity.getHoTen(),
                entity.getMaMH(),
                entity.getSoTien(),
                entity.getNgayDK());
        return insert(entity);
    }

    @Override
    public boolean update(DangKyThiLai entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getMaSV(),
                entity.getHoTen(),
                entity.getMaMH(),
                entity.getSoTien(),
                entity.getNgayDK(),
                entity.getID()
        );
        return update(entity);
    }

    @Override
    public boolean delete(Object id) {
        XJdbc.update(DELETE_SQL, id);
        return delete(id);
    }

    @Override
    public DangKyThiLai selectById(Object id) {
        List<DangKyThiLai> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<DangKyThiLai> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<DangKyThiLai> selectBySql(String sql, Object... args) {
        List<DangKyThiLai> list = new ArrayList<DangKyThiLai>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                DangKyThiLai entity = new DangKyThiLai();
                entity.setID(rs.getInt("ID"));
                entity.setMaSV(rs.getString("MaSV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setMaMH(rs.getString("MaMH"));
                entity.setSoTien(rs.getFloat("SoTien"));
                entity.setNgayDK(rs.getDate("NgayDK")
                );
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
