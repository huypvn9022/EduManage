/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan1.dao;

import com.duan1.entity.LopHoc;
import com.duan1.ultils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LopHocDAO extends DuAn1DAO<LopHoc, Object> {

    String INSERT_SQL = "INSERT INTO LOP(MaLop, TenLop, SoLuongSV, MaNV, MaMH) VALUES (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE LOP SET TenLop=?, SoLuongSV = ?, MaNV = ?, MaMH = ? WHERE MaLop=?";
    String DELETE_SQL = "DELETE FROM LOP WHERE MaLop = ? ";
    String SELECT_ALL_SQL = "SELECT * FROM LOP";
    String SELECT_BY_ID_SQL = "SELECT * FROM LOP WHERE MaLop=?";

    @Override
    public boolean insert(LopHoc entity) {
        XJdbc.update(INSERT_SQL,
                entity.getMaLop(),
                entity.getTenLop(),
                entity.getSoLuongSV(),
                entity.getMaNV(),
                entity.getMaMH());
        return insert(entity);
    }

    @Override
    public boolean update(LopHoc entity) {
        XJdbc.update(UPDATE_SQL, entity.getTenLop(), entity.getSoLuongSV(), entity.getMaNV(), entity.getMaMH(), entity.getMaLop());
        return update(entity);
    }

    @Override
    public boolean delete(Object id) {
        XJdbc.update(DELETE_SQL, id);
        return delete(id);
    }

    @Override
    public LopHoc selectById(Object id) {
        List<LopHoc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LopHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<LopHoc> selectBySql(String sql, Object... args) {
        List<LopHoc> list = new ArrayList<LopHoc>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                LopHoc entity = new LopHoc();
                entity.setMaLop(rs.getString("MaLop"));
                entity.setTenLop(rs.getString("TenLop"));
                entity.setSoLuongSV(Integer.parseInt(rs.getString("SoLuongSV")));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMaMH(rs.getString("MaMH"));
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<LopHoc> selecbyKeyword(String str) {
        String sql = "Select * from Lop where MaLop like ? or TenLop like ?";
        return this.selectBySql(sql, "%" + str + "%", "%" + str + "%");
    }

}
