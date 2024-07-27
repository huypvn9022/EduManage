package com.duan1.ultils;

import com.duan1.entity.NhanVien;
import com.duan1.entity.SinhVien;



public class Auth {
    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static NhanVien user = null;
    public static SinhVien usersv = null;
    /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void clear() {
        Auth.user = null;
        Auth.usersv = null;
    }
    /**
     * Kiểm tra xem đăng nhập hay chưa
     */
    public static boolean isLogin() {
        return Auth.user != null;
    }
     /**
     * Kiểm tra xem có phải là trưởng phòng hay không
     */
    public static boolean isManager() {
        return Auth.isLogin() && user.isVaiTro();
    }
    
     public static boolean isLoginSV() {
        return Auth.usersv != null;
    }
     
       public static boolean isManagerSV() {
        return Auth.isLoginSV();
    }
}
