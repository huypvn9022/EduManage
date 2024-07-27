package com.duan1.dao;

import com.duan1.entity.MonHoc;
import com.duan1.ultils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MonHocDAO extends DuAn1DAO<MonHoc, String> {

    String insertSQL = "INSERT INTO MONHOC (MaMH, TenMH, NgayBD, NgayKT, MoTa, MaKH) VALUES (?,?,?,?,?,?)";
    String updateSQL = "UPDATE MONHOC SET TenMH = ?, NgayBD = ?, NgayKT = ?, MoTa = ? WHERE MaMH = ? ";
    String deleteSQL = "DELETE MONHOC WHERE MaMH = ? ";
    String selectAllSQL = "SELECT * FROM MONHOC";
    String selectByIdSQL = "SELECT * FROM MONHOC WHERE MAMH = ? ";

    @Override
    public boolean insert(MonHoc entity) {
        XJdbc.update(insertSQL, 
                entity.getMaMH(),
                entity.getTenMH(),
                entity.getNgayBD(),
                entity.getNgayKT(),
                entity.getMoTa(),
                entity.getMaKH());
        return insert(entity);
    }

    @Override
    public boolean update(MonHoc entity) {
        XJdbc.update(updateSQL,
                entity.getTenMH(),
                entity.getNgayBD(),
                entity.getNgayKT(),
                entity.getMoTa(),
                entity.getMaMH());
        return update(entity);
    }

    @Override
    public boolean delete(String id) {
        XJdbc.update(deleteSQL, id);
        return delete(id);
    }

    @Override
    public MonHoc selectById(String id) {
        List<MonHoc> list = this.selectBySql(selectByIdSQL, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<MonHoc> selectAll() {
        return this.selectBySql(selectAllSQL);
    }

    @Override
    protected List<MonHoc> selectBySql(String sql, Object... args) {
        List<MonHoc> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {                
                MonHoc mh = new MonHoc();
                mh.setMaMH(rs.getString("MaMH"));
                mh.setTenMH(rs.getString("TenMH"));
                mh.setNgayBD(rs.getDate("NgayBD"));
                mh.setNgayKT(rs.getDate("NgayKT"));
                mh.setMoTa(rs.getString("MoTa"));
                mh.setMaKH(rs.getString("MaKH"));
                list.add(mh);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
    public List<MonHoc> selectByKeyword(String keyword){
        String sql = "SELECT * FROM MONHOC WHERE MaMH LIKE ? or TenMH LIKE ? or NgayBD LIKE ? or NgayKT LIKE ? ";
        return selectBySql(sql, "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
    }
    
    // chọn môn học theo khóa học
    public List<MonHoc> selectByKhoaHoc(String makh){
        String sql = "SELECT * FROM MONHOC WHERE MaKH = ?";
        return this.selectBySql(sql, makh);
    }

}
