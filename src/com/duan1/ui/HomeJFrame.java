package com.duan1.ui;

import com.duan1.dao.DangKyDAO;
import com.duan1.dao.DiemDAO;
import com.duan1.dao.KhoaHocDAO;
import com.duan1.dao.LopHocDAO;
import com.duan1.dao.MonHocDAO;
import com.duan1.dao.NhanVienDAO;
import com.duan1.dao.SinhVienDAO;
import com.duan1.entity.DangKyThiLai;
import com.duan1.entity.Diem;
import com.duan1.entity.KhoaHoc;
import com.duan1.entity.LopHoc;
import com.duan1.entity.MonHoc;
import com.duan1.entity.NhanVien;
import com.duan1.entity.SinhVien;
import com.duan1.ultils.Auth;
import com.duan1.ultils.MsgBox;
import com.duan1.ultils.XDate;
import com.duan1.ultils.XImage;
import com.duan1.ultils.XJdbc;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HomeJFrame extends javax.swing.JFrame {

    public HomeJFrame() {
        initComponents();
        init();
    }

    public void onClick(JPanel panel) {
        panel.setBackground(new Color(0, 153, 204));
    }

    public void onLeaveClick(JPanel panel) {
        panel.setBackground(new Color(0, 0, 51));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        btnGroupVTNV = new javax.swing.ButtonGroup();
        btnGroupGTNV = new javax.swing.ButtonGroup();
        btnGroupGTSV = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        SideBarPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnTrangChu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnNhanVien = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSinhVien = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnKhoaHoc = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnLopHoc = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnMonHoc = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnDiem = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnDangKy = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnDoiMatKhau = new javax.swing.JPanel();
        lblDoiMatKhau = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JPanel();
        lblDangXuat = new javax.swing.JLabel();
        btnThongKe = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();
        TrangChu = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblKhoaHoc = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblSinhVien = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        lblLopHoc = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lblMonHoc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NhanVien = new javax.swing.JPanel();
        tabsNhanVien = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rdoNamNV = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDiaChiNV = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        rdoDaoTao = new javax.swing.JRadioButton();
        rdoGiangVien = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMoTaNV = new javax.swing.JTextArea();
        rdoNuNV = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        btnAddNV = new javax.swing.JButton();
        btnEditNV = new javax.swing.JButton();
        btnDeleteNV = new javax.swing.JButton();
        btnNewNV = new javax.swing.JButton();
        btnFirtsNV = new javax.swing.JButton();
        btnPrevNV = new javax.swing.JButton();
        btnNextNV = new javax.swing.JButton();
        btnLastNV = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        lblAnhNV = new javax.swing.JLabel();
        txtMatKhauNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtSdtNV = new javax.swing.JTextField();
        txtNgaySinhNV = new javax.swing.JTextField();
        txtEmailNV = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        txtSearchNV = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        SinhVien = new javax.swing.JPanel();
        tabsSV = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTaSV = new javax.swing.JTextArea();
        jLabel50 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtDiachiSV = new javax.swing.JTextArea();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        rdoNamSV = new javax.swing.JRadioButton();
        rdoNuSV = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cboMaLopSV = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        btnAddSV = new javax.swing.JButton();
        btnEditSV = new javax.swing.JButton();
        btnDeleteSV = new javax.swing.JButton();
        btnNewSV = new javax.swing.JButton();
        btnFirstSV = new javax.swing.JButton();
        btnPrevSV = new javax.swing.JButton();
        btnNextSV = new javax.swing.JButton();
        btnLastSV = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        lblHinhSV = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtMatKhauSV = new javax.swing.JTextField();
        txtTenSV = new javax.swing.JTextField();
        txtNgaySinhSV = new javax.swing.JTextField();
        txtSDTSV = new javax.swing.JTextField();
        txtEmailSV = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        jPanel36 = new javax.swing.JPanel();
        txtSearchSV = new javax.swing.JTextField();
        KhoaHoc = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtMoTaKH = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblKhoaHoc = new javax.swing.JTable();
        btnAddKH = new javax.swing.JButton();
        btnEditKH = new javax.swing.JButton();
        btnDeleteKH = new javax.swing.JButton();
        btnNewKH = new javax.swing.JButton();
        btnFirtsKH = new javax.swing.JButton();
        btnPrevKH = new javax.swing.JButton();
        btnNextKH = new javax.swing.JButton();
        btnLastKH = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        txtSearchKH = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtHocPhiKH = new javax.swing.JTextField();
        txtThoiLuongKH = new javax.swing.JTextField();
        txtNgayTaoKH = new javax.swing.JTextField();
        LopHoc = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtMaLH = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTenLH = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cboMaMonHoc = new javax.swing.JComboBox<>();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblLopHoc = new javax.swing.JTable();
        btnAddLopHoc = new javax.swing.JButton();
        btnEditLopHoc = new javax.swing.JButton();
        btnDeleteLopHoc = new javax.swing.JButton();
        btnNewLopHoc = new javax.swing.JButton();
        btnFirstLopHoc = new javax.swing.JButton();
        btnPreviousLopHoc = new javax.swing.JButton();
        btnNextLopHoc = new javax.swing.JButton();
        btnLastLopHoc = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        cboMaNhanVien = new javax.swing.JComboBox<>();
        jPanel38 = new javax.swing.JPanel();
        txtSearchLopHoc = new javax.swing.JTextField();
        txtSLSV = new javax.swing.JTextField();
        MonHoc = new javax.swing.JPanel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        txtTenMH = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtNgayKT = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txtMaMH = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtMoTaMH = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblMonHoc = new javax.swing.JTable();
        btnAddMH = new javax.swing.JButton();
        btnEditMH = new javax.swing.JButton();
        btnDeleteMH = new javax.swing.JButton();
        btnNewMH = new javax.swing.JButton();
        btnFirstMH = new javax.swing.JButton();
        btnPrevMH = new javax.swing.JButton();
        btnNextMH = new javax.swing.JButton();
        btnLastMH = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        txtNgayBĐ = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        txtSearchMH = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtMaKHMH = new javax.swing.JTextField();
        DangKy = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMaSVDKTL = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        cboMaMHDK = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        txtHoTenSinhVienDK = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtNgayDangKy = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtIDDKTL = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        txtHocPhiDangKy = new javax.swing.JTextField();
        btnAddDangKy = new javax.swing.JButton();
        btnEditDangKy = new javax.swing.JButton();
        btnDeleteDangKy = new javax.swing.JButton();
        btnNewDangKy = new javax.swing.JButton();
        btnFirstDangKy = new javax.swing.JButton();
        btnPrevDangKy = new javax.swing.JButton();
        btnNextDangKy = new javax.swing.JButton();
        btnLastDangKy = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        tblDangKyThiLai = new javax.swing.JTable();
        Diem = new javax.swing.JPanel();
        lblMaSV = new javax.swing.JLabel();
        lblMaMH = new javax.swing.JLabel();
        lblDiemThi = new javax.swing.JLabel();
        lblDiemHocKy = new javax.swing.JLabel();
        btnAddDiem = new javax.swing.JButton();
        btnUpdateDiem = new javax.swing.JButton();
        btnDeleteDiem = new javax.swing.JButton();
        btnNewDiem = new javax.swing.JButton();
        btnFirstDiem = new javax.swing.JButton();
        btnPrevDiem = new javax.swing.JButton();
        btnNextDiem = new javax.swing.JButton();
        btnLastDiem = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        tblDSDiem = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        cboMaMHDiem = new javax.swing.JComboBox<>();
        txtDiemThi = new javax.swing.JTextField();
        txtDiemLT = new javax.swing.JTextField();
        txtDiemTH = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        txtSearchDiem = new javax.swing.JTextField();
        btnXuatExcel = new javax.swing.JButton();
        txtMaSVDiem = new javax.swing.JTextField();
        lblDiemThi1 = new javax.swing.JLabel();
        txtTenSVDiem = new javax.swing.JTextField();
        lblDiemThi2 = new javax.swing.JLabel();
        txtIDDiem = new javax.swing.JTextField();
        ThongKe = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        cboTKSV = new javax.swing.JComboBox<>();
        btnXuatDSSV = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblTKSV = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        cboDiemTongKet = new javax.swing.JComboBox<>();
        jLabel77 = new javax.swing.JLabel();
        btnXuatTongKetDiem = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblDiemtongKet = new javax.swing.JTable();
        TaskBarPanel = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        lblHeDaoTao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GIAO DIỆN CHÍNH");
        setUndecorated(true);

        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SideBarPanel.setBackground(new java.awt.Color(51, 51, 153));
        SideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/user.png"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SideBarPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 70));

        lblUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 204, 0));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/protect.png"))); // NOI18N
        lblUserName.setText("User Name");
        SideBarPanel.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, -1));

        btnTrangChu.setBackground(new java.awt.Color(0, 0, 51));
        btnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseClicked(evt);
            }
        });
        btnTrangChu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/home.png"))); // NOI18N
        jLabel9.setText("   TRANG CHỦ");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTrangChu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        SideBarPanel.add(btnTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 60));

        btnNhanVien.setBackground(new java.awt.Color(0, 0, 51));
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseClicked(evt);
            }
        });
        btnNhanVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/teacher.png"))); // NOI18N
        jLabel3.setText("   NHÂN VIÊN");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNhanVien.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        SideBarPanel.add(btnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 190, 60));

        btnSinhVien.setBackground(new java.awt.Color(0, 0, 51));
        btnSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSinhVienMouseClicked(evt);
            }
        });
        btnSinhVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/student.png"))); // NOI18N
        jLabel4.setText("   SINH VIÊN");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSinhVien.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        SideBarPanel.add(btnSinhVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 190, 60));

        btnKhoaHoc.setBackground(new java.awt.Color(0, 0, 51));
        btnKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhoaHocMouseClicked(evt);
            }
        });
        btnKhoaHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/course.png"))); // NOI18N
        jLabel5.setText("   KHÓA HỌC");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnKhoaHoc.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        SideBarPanel.add(btnKhoaHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 190, 60));

        btnLopHoc.setBackground(new java.awt.Color(0, 0, 51));
        btnLopHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLopHocMouseClicked(evt);
            }
        });
        btnLopHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/classroom.png"))); // NOI18N
        jLabel6.setText("   LỚP HỌC");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLopHoc.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        SideBarPanel.add(btnLopHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 190, 60));

        btnMonHoc.setBackground(new java.awt.Color(0, 0, 51));
        btnMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMonHocMouseClicked(evt);
            }
        });
        btnMonHoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/subject.png"))); // NOI18N
        jLabel7.setText("   MÔN HỌC");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMonHoc.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        SideBarPanel.add(btnMonHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 190, 60));

        btnDiem.setBackground(new java.awt.Color(0, 0, 51));
        btnDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiemMouseClicked(evt);
            }
        });
        btnDiem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/scores.png"))); // NOI18N
        jLabel8.setText("   ĐIỂM");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDiem.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        SideBarPanel.add(btnDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 190, 60));

        btnDangKy.setBackground(new java.awt.Color(0, 0, 51));
        btnDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangKyMouseClicked(evt);
            }
        });
        btnDangKy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/resgiter.png"))); // NOI18N
        jLabel10.setText("   ĐĂNG KÝ");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDangKy.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        SideBarPanel.add(btnDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 190, 60));

        btnDoiMatKhau.setBackground(new java.awt.Color(0, 0, 51));
        btnDoiMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiMatKhauMouseClicked(evt);
            }
        });
        btnDoiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDoiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lblDoiMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/changpass.png"))); // NOI18N
        btnDoiMatKhau.add(lblDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 60));

        SideBarPanel.add(btnDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 685, 90, 60));

        btnDangXuat.setBackground(new java.awt.Color(0, 0, 51));
        btnDangXuat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
        });
        btnDangXuat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDangXuat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/logout.png"))); // NOI18N
        btnDangXuat.add(lblDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 60));

        SideBarPanel.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 685, 100, 60));

        btnThongKe.setBackground(new java.awt.Color(0, 0, 51));
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongKeMouseClicked(evt);
            }
        });
        btnThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/setting.png"))); // NOI18N
        jLabel42.setText("THỐNG KÊ");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnThongKe.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        SideBarPanel.add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 190, 60));

        lblVaiTro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVaiTro.setForeground(new java.awt.Color(255, 255, 255));
        lblVaiTro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVaiTro.setText("VAI TRÒ");
        SideBarPanel.add(lblVaiTro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, -1));

        MainPanel.add(SideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 760));

        HeaderPanel.setBackground(new java.awt.Color(99, 152, 229));

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/close.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addGap(0, 1180, Short.MAX_VALUE)
                .addComponent(lblExit))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addComponent(lblExit)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MainPanel.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 30));

        CenterPanel.setLayout(new java.awt.CardLayout());

        TrangChu.setBackground(new java.awt.Color(216, 227, 228));
        TrangChu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel10.setBackground(new java.awt.Color(176, 196, 222));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/employee.png"))); // NOI18N

        lblNhanVien.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        lblNhanVien.setForeground(new java.awt.Color(255, 51, 51));
        lblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhanVien.setText("SL");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("NHÂN VIÊN");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(176, 196, 222));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/course_max.png"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("KHÓA HỌC");

        lblKhoaHoc.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        lblKhoaHoc.setForeground(new java.awt.Color(255, 51, 51));
        lblKhoaHoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhoaHoc.setText("SL");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblKhoaHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblKhoaHoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(176, 196, 222));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/student_max.png"))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("SINH VIÊN");

        lblSinhVien.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        lblSinhVien.setForeground(new java.awt.Color(255, 51, 51));
        lblSinhVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSinhVien.setText("SL");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jLabel37)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(176, 196, 222));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/class_max.png"))); // NOI18N

        lblLopHoc.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        lblLopHoc.setForeground(new java.awt.Color(255, 51, 51));
        lblLopHoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLopHoc.setText("SL");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("LỚP HỌC");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblLopHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLopHoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(176, 196, 222));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/book_max.png"))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("MÔN HỌC");

        lblMonHoc.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        lblMonHoc.setForeground(new java.awt.Color(255, 51, 51));
        lblMonHoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonHoc.setText("SL");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMonHoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT MANAGEMENT SOFTWARE");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout TrangChuLayout = new javax.swing.GroupLayout(TrangChu);
        TrangChu.setLayout(TrangChuLayout);
        TrangChuLayout.setHorizontalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangChuLayout.createSequentialGroup()
                .addGroup(TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrangChuLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TrangChuLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangChuLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangChuLayout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
        );
        TrangChuLayout.setVerticalGroup(
            TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangChuLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TrangChuLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );

        CenterPanel.add(TrangChu, "card2");

        NhanVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NhanVien.setPreferredSize(new java.awt.Dimension(1020, 706));

        tabsNhanVien.setBackground(new java.awt.Color(216, 227, 228));
        tabsNhanVien.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tabsNhanVien.setOpaque(true);

        jPanel17.setBackground(new java.awt.Color(216, 227, 228));
        jPanel17.setAlignmentY(2.0F);
        jPanel17.setAutoscrolls(true);
        jPanel17.setPreferredSize(new java.awt.Dimension(1020, 700));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Mã nhân viên :");
        jLabel15.setAutoscrolls(true);

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Tên nhân viên :");
        jLabel16.setAutoscrolls(true);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Ngày sinh :");
        jLabel17.setAutoscrolls(true);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Mật khẩu :");
        jLabel18.setAutoscrolls(true);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Giới tính :");
        jLabel19.setAutoscrolls(true);

        rdoNamNV.setBackground(new java.awt.Color(216, 227, 228));
        btnGroupGTNV.add(rdoNamNV);
        rdoNamNV.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rdoNamNV.setSelected(true);
        rdoNamNV.setText("Nam");
        rdoNamNV.setAutoscrolls(true);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Email :");
        jLabel20.setAutoscrolls(true);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Địa chỉ :");
        jLabel21.setAutoscrolls(true);

        txtDiaChiNV.setColumns(20);
        txtDiaChiNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDiaChiNV.setRows(5);
        jScrollPane3.setViewportView(txtDiaChiNV);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Vai trò :");
        jLabel23.setAutoscrolls(true);

        rdoDaoTao.setBackground(new java.awt.Color(216, 227, 228));
        btnGroupVTNV.add(rdoDaoTao);
        rdoDaoTao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rdoDaoTao.setSelected(true);
        rdoDaoTao.setText("Đào tạo");
        rdoDaoTao.setAutoscrolls(true);

        rdoGiangVien.setBackground(new java.awt.Color(216, 227, 228));
        btnGroupVTNV.add(rdoGiangVien);
        rdoGiangVien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rdoGiangVien.setText("Giảng viên");
        rdoGiangVien.setAlignmentY(4.0F);
        rdoGiangVien.setAutoscrolls(true);
        rdoGiangVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGiangVienActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("SĐT :");
        jLabel24.setAutoscrolls(true);

        txtMoTaNV.setColumns(20);
        txtMoTaNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMoTaNV.setRows(5);
        jScrollPane4.setViewportView(txtMoTaNV);

        rdoNuNV.setBackground(new java.awt.Color(216, 227, 228));
        btnGroupGTNV.add(rdoNuNV);
        rdoNuNV.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rdoNuNV.setText("Nữ");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setText("Mô tả :");
        jLabel41.setToolTipText("");

        btnAddNV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddNV.setText("ADD");
        btnAddNV.setPreferredSize(new java.awt.Dimension(103, 33));
        btnAddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNVActionPerformed(evt);
            }
        });

        btnEditNV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditNV.setText("EDIT");
        btnEditNV.setPreferredSize(new java.awt.Dimension(103, 33));
        btnEditNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditNVActionPerformed(evt);
            }
        });

        btnDeleteNV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDeleteNV.setText("DELETE");
        btnDeleteNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNVActionPerformed(evt);
            }
        });

        btnNewNV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnNewNV.setText("NEW");
        btnNewNV.setPreferredSize(new java.awt.Dimension(103, 33));
        btnNewNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewNVActionPerformed(evt);
            }
        });

        btnFirtsNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/first.png"))); // NOI18N
        btnFirtsNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirtsNVActionPerformed(evt);
            }
        });

        btnPrevNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/prev.png"))); // NOI18N
        btnPrevNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevNVActionPerformed(evt);
            }
        });

        btnNextNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/next.png"))); // NOI18N
        btnNextNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextNVActionPerformed(evt);
            }
        });

        btnLastNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/last.png"))); // NOI18N
        btnLastNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastNVActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel49.setText("(dd/mm/yyyy)");

        lblAnhNV.setBackground(new java.awt.Color(255, 255, 255));
        lblAnhNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnhNV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblAnhNV.setOpaque(true);
        lblAnhNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhNVMouseClicked(evt);
            }
        });

        txtMatKhauNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtTenNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtSdtNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNgaySinhNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEmailNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel20)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtEmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(298, 298, 298)
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoNamNV)
                                        .addGap(41, 41, 41)
                                        .addComponent(rdoNuNV)))
                                .addGap(1, 1, 1))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMatKhauNV, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditNV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewNV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnFirtsNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrevNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNextNV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLastNV)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblAnhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel23)
                                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel49)
                                                .addComponent(jLabel17)))
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(rdoDaoTao)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdoGiangVien)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSdtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel41))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3))))))
                .addGap(19, 19, 19))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMatKhauNV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSdtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel49)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdoNamNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdoNuNV)
                            .addComponent(rdoDaoTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdoGiangVien))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAnhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)))
                .addGap(9, 9, 9)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(33, 33, 33)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFirtsNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        tabsNhanVien.addTab("Cập nhập", jPanel17);

        jPanel20.setBackground(new java.awt.Color(216, 227, 228));

        jPanel35.setBackground(new java.awt.Color(216, 227, 228));
        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        txtSearchNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearchNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchNVKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchNV)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(txtSearchNV, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblNhanVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Giới tính", "Vai trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setRowHeight(26);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsNhanVien.addTab("Danh sách", jPanel20);

        javax.swing.GroupLayout NhanVienLayout = new javax.swing.GroupLayout(NhanVien);
        NhanVien.setLayout(NhanVienLayout);
        NhanVienLayout.setHorizontalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
        );
        NhanVienLayout.setVerticalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        CenterPanel.add(NhanVien, "card3");

        SinhVien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabsSV.setBackground(new java.awt.Color(216, 227, 228));
        tabsSV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tabsSV.setOpaque(true);

        jPanel3.setBackground(new java.awt.Color(216, 227, 228));

        txtMoTaSV.setColumns(20);
        txtMoTaSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMoTaSV.setRows(5);
        jScrollPane1.setViewportView(txtMoTaSV);

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setText("Mô tả :");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Mã lớp :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Số điện thoại :");

        txtDiachiSV.setColumns(20);
        txtDiachiSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDiachiSV.setRows(5);
        jScrollPane12.setViewportView(txtDiachiSV);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48.setText("Địa chỉ :");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("Email :");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setText("Giới tính :");

        rdoNamSV.setBackground(new java.awt.Color(216, 227, 228));
        btnGroupGTSV.add(rdoNamSV);
        rdoNamSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdoNamSV.setSelected(true);
        rdoNamSV.setText("Nam");

        rdoNuSV.setBackground(new java.awt.Color(216, 227, 228));
        btnGroupGTSV.add(rdoNuSV);
        rdoNuSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdoNuSV.setText("Nữ");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setText("Ngày sinh :");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setText("Tên sinh viên :");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Mã sinh viên  :");

        cboMaLopSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboMaLopSV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Mật khẩu :");

        btnAddSV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddSV.setText("ADD");
        btnAddSV.setPreferredSize(new java.awt.Dimension(103, 33));
        btnAddSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSVActionPerformed(evt);
            }
        });

        btnEditSV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditSV.setText("EDIT");
        btnEditSV.setPreferredSize(new java.awt.Dimension(103, 33));
        btnEditSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSVActionPerformed(evt);
            }
        });

        btnDeleteSV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDeleteSV.setText("DELETE");
        btnDeleteSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSVActionPerformed(evt);
            }
        });

        btnNewSV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnNewSV.setText("NEW");
        btnNewSV.setPreferredSize(new java.awt.Dimension(103, 33));
        btnNewSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSVActionPerformed(evt);
            }
        });

        btnFirstSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/first.png"))); // NOI18N
        btnFirstSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstSVActionPerformed(evt);
            }
        });

        btnPrevSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/prev.png"))); // NOI18N
        btnPrevSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevSVActionPerformed(evt);
            }
        });

        btnNextSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/next.png"))); // NOI18N
        btnNextSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSVActionPerformed(evt);
            }
        });

        btnLastSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/last.png"))); // NOI18N
        btnLastSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastSVActionPerformed(evt);
            }
        });

        jLabel55.setText("(dd/MM/yyyy)");

        lblHinhSV.setBackground(new java.awt.Color(255, 255, 255));
        lblHinhSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhSV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHinhSV.setOpaque(true);
        lblHinhSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhSVMouseClicked(evt);
            }
        });

        txtMaSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtMatKhauSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtTenSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNgaySinhSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtSDTSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEmailSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblHinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(4, 4, 4)
                                .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(36, 36, 36)
                                .addComponent(rdoNamSV)
                                .addGap(30, 30, 30)
                                .addComponent(rdoNuSV))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel55))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNgaySinhSV, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(txtMatKhauSV))))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel47)
                                .addComponent(jLabel26))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSDTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(58, 58, 58)
                            .addComponent(jLabel28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel48)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel50)
                                    .addGap(14, 14, 14)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                                .addComponent(jScrollPane12)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddSV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditSV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewSV, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnFirstSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLastSV)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel22)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhauSV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)
                            .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaySinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel46)
                            .addComponent(rdoNamSV)
                            .addComponent(rdoNuSV)
                            .addComponent(txtSDTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(cboMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(txtEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteSV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFirstSV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevSV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextSV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastSV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        tabsSV.addTab("Cập nhập", jPanel3);

        jPanel8.setBackground(new java.awt.Color(216, 227, 228));

        tblSinhVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Tên SV", "Giới tính", "Mã lớp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSinhVien.setRowHeight(26);
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblSinhVien);

        jPanel36.setBackground(new java.awt.Color(216, 227, 228));
        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        txtSearchSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearchSV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchSVKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchSV, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(txtSearchSV, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsSV.addTab("Danh sách", jPanel8);

        javax.swing.GroupLayout SinhVienLayout = new javax.swing.GroupLayout(SinhVien);
        SinhVien.setLayout(SinhVienLayout);
        SinhVienLayout.setHorizontalGroup(
            SinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SinhVienLayout.createSequentialGroup()
                .addComponent(tabsSV, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, Short.MAX_VALUE)
                .addContainerGap())
        );
        SinhVienLayout.setVerticalGroup(
            SinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsSV)
        );

        CenterPanel.add(SinhVien, "card4");

        KhoaHoc.setBackground(new java.awt.Color(216, 227, 228));
        KhoaHoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Mã khóa học :");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setText("Học phí :");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setText("Tên khóa học :");

        txtTenKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenKH.setMinimumSize(new java.awt.Dimension(6, 31));
        txtTenKH.setPreferredSize(new java.awt.Dimension(69, 31));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel69.setText("Thời lượng :");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setText("Ngày tạo :");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel54.setText("Mô tả :");

        txtMoTaKH.setColumns(20);
        txtMoTaKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMoTaKH.setRows(5);
        jScrollPane6.setViewportView(txtMoTaKH);

        tblKhoaHoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Học phí ", "Thời lượng", "Ngày tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoaHoc.setRowHeight(26);
        tblKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoaHocMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tblKhoaHoc);

        btnAddKH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddKH.setText("ADD");
        btnAddKH.setPreferredSize(new java.awt.Dimension(103, 33));
        btnAddKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKHActionPerformed(evt);
            }
        });

        btnEditKH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditKH.setText("EDIT");
        btnEditKH.setPreferredSize(new java.awt.Dimension(103, 33));
        btnEditKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditKHActionPerformed(evt);
            }
        });

        btnDeleteKH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDeleteKH.setText("DELETE");
        btnDeleteKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteKHActionPerformed(evt);
            }
        });

        btnNewKH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnNewKH.setText("NEW");
        btnNewKH.setPreferredSize(new java.awt.Dimension(103, 33));
        btnNewKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewKHActionPerformed(evt);
            }
        });

        btnFirtsKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/first.png"))); // NOI18N
        btnFirtsKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirtsKHActionPerformed(evt);
            }
        });

        btnPrevKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/prev.png"))); // NOI18N
        btnPrevKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevKHActionPerformed(evt);
            }
        });

        btnNextKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/next.png"))); // NOI18N
        btnNextKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextKHActionPerformed(evt);
            }
        });

        btnLastKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/last.png"))); // NOI18N
        btnLastKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastKHActionPerformed(evt);
            }
        });

        jPanel34.setBackground(new java.awt.Color(216, 227, 228));
        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        txtSearchKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearchKH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKHKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearchKH, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(txtSearchKH, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel56.setText("(dd/MM/yyyy)");

        txtMaKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtHocPhiKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtThoiLuongKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNgayTaoKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout KhoaHocLayout = new javax.swing.GroupLayout(KhoaHoc);
        KhoaHoc.setLayout(KhoaHocLayout);
        KhoaHocLayout.setHorizontalGroup(
            KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhoaHocLayout.createSequentialGroup()
                .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhoaHocLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KhoaHocLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel52))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHocPhiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(KhoaHocLayout.createSequentialGroup()
                                .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel54))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(KhoaHocLayout.createSequentialGroup()
                                        .addComponent(btnAddKH, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEditKH, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDeleteKH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNewKH, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(btnFirtsKH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPrevKH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNextKH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLastKH)
                                        .addGap(119, 119, 119))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhoaHocLayout.createSequentialGroup()
                                        .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(KhoaHocLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(198, 198, 198)
                                                .addComponent(txtThoiLuongKH, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, KhoaHocLayout.createSequentialGroup()
                                                .addComponent(txtNgayTaoKH, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel56)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(14, 14, 14))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhoaHocLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane13))))
                .addGap(21, 21, 21))
        );
        KhoaHocLayout.setVerticalGroup(
            KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KhoaHocLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel52)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHocPhiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)
                    .addComponent(txtThoiLuongKH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel56)
                    .addComponent(txtNgayTaoKH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(KhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteKH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFirtsKH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevKH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextKH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastKH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CenterPanel.add(KhoaHoc, "card5");

        LopHoc.setBackground(new java.awt.Color(216, 227, 228));
        LopHoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Mã lớp học :");

        txtMaLH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Tên lớp học :");

        txtTenLH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Số lượng sinh viên :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("Mã môn học :");

        cboMaMonHoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tblLopHoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblLopHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã LH", "Tên LH", "Số lượng SV", "Mã NV", "Mã MH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLopHoc.setRowHeight(26);
        tblLopHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLopHocMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblLopHoc);

        btnAddLopHoc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddLopHoc.setText("ADD");
        btnAddLopHoc.setPreferredSize(new java.awt.Dimension(103, 33));
        btnAddLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLopHocActionPerformed(evt);
            }
        });

        btnEditLopHoc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditLopHoc.setText("EDIT");
        btnEditLopHoc.setPreferredSize(new java.awt.Dimension(103, 33));
        btnEditLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditLopHocActionPerformed(evt);
            }
        });

        btnDeleteLopHoc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDeleteLopHoc.setText("DELETE");
        btnDeleteLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLopHocActionPerformed(evt);
            }
        });

        btnNewLopHoc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnNewLopHoc.setText("NEW");
        btnNewLopHoc.setPreferredSize(new java.awt.Dimension(103, 33));
        btnNewLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLopHocActionPerformed(evt);
            }
        });

        btnFirstLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/first.png"))); // NOI18N
        btnFirstLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstLopHocActionPerformed(evt);
            }
        });

        btnPreviousLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/prev.png"))); // NOI18N
        btnPreviousLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousLopHocActionPerformed(evt);
            }
        });

        btnNextLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/next.png"))); // NOI18N
        btnNextLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextLopHocActionPerformed(evt);
            }
        });

        btnLastLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/last.png"))); // NOI18N
        btnLastLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastLopHocActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel57.setText("Mã nhân viên :");

        cboMaNhanVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel38.setBackground(new java.awt.Color(216, 227, 228));
        jPanel38.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        txtSearchLopHoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearchLopHoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchLopHocKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchLopHoc)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(txtSearchLopHoc)
                .addContainerGap())
        );

        txtSLSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout LopHocLayout = new javax.swing.GroupLayout(LopHoc);
        LopHoc.setLayout(LopHocLayout);
        LopHocLayout.setHorizontalGroup(
            LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LopHocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14)
                    .addGroup(LopHocLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(LopHocLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSLSV))
                            .addGroup(LopHocLayout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboMaMonHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(LopHocLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaLH, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LopHocLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenLH))
                            .addGroup(LopHocLayout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboMaNhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LopHocLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteLopHoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnFirstLopHoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPreviousLopHoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNextLopHoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLastLopHoc)
                        .addGap(135, 135, 135))
                    .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LopHocLayout.setVerticalGroup(
            LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LopHocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMaLH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtTenLH, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtSLSV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel57))
                    .addGroup(LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboMaMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35)))
                .addGap(18, 18, 18)
                .addGroup(LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFirstLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreviousLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        CenterPanel.add(LopHoc, "card6");

        MonHoc.setBackground(new java.awt.Color(216, 227, 228));
        MonHoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cboKhoaHoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel67.setText("Ngày bắt đầu (dd/MM/yyyy) :");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setText("Tên môn học :");

        txtTenMH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenMH.setMinimumSize(new java.awt.Dimension(6, 31));
        txtTenMH.setPreferredSize(new java.awt.Dimension(69, 31));
        txtTenMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenMHActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel63.setText("Mã môn học :");

        txtNgayKT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNgayKT.setMinimumSize(new java.awt.Dimension(6, 31));
        txtNgayKT.setPreferredSize(new java.awt.Dimension(69, 31));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel64.setText("Khóa học :");

        txtMaMH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaMH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaMH.setMinimumSize(new java.awt.Dimension(6, 31));
        txtMaMH.setPreferredSize(new java.awt.Dimension(69, 31));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel66.setText("Mô tả:");

        txtMoTaMH.setColumns(20);
        txtMoTaMH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMoTaMH.setRows(5);
        jScrollPane9.setViewportView(txtMoTaMH);

        tblMonHoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã MH", "Tên MH", "Ngày bắt đầu", "Ngày kết thúc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMonHoc.setRowHeight(26);
        tblMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonHocMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tblMonHoc);

        btnAddMH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddMH.setText("ADD");
        btnAddMH.setPreferredSize(new java.awt.Dimension(103, 33));
        btnAddMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMHActionPerformed(evt);
            }
        });

        btnEditMH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditMH.setText("EDIT");
        btnEditMH.setPreferredSize(new java.awt.Dimension(103, 33));
        btnEditMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMHActionPerformed(evt);
            }
        });

        btnDeleteMH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDeleteMH.setText("DELETE");
        btnDeleteMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMHActionPerformed(evt);
            }
        });

        btnNewMH.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnNewMH.setText("NEW");
        btnNewMH.setPreferredSize(new java.awt.Dimension(103, 33));
        btnNewMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMHActionPerformed(evt);
            }
        });

        btnFirstMH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/first.png"))); // NOI18N
        btnFirstMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstMHActionPerformed(evt);
            }
        });

        btnPrevMH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/prev.png"))); // NOI18N
        btnPrevMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevMHActionPerformed(evt);
            }
        });

        btnNextMH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/next.png"))); // NOI18N
        btnNextMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextMHActionPerformed(evt);
            }
        });

        btnLastMH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/last.png"))); // NOI18N
        btnLastMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastMHActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel68.setText("Ngày kết thúc (dd/MM/yyyy) :");

        txtNgayBĐ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNgayBĐ.setMinimumSize(new java.awt.Dimension(6, 31));
        txtNgayBĐ.setPreferredSize(new java.awt.Dimension(69, 31));

        jPanel39.setBackground(new java.awt.Color(216, 227, 228));
        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        txtSearchMH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearchMH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchMHKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearchMH, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSearchMH, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Mã khóa học :");

        txtMaKHMH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaKHMH.setForeground(new java.awt.Color(255, 51, 51));
        txtMaKHMH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMaKHMH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMaKHMH.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtMaKHMH.setEnabled(false);
        txtMaKHMH.setFocusable(false);
        txtMaKHMH.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout MonHocLayout = new javax.swing.GroupLayout(MonHoc);
        MonHoc.setLayout(MonHocLayout);
        MonHocLayout.setHorizontalGroup(
            MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonHocLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MonHocLayout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MonHocLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MonHocLayout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addGap(21, 21, 21))
                            .addGroup(MonHocLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(MonHocLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(12, 12, 12)))
                        .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MonHocLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(MonHocLayout.createSequentialGroup()
                                        .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel67)
                                            .addComponent(txtNgayBĐ, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel68)))
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(MonHocLayout.createSequentialGroup()
                                .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaKHMH, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))
                            .addGroup(MonHocLayout.createSequentialGroup()
                                .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MonHocLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(btnAddMH, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEditMH, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDeleteMH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNewMH, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(btnFirstMH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPrevMH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNextMH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLastMH))
                                    .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MonHocLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane15)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, 993, Short.MAX_VALUE))
                .addContainerGap())
        );
        MonHocLayout.setVerticalGroup(
            MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MonHocLayout.createSequentialGroup()
                .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MonHocLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel64))
                    .addGroup(MonHocLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MonHocLayout.createSequentialGroup()
                        .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenMH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MonHocLayout.createSequentialGroup()
                        .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaKHMH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(7, 7, 7)))
                .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MonHocLayout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgayBĐ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)
                            .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MonHocLayout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteMH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFirstMH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevMH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextMH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastMH, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CenterPanel.add(MonHoc, "card7");

        DangKy.setBackground(new java.awt.Color(216, 227, 228));
        DangKy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("PHIẾU ĐĂNG KÝ THI LẠI");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Mã SV :");

        txtMaSVDKTL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel58.setText("Mã MH :");

        cboMaMHDK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboMaMHDK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOB1014", "SOF203", "PR01", "MOB103", "WEB1032", "ACC105" }));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel59.setText("Họ tên SV :");

        txtHoTenSinhVienDK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel60.setText("Ngày đăng ký (dd/MM/yyyy):");

        txtNgayDangKy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel70.setText("ID:");

        txtIDDKTL.setEditable(false);
        txtIDDKTL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIDDKTL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDDKTL.setDisabledTextColor(new java.awt.Color(255, 0, 51));
        txtIDDKTL.setEnabled(false);

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel65.setText("Số tiền :");

        txtHocPhiDangKy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAddDangKy.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddDangKy.setText("ADD");
        btnAddDangKy.setPreferredSize(new java.awt.Dimension(103, 33));
        btnAddDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDangKyActionPerformed(evt);
            }
        });

        btnEditDangKy.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnEditDangKy.setText("EDIT");
        btnEditDangKy.setPreferredSize(new java.awt.Dimension(103, 33));
        btnEditDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDangKyActionPerformed(evt);
            }
        });

        btnDeleteDangKy.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDeleteDangKy.setText("DELETE");
        btnDeleteDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDangKyActionPerformed(evt);
            }
        });

        btnNewDangKy.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnNewDangKy.setText("NEW");
        btnNewDangKy.setPreferredSize(new java.awt.Dimension(103, 33));
        btnNewDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewDangKyActionPerformed(evt);
            }
        });

        btnFirstDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/first.png"))); // NOI18N
        btnFirstDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstDangKyActionPerformed(evt);
            }
        });

        btnPrevDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/prev.png"))); // NOI18N
        btnPrevDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevDangKyActionPerformed(evt);
            }
        });

        btnNextDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/next.png"))); // NOI18N

        btnLastDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/last.png"))); // NOI18N
        btnLastDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastDangKyActionPerformed(evt);
            }
        });

        tblDangKyThiLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblDangKyThiLai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã SV", "Họ tên SV", "Mã môn hoc", "Số tiền", "Ngày ĐK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDangKyThiLai.setRowHeight(26);
        tblDangKyThiLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDangKyThiLaiMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(tblDangKyThiLai);

        javax.swing.GroupLayout DangKyLayout = new javax.swing.GroupLayout(DangKy);
        DangKy.setLayout(DangKyLayout);
        DangKyLayout.setHorizontalGroup(
            DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DangKyLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btnAddDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteDangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnFirstDangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevDangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextDangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLastDangKy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangKyLayout.createSequentialGroup()
                .addGroup(DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DangKyLayout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DangKyLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DangKyLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaSVDKTL, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DangKyLayout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDDKTL, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DangKyLayout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoTenSinhVienDK, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DangKyLayout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgayDangKy))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangKyLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangKyLayout.createSequentialGroup()
                                        .addComponent(jLabel58)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboMaMHDK, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DangKyLayout.createSequentialGroup()
                                        .addComponent(jLabel65)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHocPhiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(33, 33, 33))
        );
        DangKyLayout.setVerticalGroup(
            DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangKyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel71)
                .addGap(35, 35, 35)
                .addGroup(DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSVDKTL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel58)
                    .addComponent(cboMaMHDK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(txtHoTenSinhVienDK, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(txtNgayDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDDKTL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel65)
                    .addComponent(txtHocPhiDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFirstDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        CenterPanel.add(DangKy, "card9");

        Diem.setBackground(new java.awt.Color(216, 227, 228));
        Diem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMaSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMaSV.setText("Mã sinh viên:");

        lblMaMH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMaMH.setText("Tên sinh viên:");

        lblDiemThi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDiemThi.setText("Điểm thi:");

        lblDiemHocKy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDiemHocKy.setText("Điểm lý thuyết:");

        btnAddDiem.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnAddDiem.setText("ADD");
        btnAddDiem.setPreferredSize(new java.awt.Dimension(103, 33));
        btnAddDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDiemActionPerformed(evt);
            }
        });

        btnUpdateDiem.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnUpdateDiem.setText("EDIT");
        btnUpdateDiem.setPreferredSize(new java.awt.Dimension(103, 33));
        btnUpdateDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDiemActionPerformed(evt);
            }
        });

        btnDeleteDiem.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDeleteDiem.setText("DELETE");
        btnDeleteDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDiemActionPerformed(evt);
            }
        });

        btnNewDiem.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnNewDiem.setText("NEW");
        btnNewDiem.setPreferredSize(new java.awt.Dimension(103, 33));
        btnNewDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewDiemActionPerformed(evt);
            }
        });

        btnFirstDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/first.png"))); // NOI18N
        btnFirstDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstDiemActionPerformed(evt);
            }
        });

        btnPrevDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/prev.png"))); // NOI18N
        btnPrevDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevDiemActionPerformed(evt);
            }
        });

        btnNextDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/next.png"))); // NOI18N
        btnNextDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextDiemActionPerformed(evt);
            }
        });

        btnLastDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/last.png"))); // NOI18N
        btnLastDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastDiemActionPerformed(evt);
            }
        });

        tblDSDiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblDSDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã SV", "Mã MH", "Tên SV", "Điểm thi", "Điểm lý thuyết", "Điểm thực hành", "Điểm trung bình"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSDiem.setRowHeight(26);
        tblDSDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSDiemMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(tblDSDiem);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Điểm thực hành:");

        cboMaMHDiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtDiemThi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtDiemLT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtDiemTH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel42.setBackground(new java.awt.Color(216, 227, 228));
        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tìm kiếm ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        txtSearchDiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearchDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(txtSearchDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnXuatExcel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnXuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/excel.png"))); // NOI18N
        btnXuatExcel.setText("Xuất Excel");
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });

        txtMaSVDiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblDiemThi1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDiemThi1.setText("Mã MH :");

        txtTenSVDiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblDiemThi2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDiemThi2.setText("ID :");

        txtIDDiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIDDiem.setForeground(new java.awt.Color(255, 0, 0));
        txtIDDiem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDDiem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIDDiem.setDisabledTextColor(new java.awt.Color(255, 0, 51));
        txtIDDiem.setEnabled(false);

        javax.swing.GroupLayout DiemLayout = new javax.swing.GroupLayout(Diem);
        Diem.setLayout(DiemLayout);
        DiemLayout.setHorizontalGroup(
            DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnXuatExcel)
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DiemLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DiemLayout.createSequentialGroup()
                                .addComponent(lblMaSV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaSVDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDiemThi1)
                                .addGap(18, 18, 18)
                                .addComponent(cboMaMHDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(DiemLayout.createSequentialGroup()
                                .addComponent(lblDiemThi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDiemHocKy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiemLT, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiemTH, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DiemLayout.createSequentialGroup()
                                .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(DiemLayout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(btnAddDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpdateDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDeleteDiem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNewDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(114, 114, 114)
                                        .addComponent(btnFirstDiem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPrevDiem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNextDiem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLastDiem))
                                    .addGroup(DiemLayout.createSequentialGroup()
                                        .addComponent(lblMaMH)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTenSVDiem)
                                        .addGap(131, 131, 131)
                                        .addComponent(lblDiemThi2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIDDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DiemLayout.setVerticalGroup(
            DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSV)
                    .addComponent(txtMaSVDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiemThi1)
                    .addComponent(cboMaMHDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDDiem)
                    .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaMH)
                        .addComponent(txtTenSVDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDiemThi2)))
                .addGap(18, 18, 18)
                .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiemThi)
                    .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtDiemTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiemHocKy)
                    .addComponent(txtDiemLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdateDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFirstDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrevDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNextDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLastDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CenterPanel.add(Diem, "card8");

        ThongKe.setBackground(new java.awt.Color(216, 227, 228));
        ThongKe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(216, 227, 228));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("DANH SÁCH SINH VIÊN");

        cboTKSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboTKSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTKSVActionPerformed(evt);
            }
        });

        btnXuatDSSV.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnXuatDSSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/excel.png"))); // NOI18N
        btnXuatDSSV.setText("Xuất Excel");
        btnXuatDSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatDSSVActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel76.setText("Lớp học :");

        tblTKSV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblTKSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Tên SV", "Ngày sinh", "Giới tính", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTKSV.setRowHeight(26);
        jScrollPane7.setViewportView(tblTKSV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXuatDSSV))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboTKSV, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTKSV, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel76))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXuatDSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Thống kê sinh viên", jPanel1);

        jPanel2.setBackground(new java.awt.Color(216, 227, 228));

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("ĐIỂM TỔNG KẾT SINH VIÊN");

        cboDiemTongKet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cboDiemTongKet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiemTongKetActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel77.setText("Môn học :");

        btnXuatTongKetDiem.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnXuatTongKetDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/excel.png"))); // NOI18N
        btnXuatTongKetDiem.setText("Xuất Excel");
        btnXuatTongKetDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatTongKetDiemActionPerformed(evt);
            }
        });

        tblDiemtongKet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblDiemtongKet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Tên SV", "Mã MH", "Điểm TB", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDiemtongKet.setRowHeight(26);
        jScrollPane8.setViewportView(tblDiemtongKet);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXuatTongKetDiem))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDiemTongKet, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDiemTongKet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXuatTongKetDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Điểm tổng kết sinh viên", jPanel2);

        javax.swing.GroupLayout ThongKeLayout = new javax.swing.GroupLayout(ThongKe);
        ThongKe.setLayout(ThongKeLayout);
        ThongKeLayout.setHorizontalGroup(
            ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        ThongKeLayout.setVerticalGroup(
            ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        CenterPanel.add(ThongKe, "card10");

        MainPanel.add(CenterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 1020, 700));

        TaskBarPanel.setBackground(new java.awt.Color(99, 152, 229));

        lblDongHo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/clock.png"))); // NOI18N
        lblDongHo.setText("12 : 00 : 00 AM");

        lblHeDaoTao.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblHeDaoTao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/duan1/icon/mark.png"))); // NOI18N
        lblHeDaoTao.setText("HỆ QUẢN LÝ ĐÀO TẠO");

        javax.swing.GroupLayout TaskBarPanelLayout = new javax.swing.GroupLayout(TaskBarPanel);
        TaskBarPanel.setLayout(TaskBarPanelLayout);
        TaskBarPanelLayout.setHorizontalGroup(
            TaskBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TaskBarPanelLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(lblHeDaoTao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 660, Short.MAX_VALUE)
                .addComponent(lblDongHo)
                .addContainerGap())
        );
        TaskBarPanelLayout.setVerticalGroup(
            TaskBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TaskBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblHeDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.add(TaskBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 1210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseClicked
        // Sidebar
        onClick(btnTrangChu);
        onLeaveClick(btnNhanVien);
        onLeaveClick(btnSinhVien);
        onLeaveClick(btnKhoaHoc);
        onLeaveClick(btnLopHoc);
        onLeaveClick(btnMonHoc);
        onLeaveClick(btnDiem);
        onLeaveClick(btnDangKy);
        onLeaveClick(btnThongKe);
        onLeaveClick(btnDangXuat);
        onLeaveClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(true);
        NhanVien.setVisible(false);
        SinhVien.setVisible(false);
        KhoaHoc.setVisible(false);
        LopHoc.setVisible(false);
        MonHoc.setVisible(false);
        Diem.setVisible(false);
        DangKy.setVisible(false);
        ThongKe.setVisible(false);


    }//GEN-LAST:event_btnTrangChuMouseClicked

    private void btnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseClicked
        // Sidebar
        onLeaveClick(btnTrangChu);
        onClick(btnNhanVien);
        onLeaveClick(btnSinhVien);
        onLeaveClick(btnKhoaHoc);
        onLeaveClick(btnLopHoc);
        onLeaveClick(btnMonHoc);
        onLeaveClick(btnDiem);
        onLeaveClick(btnDangKy);
        onLeaveClick(btnThongKe);
        onLeaveClick(btnDangXuat);
        onLeaveClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(false);
        if (Auth.user != null) {
            if (!Auth.isManager() == false) {
                MsgBox.alert(this, "Bạn không thể sử dụng chức năng này ");
                NhanVien.setVisible(false);
            } else {
                NhanVien.setVisible(true);
            }
        } else {
            // sinh viên
            if (!Auth.isManagerSV() == false) {
                MsgBox.alert(this, "Bạn không thể sử dụng chức năng này ");
                NhanVien.setVisible(false);
            } else {
                NhanVien.setVisible(true);
            }
        }

        SinhVien.setVisible(false);
        KhoaHoc.setVisible(false);
        LopHoc.setVisible(false);
        MonHoc.setVisible(false);
        Diem.setVisible(false);
        DangKy.setVisible(false);
        ThongKe.setVisible(false);
    }//GEN-LAST:event_btnNhanVienMouseClicked

    private void btnSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSinhVienMouseClicked
        // Sidebar
        onLeaveClick(btnTrangChu);
        onLeaveClick(btnNhanVien);
        onClick(btnSinhVien);
        onLeaveClick(btnKhoaHoc);
        onLeaveClick(btnLopHoc);
        onLeaveClick(btnMonHoc);
        onLeaveClick(btnDiem);
        onLeaveClick(btnDangKy);
        onLeaveClick(btnThongKe);
        onLeaveClick(btnDangXuat);
        onLeaveClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(false);
        NhanVien.setVisible(false);
        if (Auth.user != null) {
            if (!Auth.isManager() == false) {
                MsgBox.alert(this, "Bạn không thể sử dụng chức năng này ");
                SinhVien.setVisible(false);
            } else {
                SinhVien.setVisible(true);
            }
        } else {
            // sinh viên
            if (!Auth.isManagerSV() == false) {
                MsgBox.alert(this, "Bạn không thể sử dụng chức năng này ");
                SinhVien.setVisible(false);
            } else {
                SinhVien.setVisible(true);
            }
        }
        KhoaHoc.setVisible(false);
        LopHoc.setVisible(false);
        MonHoc.setVisible(false);
        Diem.setVisible(false);
        DangKy.setVisible(false);
        ThongKe.setVisible(false);
    }//GEN-LAST:event_btnSinhVienMouseClicked

    private void btnKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhoaHocMouseClicked
        // Sidebar
        onLeaveClick(btnTrangChu);
        onLeaveClick(btnNhanVien);
        onLeaveClick(btnSinhVien);
        onClick(btnKhoaHoc);
        onLeaveClick(btnLopHoc);
        onLeaveClick(btnMonHoc);
        onLeaveClick(btnDiem);
        onLeaveClick(btnDangKy);
        onLeaveClick(btnThongKe);
        onLeaveClick(btnDangXuat);
        onLeaveClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(false);
        NhanVien.setVisible(false);
        SinhVien.setVisible(false);
        if (Auth.user != null) {
            if (!Auth.isManager() == false) {
                MsgBox.alert(this, "Bạn không thể sử dụng chức năng này ");
                KhoaHoc.setVisible(false);
            } else {
                KhoaHoc.setVisible(true);
            }
        } else {
            // sinh viên
            if (!Auth.isManagerSV() == false) {
                MsgBox.alert(this, "Bạn không thể sử dụng chức năng này ");
                KhoaHoc.setVisible(false);
            } else {
                KhoaHoc.setVisible(true);
            }
        }
        LopHoc.setVisible(false);
        MonHoc.setVisible(false);
        Diem.setVisible(false);
        DangKy.setVisible(false);
        ThongKe.setVisible(false);
    }//GEN-LAST:event_btnKhoaHocMouseClicked

    private void btnLopHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLopHocMouseClicked
        // Sidebar
        onLeaveClick(btnTrangChu);
        onLeaveClick(btnNhanVien);
        onLeaveClick(btnSinhVien);
        onLeaveClick(btnKhoaHoc);
        onClick(btnLopHoc);
        onLeaveClick(btnMonHoc);
        onLeaveClick(btnDiem);
        onLeaveClick(btnDangKy);
        onLeaveClick(btnThongKe);
        onLeaveClick(btnDangXuat);
        onLeaveClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(false);
        NhanVien.setVisible(false);
        SinhVien.setVisible(false);
        KhoaHoc.setVisible(false);
        // sinh viên
        if (!Auth.isManagerSV() == false) {
            MsgBox.alert(this, "Bạn không thể sử dụng chức năng này ");
            LopHoc.setVisible(false);
        } else {
            LopHoc.setVisible(true);
        }
        MonHoc.setVisible(false);
        Diem.setVisible(false);
        DangKy.setVisible(false);
        ThongKe.setVisible(false);
    }//GEN-LAST:event_btnLopHocMouseClicked

    private void btnMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonHocMouseClicked
        // Sidebar
        onLeaveClick(btnTrangChu);
        onLeaveClick(btnNhanVien);
        onLeaveClick(btnSinhVien);
        onLeaveClick(btnKhoaHoc);
        onLeaveClick(btnLopHoc);
        onClick(btnMonHoc);
        onLeaveClick(btnDiem);
        onLeaveClick(btnDangKy);
        onLeaveClick(btnThongKe);
        onLeaveClick(btnDangXuat);
        onLeaveClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(false);
        NhanVien.setVisible(false);
        SinhVien.setVisible(false);
        KhoaHoc.setVisible(false);
        LopHoc.setVisible(false);
        // sinh viên
        if (!Auth.isManagerSV() == false) {
            MsgBox.alert(this, "Bạn không thể sử dụng chức năng này ");
            MonHoc.setVisible(false);
        } else {
            MonHoc.setVisible(true);
        }
        Diem.setVisible(false);
        DangKy.setVisible(false);
        ThongKe.setVisible(false);
    }//GEN-LAST:event_btnMonHocMouseClicked

    private void btnDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiemMouseClicked
        onLeaveClick(btnTrangChu);
        onLeaveClick(btnNhanVien);
        onLeaveClick(btnSinhVien);
        onLeaveClick(btnKhoaHoc);
        onLeaveClick(btnLopHoc);
        onLeaveClick(btnMonHoc);
        onClick(btnDiem);
        onLeaveClick(btnDangKy);
        onLeaveClick(btnThongKe);
        onLeaveClick(btnDangXuat);
        onLeaveClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(false);
        NhanVien.setVisible(false);
        SinhVien.setVisible(false);
        KhoaHoc.setVisible(false);
        LopHoc.setVisible(false);
        MonHoc.setVisible(false);
        // sinh viên
        if (!Auth.isManagerSV() == false) {
            MsgBox.alert(this, "Bạn không thể sử dụng chức năng này ");
            Diem.setVisible(false);
        } else {
            Diem.setVisible(true);
        }
        DangKy.setVisible(false);
        ThongKe.setVisible(false);
    }//GEN-LAST:event_btnDiemMouseClicked
    private void btnDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangKyMouseClicked
        // TODO add your handling code here:
        onLeaveClick(btnTrangChu);
        onLeaveClick(btnNhanVien);
        onLeaveClick(btnSinhVien);
        onLeaveClick(btnKhoaHoc);
        onLeaveClick(btnLopHoc);
        onLeaveClick(btnMonHoc);
        onLeaveClick(btnDiem);
        onClick(btnDangKy);
        onLeaveClick(btnThongKe);
        onLeaveClick(btnDangXuat);
        onLeaveClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(false);
        NhanVien.setVisible(false);
        SinhVien.setVisible(false);
        KhoaHoc.setVisible(false);
        LopHoc.setVisible(false);
        MonHoc.setVisible(false);
        Diem.setVisible(false);
        DangKy.setVisible(true);
        ThongKe.setVisible(false);

    }//GEN-LAST:event_btnDangKyMouseClicked

    private void btnThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseClicked
        // TODO add your handling code here:
        onLeaveClick(btnTrangChu);
        onLeaveClick(btnNhanVien);
        onLeaveClick(btnSinhVien);
        onLeaveClick(btnKhoaHoc);
        onLeaveClick(btnLopHoc);
        onLeaveClick(btnMonHoc);
        onLeaveClick(btnDiem);
        onLeaveClick(btnDangKy);
        onClick(btnThongKe);
        onLeaveClick(btnDangXuat);
        onLeaveClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(false);
        NhanVien.setVisible(false);
        SinhVien.setVisible(false);
        KhoaHoc.setVisible(false);
        LopHoc.setVisible(false);
        MonHoc.setVisible(false);
        Diem.setVisible(false);
        DangKy.setVisible(false);
        // sinh viên
        if (!Auth.isManagerSV() == false) {
            MsgBox.alert(this, "Bạn không thể sử dụng chức năng này ");
            ThongKe.setVisible(false);
        } else {
            ThongKe.setVisible(true);
        }
    }//GEN-LAST:event_btnThongKeMouseClicked

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        // TODO add your handling code here:
        onLeaveClick(btnTrangChu);
        onLeaveClick(btnNhanVien);
        onLeaveClick(btnSinhVien);
        onLeaveClick(btnKhoaHoc);
        onLeaveClick(btnLopHoc);
        onLeaveClick(btnMonHoc);
        onLeaveClick(btnDiem);
        onLeaveClick(btnDangKy);
        onLeaveClick(btnThongKe);
        onClick(btnDangXuat);
        onLeaveClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(false);
        NhanVien.setVisible(false);
        SinhVien.setVisible(false);
        KhoaHoc.setVisible(false);
        LopHoc.setVisible(false);
        MonHoc.setVisible(false);
        Diem.setVisible(false);
        DangKy.setVisible(false);
        ThongKe.setVisible(false);

        // giao diện
        Auth.clear();
        new DangNhapJDialog(this, true).setVisible(true);
        if (Auth.user != null) {
            lblUserName.setText(Auth.user.getTenNV());
            lblVaiTro.setText(String.valueOf(Auth.user.isVaiTro() ? "GIẢNG VIÊN" : "ĐÀO TẠO"));
        } else {
            lblUserName.setText(Auth.usersv.getTenSV());
            lblVaiTro.setText("SINH VIÊN");
        }
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void txtTenMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenMHActionPerformed

    }//GEN-LAST:event_txtTenMHActionPerformed

    private void lblAnhNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhNVMouseClicked
        this.chonAnhNV();
    }//GEN-LAST:event_lblAnhNVMouseClicked

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblSinhVien.getSelectedRow();
            this.editSV();
        }
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void lblHinhSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhSVMouseClicked
        this.chonhinhSV();
    }//GEN-LAST:event_lblHinhSVMouseClicked

    private void tblLopHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLopHocMouseClicked
        this.row = tblLopHoc.getSelectedRow();
        this.editLop();
    }//GEN-LAST:event_tblLopHocMouseClicked

    private void btnAddDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDiemActionPerformed
        if (this.checkDiem()) {
            this.insertDiem();
        }
        this.showSoLuong();
    }//GEN-LAST:event_btnAddDiemActionPerformed

    private void btnUpdateDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDiemActionPerformed
        if (this.checkDiem()) {
            this.updateDiem();
        }
    }//GEN-LAST:event_btnUpdateDiemActionPerformed

    private void btnDeleteDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDiemActionPerformed
        this.deleteDiem();
        this.showSoLuong();
    }//GEN-LAST:event_btnDeleteDiemActionPerformed

    private void btnNewDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewDiemActionPerformed
        this.clearFormDiem();
    }//GEN-LAST:event_btnNewDiemActionPerformed

    private void btnFirstDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstDiemActionPerformed
        this.firstDiem();
    }//GEN-LAST:event_btnFirstDiemActionPerformed

    private void btnPrevDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevDiemActionPerformed
        this.prevDiem();
    }//GEN-LAST:event_btnPrevDiemActionPerformed

    private void btnLastDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastDiemActionPerformed
        this.lastDiem();
    }//GEN-LAST:event_btnLastDiemActionPerformed

    private void tblDSDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSDiemMouseClicked
        this.row = tblDSDiem.getSelectedRow();
        this.editDiem();
    }//GEN-LAST:event_tblDSDiemMouseClicked

    private void btnAddNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNVActionPerformed
        if (trungMaNV() && kiemTraFormNV()) {
            this.insertNV();
        }
        this.showSoLuong();
    }//GEN-LAST:event_btnAddNVActionPerformed

    private void btnEditNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditNVActionPerformed
        if (kiemTraFormNV()) {
            this.updateNV();
        }
    }//GEN-LAST:event_btnEditNVActionPerformed

    private void btnDeleteNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNVActionPerformed
        if (txtMaNV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Nhập mã nhân viên cần xóa !");
            txtMaNV.requestFocus();
        } else {
            this.deleteNV();
            this.showSoLuong();
        }
    }//GEN-LAST:event_btnDeleteNVActionPerformed

    private void btnNewNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewNVActionPerformed
        this.clearFormNV();
    }//GEN-LAST:event_btnNewNVActionPerformed

    private void btnFirtsNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirtsNVActionPerformed
        this.firstNV();
    }//GEN-LAST:event_btnFirtsNVActionPerformed

    private void btnPrevNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevNVActionPerformed
        this.prevNV();
    }//GEN-LAST:event_btnPrevNVActionPerformed

    private void btnLastNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastNVActionPerformed
        this.lastNV();
    }//GEN-LAST:event_btnLastNVActionPerformed

    private void btnAddSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSVActionPerformed
        if (trungMaSV() && kiemTraFormSV()) {
            this.insertSV();
        }
        this.showSoLuong();
    }//GEN-LAST:event_btnAddSVActionPerformed

    private void btnEditSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSVActionPerformed
        if (kiemTraFormSV()) {
            this.updateSV();
        }
    }//GEN-LAST:event_btnEditSVActionPerformed

    private void btnDeleteSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSVActionPerformed
        this.deleteSV();
        this.showSoLuong();
    }//GEN-LAST:event_btnDeleteSVActionPerformed

    private void btnNewSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSVActionPerformed
        this.clearFormSV();
    }//GEN-LAST:event_btnNewSVActionPerformed

    private void btnFirstSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstSVActionPerformed
        this.firstSV();
    }//GEN-LAST:event_btnFirstSVActionPerformed

    private void btnPrevSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevSVActionPerformed
        this.prevSV();
    }//GEN-LAST:event_btnPrevSVActionPerformed

    private void btnLastSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastSVActionPerformed
        this.lastSV();
    }//GEN-LAST:event_btnLastSVActionPerformed

    private void btnAddKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKHActionPerformed
        if (trungMaKH() && checkFormKH()) {
            this.insertKH();
        }
        this.showSoLuong();
    }//GEN-LAST:event_btnAddKHActionPerformed

    private void btnEditKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditKHActionPerformed
        if (checkFormKH()) {
            this.updateKH();
        }
    }//GEN-LAST:event_btnEditKHActionPerformed

    private void btnDeleteKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteKHActionPerformed
        if (txtMaKH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Nhập mã khóa học cần xóa !");
        } else {
            this.deleteKH();
        }
        this.showSoLuong();
    }//GEN-LAST:event_btnDeleteKHActionPerformed

    private void btnNewKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewKHActionPerformed
        this.clearFormKH();
    }//GEN-LAST:event_btnNewKHActionPerformed

    private void btnFirtsKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirtsKHActionPerformed
        this.firstKH();
    }//GEN-LAST:event_btnFirtsKHActionPerformed

    private void btnPrevKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevKHActionPerformed
        this.prevKH();
    }//GEN-LAST:event_btnPrevKHActionPerformed

    private void btnLastKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastKHActionPerformed
        this.lastKH();
    }//GEN-LAST:event_btnLastKHActionPerformed

    private void btnAddLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLopHocActionPerformed
        if (trungMaLop() && checkFormLop()) {
            this.insertLop();
        }
        this.showSoLuong();
    }//GEN-LAST:event_btnAddLopHocActionPerformed

    private void btnEditLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditLopHocActionPerformed
        if (checkFormLop()) {
            this.updateLop();
        }
    }//GEN-LAST:event_btnEditLopHocActionPerformed

    private void btnDeleteLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLopHocActionPerformed
        this.deleteLop();
        this.showSoLuong();
    }//GEN-LAST:event_btnDeleteLopHocActionPerformed

    private void btnNewLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLopHocActionPerformed
        this.clearFormLop();
    }//GEN-LAST:event_btnNewLopHocActionPerformed

    private void btnFirstLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstLopHocActionPerformed
        this.firstLop();
    }//GEN-LAST:event_btnFirstLopHocActionPerformed

    private void btnPreviousLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousLopHocActionPerformed
        this.previousLop();
    }//GEN-LAST:event_btnPreviousLopHocActionPerformed

    private void btnLastLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastLopHocActionPerformed
        this.lastLop();
    }//GEN-LAST:event_btnLastLopHocActionPerformed

    private void btnAddMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMHActionPerformed
        if (trungMaMH() && checkFormMH()) {
            this.insertMH();
        }
        this.showSoLuong();
    }//GEN-LAST:event_btnAddMHActionPerformed

    private void btnEditMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMHActionPerformed
        if (checkFormMH()) {
            this.updateMH();
        }
    }//GEN-LAST:event_btnEditMHActionPerformed

    private void btnDeleteMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMHActionPerformed
        this.deleteMH();
        this.showSoLuong();
    }//GEN-LAST:event_btnDeleteMHActionPerformed

    private void btnNewMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMHActionPerformed
        this.clearFormMH();
    }//GEN-LAST:event_btnNewMHActionPerformed

    private void btnFirstMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstMHActionPerformed
        this.firstMH();
    }//GEN-LAST:event_btnFirstMHActionPerformed

    private void btnPrevMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevMHActionPerformed
        this.prevMH();
    }//GEN-LAST:event_btnPrevMHActionPerformed

    private void btnLastMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastMHActionPerformed
        this.lastMH();
    }//GEN-LAST:event_btnLastMHActionPerformed

    private void tblDangKyThiLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDangKyThiLaiMouseClicked
        this.row = tblDangKyThiLai.getSelectedRow();
        this.editDKTL();
    }//GEN-LAST:event_tblDangKyThiLaiMouseClicked

    private void btnAddDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDangKyActionPerformed
        if (checkFormDKTL()) {
            this.insertDKTL();
        }
    }//GEN-LAST:event_btnAddDangKyActionPerformed

    private void btnEditDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDangKyActionPerformed
        this.updateDKTL();
    }//GEN-LAST:event_btnEditDangKyActionPerformed

    private void btnDeleteDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDangKyActionPerformed
        this.deleteDKTL();
    }//GEN-LAST:event_btnDeleteDangKyActionPerformed

    private void btnNewDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewDangKyActionPerformed
        this.clearFormDKTL();
    }//GEN-LAST:event_btnNewDangKyActionPerformed

    private void btnFirstDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstDangKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstDangKyActionPerformed

    private void btnPrevDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevDangKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevDangKyActionPerformed

    private void btnLastDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastDangKyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastDangKyActionPerformed

    private void btnNextKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextKHActionPerformed
        this.nextKH();
    }//GEN-LAST:event_btnNextKHActionPerformed

    private void txtSearchKHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKHKeyReleased
        this.timKiemKH();
    }//GEN-LAST:event_txtSearchKHKeyReleased

    private void btnNextMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextMHActionPerformed
        this.nextMH();
    }//GEN-LAST:event_btnNextMHActionPerformed

    private void txtSearchMHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchMHKeyReleased
        this.timKiemMH();
    }//GEN-LAST:event_txtSearchMHKeyReleased

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
        this.chonKhoaHoc();
    }//GEN-LAST:event_cboKhoaHocActionPerformed

    private void btnNextLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextLopHocActionPerformed
        this.nextLop();
    }//GEN-LAST:event_btnNextLopHocActionPerformed

    private void txtSearchLopHocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchLopHocKeyReleased
        this.timKiemLop();
    }//GEN-LAST:event_txtSearchLopHocKeyReleased

    private void btnNextDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextDiemActionPerformed
        this.nextDiem();
    }//GEN-LAST:event_btnNextDiemActionPerformed

    private void tblKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoaHocMouseClicked
        this.row = tblKhoaHoc.getSelectedRow();
        this.editKH();
    }//GEN-LAST:event_tblKhoaHocMouseClicked

    private void txtSearchNVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchNVKeyReleased
        this.timKiemNV();
    }//GEN-LAST:event_txtSearchNVKeyReleased

    private void btnNextNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextNVActionPerformed
        this.nextNV();
    }//GEN-LAST:event_btnNextNVActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        this.printDiem();
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void tblMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonHocMouseClicked
        this.row = tblMonHoc.getSelectedRow();
        this.editMH();
    }//GEN-LAST:event_tblMonHocMouseClicked

    private void txtSearchSVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchSVKeyReleased
        this.TimKiemSV();
    }//GEN-LAST:event_txtSearchSVKeyReleased

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblNhanVien.getSelectedRow();
            this.editNV();
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnXuatTongKetDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatTongKetDiemActionPerformed
        this.printTKĐ();
    }//GEN-LAST:event_btnXuatTongKetDiemActionPerformed

    private void cboDiemTongKetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiemTongKetActionPerformed
        this.chonMonHoc();
    }//GEN-LAST:event_cboDiemTongKetActionPerformed

    private void btnXuatDSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatDSSVActionPerformed
        this.printdsSV();
    }//GEN-LAST:event_btnXuatDSSVActionPerformed

    private void cboTKSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTKSVActionPerformed
        this.chonLopHoc();
    }//GEN-LAST:event_cboTKSVActionPerformed

    private void btnNextSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSVActionPerformed
        this.nextSV();
    }//GEN-LAST:event_btnNextSVActionPerformed

    private void rdoGiangVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGiangVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoGiangVienActionPerformed

    private void btnDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMatKhauMouseClicked
        // TODO add your handling code here:
        onLeaveClick(btnTrangChu);
        onLeaveClick(btnNhanVien);
        onLeaveClick(btnSinhVien);
        onLeaveClick(btnKhoaHoc);
        onLeaveClick(btnLopHoc);
        onLeaveClick(btnMonHoc);
        onLeaveClick(btnDiem);
        onLeaveClick(btnDangKy);
        onLeaveClick(btnThongKe);
        onLeaveClick(btnDangXuat);
        onClick(btnDoiMatKhau);

        // giao diện
        TrangChu.setVisible(false);
        NhanVien.setVisible(false);
        SinhVien.setVisible(false);
        KhoaHoc.setVisible(false);
        LopHoc.setVisible(false);
        MonHoc.setVisible(false);
        Diem.setVisible(false);
        DangKy.setVisible(false);
        ThongKe.setVisible(false);

        new DoiMatKhauJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JPanel DangKy;
    private javax.swing.JPanel Diem;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel KhoaHoc;
    private javax.swing.JPanel LopHoc;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MonHoc;
    private javax.swing.JPanel NhanVien;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JPanel SinhVien;
    private javax.swing.JPanel TaskBarPanel;
    private javax.swing.JPanel ThongKe;
    private javax.swing.JPanel TrangChu;
    private javax.swing.JButton btnAddDangKy;
    private javax.swing.JButton btnAddDiem;
    private javax.swing.JButton btnAddKH;
    private javax.swing.JButton btnAddLopHoc;
    private javax.swing.JButton btnAddMH;
    private javax.swing.JButton btnAddNV;
    private javax.swing.JButton btnAddSV;
    private javax.swing.JPanel btnDangKy;
    private javax.swing.JPanel btnDangXuat;
    private javax.swing.JButton btnDeleteDangKy;
    private javax.swing.JButton btnDeleteDiem;
    private javax.swing.JButton btnDeleteKH;
    private javax.swing.JButton btnDeleteLopHoc;
    private javax.swing.JButton btnDeleteMH;
    private javax.swing.JButton btnDeleteNV;
    private javax.swing.JButton btnDeleteSV;
    private javax.swing.JPanel btnDiem;
    private javax.swing.JPanel btnDoiMatKhau;
    private javax.swing.JButton btnEditDangKy;
    private javax.swing.JButton btnEditKH;
    private javax.swing.JButton btnEditLopHoc;
    private javax.swing.JButton btnEditMH;
    private javax.swing.JButton btnEditNV;
    private javax.swing.JButton btnEditSV;
    private javax.swing.JButton btnFirstDangKy;
    private javax.swing.JButton btnFirstDiem;
    private javax.swing.JButton btnFirstLopHoc;
    private javax.swing.JButton btnFirstMH;
    private javax.swing.JButton btnFirstSV;
    private javax.swing.JButton btnFirtsKH;
    private javax.swing.JButton btnFirtsNV;
    private javax.swing.ButtonGroup btnGroupGTNV;
    private javax.swing.ButtonGroup btnGroupGTSV;
    private javax.swing.ButtonGroup btnGroupVTNV;
    private javax.swing.JPanel btnKhoaHoc;
    private javax.swing.JButton btnLastDangKy;
    private javax.swing.JButton btnLastDiem;
    private javax.swing.JButton btnLastKH;
    private javax.swing.JButton btnLastLopHoc;
    private javax.swing.JButton btnLastMH;
    private javax.swing.JButton btnLastNV;
    private javax.swing.JButton btnLastSV;
    private javax.swing.JPanel btnLopHoc;
    private javax.swing.JPanel btnMonHoc;
    private javax.swing.JButton btnNewDangKy;
    private javax.swing.JButton btnNewDiem;
    private javax.swing.JButton btnNewKH;
    private javax.swing.JButton btnNewLopHoc;
    private javax.swing.JButton btnNewMH;
    private javax.swing.JButton btnNewNV;
    private javax.swing.JButton btnNewSV;
    private javax.swing.JButton btnNextDangKy;
    private javax.swing.JButton btnNextDiem;
    private javax.swing.JButton btnNextKH;
    private javax.swing.JButton btnNextLopHoc;
    private javax.swing.JButton btnNextMH;
    private javax.swing.JButton btnNextNV;
    private javax.swing.JButton btnNextSV;
    private javax.swing.JPanel btnNhanVien;
    private javax.swing.JButton btnPrevDangKy;
    private javax.swing.JButton btnPrevDiem;
    private javax.swing.JButton btnPrevKH;
    private javax.swing.JButton btnPrevMH;
    private javax.swing.JButton btnPrevNV;
    private javax.swing.JButton btnPrevSV;
    private javax.swing.JButton btnPreviousLopHoc;
    private javax.swing.JPanel btnSinhVien;
    private javax.swing.JPanel btnThongKe;
    private javax.swing.JPanel btnTrangChu;
    private javax.swing.JButton btnUpdateDiem;
    private javax.swing.JButton btnXuatDSSV;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JButton btnXuatTongKetDiem;
    private javax.swing.JComboBox<String> cboDiemTongKet;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JComboBox<String> cboMaLopSV;
    private javax.swing.JComboBox<String> cboMaMHDK;
    private javax.swing.JComboBox<String> cboMaMHDiem;
    private javax.swing.JComboBox<String> cboMaMonHoc;
    private javax.swing.JComboBox<String> cboMaNhanVien;
    private javax.swing.JComboBox<String> cboTKSV;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAnhNV;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDiemHocKy;
    private javax.swing.JLabel lblDiemThi;
    private javax.swing.JLabel lblDiemThi1;
    private javax.swing.JLabel lblDiemThi2;
    private javax.swing.JLabel lblDoiMatKhau;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHeDaoTao;
    private javax.swing.JLabel lblHinhSV;
    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JLabel lblLopHoc;
    private javax.swing.JLabel lblMaMH;
    private javax.swing.JLabel lblMaSV;
    private javax.swing.JLabel lblMonHoc;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSinhVien;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JRadioButton rdoDaoTao;
    private javax.swing.JRadioButton rdoGiangVien;
    private javax.swing.JRadioButton rdoNamNV;
    private javax.swing.JRadioButton rdoNamSV;
    private javax.swing.JRadioButton rdoNuNV;
    private javax.swing.JRadioButton rdoNuSV;
    private javax.swing.JTabbedPane tabsNhanVien;
    private javax.swing.JTabbedPane tabsSV;
    private javax.swing.JTable tblDSDiem;
    private javax.swing.JTable tblDangKyThiLai;
    private javax.swing.JTable tblDiemtongKet;
    private javax.swing.JTable tblKhoaHoc;
    private javax.swing.JTable tblLopHoc;
    private javax.swing.JTable tblMonHoc;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTable tblTKSV;
    private javax.swing.JTextArea txtDiaChiNV;
    private javax.swing.JTextArea txtDiachiSV;
    private javax.swing.JTextField txtDiemLT;
    private javax.swing.JTextField txtDiemTH;
    private javax.swing.JTextField txtDiemThi;
    private javax.swing.JTextField txtEmailNV;
    private javax.swing.JTextField txtEmailSV;
    private javax.swing.JTextField txtHoTenSinhVienDK;
    private javax.swing.JTextField txtHocPhiDangKy;
    private javax.swing.JTextField txtHocPhiKH;
    private javax.swing.JTextField txtIDDKTL;
    private javax.swing.JTextField txtIDDiem;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaKHMH;
    private javax.swing.JTextField txtMaLH;
    private javax.swing.JTextField txtMaMH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtMaSVDKTL;
    private javax.swing.JTextField txtMaSVDiem;
    private javax.swing.JTextField txtMatKhauNV;
    private javax.swing.JTextField txtMatKhauSV;
    private javax.swing.JTextArea txtMoTaKH;
    private javax.swing.JTextArea txtMoTaMH;
    private javax.swing.JTextArea txtMoTaNV;
    private javax.swing.JTextArea txtMoTaSV;
    private javax.swing.JTextField txtNgayBĐ;
    private javax.swing.JTextField txtNgayDangKy;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtNgaySinhNV;
    private javax.swing.JTextField txtNgaySinhSV;
    private javax.swing.JTextField txtNgayTaoKH;
    private javax.swing.JTextField txtSDTSV;
    private javax.swing.JTextField txtSLSV;
    private javax.swing.JTextField txtSdtNV;
    private javax.swing.JTextField txtSearchDiem;
    private javax.swing.JTextField txtSearchKH;
    private javax.swing.JTextField txtSearchLopHoc;
    private javax.swing.JTextField txtSearchMH;
    private javax.swing.JTextField txtSearchNV;
    private javax.swing.JTextField txtSearchSV;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenLH;
    private javax.swing.JTextField txtTenMH;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTenSV;
    private javax.swing.JTextField txtTenSVDiem;
    private javax.swing.JTextField txtThoiLuongKH;
    // End of variables declaration//GEN-END:variables

    Border boder;

    NhanVienDAO nvdao = new NhanVienDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    DiemDAO diemdao = new DiemDAO();
    LopHocDAO lopdao = new LopHocDAO();
    SinhVienDAO svdao = new SinhVienDAO();
    MonHocDAO mhdao = new MonHocDAO();
    DangKyDAO dkdao = new DangKyDAO();

    int row = -1; // vị trí hàng được chọn

    public void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        new CuaSoChao(this, true).setVisible(true);
        new DangNhapJDialog(this, true).setVisible(true);
        this.startDongHo();

        if (Auth.user != null) {
            lblUserName.setText(Auth.user.getTenNV());
            lblVaiTro.setText(String.valueOf(Auth.user.isVaiTro() ? "GIẢNG VIÊN" : "ĐÀO TẠO"));
        } else {
            lblUserName.setText(Auth.usersv.getTenSV());
            lblVaiTro.setText("SINH VIÊN");
        }

        // đổ dữ liệu vào bảng
        this.fillTableNV();
        this.fillTableKH();
        this.fillTableDiem();
        this.fillTableLop();
        this.fillTableSinhVien();
        this.fillTableDangKy();

        // đổ dữ liệu vào combobox
        this.fillComboboxKhoaHoc();
        this.fillComboBoxMHDiem();
        this.fillComboBoxLop();
        this.fillcboTKSV();
        this.fillcboTKD();
        this.fillComboBoxMHLop();
        this.fillComboBoxNVLop();

        // trạng thái
        this.updateStatusKH();
        this.updateStatusSV();
        this.updateStatusNV();
        this.updateStatusMH();
        this.updateStatusDiem();
        this.updateStatusDKTL();
        this.updateStatusLop();

        this.row = -1;
        this.showSoLuong();
    }

    // hiện thị số lượng các chức năng
    public void showSoLuong() {

        String sqlNV = "SELECT COUNT(*) FROM NHANVIEN";
        int countNV = (Integer) XJdbc.value(sqlNV);
        lblNhanVien.setText(String.valueOf(countNV));

        String sqlSV = "SELECT COUNT(*) FROM SINHVIEN";
        int countSV = (Integer) XJdbc.value(sqlSV);
        lblSinhVien.setText(String.valueOf(countSV));

        String sqlKH = "SELECT COUNT(*) FROM KHOAHOC";
        int countKH = (Integer) XJdbc.value(sqlKH);
        lblKhoaHoc.setText(String.valueOf(countKH));

        String sqlL = "SELECT COUNT(*) FROM LOP";
        int countL = (Integer) XJdbc.value(sqlL);
        lblLopHoc.setText(String.valueOf(countL));

        String sqlMH = "SELECT COUNT(*) FROM MONHOC";
        int countMH = (Integer) XJdbc.value(sqlMH);
        lblMonHoc.setText(String.valueOf(countMH));
    }

    // Đồng hồ
    public void startDongHo() {
        new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy ngày giờ hiện tại
                Date now = new Date();
                // đinh dạng
                SimpleDateFormat simpleFormart = new SimpleDateFormat("hh:mm:ss a");
                lblDongHo.setText(simpleFormart.format(now));
            }
        }).start();
    }

    /**
     * *
     *********** KHÓA HỌC *********************************
     */
    // đổ dữ liệu vào bảng khóa học
    public void fillTableKH() {
        DefaultTableModel model = (DefaultTableModel) tblKhoaHoc.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtSearchKH.getText();
            List<KhoaHoc> list = khdao.selectByKeyword(keyword);
            for (KhoaHoc kh : list) {
                Object[] rows = {kh.getMaKH(), kh.getTenKH(), kh.getHocPhi(), kh.getThoiLuong(), XDate.toString(kh.getNgayTao(), "dd/MM/yyyy")};
                model.addRow(rows);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // thêm khóa học
    public void insertKH() {
        KhoaHoc kh = getFormKH();
        try {
            khdao.insert(kh);
            this.fillTableKH();
            this.clearFormKH();
            MsgBox.alert(this, "Thêm mới thành công !");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại !");
        }
    }

    // sửa khóa học
    public void updateKH() {
        KhoaHoc kh = getFormKH();
        try {
            khdao.update(kh);
            this.fillTableKH();
            this.clearFormKH();
            MsgBox.alert(this, "Cập nhật thành công !");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại !");
        }

    }

    // xóa khóa học
    public void deleteKH() {
        KhoaHoc kh = getFormKH();
        if (MsgBox.confirm(this, "Bạn có thực sự muốn xóa khóa học này !")) {
            try {
                String makh = txtMaKH.getText();
                khdao.delete(makh);
                this.fillTableKH();
                this.clearFormKH();
                MsgBox.alert(this, "Xóa thành công !");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại !");
            }
        }
    }

    // mới khóa học
    public void clearFormKH() {
        KhoaHoc kh = new KhoaHoc();
        this.setFormKH(kh);
        this.row = -1;
        this.updateStatusKH();
    }

    // hiện dữ liệu lên bảng
    public void setFormKH(KhoaHoc kh) {
        txtMaKH.setText(kh.getMaKH());
        txtTenKH.setText(kh.getTenKH());
        txtHocPhiKH.setText(String.valueOf(kh.getHocPhi()));
        txtThoiLuongKH.setText(String.valueOf(kh.getThoiLuong()));
        txtNgayTaoKH.setText(XDate.toString(kh.getNgayTao(), "dd/MM/yyyy"));
        txtMoTaKH.setText(kh.getMoTa());
    }

    // tạo mới khóa học từ form
    KhoaHoc getFormKH() {
        KhoaHoc kh = new KhoaHoc();
        kh.setMaKH(txtMaKH.getText());
        kh.setTenKH(txtTenKH.getText());
        kh.setHocPhi(Float.valueOf(txtHocPhiKH.getText()));
        kh.setThoiLuong(Integer.valueOf(txtThoiLuongKH.getText()));
        kh.setNgayTao(XDate.toDate(txtNgayTaoKH.getText(), "dd/MM/yyyy"));
        kh.setMoTa(txtMoTaKH.getText());
        return kh;
    }

    // click hiện lên form
    public void editKH() {
        String makh = (String) tblKhoaHoc.getValueAt(this.row, 0);
        KhoaHoc kh = khdao.selectById(makh);
        this.setFormKH(kh);
        this.updateStatusKH();
    }

    // nút bấm về đầu
    public void firstKH() {
        this.row = 0;
        this.editKH();
        tblKhoaHoc.setRowSelectionInterval(row, row);
    }

    // nút bấm về trước
    public void prevKH() {
        if (this.row > 0) {
            this.row--;
            this.editKH();
            tblKhoaHoc.setRowSelectionInterval(row, row);
        }
    }

    // nút bấm về sau
    public void nextKH() {
        if (this.row < tblKhoaHoc.getRowCount() - 1) {
            this.row++;
            this.editKH();
            tblKhoaHoc.setRowSelectionInterval(row, row);
        }
    }

    // nút bấm về cuối
    public void lastKH() {
        this.row = tblKhoaHoc.getRowCount() - 1;
        this.editKH();
        tblKhoaHoc.setRowSelectionInterval(row, row);
    }

    public void timKiemKH() {
        this.fillTableKH();
        this.clearFormKH();
        this.row = -1;
        this.updateStatusKH();
    }

    public void updateStatusKH() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblKhoaHoc.getRowCount() - 1);

        // trạng thái form 
        txtMaKH.setEditable(!edit);
        btnAddKH.setEnabled(!edit);
        btnEditKH.setEnabled(edit);
        btnDeleteKH.setEnabled(edit);

        // trạng thái điều hướng
        btnFirtsKH.setEnabled(edit && !first);
        btnPrevKH.setEnabled(edit && !first);
        btnNextKH.setEnabled(edit && !last);
        btnLastKH.setEnabled(edit && !last);
    }

    // trùng mã khóa học
    public boolean trungMaKH() {
        List<KhoaHoc> list = khdao.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (txtMaKH.getText().equalsIgnoreCase(list.get(i).getMaKH())) {
                MsgBox.alert(this, "Mã khóa học đã tồn tại!");
                txtMaKH.requestFocus();
                txtMaKH.setText("");
                txtMaKH.requestFocus();
                boder = BorderFactory.createLineBorder(Color.red);
                txtMaKH.setBorder(boder);
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtMaKH.setBorder(boder);
            }
        }
        return true;
    }

    // bắt lỗi bỏ trống form từ người dùng
    public boolean checkFormKH() {
        Border boder;
        // mã khóa học
        if (txtMaKH.getText().equals("")) {
            MsgBox.alert(this, "Mã khóa học không rỗng !");
            txtMaKH.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtMaKH.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMaKH.setBorder(boder);
        }

        // tên khóa học
        if (txtTenKH.getText().equals("")) {
            MsgBox.alert(this, "Tên khóa học không rỗng !");
            txtTenKH.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtTenKH.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtTenKH.setBorder(boder);
        }

        // học phí
        if (txtHocPhiKH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Học phí không rỗng !");
            txtHocPhiKH.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtHocPhiKH.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtHocPhiKH.setBorder(boder);
        }

        try {
            double hocphi = Double.parseDouble(txtHocPhiKH.getText());
            if (hocphi < 0) {
                MsgBox.alert(this, "Học phí phải lớn hơn 0 !");
                txtHocPhiKH.setText("");
                txtHocPhiKH.requestFocus();
                boder = BorderFactory.createLineBorder(Color.red);
                txtHocPhiKH.setBorder(boder);
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtHocPhiKH.setBorder(boder);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Gía trị nhập vào không phải là số !");
            txtHocPhiKH.setText("");
            txtHocPhiKH.requestFocus();
            boder = BorderFactory.createLineBorder(Color.white);
            txtHocPhiKH.setBorder(boder);
            return false;
        }

        // thời lượng
        if (txtThoiLuongKH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Thời lượng rỗng !");
            txtThoiLuongKH.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtThoiLuongKH.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtThoiLuongKH.setBorder(boder);
        }

        try {
            int thoiluong = Integer.parseInt(txtThoiLuongKH.getText());
            if (thoiluong < 0) {
                MsgBox.alert(this, "Thời lượng phải lớn hơn 0 !");
                txtThoiLuongKH.setText("");
                txtThoiLuongKH.requestFocus();
                boder = BorderFactory.createLineBorder(Color.red);
                txtThoiLuongKH.setBorder(boder);
                return false;
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Gía trị nhập vào không phải là số !");
            txtThoiLuongKH.setText("");
            txtThoiLuongKH.requestFocus();
            boder = BorderFactory.createLineBorder(Color.white);
            txtThoiLuongKH.setBorder(boder);
            return false;
        }

        // ngày tạo khóa học
        if (txtNgayTaoKH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Ngày tạo không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtNgayTaoKH.setBorder(boder);
            txtNgayTaoKH.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtNgayTaoKH.setBorder(boder);
        }

        if (!txtNgayTaoKH.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
            MsgBox.alert(this, "Ngày tạo không đúng định dạng (dd/MM/yyyy) !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtNgayTaoKH.setBorder(boder);
            txtNgayTaoKH.requestFocus();
            txtNgayTaoKH.setText("");
            txtNgayTaoKH.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtNgayTaoKH.setBorder(boder);
        }

        // mô tả
        if (txtMoTaKH.getText().equals("")) {
            MsgBox.alert(this, "Mô tả không rỗng !");
            txtMoTaKH.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtMoTaKH.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMoTaKH.setBorder(boder);
        }
        return true;
    }

    /**
     *********** NHÂN VIÊN ************
     */
    private void fillTableNV() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtSearchNV.getText();
            List<NhanVien> list = nvdao.selectByKeyword(keyword);
            for (NhanVien nv : list) {
                Object[] row = {
                    nv.getMaNV(),
                    nv.getTenNV(),
                    nv.isGioiTinh() ? "Nam" : "Nữ",
                    nv.isVaiTro() ? "Giảng viên" : "Đào tạo"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    // hiện thông tin lên form
    private void setFormNV(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtTenNV.setText(nv.getTenNV());
        txtNgaySinhNV.setText(XDate.toString(nv.getNgaySinh(), "MM/dd/yyyy"));
        rdoGiangVien.setSelected(nv.isVaiTro());
        rdoDaoTao.setSelected(!nv.isVaiTro());
        txtMatKhauNV.setText(nv.getMatKhau());
        rdoNamNV.setSelected(nv.isGioiTinh());
        rdoNuNV.setSelected(!nv.isGioiTinh());
        txtSdtNV.setText(nv.getSDT());
        txtEmailNV.setText(nv.getEmail());
        txtDiaChiNV.setText(nv.getDiaChi());
        if (nv.getHinh() != null) {
            lblAnhNV.setToolTipText(nv.getHinh());
            lblAnhNV.setIcon(XImage.read(nv.getHinh()));
        }
        txtMoTaNV.setText(nv.getMoTa());
    }

    private NhanVien getFormNV() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setTenNV(txtTenNV.getText());
        nv.setNgaySinh(XDate.toDate(txtNgaySinhNV.getText(), "MM/dd/yyyy"));
        nv.setVaiTro(rdoGiangVien.isSelected());
        nv.setMatKhau(txtMatKhauNV.getText());
        nv.setGioiTinh(rdoNamNV.isSelected());
        nv.setSDT(txtSdtNV.getText());
        nv.setEmail(txtEmailNV.getText());
        nv.setDiaChi(txtMoTaNV.getText());
        nv.setHinh(lblAnhNV.getToolTipText());
        nv.setMoTa(txtDiaChiNV.getText());
        return nv;
    }

    private void updateStatusNV() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNhanVien.getRowCount() - 1);
        //Trạng thái form
        txtMaNV.setEditable(!edit);
        btnAddNV.setEnabled(!edit);
        btnEditNV.setEnabled(edit);
        btnDeleteNV.setEnabled(edit);
        //Trạng thái điều hướng
        btnFirtsNV.setEnabled(edit && !first);
        btnPrevNV.setEnabled(edit && !first);
        btnNextNV.setEnabled(edit && !last);
        btnLastNV.setEnabled(edit && !last);
    }

    private void chonAnhNV() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.save(file);//Lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName());//Đọc hình từ logos
            lblAnhNV.setIcon(icon);
            lblAnhNV.setToolTipText(file.getName());//Giữ tên hình trong tooltip
        }
    }

    private void editNV() {
        String maNV = (String) tblNhanVien.getValueAt(this.row, 0);
        NhanVien nv = nvdao.selectById(maNV);
        this.setFormNV(nv);
        tabsNhanVien.setSelectedIndex(0);
        this.updateStatusNV();
    }

    private void clearFormNV() {
        NhanVien nv = new NhanVien();
        lblAnhNV.setIcon(XImage.read("nen.png"));
        this.setFormNV(nv);
        rdoDaoTao.setSelected(true);
        rdoNamNV.setSelected(true);
        this.row = -1;
        this.updateStatusNV();
    }

    private void insertNV() {
        NhanVien nv = getFormNV();
        try {
            nvdao.insert(nv);
            this.fillTableNV();
            this.clearFormNV();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }

    private void updateNV() {
        NhanVien nv = getFormNV();
        try {
            nvdao.update(nv);
            this.fillTableNV();
            this.clearFormNV();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
    }

    private void deleteNV() {
        String maNV = txtMaNV.getText();
        if (maNV.equals(Auth.user.getMaNV())) {
            MsgBox.alert(this, "Bạn không được xóa chính mình!");
        } else if (MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")) {
            try {
                nvdao.delete(maNV);
                this.fillTableNV();//Tải dữ liệu lên bảng
                this.clearFormNV();//Làm sạch form
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
                e.printStackTrace();
            }
        }
    }

    private void firstNV() {
        this.row = 0;
        this.editNV();
    }

    private void prevNV() {
        if (this.row > 0) {
            this.row--;
            this.editNV();
        }
    }

    private void nextNV() {
        if (this.row < tblNhanVien.getRowCount() - 1) {
            this.row++;
            this.editNV();
        }
    }

    private void lastNV() {
        this.row = tblNhanVien.getRowCount() - 1;
        this.editNV();
    }

    private void timKiemNV() {
        this.fillTableNV();
        this.clearFormNV();
        this.row = -1;
        updateStatusNV();
    }

    public boolean trungMaNV() {
        // lỗi trùng mã nv
        List<NhanVien> list = nvdao.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (txtMaNV.getText().equalsIgnoreCase(list.get(i).getMaNV())) {
                MsgBox.alert(this, "Mã Nhân viên đã tồn tại!");
                boder = BorderFactory.createLineBorder(Color.red);
                txtMaNV.setBorder(boder);
                txtMaNV.setText("");
                txtMaNV.requestFocus();
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtMaNV.setBorder(boder);
            }
        }
        return true;
    }

    // form nhân viên
    private boolean kiemTraFormNV() {
        // mã nhân viên
        if (txtMaNV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mã nhân viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtMaNV.setBorder(boder);
            txtMaNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMaNV.setBorder(boder);
        }

        // tên nhân viên
        if (txtTenNV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Tên nhân viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtTenNV.setBorder(boder);
            txtTenNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtTenNV.setBorder(boder);
        }

        // mật khẩu nhân viên
        if (txtMatKhauNV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mật khẩu nhân viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtMatKhauNV.setBorder(boder);
            txtMatKhauNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMatKhauNV.setBorder(boder);
        }

        // số diện thoại nv
        if (txtSdtNV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Số điện thoại nhân viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtSdtNV.setBorder(boder);
            txtSdtNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtSdtNV.setBorder(boder);
        }

        if (!txtSdtNV.getText().matches("0\\d{9}")) {
            MsgBox.alert(this, "Số điện thoại không hợp lệ !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtSdtNV.setBorder(boder);
            txtSdtNV.setText("");
            txtSdtNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtSdtNV.setBorder(boder);
        }

        // ngày sinh nv
        if (txtNgaySinhNV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Ngày sinh nhân viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtNgaySinhNV.setBorder(boder);
            txtNgaySinhNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);   
            txtNgaySinhNV.setBorder(boder);
        }

        if (!txtNgaySinhNV.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
            MsgBox.alert(this, "Ngày sinh không đúng định dạng (dd/MM/yyyy) !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtNgaySinhNV.setBorder(boder);
            txtNgaySinhNV.requestFocus();
            txtNgaySinhNV.setText("");
            txtNgaySinhNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtNgaySinhNV.setBorder(boder);
        }

        // email rỗng
        if (txtEmailNV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Email nhân viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtEmailNV.setBorder(boder);
            txtEmailNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtEmailNV.setBorder(boder);
        }

        if (!txtEmailNV.getText().matches("\\w+@fpt.edu.vn")) {
            MsgBox.alert(this, "Email nhân viên không đúng định dạng  !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtEmailNV.setBorder(boder);
            txtEmailNV.setText("");
            txtEmailNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtEmailNV.setBorder(boder);
        }

        // địa chỉ
        if (txtDiaChiNV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Địa chỉ nhân viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtDiaChiNV.setBorder(boder);
            txtDiaChiNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtDiaChiNV.setBorder(boder);
        }

        // mô tả nhân viên
        if (txtMoTaNV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mô tả nhân viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtMoTaNV.setBorder(boder);
            txtMoTaNV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMoTaNV.setBorder(boder);
        }

        if (lblAnhNV.getToolTipText() == null) {
            MsgBox.alert(this, "Chưa chọn ảnh !");
            return false;
        }
        return true;
    }

    /**
     ********** ĐIỂM ***********************************
     */
    private void fillTableDiem() {
        DefaultTableModel model = (DefaultTableModel) tblDSDiem.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtSearchDiem.getText();
            List<Diem> list = diemdao.selectByKeyWord(keyword);
            for (Diem d : list) {
                Object[] row = {
                    d.getIDDiem(),
                    d.getMaSV(),
                    d.getMaMH(),
                    d.getTenSV(),
                    d.getDiemThi(),
                    d.getDiemLyThuyet(),
                    d.getDiemThucHanh(),
                    d.getDiemTB()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    private void setFormDiem(Diem d) {
        txtMaSVDiem.setText(d.getMaSV());
        txtTenSVDiem.setText(d.getTenSV());
        txtIDDiem.setText(String.valueOf(d.getIDDiem()));
        txtDiemLT.setText(String.valueOf(d.getDiemLyThuyet()));
        txtDiemTH.setText(String.valueOf(d.getDiemThucHanh()));
        txtDiemThi.setText(String.valueOf(d.getDiemThi()));
        // cbobox mã mh
        int i = 0;
        while (true) {
            String cbomh = String.valueOf(cboMaMHDiem.getItemAt(i));
            if (cbomh.equalsIgnoreCase(d.getMaMH())) {
                cboMaMHDiem.setSelectedIndex(i);
                break;
            }
            i++;
        }

    }

    private Diem getFormDiem() {
        Diem d = new Diem();
        d.setMaSV(txtMaSVDiem.getText());
        d.setTenSV(txtTenSVDiem.getText());
        d.setMaMH(String.valueOf(cboMaMHDiem.getSelectedItem()));
        d.setDiemLyThuyet(Float.valueOf(txtDiemLT.getText()));
        d.setDiemThucHanh(Float.valueOf(txtDiemTH.getText()));
        d.setDiemThi(Float.valueOf(txtDiemThi.getText()));
        return d;
    }

    private Diem getFormDiem1() {
        Diem d = new Diem();
        d.setIDDiem(Integer.valueOf(txtIDDiem.getText()));
        d.setMaSV(txtMaSVDiem.getText());
        d.setTenSV(txtTenSVDiem.getText());
        d.setMaMH(String.valueOf(cboMaMHDiem.getSelectedItem()));
        d.setDiemLyThuyet(Float.valueOf(txtDiemLT.getText()));
        d.setDiemThucHanh(Float.valueOf(txtDiemTH.getText()));
        d.setDiemThi(Float.valueOf(txtDiemThi.getText()));
        return d;
    }

    void fillComboBoxMHDiem() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaMHDiem.getModel();
        model.removeAllElements();
        try {
            List<MonHoc> list = mhdao.selectAll();
            for (MonHoc lh : list) {
                model.addElement(lh);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }

    }

    private void updateStatusDiem() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblDSDiem.getRowCount() - 1);
        //Trạng thái form
        txtMaSVDiem.setEditable(!edit);
        txtTenSVDiem.setEditable(!edit);
        btnAddDiem.setEnabled(!edit);
        btnUpdateDiem.setEnabled(edit);
        btnDeleteSV.setEnabled(edit);
        //Trạng thái điều hướng
        btnFirstDiem.setEnabled(edit && !first);
        btnPrevDiem.setEnabled(edit && !first);
        btnNextDiem.setEnabled(edit && !last);
        btnLastDiem.setEnabled(edit && !last);
    }

    private void editDiem() {
        Integer id = (Integer) tblDSDiem.getValueAt(this.row, 0);
        Diem d = diemdao.selectById(id);
        this.setFormDiem(d);
        updateStatusDiem();
    }

    private void clearFormDiem() {
        txtMaSVDiem.setText("");
        txtIDDiem.setText("");
        txtDiemLT.setText("0");
        txtDiemTH.setText("0");
        txtDiemThi.setText("0");
        txtTenSVDiem.setText("");
        this.row = -1;
        this.updateStatusDiem();
    }

    private void insertDiem() {
        Diem d = getFormDiem();
        try {
            diemdao.insert(d);
            this.fillTableDiem();
            this.clearFormDiem();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
            e.printStackTrace();
            System.out.println(e);
        }
    }

    private void updateDiem() {
        Diem d = getFormDiem1();
        try {
            diemdao.update(d);
            this.fillTableDiem();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
    }

    private void deleteDiem() {
        Integer id = Integer.valueOf(txtIDDiem.getText());
        try {
            diemdao.delete(id);
            this.fillTableDiem();//Tải dữ liệu lên bảng
            this.clearFormDiem();//Làm sạch form
            MsgBox.alert(this, "Xóa thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Xóa thất bại!");
            e.printStackTrace();
        }
    }

    private void firstDiem() {
        this.row = 0;
        this.editDiem();
        tblLopHoc.setRowSelectionInterval(row, row);
    }

    private void prevDiem() {
        if (this.row > 0) {
            this.row--;
            this.editDiem();
            tblLopHoc.setRowSelectionInterval(row, row);
        }
    }

    private void nextDiem() {
        if (this.row < tblDSDiem.getRowCount() - 1) {
            this.row++;
            this.editDiem();
            tblLopHoc.setRowSelectionInterval(row, row);
        }
    }

    private void lastDiem() {
        this.row = tblDSDiem.getRowCount() - 1;
        this.editDiem();
        tblLopHoc.setRowSelectionInterval(row, row);
    }

    private void timKiemDiem() {
        this.fillTableDiem();
        this.clearFormDiem();
        this.row = -1;
        updateStatusDiem();
    }

    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public void printDiem() {
        try {
            JFileChooser jflieChooser = new JFileChooser();
            jflieChooser.showOpenDialog(this);
            File saveFile = jflieChooser.getSelectedFile();
            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + " .xlsx");
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Điểm sinh viên");
                XSSFRow row = null;
                Cell cell = null;

                Font fontTitle = sheet.getWorkbook().createFont();
                fontTitle.setFontName("Calibri");
                fontTitle.setBold(true);
                fontTitle.setFontHeightInPoints((short) 12);
                CellStyle titleStyle = sheet.getWorkbook().createCellStyle();
                titleStyle.setBorderTop(BorderStyle.THIN);
                titleStyle.setBorderBottom(BorderStyle.THIN);
                titleStyle.setBorderRight(BorderStyle.THIN);
                titleStyle.setFont(fontTitle);

                Font fontTitleTieuDe = sheet.getWorkbook().createFont();
                fontTitleTieuDe.setFontName("Calibri");
                fontTitleTieuDe.setBold(true);
                fontTitleTieuDe.setFontHeightInPoints((short) 14);
                CellStyle titleStyleTieuDe = sheet.getWorkbook().createCellStyle();
                titleStyleTieuDe.setFont(fontTitleTieuDe);

                Font fontRow = sheet.getWorkbook().createFont();
                fontRow.setFontName("Calibri");
                fontRow.setFontHeightInPoints((short) 13);
                CellStyle rowStyle = sheet.getWorkbook().createCellStyle();
                rowStyle.setBorderTop(BorderStyle.THIN);
                rowStyle.setBorderBottom(BorderStyle.THIN);
                rowStyle.setBorderRight(BorderStyle.THIN);
                rowStyle.setBorderLeft(BorderStyle.THIN);
                rowStyle.setFont(fontRow);

                row = sheet.createRow(1);
                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("DANH SÁCH ĐIỂM SINH VIÊN");
                cell.setCellStyle(titleStyleTieuDe);

                row = sheet.createRow(3);
                cell = row.createCell(0, CellType.NUMERIC);
                cell.setCellValue("STT");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue("Mã sinh viên");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("Tên sinh viên");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue("Mã môn học");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue("Điểm thực hành ");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue("Điểm lý thuyết");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue("Điểm thi");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(7, CellType.STRING);
                cell.setCellValue("Điểm TB");
                cell.setCellStyle(titleStyle);

                for (int i = 0; i < tblDSDiem.getRowCount(); i++) {
                    String masv = (String) tblDSDiem.getValueAt(i, 1);
                    String tensv = (String) tblDSDiem.getValueAt(i, 2);
                    String mamh = (String) tblDSDiem.getValueAt(i, 3);
                    float diemth = (Float) tblDSDiem.getValueAt(i, 4);
                    float diemlt = (Float) tblDSDiem.getValueAt(i, 5);
                    float diemt = (Float) tblDSDiem.getValueAt(i, 6);
                    float diemtb = (Float) tblDSDiem.getValueAt(i, 7);

                    row = sheet.createRow(4 + i);

                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(masv);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(tensv);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(mamh);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(diemth);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(diemlt);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(6, CellType.STRING);
                    cell.setCellValue(diemt);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(7, CellType.STRING);
                    cell.setCellValue(diemtb);
                    cell.setCellStyle(rowStyle);

                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                workbook.write(out);
                workbook.close();
                out.close();
                MsgBox.alert(this, "Mở File !");
                openFile(saveFile.toString());
            } else {
                MsgBox.alert(this, "Lỗi !");
                return;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public boolean trungMaDiem() {
        List<Diem> list = diemdao.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (txtMaSV.getText().equalsIgnoreCase(list.get(i).getMaSV())) {
                MsgBox.alert(this, "Mã Sinh viên đã tồn tại!");
                txtMaSV.requestFocus();
                txtMaSV.setText("");
                txtMaSV.requestFocus();
                boder = BorderFactory.createLineBorder(Color.red);
                txtMaSV.setBorder(boder);
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtMaSV.setBorder(boder);
            }
        }
        return true;
    }

    boolean checkDiem() {
        // check mã sv
        if (txtMaSVDiem.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mã sinh viên không bỏ rỗng ! ");
            boder = BorderFactory.createLineBorder(Color.red);
            txtMaSVDiem.setBorder(boder);
            txtMaSVDiem.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMaSVDiem.setBorder(boder);
        }

        try {
            SinhVien sv = svdao.selectById(txtMaSVDiem.getText());
            if (sv == null) {
                MsgBox.alert(this, "Mã sinh viên này không tồn tại !");
                txtMaSVDiem.setText("");
                boder = BorderFactory.createLineBorder(Color.red);
                txtMaSVDiem.setBorder(boder);
                txtMaSVDiem.requestFocus();
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtMaSVDiem.setBorder(boder);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi");
        }

        // tên sv
        if (txtTenSVDiem.getText().trim().length() == 0) {
            MsgBox.alert(this, "Tên sinh viên không bỏ rỗng ! ");
            boder = BorderFactory.createLineBorder(Color.red);
            txtTenSVDiem.setBorder(boder);
            txtTenSVDiem.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtTenSVDiem.setBorder(boder);
        }

        // điểm thi
        if (txtDiemThi.getText().trim().length() == 0) {
            MsgBox.alert(this, "Điểm thi không bỏ rỗng ! ");
            boder = BorderFactory.createLineBorder(Color.red);
            txtDiemThi.setBorder(boder);
            txtDiemThi.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtDiemThi.setBorder(boder);
        }

        float diemthi = Float.parseFloat(txtDiemThi.getText());
        try {
            if (diemthi < 0 && diemthi > 10) {
                MsgBox.alert(this, "Điểm phải lớn hơn 0 và nhỏ hơn 10 !");
                txtDiemThi.setText("");
                txtDiemThi.requestFocus();
                boder = BorderFactory.createLineBorder(Color.red);
                txtDiemThi.setBorder(boder);
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtDiemThi.setBorder(boder);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Gía trị nhập vào phải là số !");
            txtDiemThi.setText("");
            txtDiemThi.requestFocus();
            return false;
        }

        // điểm lý thuyết
        if (txtDiemLT.getText().trim().length() == 0) {
            MsgBox.alert(this, "Điểm lý thuyết không bỏ rỗng ! ");
            boder = BorderFactory.createLineBorder(Color.red);
            txtDiemLT.setBorder(boder);
            txtDiemLT.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtDiemLT.setBorder(boder);
        }

        float diemlt = Float.parseFloat(txtDiemLT.getText());
        try {
            if (diemlt < 0 && diemlt > 10) {
                MsgBox.alert(this, "Điểm phải lớn hơn 0 và nhỏ hơn 10 !");
                txtDiemLT.setText("");
                txtDiemLT.requestFocus();
                boder = BorderFactory.createLineBorder(Color.red);
                txtDiemLT.setBorder(boder);
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtDiemLT.setBorder(boder);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Gía trị nhập vào phải là số !");
            txtDiemLT.setText("");
            txtDiemLT.requestFocus();
            return false;
        }

        // điểm thực hành
        if (txtDiemTH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Điểm thực hành không bỏ rỗng ! ");
            boder = BorderFactory.createLineBorder(Color.red);
            txtDiemTH.setBorder(boder);
            txtDiemTH.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtDiemTH.setBorder(boder);
        }

        float diemth = Float.parseFloat(txtDiemTH.getText());
        try {
            if (diemth < 0 && diemth > 10) {
                MsgBox.alert(this, "Điểm phải lớn hơn 0 và nhỏ hơn 10 !");
                txtDiemTH.setText("");
                txtDiemTH.requestFocus();
                boder = BorderFactory.createLineBorder(Color.red);
                txtDiemTH.setBorder(boder);
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtDiemTH.setBorder(boder);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Gía trị nhập vào phải là số !");
            txtDiemTH.setText("");
            txtDiemTH.requestFocus();
            return false;
        }
        return true;
    }

    /**
     *********** LỚP HỌC **************************
     */
    void fillTableLop() {
        DefaultTableModel model = (DefaultTableModel) tblLopHoc.getModel();//noi chua du lieu 
        model.setRowCount(0);//xoa tat ca cac hang tren table
        try {
            String key = txtSearchLopHoc.getText();
            List<LopHoc> list = lopdao.selecbyKeyword(key);//đọc dữ liệu từ CSDL
            for (LopHoc lop : list) {
                Object[] row = {
                    lop.getMaLop(),
                    lop.getTenLop(),
                    lop.getSoLuongSV(),
                    lop.getMaNV(),
                    lop.getMaMH(),};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    // đỗ dữ liệu vào combobox môn học của lớp
    private void fillComboBoxMHLop() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaMonHoc.getModel();
        model.removeAllElements();
        try {
            List<MonHoc> list = mhdao.selectAll();
            for (MonHoc mh : list) {
                model.addElement(mh);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    // đỗ dữ liệu vào combobox mã nhân viên của lớp
    private void fillComboBoxNVLop() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaNhanVien.getModel();
        model.removeAllElements();
        try {
            List<NhanVien> list = nvdao.selectAll();
            for (NhanVien nv : list) {
                model.addElement(nv);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    //hiển thị lớp học lên form
    void setFormLop(LopHoc lop) {
        txtMaLH.setText(lop.getMaLop());
        txtTenLH.setText(lop.getTenLop());
        txtSLSV.setText(String.valueOf(lop.getSoLuongSV()));
        // cbobox mã môn học của lớp
        int i = 0;
        while (true) {
            String cbomh = String.valueOf(cboMaMonHoc.getItemAt(i));
            if (cbomh.equalsIgnoreCase(lop.getMaMH())) {
                cboMaMonHoc.setSelectedIndex(i);
                break;
            }
            i++;
        }
        // cbobox nhân viên của lớp
        int ii = 0;
        while (true) {
            String cbonv = String.valueOf(cboMaNhanVien.getItemAt(ii));
            if (cbonv.equalsIgnoreCase(lop.getMaNV())) {
                cboMaNhanVien.setSelectedIndex(ii);
                break;
            }
            ii++;
        }
    }

    //lấy thông tin của một lớp học có sẵn hiện lên form 
    LopHoc getFormLop() {
        LopHoc lop = new LopHoc();
        lop.setMaLop(txtMaLH.getText());
        lop.setTenLop(txtTenLH.getText());
        lop.setSoLuongSV(Integer.parseInt(txtSLSV.getText()));
        lop.setMaNV(String.valueOf(cboMaNhanVien.getSelectedItem()));
        lop.setMaMH(String.valueOf(cboMaMonHoc.getSelectedItem()));
        return lop;
    }

    //them moi du lieu - btnThem
    void insertLop() {
        LopHoc lop = getFormLop();
        try {
            lopdao.insert(lop);
            this.clearFormLop();
            this.fillTableLop();
            MsgBox.alert(this, "Thêm mới lớp học thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới lớp học thất bại!");
        }
    }

    //xoa lop hoc - btnXoa
    void deleteLop() {
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa lớp học này?")) {
            String manh = txtMaLH.getText();
            try {
                lopdao.delete(manh);
                this.fillTableLop();
                this.clearFormLop();
                MsgBox.alert(this, "Xóa lớp học thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa lớp học thất bại!");
            }
        }
    }

    //cap nhat lai lop hoc - btnEdit
    void updateLop() {
        LopHoc lop = getFormLop();
        try {
            lopdao.update(lop);
            this.clearFormLop();
            this.fillTableLop();
            MsgBox.alert(this, "Cập nhật lớp học thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Cập nhật lớp học thất bại!");
        }
    }

    void clearFormLop() {
        txtMaLH.setText("");
        txtTenLH.setText("");
        txtSLSV.setText("");
        this.row = -1;//xoa form
        this.updateStatusLop();//cap nhat lai cac nut trang thai
    }

    //table class double click
    void editLop() {
        String malop = (String) tblLopHoc.getValueAt(this.row, 0);
        LopHoc lop = lopdao.selectById(malop);
        this.setFormLop(lop);
        this.updateStatusLop();
    }

    void firstLop() {
        this.row = 0;
        this.editLop();
        tblLopHoc.setRowSelectionInterval(row, row);
    }

    void previousLop() {
        this.row--;
        this.editLop();
        tblLopHoc.setRowSelectionInterval(row, row);
    }

    void nextLop() {
        this.row++;
        this.editLop();
        tblLopHoc.setRowSelectionInterval(row, row);
    }

    void lastLop() {
        row = tblLopHoc.getRowCount() - 1;
        this.editLop();
        tblLopHoc.setRowSelectionInterval(row, row);
    }

    //trạng thái lớp học
    void updateStatusLop() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblLopHoc.getRowCount() - 1);
        // trạng thái form 
        txtMaLH.setEditable(!edit);
        btnAddLopHoc.setEnabled(!edit);
        btnEditLopHoc.setEnabled(edit);
        btnDeleteLopHoc.setEnabled(edit);
        //trạng thái điều hướng
        btnFirstLopHoc.setEnabled(edit && !first);
        btnPreviousLopHoc.setEnabled(edit && !first);
        btnNextLopHoc.setEnabled(edit && !last);
        btnLastLopHoc.setEnabled(edit && !last);
    }

    void timKiemLop() {
        this.fillTableLop();
        this.clearFormLop();
        this.row = -1;
        this.updateStatusLop();
    }

    // kiểm tra trùng mã lớp
    public boolean trungMaLop() {
        List<LopHoc> list = lopdao.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (txtMaLH.getText().equalsIgnoreCase(list.get(i).getMaLop())) {
                MsgBox.alert(this, "Mã khóa học đã tồn tại!");
                txtMaLH.requestFocus();
                txtMaLH.setText("");
                txtMaLH.requestFocus();
                boder = BorderFactory.createLineBorder(Color.red);
                txtMaLH.setBorder(boder);
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtMaLH.setBorder(boder);
            }
        }
        return true;
    }

    public boolean checkFormLop() {
        // mã lớp
        if (txtMaLH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mã lớp không bỏ rỗng! ");
            boder = BorderFactory.createLineBorder(Color.red);
            txtMaLH.setBorder(boder);
            txtMaLH.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMaLH.setBorder(boder);
        }

        // tên lớp
        if (txtTenLH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Tên lớp không bỏ rỗng! ");
            boder = BorderFactory.createLineBorder(Color.red);
            txtTenLH.setBorder(boder);
            txtTenLH.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtTenLH.setBorder(boder);
        }

        // số lượng sinh viên
        if (txtSLSV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Số lượng sinh viên không bỏ rỗng! ");
            boder = BorderFactory.createLineBorder(Color.red);
            txtSLSV.setBorder(boder);
            txtSLSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtSLSV.setBorder(boder);
        }

        int slsv = Integer.parseInt(txtSLSV.getText());
        try {
            if (slsv < 0) {
                MsgBox.alert(this, "Số lượng sinh viên phải lớn hơn 0");
                boder = BorderFactory.createLineBorder(Color.red);
                txtSLSV.setBorder(boder);
                txtSLSV.setText("");
                txtSLSV.requestFocus();
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtSLSV.setBorder(boder);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Gía trị nhập vào phải là số !");
            boder = BorderFactory.createLineBorder(Color.white);
            txtSLSV.setBorder(boder);
            txtSLSV.setText("");
            txtSLSV.requestFocus();
            return false;
        }
        return true;

    }

    /**
     *********** SINH VIÊN *************
     */
    private void fillTableSinhVien() {
        DefaultTableModel model = (DefaultTableModel) tblSinhVien.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtSearchSV.getText();
            List<SinhVien> list = svdao.selectByKeyword(keyword);
            for (SinhVien sv : list) {
                Object[] row = {
                    sv.getMaSV(),
                    sv.getTenSV(),
                    sv.isGioiTinh() ? "Nam" : "Nữ",
                    sv.getMaLop()
                };
                model.addRow(row);
            }

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    // hiện dữ liệu lên form sinh viên
    private void setFormSV(SinhVien sv) {
        txtMaSV.setText(sv.getMaSV());
        txtTenSV.setText(sv.getTenSV());
        txtNgaySinhSV.setText(XDate.toString(sv.getNgaySinh(), "dd/MM/yyyy"));
        rdoNamSV.setSelected(sv.isGioiTinh());
        rdoNuSV.setSelected(!sv.isGioiTinh());
        txtDiachiSV.setText(sv.getDiaChi());
        txtEmailSV.setText(sv.getEmail());
        txtSDTSV.setText(sv.getSDT());
        if (sv.getHinh() != null) {
            lblHinhSV.setToolTipText(sv.getHinh());
            lblHinhSV.setIcon(XImage.read(sv.getHinh()));
        }
        txtMoTaSV.setText(sv.getMoTa());
        txtMatKhauSV.setText(sv.getMatKhauSV());
        // cbobox mã lớp của sinh viên
        int i = 0;
        while (true) {
            String cbolop = String.valueOf(cboMaLopSV.getItemAt(i));
            if (cbolop.equalsIgnoreCase(sv.getMaLop())) {
                cboMaLopSV.setSelectedIndex(i);
                break;
            }
            i++;
        }
    }

    // lấy dữ liệu trên form
    private SinhVien getFormSV() {
        SinhVien sv = new SinhVien();
        sv.setMaSV(txtMaSV.getText());
        sv.setTenSV(txtTenSV.getText());
        sv.setNgaySinh(XDate.toDate(txtNgaySinhSV.getText(), "dd/MM/yyyy"));
        sv.setGioiTinh(rdoNamSV.isSelected());
        sv.setDiaChi(txtDiachiSV.getText());
        sv.setEmail(txtEmailSV.getText());
        sv.setSDT(txtSDTSV.getText());
        sv.setHinh(lblHinhSV.getToolTipText());
        sv.setMoTa(txtMoTaSV.getText());
        sv.setMaLop(cboMaLopSV.getSelectedItem().toString());
        sv.setMatKhauSV(txtMatKhauSV.getText());
        return sv;
    }

    private void chonhinhSV() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            XImage.save(file);
            ImageIcon icon = XImage.read(file.getName());
            lblHinhSV.setIcon(icon);
            lblHinhSV.setToolTipText(file.getName());
        }
    }

    private void clearFormSV() {
        lblHinhSV.setIcon(XImage.read("nen.png"));
        txtMaSV.setText("");
        txtTenSV.setText("");
        txtMatKhauSV.setText("");
        txtNgaySinhSV.setText("01/01/1999");
        txtSDTSV.setText("");
        rdoNamSV.setSelected(true);
        txtEmailSV.setText("");
        txtDiachiSV.setText("");
        txtMoTaSV.setText("");
        this.row = -1;
        this.updateStatusSV();
    }

    private void insertSV() {
        SinhVien sv = this.getFormSV();
        try {
            svdao.insert(sv);
            this.fillTableSinhVien();
            this.clearFormSV();
            MsgBox.alert(this, "Thêm mới sinh viên thành công ");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới sinh viên thất bại");
            e.printStackTrace();
        }

    }

    private void updateSV() {
        SinhVien sv = this.getFormSV();
        try {
            svdao.update(sv);
            this.fillTableSinhVien();
            this.clearFormSV();
            MsgBox.alert(this, "Cập nhật sinh viên thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật sinh viên thất bại!");
            e.printStackTrace();
        }
    }

    private void deleteSV() {
        String maSV = txtMaSV.getText();
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa sinh viên này?")) {
            try {
                svdao.delete(maSV);
                this.fillTableSinhVien();
                this.clearFormSV();
                MsgBox.alert(this, "Xóa sinh viên thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa sinh viên thất bại!");
                e.printStackTrace();
            }
        }
    }

    private void editSV() {
        String maSV = (String) tblSinhVien.getValueAt(this.row, 0);
        SinhVien sv = svdao.selectById(maSV);
        this.setFormSV(sv);
        tabsSV.setSelectedIndex(0);
        this.updateStatusSV();
    }

    private void firstSV() {
        this.row = 0;
        this.editSV();

    }

    private void prevSV() {
        if (this.row > 0) {
            this.row--;
            this.editSV();

        }
    }

    private void nextSV() {
        if (this.row < tblSinhVien.getRowCount() - 1) {
            this.row++;
            this.editSV();

        }
    }

    private void lastSV() {
        this.row = tblSinhVien.getRowCount() - 1;
        this.editSV();

    }

    private void TimKiemSV() {
        this.fillTableSinhVien();
        this.clearFormSV();
        this.row = -1;
        updateStatusSV();
    }

    private void updateStatusSV() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblSinhVien.getRowCount() - 1);
        // trạng thái form
        txtMaSV.setEditable(!edit);
        btnAddSV.setEnabled(!edit);
        btnEditSV.setEnabled(edit);
        btnDeleteSV.setEnabled(edit);
        // trạng thái điều hướng
        btnFirstSV.setEnabled(edit && !first);
        btnPrevSV.setEnabled(edit && !first);
        btnNextSV.setEnabled(edit && !last);
        btnLastSV.setEnabled(edit && !last);
    }

    // đỗ dữ liệu vào combobox lớp học của sinh viên
    private void fillComboBoxLop() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaLopSV.getModel();
        model.removeAllElements();
        try {
            List<LopHoc> list = lopdao.selectAll();
            for (LopHoc lh : list) {
                model.addElement(lh);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void chonMaLop() {
        this.fillTableSinhVien();
        this.row = -1;
        this.updateStatusSV();
        tabsSV.setSelectedIndex(1);
    }

    public boolean trungMaSV() {
        List<SinhVien> list = svdao.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (txtMaSV.getText().equalsIgnoreCase(list.get(i).getMaSV())) {
                MsgBox.alert(this, "Mã Sinh viên đã tồn tại!");
                txtMaSV.requestFocus();
                txtMaSV.setText("");
                txtMaSV.requestFocus();
                boder = BorderFactory.createLineBorder(Color.red);
                txtMaSV.setBorder(boder);
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtMaSV.setBorder(boder);
            }
        }
        return true;
    }

    private boolean kiemTraFormSV() {
        // mã sinh viên
        if (txtMaSV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mã sinh viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtMaSV.setBorder(boder);
            txtMaSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMaSV.setBorder(boder);
        }

        // tên sinh viên
        if (txtTenSV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Tên sinh viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtTenSV.setBorder(boder);
            txtTenSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtTenSV.setBorder(boder);
        }

        // mật khẩu sinh viên
        if (txtMatKhauSV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mật khẩu sinh viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtMatKhauSV.setBorder(boder);
            txtMatKhauSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMatKhauSV.setBorder(boder);
        }

        // số diện thoại sinh viên
        if (txtSDTSV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Số điện thoại sinh viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtSDTSV.setBorder(boder);
            txtSDTSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtSDTSV.setBorder(boder);
        }

        if (!txtSDTSV.getText().matches("0\\d{9}")) {
            MsgBox.alert(this, "Số điện thoại không hợp lệ !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtSDTSV.setBorder(boder);
            txtSDTSV.setText("");
            txtSDTSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtSDTSV.setBorder(boder);
        }

        // ngày sinh sinh viên
        if (txtNgaySinhSV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Ngày sinh sinh viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtNgaySinhSV.setBorder(boder);
            txtNgaySinhSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtNgaySinhSV.setBorder(boder);
        }

        if (!txtNgaySinhSV.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
            MsgBox.alert(this, "Ngày sinh không đúng định dạng (dd/MM/yyyy) !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtNgaySinhSV.setBorder(boder);
            txtNgaySinhSV.requestFocus();
            txtNgaySinhSV.setText("");
            txtNgaySinhSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtNgaySinhSV.setBorder(boder);
        }

        // email rỗng
        if (txtEmailSV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Email sinh viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtEmailSV.setBorder(boder);
            txtEmailSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtEmailSV.setBorder(boder);
        }

        if (!txtEmailSV.getText().matches("\\w+@fpt.edu.vn")) {
            MsgBox.alert(this, "Email sinh viên không đúng định dạng !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtEmailSV.setBorder(boder);
            txtEmailSV.setText("");
            txtEmailSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtEmailSV.setBorder(boder);
        }

        // địa chỉ
        if (txtDiachiSV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Địa chỉ sinh viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtDiachiSV.setBorder(boder);
            txtDiachiSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtDiachiSV.setBorder(boder);
        }

        // mô tả nhân viên
        if (txtMoTaSV.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mô tả sinh viên không rỗng!");
            boder = BorderFactory.createLineBorder(Color.red);
            txtMoTaSV.setBorder(boder);
            txtMoTaSV.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMoTaSV.setBorder(boder);
        }

        if (lblHinhSV.getToolTipText() == null) {
            MsgBox.alert(this, "Chưa chọn ảnh !");
            return false;
        }

        return true;
    }

    /**
     *********** MÔN HỌC *************
     */
    // đổ dữ liệu vào bảng môn học
    public void fillTableMonHoc() {
        DefaultTableModel model = (DefaultTableModel) tblMonHoc.getModel();
        model.setRowCount(0);
        try {
            KhoaHoc khoahoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
            //  String key = txtSearchMH.getText();
            List<MonHoc> list = mhdao.selectByKhoaHoc(khoahoc.getMaKH());
            for (MonHoc mh : list) {
                Object[] rows = {mh.getMaMH(), mh.getTenMH(),
                    XDate.toString(mh.getNgayBD(), "dd/MM/yyyy"),
                    XDate.toString(mh.getNgayKT(), "dd/MM/yyyy")
                };
                model.addRow(rows);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !");
            throw new RuntimeException();
        }
    }

    // đổ dữ liệu vào combobox Khóa học
    public void fillComboboxKhoaHoc() {
        // this.updateKH();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhoaHoc.getModel();
        model.removeAllElements();
        List<KhoaHoc> list = khdao.selectAll();
        for (KhoaHoc khoaHoc : list) {
            model.addElement(khoaHoc);
        }

    }

    // chọn khóa học
    public void chonKhoaHoc() {
        KhoaHoc kh = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        txtMaKHMH.setText(kh.getMaKH());
        this.fillTableMonHoc();
        this.row = -1;
        this.updateStatusMH();

    }

    // thêm môn học
    public void insertMH() {
        MonHoc mh = getFormMH();
        try {
            mhdao.insert(mh);
            this.fillTableMonHoc();
            this.clearFormMH();
            MsgBox.alert(this, "Thêm mới thành công !");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Thêm mới thất bại !");
        }
    }

    // cập nhật môn học
    public void updateMH() {
        MonHoc mh = getFormMH();
        try {
            mhdao.update(mh);
            this.fillTableMonHoc();
            this.clearFormMH();
            MsgBox.alert(this, "Cập nhật thành công !");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Cập nhật thành công !");
        }
    }

    public void deleteMH() {
        String mamh = txtMaMH.getText();
        if (txtMaMH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Nhập mã môn học cần xóa !");
            txtMaMH.requestFocus();
        } else {
            try {
                mhdao.delete(mamh);
                this.fillTableMonHoc();
                this.clearFormMH();
                MsgBox.alert(this, "Xóa thành công !");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.alert(this, "Xóa thất bại !");
            }
        }
    }

    public void firstMH() {
        this.row = 0;
        this.editMH();
        tblMonHoc.setRowSelectionInterval(row, row);
    }

    public void prevMH() {
        if (this.row > 0) {
            this.row--;
            this.editMH();
            tblMonHoc.setRowSelectionInterval(row, row);
        }
    }

    public void nextMH() {
        if (this.row < tblMonHoc.getRowCount() - 1) {
            this.row++;
            this.editMH();
            tblMonHoc.setRowSelectionInterval(row, row);
        }
    }

    public void lastMH() {
        this.row = tblMonHoc.getRowCount() - 1;
        this.editMH();
        tblMonHoc.setRowSelectionInterval(row, row);
    }

    // xóa trắng
    public void clearFormMH() {
        MonHoc mh = new MonHoc();
        this.setFormMH(mh);
        this.row = -1;
        this.updateStatusMH();
    }

    // hàm hiện lên form
    public void setFormMH(MonHoc mh) {
        txtMaMH.setText(mh.getMaMH());
        txtTenMH.setText(mh.getTenMH());
        txtNgayBĐ.setText(XDate.toString(mh.getNgayBD(), "dd/MM/yyyy"));
        txtNgayKT.setText(XDate.toString(mh.getNgayKT(), "dd/MM/yyyy"));
        txtMoTaMH.setText(mh.getMoTa());
    }

    // Lấy dữ liệu từ form
    MonHoc getFormMH() {
        MonHoc mh = new MonHoc();
        mh.setMaMH(txtMaMH.getText());
        mh.setTenMH(txtTenMH.getText());
        mh.setNgayBD(XDate.toDate(txtNgayBĐ.getText(), "dd/MM/yyyy"));
        mh.setNgayKT(XDate.toDate(txtNgayKT.getText(), "dd/MM/yyyy"));
        mh.setMoTa(txtMoTaMH.getText());
        mh.setMaKH(txtMaKHMH.getText());
        return mh;
    }

    // hàm click
    public void editMH() {
        String mamh = (String) tblMonHoc.getValueAt(this.row, 0);
        MonHoc mh = mhdao.selectById(mamh);
        this.setFormMH(mh);
        this.updateStatusMH();
    }

    // cập nhật trạng thái
    public void updateStatusMH() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblMonHoc.getRowCount() - 1);
        // trạng thái form
        txtMaMH.setEditable(!edit);
        btnAddMH.setEnabled(!edit);
        btnEditMH.setEnabled(edit);
        btnDeleteMH.setEnabled(edit);
        // trạng thái điều hướng
        btnFirstMH.setEnabled(edit && !first);
        btnPrevMH.setEnabled(edit && !first);
        btnNextMH.setEnabled(edit && !last);
        btnLastMH.setEnabled(edit && !last);
    }

    public void timKiemMH() {
        this.clearFormMH();
        this.row = -1;
        this.updateStatusMH();
    }

    public boolean trungMaMH() {
        List<MonHoc> list = mhdao.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (txtMaMH.getText().equalsIgnoreCase(list.get(i).getMaMH())) {
                MsgBox.alert(this, "Mã môn học đã tồn tại !");
                txtMaMH.setText("");
                txtMaMH.requestFocus();
                boder = BorderFactory.createLineBorder(Color.red);
                txtMaMH.setBorder(boder);
                return false;
            } else {
                boder = BorderFactory.createLineBorder(Color.white);
                txtMaMH.setBorder(boder);
            }
        }
        return true;
    }

    public boolean checkFormMH() {
        // mã mh
        if (txtMaMH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mã môn học không rỗng !");
            txtMaMH.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtMaMH.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMaMH.setBorder(boder);
        }

        // tên mh
        if (txtTenMH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Tên môn học không rỗng !");
            txtTenMH.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtTenMH.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtTenMH.setBorder(boder);
        }

        // ngày bđ
        if (txtNgayBĐ.getText().trim().length() == 0) {
            MsgBox.alert(this, "Ngày bắt đầu không rỗng !");
            txtNgayBĐ.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtNgayBĐ.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtNgayBĐ.setBorder(boder);
        }

        if (!txtNgayBĐ.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
            MsgBox.alert(this, "Ngày bắt đầu không đúng định dạng (dd/MM/yyyy) !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtNgayBĐ.setBorder(boder);
            txtNgayBĐ.requestFocus();
            txtNgayBĐ.setText("");
            txtNgayBĐ.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtNgayBĐ.setBorder(boder);
        }

        // ngày kt
        if (txtNgayKT.getText().trim().length() == 0) {
            MsgBox.alert(this, "Ngày kết thúc không rỗng !");
            txtNgayKT.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtNgayKT.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtNgayKT.setBorder(boder);
        }

        if (!txtNgayKT.getText().matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) {
            MsgBox.alert(this, "Ngày kết thúc không đúng định dạng (dd/MM/yyyy) !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtNgayKT.setBorder(boder);
            txtNgayKT.requestFocus();
            txtNgayKT.setText("");
            txtNgayKT.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtNgayKT.setBorder(boder);
        }

        // mô tả mh
        if (txtMoTaMH.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mô tả không rỗng !");
            txtMoTaMH.requestFocus();
            boder = BorderFactory.createLineBorder(Color.red);
            txtMoTaMH.setBorder(boder);
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMoTaMH.setBorder(boder);
        }
        return true;
    }

    /**
     *********** ĐĂNG KÝ THI LẠI *************
     */
    void fillTableDangKy() {
        DefaultTableModel model = (DefaultTableModel) tblDangKyThiLai.getModel();//noi chua du lieu 
        model.setRowCount(0);//xoa tat ca cac hang tren table
        try {
            List<DangKyThiLai> list = dkdao.selectAll();//đọc dữ liệu từ CSDL
            for (DangKyThiLai dk : list) {
                Object[] row = {
                    dk.getID(),
                    dk.getMaSV(),
                    dk.getHoTen(),
                    dk.getMaMH(),
                    dk.getSoTien(),
                    XDate.toString(dk.getNgayDK(), "dd/MM/yyyy")
                };
                model.addRow(row);//thêm 1 hàng vào table
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu đăng ký !");
            e.printStackTrace();
        }
    }

    //hiển thị lên form
    void setFormDangKy(DangKyThiLai dk) {
        txtIDDKTL.setText(String.valueOf(dk.getID()));
        txtMaSVDKTL.setText(dk.getMaSV());
        txtHoTenSinhVienDK.setText(dk.getHoTen());
        cboMaMHDK.setSelectedItem(dk.getMaMH());
        txtHocPhiDangKy.setText(String.valueOf(dk.getSoTien()));
        txtNgayDangKy.setText(XDate.toString(dk.getNgayDK(), "dd/MM/yyyy"));

    }

    //lấy thông tin  có sẵn hiện lên form 
    DangKyThiLai getFormDKTL() {
        DangKyThiLai dk = new DangKyThiLai();
        dk.setMaSV(txtMaSVDKTL.getText());
        dk.setHoTen(txtHoTenSinhVienDK.getText());
        dk.setMaMH(String.valueOf(cboMaMHDK.getSelectedItem()));
        dk.setSoTien(Float.parseFloat(txtHocPhiDangKy.getText()));
        dk.setNgayDK(XDate.toDate(txtNgayDangKy.getText(), "dd/MM/yyyy"));
        return dk;
    }

    DangKyThiLai getFormDKTL2() {
        DangKyThiLai dk = new DangKyThiLai();
        dk.setID(Integer.parseInt(txtIDDKTL.getText()));
        dk.setMaSV(txtMaSVDKTL.getText());
        dk.setHoTen(txtHoTenSinhVienDK.getText());
        dk.setMaMH(String.valueOf(cboMaMHDK.getSelectedItem()));
        dk.setSoTien(Float.parseFloat(txtHocPhiDangKy.getText()));
        dk.setNgayDK(XDate.toDate(txtNgayDangKy.getText(), "dd/MM/yyyy"));
        return dk;
    }

    //them moi du lieu - btnThem
    void insertDKTL() {
        DangKyThiLai dk = getFormDKTL();
        try {
            dkdao.insert(dk);
            this.fillTableDangKy();
            this.clearFormDKTL();
            MsgBox.alert(this, "Thêm phiếu đăng ký thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm phiếu đăng ký thất bại!");
            e.printStackTrace();
        }
    }

    //xoa phieu dang ky - btnXoa
    void deleteDKTL() {
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa phiếu đăng ký này?")) {
            String id = txtIDDKTL.getText();
            try {
                dkdao.delete(id);
                this.fillTableDangKy();
                this.clearFormDKTL();
                MsgBox.alert(this, "Xóa phiếu đăng ký thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa phiếu đăng ký thất bại!");
            }
        }
    }

    //cap nhat lai phieu dang ky - btnEdit
    void updateDKTL() {
        DangKyThiLai dk = getFormDKTL2();
        try {
            dkdao.update(dk);
            this.clearFormDKTL();
            this.fillTableDangKy();
            MsgBox.alert(this, "Cập nhật phiếu đăng ký thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Cập nhật phiếu đăng ký thất bại!");
        }
    }

    void clearFormDKTL() {
        DangKyThiLai dk = new DangKyThiLai();//tao phieu dnag ky  moi
        this.setFormDangKy(dk);
        this.row = -1;//xoa form
        this.updateStatusDKTL();//cap nhat lai cac nut trang thai
    }

    //table double click
    void editDKTL() {
        int id = (int) tblDangKyThiLai.getValueAt(this.row, 0);
        DangKyThiLai dk = dkdao.selectById(id);
        this.setFormDangKy(dk);
        //    tabs.setSelectedIndex(0);
        this.updateStatusDKTL();
    }

    void firstDKTL() {
        this.row = 0;
        this.editDKTL();
        tblDangKyThiLai.setRowSelectionInterval(row, row);
    }

    void previousDKTL() {
        this.row--;
        this.editDKTL();
        tblDangKyThiLai.setRowSelectionInterval(row, row);
    }

    void nextDKTL() {
        this.row++;
        this.editDKTL();
        tblDangKyThiLai.setRowSelectionInterval(row, row);
    }

    void lastDKTL() {
        row = tblDangKyThiLai.getRowCount() - 1;
        this.editDKTL();
        tblDangKyThiLai.setRowSelectionInterval(row, row);
    }

    //cap nhat lai cac nut trang thai
    void updateStatusDKTL() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblDangKyThiLai.getRowCount() - 1);
        // trạng thái form 
        txtIDDKTL.setEditable(!edit);
        btnAddDangKy.setEnabled(!edit);
        btnEditDangKy.setEnabled(edit);
        btnDeleteDangKy.setEnabled(edit);
        //trạng thái điều hướng
        btnFirstDangKy.setEnabled(edit && !first);
        btnPrevDangKy.setEnabled(edit && !first);
        btnNextDangKy.setEnabled(edit && !last);
        btnLastDangKy.setEnabled(edit && !last);
    }

    public boolean checkFormDKTL() {
        // mã sinh viên
        if (txtMaSVDKTL.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mã sinh viên không bỏ rỗng !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtMaSVDKTL.setBorder(boder);
            txtMaSVDKTL.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtMaSVDKTL.setBorder(boder);
        }

        // họ tên
        if (txtHoTenSinhVienDK.getText().trim().length() == 0) {
            MsgBox.alert(this, "Tên sinh viên không bỏ rỗng !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtHoTenSinhVienDK.setBorder(boder);
            txtHoTenSinhVienDK.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtHoTenSinhVienDK.setBorder(boder);
        }

        // ngày đăng ký
        if (txtHoTenSinhVienDK.getText().trim().length() == 0) {
            MsgBox.alert(this, "Tên sinh viên không bỏ rỗng !");
            boder = BorderFactory.createLineBorder(Color.red);
            txtHoTenSinhVienDK.setBorder(boder);
            txtHoTenSinhVienDK.requestFocus();
            return false;
        } else {
            boder = BorderFactory.createLineBorder(Color.white);
            txtHoTenSinhVienDK.setBorder(boder);
        }

        // số tiền
        return true;
    }

    /**
     * thống kê
     */
    void fillTableDiemTongKet() {
        DefaultTableModel model = (DefaultTableModel) tblDiemtongKet.getModel();
        model.setRowCount(0);
        try {
            MonHoc mamh = (MonHoc) cboDiemTongKet.getSelectedItem();
            List<Diem> list = diemdao.selectByMonHoc(mamh.getMaMH());
            for (Diem d : list) {
                Object[] row = {
                    d.getMaSV(),
                    d.getTenSV(),
                    d.getMaMH(),
                    d.getDiemTB(),
                    d.getXepLoai(d.getDiemTB())
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fillcboTKD() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboDiemTongKet.getModel();
        model.removeAllElements();
        try {
            List<MonHoc> list = mhdao.selectAll();
            for (MonHoc lh : list) {
                model.addElement(lh);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    public void chonMonHoc() {
        MonHoc mh = (MonHoc) cboDiemTongKet.getSelectedItem();
        this.fillTableDiemTongKet();
        this.row = -1;
    }

    void printTKĐ() {
        try {
            JFileChooser jflieChooser = new JFileChooser();
            jflieChooser.showOpenDialog(this);
            File saveFile = jflieChooser.getSelectedFile();
            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + " .xlsx");
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Điểm tổng kết SV");
                XSSFRow row = null;
                Cell cell = null;

                Font fontTitle = sheet.getWorkbook().createFont();
                fontTitle.setFontName("Caiibri");
                fontTitle.setBold(true);
                fontTitle.setFontHeightInPoints((short) 12);
                CellStyle titleStyle = sheet.getWorkbook().createCellStyle();
                titleStyle.setBorderTop(BorderStyle.THIN);
                titleStyle.setBorderBottom(BorderStyle.THIN);
                titleStyle.setBorderRight(BorderStyle.THIN);
                titleStyle.setFont(fontTitle);

                Font fontTitleTieuDe = sheet.getWorkbook().createFont();
                fontTitleTieuDe.setFontName("Caiibri");
                fontTitleTieuDe.setBold(true);
                fontTitleTieuDe.setFontHeightInPoints((short) 14);
                CellStyle titleStyleTieuDe = sheet.getWorkbook().createCellStyle();
                titleStyleTieuDe.setFont(fontTitleTieuDe);

                Font fontRow = sheet.getWorkbook().createFont();
                fontRow.setFontName("Caiibri");
                fontRow.setFontHeightInPoints((short) 13);
                CellStyle rowStyle = sheet.getWorkbook().createCellStyle();
                rowStyle.setBorderTop(BorderStyle.THIN);
                rowStyle.setBorderBottom(BorderStyle.THIN);
                rowStyle.setBorderRight(BorderStyle.THIN);
                rowStyle.setBorderLeft(BorderStyle.THIN);
                rowStyle.setFont(fontRow);

                row = sheet.createRow(1);
                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("ĐIỂM TỔNG KẾT SINH VIÊN");
                cell.setCellStyle(titleStyleTieuDe);

                row = sheet.createRow(3);
                cell = row.createCell(0, CellType.NUMERIC);
                cell.setCellValue("STT");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue("Mã sinh viên");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("Tên sinh viên");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue("Mã môn học");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue("Điểm");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue("Trạng thái");
                cell.setCellStyle(titleStyle);

                for (int i = 0; i < tblDiemtongKet.getRowCount(); i++) {
                    String masv = (String) tblDiemtongKet.getValueAt(i, 0);
                    String tensv = (String) tblDiemtongKet.getValueAt(i, 1);
                    String mamh = (String) tblDiemtongKet.getValueAt(i, 2);
                    float diemtb = (Float) tblDiemtongKet.getValueAt(i, 3);
                    String xl = (String) tblDiemtongKet.getValueAt(i, 4);

                    row = sheet.createRow(4 + i);

                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(masv);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(tensv);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(3, CellType.NUMERIC);
                    cell.setCellValue(mamh);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(4, CellType.NUMERIC);
                    cell.setCellValue(diemtb);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(xl);
                    cell.setCellStyle(rowStyle);

                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                workbook.write(out);
                workbook.close();
                out.close();
                MsgBox.alert(this, "Mở File !");
                openFile(saveFile.toString());
            } else {
                MsgBox.alert(this, "Lỗi !");
                return;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    // thống kê danh sách sinh viên
    void filltableTKSV() {
        DefaultTableModel model = (DefaultTableModel) tblTKSV.getModel();
        model.setRowCount(0);
        try {
            LopHoc lop = (LopHoc) cboTKSV.getSelectedItem();
            List<SinhVien> list = svdao.selectByLopHoc(lop.getMaLop());
            for (SinhVien sv : list) {
                Object[] row = {
                    sv.getMaSV(),
                    sv.getTenSV(),
                    // sv.getMatKhauSV(),
                    sv.getNgaySinh(),
                    sv.isGioiTinh() ? "Nam" : "Nữ",
                    //sv.getDiaChi(),
                    //sv.getSDT(),
                    sv.getEmail(), // sv.getHinh(),
                //sv.getMaLop()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !");
            e.printStackTrace();
        }
    }

    void fillcboTKSV() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTKSV.getModel();
        model.removeAllElements();
        try {
            List<LopHoc> list = lopdao.selectAll();
            for (LopHoc lh : list) {
                model.addElement(lh);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    public void chonLopHoc() {
        LopHoc lh = (LopHoc) cboTKSV.getSelectedItem();
        this.filltableTKSV();
        this.row = -1;
    }

    void printdsSV() {
        try {
            JFileChooser jflieChooser = new JFileChooser();
            jflieChooser.showOpenDialog(this);
            File saveFile = jflieChooser.getSelectedFile();
            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + " .xlsx");
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Danh sách sinh viên");
                XSSFRow row = null;
                Cell cell = null;

                Font fontTitle = sheet.getWorkbook().createFont();
                fontTitle.setFontName("Calibri");
                fontTitle.setBold(true);
                fontTitle.setFontHeightInPoints((short) 12);
                CellStyle titleStyle = sheet.getWorkbook().createCellStyle();
                titleStyle.setBorderTop(BorderStyle.THIN);
                titleStyle.setBorderBottom(BorderStyle.THIN);
                titleStyle.setBorderRight(BorderStyle.THIN);
                titleStyle.setFont(fontTitle);

                Font fontTitleTieuDe = sheet.getWorkbook().createFont();
                fontTitleTieuDe.setFontName("Calibri");
                fontTitleTieuDe.setBold(true);
                fontTitleTieuDe.setFontHeightInPoints((short) 14);
                CellStyle titleStyleTieuDe = sheet.getWorkbook().createCellStyle();
                titleStyleTieuDe.setFont(fontTitleTieuDe);

                Font fontRow = sheet.getWorkbook().createFont();
                fontRow.setFontName("Calibri");
                fontRow.setFontHeightInPoints((short) 13);
                CellStyle rowStyle = sheet.getWorkbook().createCellStyle();
                rowStyle.setBorderTop(BorderStyle.THIN);
                rowStyle.setBorderBottom(BorderStyle.THIN);
                rowStyle.setBorderRight(BorderStyle.THIN);
                rowStyle.setBorderLeft(BorderStyle.THIN);
                rowStyle.setFont(fontRow);

                row = sheet.createRow(1);
                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("DANH SÁCH SINH VIÊN");
                cell.setCellStyle(titleStyleTieuDe);

                row = sheet.createRow(3);
                cell = row.createCell(0, CellType.NUMERIC);
                cell.setCellValue("STT");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue("Mã sinh viên");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("Tên sinh viên");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(" Ngày sinh ");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue("Giới tính");
                cell.setCellStyle(titleStyle);

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue("Email");
                cell.setCellStyle(titleStyle);

                for (int i = 0; i < tblTKSV.getRowCount(); i++) {
                    String masv = (String) tblTKSV.getValueAt(i, 0);
                    String tensv = (String) tblTKSV.getValueAt(i, 1);
                    //sv.setNgaySinh(XDate.toDate(txtNgaySinhSV.getText(), "dd/MM/yyyy"));

                    String gt = (String) tblTKSV.getValueAt(i, 3);
                    String sdt = (String) tblTKSV.getValueAt(i, 4);
                    String ns = String.valueOf(tblTKSV.getValueAt(i, 2));

                    row = sheet.createRow(4 + i);

                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(masv);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(tensv);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(ns);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(gt);
                    cell.setCellStyle(rowStyle);

                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(sdt);
                    cell.setCellStyle(rowStyle);

                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                workbook.write(out);
                workbook.close();
                out.close();
                MsgBox.alert(this, "Mở File !");
                openFile(saveFile.toString());
            } else {
                MsgBox.alert(this, "Lỗi !");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

}
