package com.duan1.ui;

import com.duan1.dao.NhanVienDAO;
import com.duan1.dao.SinhVienDAO;
import com.duan1.entity.NhanVien;
import com.duan1.entity.SinhVien;
import com.duan1.ultils.Auth;
import com.duan1.ultils.MsgBox;
import com.duan1.ultils.XImage;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class DangNhapJDialog extends javax.swing.JDialog {

    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNameAccount = new javax.swing.JLabel();
        lblPassAccount = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        chkHienMatKhau = new javax.swing.JCheckBox();
        btnQuenMK = new javax.swing.JButton();
        txtNameAccount = new javax.swing.JTextField();
        txtPassAccount = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ĐĂNG NHẬP");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNameAccount.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNameAccount.setForeground(new java.awt.Color(51, 51, 51));
        lblNameAccount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNameAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/username.png"))); // NOI18N
        getContentPane().add(lblNameAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 40, 30));

        lblPassAccount.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPassAccount.setForeground(new java.awt.Color(51, 51, 51));
        lblPassAccount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/password.png"))); // NOI18N
        getContentPane().add(lblPassAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 40, 40));

        btnDangNhap.setBackground(new java.awt.Color(0, 0, 0));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 290, 40));

        chkHienMatKhau.setBackground(new java.awt.Color(141, 172, 212));
        chkHienMatKhau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkHienMatKhau.setText("Hiển thị ?");
        chkHienMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHienMatKhauActionPerformed(evt);
            }
        });
        getContentPane().add(chkHienMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, 30));

        btnQuenMK.setBackground(new java.awt.Color(0, 0, 0));
        btnQuenMK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuenMK.setForeground(new java.awt.Color(255, 255, 255));
        btnQuenMK.setText("Quên mật khẩu ?");
        btnQuenMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenMKActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuenMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 150, 40));

        txtNameAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNameAccount.setText("tula");
        getContentPane().add(txtNameAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 290, 40));

        txtPassAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassAccount.setText("anhtu");
        getContentPane().add(txtPassAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 290, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/DangNhap.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkHienMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHienMatKhauActionPerformed
        // TODO add your handling code here:
        if (chkHienMatKhau.isSelected()) {
            txtPassAccount.setEchoChar((char) 0);
        } else {
            txtPassAccount.setEchoChar('*');
        }
    }//GEN-LAST:event_chkHienMatKhauActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if (checkEmpty()) {
             this.dangNhap();
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnQuenMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenMKActionPerformed
        this.dispose();
        this.openQuenMK();
    }//GEN-LAST:event_btnQuenMKActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnQuenMK;
    private javax.swing.JCheckBox chkHienMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNameAccount;
    private javax.swing.JLabel lblPassAccount;
    private javax.swing.JTextField txtNameAccount;
    private javax.swing.JPasswordField txtPassAccount;
    // End of variables declaration//GEN-END:variables

    NhanVienDAO nvdao = new NhanVienDAO();
    SinhVienDAO svdao = new SinhVienDAO();
    Border boder;

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
    }

    // đăng nhập
    public boolean dangNhap() {
        // nhân viên
        String manv = txtNameAccount.getText();
        String pass = new String(txtPassAccount.getPassword());
        NhanVien nv = nvdao.selectById(manv);

        // sinh viên
        String masv = txtNameAccount.getText();
        String passsv = new String(txtPassAccount.getPassword());
        SinhVien sv = svdao.selectById(masv);

        if (nv != null) {
            if (nv == null) {
                MsgBox.alert(this, "Sai tên đăng nhập nhân viên !");
                return false;
            } else if (!pass.equals(nv.getMatKhau())) {
                MsgBox.alert(this, "Sai mật khẩu nhân viên !");
                return false;
            } else {
                Auth.user = nv;
                this.dispose();
                return true;
            }
        } else {
            if (sv == null) {
                MsgBox.alert(this, "Sai tên đăng nhập sinh viên !");
                return false;
            } else if (!pass.equals(sv.getMatKhauSV())) {
                MsgBox.alert(this, "Sai mật khẩu sinh viên !");
                return false;
            } else {
                Auth.usersv = sv;
                this.dispose();
            }
        }

        return true;

    }

    public boolean checkEmpty() {
        if (txtNameAccount.getText().trim().length() == 0) {
            MsgBox.alert(this, "Nhập tài khoản !");
            txtNameAccount.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtNameAccount.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtNameAccount.setBorder(boder);
        }
       
        if (txtPassAccount.getText().trim().length() == 0) {
            MsgBox.alert(this, "Nhập mật khẩu !");
            txtPassAccount.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtPassAccount.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtPassAccount.setBorder(boder);
        }
        return true;
    }

    public void openQuenMK() {
        new QuenMatKhauJDialog(new javax.swing.JFrame(), true).setVisible(true);
    }

}
