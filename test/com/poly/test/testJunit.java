/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.test;

import com.duan1.dao.NhanVienDAO;
import com.duan1.entity.NhanVien;
import com.duan1.ultils.Auth;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class testJunit {

   
    public void checkLogin() {
        String user = "tula";
        String pass = "anhtu";
//        String expected;
//        String actual;
//        
        NhanVienDAO dao = new NhanVienDAO();
        NhanVien nv = dao.selectById(user);
//        assertEquals(nv, actual);
        Auth.user = nv;
        NhanVien actual = dao.selectById(user) ;
        
        System.out.println(nv);
        System.out.println(actual);
        
        assertEquals(nv, actual);    
    }
    
   
    public void checkCreateNV(){
        String manv = "testnew";
        String tennv = "new";
        Date ngaySinh;
        boolean vaiTro = false;
        String matKhau = "123";
        boolean gioiTinh = false;
        String sđt = "0123456789";
        String email = "teo@gmail.com";
        String diaChi = "hcm";
        String hinh = "1.jpg";
        String moTa = "teo";
        
        NhanVienDAO nvdao = new NhanVienDAO();
        NhanVien nv = new NhanVien(manv, tennv, vaiTro, matKhau, gioiTinh, sđt, email, diaChi, hinh, moTa);
        
        boolean expected = false;
        boolean actual = nvdao.insert(nv);
        
        System.out.println(expected);
        System.out.println(actual);
        
        assertEquals(expected, actual);
       
           
    }
    
   
    public void checkUpdateNV(){
        
        String manv = "test1";
        String tennv = "Nguyễn Văn Tèo";
        Date ngaySinh;
        boolean vaiTro = false;
        String matKhau = null;
        boolean gioiTinh = true;
        String sđt = "0123456789";
        String email = "teo@gmail.com";
        String diaChi = "hcm";
        String hinh = "2.jpg";
        String moTa = "teo1";
        
        NhanVienDAO dao = new NhanVienDAO();
        NhanVien nv =  new NhanVien(manv, tennv, vaiTro, matKhau, gioiTinh, sđt, email, diaChi, hinh, moTa);
        
        boolean expected = true;
        boolean actual = dao.update(nv);
        
        assertEquals(expected, actual);
        
    }
    
   
    public void checkDeleteNV(){
        
        String id = "testnew11";
        NhanVienDAO dao = new NhanVienDAO();
        NhanVien nv =  new NhanVien();
        
        boolean expected = true;
        boolean actual = dao.delete(id);
        
        System.out.println(actual);
        assertEquals(expected, actual);
        
        
    }
    
    @Test
    public void checkFindNV(){
        
        String user = "tula";
        NhanVienDAO dao = new NhanVienDAO();
        NhanVien nv =  new NhanVien();
        
        List<NhanVien> actual = dao.selectByKeyword(user);
        
        assertEquals("tula", actual);
        
    }

}
