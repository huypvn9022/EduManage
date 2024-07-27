package com.duan1.dao;

import com.duan1.entity.Diem;
import com.duan1.ultils.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DiemDAO extends DuAn1DAO<Diem, Integer> {

    String INSSERT_SQL = "INSERT INTO DIEM (MaSV ,TenSV,MaMH,DiemLyThuyet, DiemThucHanh ,DiemThi ,DiemTB) VALUES (?,?, ?, ?, ?, ?,?)";
    String UPDATE_SQL = "UPDATE DIEM  SET MaMH =? ,DiemLyThuyet=?, DiemThucHanh=?, DiemThi=? ,diemTB=? WHERE ID= ?";
    String DELETE_SQL = "DELETE FROM DIEM WHERE ID=?";
    String SELECT_ALL_SQL = "SELECT * FROM DIEM";
    String SELECT_BY_ID_SQL = "SELECT * FROM DIEM WHERE ID=?";

    @Override
    public boolean insert(Diem entity) {
        XJdbc.update(INSSERT_SQL,
                entity.getMaSV(),
                entity.getTenSV(),
                entity.getMaMH(),
                entity.getDiemThi(),
                entity.getDiemThucHanh(),
                entity.getDiemThi(),
                entity.getDiemTB()
                );
        return insert(entity);

    }

    @Override
    public boolean update(Diem entity) {
        XJdbc.update(UPDATE_SQL,
                entity.getMaMH(),
                entity.getDiemLyThuyet(),
                entity.getDiemThucHanh(),
                entity.getDiemThi(),
                entity.getDiemTB(),
                entity.getIDDiem());
        return update(entity);
    }

    @Override
    public boolean delete(Integer key) {
        XJdbc.update(DELETE_SQL, key);
        return delete(key);
    }

    @Override
    public List<Diem> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Diem selectById(Integer key) {
        List<Diem> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Diem> selectBySql(String sql, Object... args) {
        List<Diem> list = new ArrayList<Diem>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Diem entity = new Diem();
                entity.setIDDiem(rs.getInt("ID"));
                entity.setMaSV(rs.getString("MaSV"));
                entity.setTenSV(rs.getString("TenSV"));
                entity.setMaMH(rs.getString("MaMH"));
                entity.setDiemLyThuyet(rs.getFloat("DiemLyThuyet"));
                entity.setDiemThucHanh(rs.getFloat("DiemThucHanh"));
                entity.setDiemThi(rs.getFloat("DiemThi"));
                entity.setDiemTB(rs.getFloat("diemTB"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public List<Diem> selectByKeyWord(String keyword) {
        String sql = "SELECT * FROM DIEM WHERE  MaSV LIKE ? OR MaMH LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%", "%" + keyword + "%");
    }
      public List<Diem> selectByMonHoc(String MaMon) {
        String sql = "SELECT * FROM Diem WHERE MaMH = ?";
        return this.selectBySql(sql, MaMon);
    }
  

}
