/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package btl_qlns;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author NGUYEN THI GIANG
 */
public class QuanLyHopDong extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyHopDong
     */
    private KetNoi ketNoi = new KetNoi();

    public QuanLyHopDong() {
        initComponents();
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        txtNgaySinh.setDate(currentDate);
        txtNgayLamHD.setDate(currentDate);
        loadData("SELECT sohopdong, hopdong.makh, hoten, cmnd, ngaysinh, diachi, sdt, ngaylamhd, noilamhd, mucdich, madh FROM hopdong, khachhang WHERE hopdong.makh = khachhang.makh;");
        cbMaDongHoHD.removeAllItems();
        loadComboBoxData("SELECT madh FROM donghonuoc", cbMaDongHoHD);
        try {
            ResultSet rs = ketNoi.executeQuery("select * from donghonuoc where status = 0;");
            while (rs.next()) {
                cbMaDongHoHD.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private void loadComboBoxData(String query, JComboBox comboBox) {
        ResultSet rs = ketNoi.executeQuery(query);
        try {
            while (rs.next()) {
                String item = rs.getString(1);
                comboBox.addItem(item);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    private void loadData(String query) {
        DefaultTableModel model = (DefaultTableModel) tableDSHD.getModel();
        model.setRowCount(0);
        tableDSHD.setAutoCreateRowSorter(true);
        ResultSet rs = ketNoi.executeQuery(query);
        try {
            while (rs.next()) {
                Object[] rowData = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)};
                model.addRow(rowData);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timingTargetAdapter1 = new org.jdesktop.animation.timing.TimingTargetAdapter();
        timingTargetAdapter2 = new org.jdesktop.animation.timing.TimingTargetAdapter();
        btXoaHD = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSoHD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNoiLamHD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cbMaDongHoHD = new javax.swing.JComboBox<>();
        txtNgayLamHD = new com.toedter.calendar.JDateChooser();
        btInHD = new javax.swing.JButton();
        btTimKiemHD = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDSHD = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        CMND = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtHoTenKH = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtDiaChiKH = new javax.swing.JTextField();
        txtMucDichKH = new javax.swing.JTextField();
        txtSDTKH = new javax.swing.JTextField();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        btThemHD = new javax.swing.JButton();
        btSuaHD = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btXoaHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btXoaHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/file.png"))); // NOI18N
        btXoaHD.setText("Xoá hợp đồng");
        btXoaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaHDActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hợp đồng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setText("Số hợp đồng:");

        txtSoHD.setEnabled(false);

        jLabel3.setText("Ngày làm hợp đồng:");

        jLabel4.setText("Nơi làm hợp đồng:");

        jLabel29.setText("Mã đồng hồ:");

        cbMaDongHoHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMaDongHoHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaDongHoHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel29))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNoiLamHD)
                    .addComponent(txtSoHD)
                    .addComponent(cbMaDongHoHD, 0, 182, Short.MAX_VALUE)
                    .addComponent(txtNgayLamHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSoHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtNgayLamHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoiLamHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cbMaDongHoHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btInHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btInHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer.png"))); // NOI18N
        btInHD.setText("In hợp đồng");
        btInHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInHDActionPerformed(evt);
            }
        });

        btTimKiemHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btTimKiemHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loupe.png"))); // NOI18N
        btTimKiemHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTimKiemHDMouseClicked(evt);
            }
        });
        btTimKiemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemHDActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Tìm kiếm theo tên:");

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hợp đồng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel5.setToolTipText("");

        tableDSHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Số HĐ", "Mã KH", "Họ tên KH", "CMND", "Ngày sinh", "Địa chỉ", "SĐT", "Ngày làm HĐ", "Nơi làm HĐ", "Mục đích", "Mã đồng hồ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDSHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDSHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDSHD);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel23.setText("Địa chỉ:");

        jLabel24.setText("Số điện thoại:");

        jLabel25.setText("Họ và tên:");

        jLabel26.setText("Ngày sinh:");

        jLabel30.setText("Mục đích:");

        jLabel28.setText("Mã KH:");

        CMND.setText("CMND:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CMND, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCMND)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDiaChiKH)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDTKH)
                            .addComponent(txtMucDichKH)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel28))
                            .addComponent(jLabel25))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaKH)
                            .addComponent(txtHoTenKH))))
                .addGap(32, 32, 32))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtHoTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CMND))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtDiaChiKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtSDTKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(txtMucDichKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btThemHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btThemHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btThemHD.setText("Thêm hợp đồng");
        btThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemHDActionPerformed(evt);
            }
        });

        btSuaHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSuaHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit-text.png"))); // NOI18N
        btSuaHD.setText("Sửa hợp đồng");
        btSuaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btThemHD)
                .addGap(18, 18, 18)
                .addComponent(btSuaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btTimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btTimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSuaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemHDActionPerformed
        // TODO add your handling code here:
        if (cbMaDongHoHD.getItemCount() == 0 || txtHoTenKH.getText().equals("") || txtDiaChiKH.getText().equals("") || txtSDTKH.getText().equals("") || txtNoiLamHD.getText().equals("")) {
            JOptionPane.showConfirmDialog(null, "Các trường nhập không được để trống!", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            if (ketNoi.executeQuery("select * from khachhang where makh = '" + txtMaKH.getText() + "';").next()) {
                JOptionPane.showConfirmDialog(null, "Mã khách hàng đã tồn tại! Mời bạn nhập mã khách hàng khác", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } else {
                ketNoi.executeUpdate("INSERT INTO `khachhang`(`makh`, `hoten`, `cmnd`, `ngaysinh`, `diachi`, `sdt`, `mucdich`) VALUES (" + txtMaKH.getText() + ", '" + txtHoTenKH.getText() + "', '" + txtCMND.getText() + "', '" + new SimpleDateFormat("yyyy-MM-dd").format(txtNgaySinh.getDate()) + "', '" + txtDiaChiKH.getText() + "', '" + txtSDTKH.getText() + "', '" + txtMucDichKH.getText() + "');");
                ketNoi.executeUpdate("INSERT INTO `hopdong`(`ngaylamhd`, `noilamhd`, `madh`, `makh`) VALUES ('" + new SimpleDateFormat("yyyy-MM-dd").format(txtNgayLamHD.getDate()) + "', '" + txtNoiLamHD.getText() + "', '" + cbMaDongHoHD.getSelectedItem() + "', " + txtMaKH.getText() + ");");
                ketNoi.executeUpdate("UPDATE `donghonuoc` SET `status`= 1 WHERE madh = '" + cbMaDongHoHD.getSelectedItem() + "'");
                cbMaDongHoHD.removeAllItems();
                try {
                    ResultSet result = ketNoi.executeQuery("select * from donghonuoc where status = 0;");
                    while (result.next()) {
                        cbMaDongHoHD.addItem(result.getString(1));
                    }
                } catch (SQLException ex) {
                    JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                loadData("SELECT sohopdong, hopdong.makh, hoten, cmnd, ngaysinh, diachi, sdt, ngaylamhd, noilamhd, mucdich, madh FROM hopdong, khachhang WHERE hopdong.makh = khachhang.makh;");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btThemHDActionPerformed

    private void btSuaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaHDActionPerformed
        // TODO add your handling code here:
        if (txtSoHD.getText().equals("") || txtHoTenKH.getText().equals("") || txtDiaChiKH.getText().equals("") || txtSDTKH.getText().equals("") || txtNoiLamHD.getText().equals("")) {
            JOptionPane.showConfirmDialog(null, "Các trường nhập không được để trống!", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            ResultSet rs = ketNoi.executeQuery("select * from hopdong where sohopdong = " + txtSoHD.getText() + ";");
            if (!rs.next()) {
                JOptionPane.showConfirmDialog(null, "Mã hợp đồng không tồn tại! Mời bạn nhập mã hợp đồng khác", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } else if (!ketNoi.executeQuery("select * from khachhang where makh = '" + txtMaKH.getText() + "';").next()) {
                JOptionPane.showConfirmDialog(null, "Mã khách hàng không tồn tại! Mời bạn nhập mã khách hàng khác", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } else {
                ketNoi.executeUpdate("update khachhang set hoten = '" + txtHoTenKH.getText()
                        + "', ngaysinh = '" + new SimpleDateFormat("yyyy-MM-dd").format(txtNgaySinh.getDate())
                        + "', diachi = '" + txtDiaChiKH.getText()
                        + "', sdt = '" + txtSDTKH.getText()
                        + "', mucdich = '" + txtMucDichKH.getText()
                        + "', cmnd = '" + txtCMND.getText()
                        + "' where makh = " + txtMaKH.getText() + ";");
                ketNoi.executeUpdate("update hopdong set ngaylamhd = '" + new SimpleDateFormat("yyyy-MM-dd").format(txtNgayLamHD.getDate())
                        + "', noilamhd = '" + txtNoiLamHD.getText()
                        + "', madh = '" + cbMaDongHoHD.getSelectedItem()
                        + "', makh = " + txtMaKH.getText()
                        + " where sohopdong = " + txtSoHD.getText() + ";");
                txtSoHD.setText("");
                txtMaKH.setText("");
                txtHoTenKH.setText("");
                txtCMND.setText("");
                txtNoiLamHD.setText("");
                txtDiaChiKH.setText("");
                txtSDTKH.setText("");
                txtMucDichKH.setText("");
                loadData("SELECT sohopdong, hopdong.makh, hoten, cmnd, ngaysinh, diachi, sdt, ngaylamhd, noilamhd, mucdich, madh FROM hopdong, khachhang WHERE hopdong.makh = khachhang.makh;");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSuaHDActionPerformed

    private void btXoaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaHDActionPerformed

        if (txtSoHD.getText().equals("") || txtHoTenKH.getText().equals("") || txtDiaChiKH.getText().equals("") || txtSDTKH.getText().equals("") || txtNoiLamHD.getText().equals("")) {
            JOptionPane.showConfirmDialog(null, "Các trường nhập không được để trống!", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            ResultSet rs = ketNoi.executeQuery("select * from hopdong where sohopdong = " + txtSoHD.getText() + ";");
            if (!rs.next()) {
                JOptionPane.showConfirmDialog(null, "Mã hợp đồng không tồn tại! Mời bạn nhập mã hợp đồng khác", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } else if (!ketNoi.executeQuery("select * from khachhang where makh = '" + txtMaKH.getText() + "';").next()) {
                JOptionPane.showConfirmDialog(null, "Mã khách hàng không tồn tại! Mời bạn nhập mã khách hàng khác", "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } else {
                ketNoi.executeUpdate("delete from hopdong where sohopdong = " + txtSoHD.getText() + ";");
                ketNoi.executeUpdate("delete from khachhang where makh = " + txtSoHD.getText() + ";");
                txtSoHD.setText("");
                txtHoTenKH.setText("");
                txtNoiLamHD.setText("");
                txtDiaChiKH.setText("");
                txtSDTKH.setText("");
                txtMucDichKH.setText("");
                loadData("SELECT sohopdong, hopdong.makh, hoten, cmnd, ngaysinh, diachi, sdt, ngaylamhd, noilamhd, mucdich, madh FROM hopdong, khachhang WHERE hopdong.makh = khachhang.makh;");
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btXoaHDActionPerformed

    private void btInHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInHDActionPerformed
        // TODO add your handling code here:
        try {
            XSSFWorkbook wordkbook = new XSSFWorkbook();
            XSSFSheet sheet = wordkbook.createSheet("donghonuoc");
            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(2);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Danh sách hợp đồng");

            row = sheet.createRow(3);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("STT");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Số hợp đồng");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Mã khách hàng");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Họ tên khách hàng");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("CMND");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Ngày sinh");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Địa chỉ");

            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("SĐT");

            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Ngày làm hợp đồng");

            cell = row.createCell(9, CellType.STRING);
            cell.setCellValue("Nơi làm hợp đồng");

            cell = row.createCell(10, CellType.STRING);
            cell.setCellValue("Mục đích");

            cell = row.createCell(11, CellType.STRING);
            cell.setCellValue("Mã đồng hồ nước");

            for (int i = 0; i < tableDSHD.getRowCount(); i++) {
                //Modelbook book =arr.get(i);
                row = sheet.createRow(4 + i);

                cell = row.createCell(0, CellType.NUMERIC);
                cell.setCellValue(i + 1);

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 0).toString());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 1).toString());

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 2).toString());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 3).toString());

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 4).toString());

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 5).toString());

                cell = row.createCell(7, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 6).toString());

                cell = row.createCell(8, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 7).toString());

                cell = row.createCell(9, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 8).toString());

                cell = row.createCell(10, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 9).toString());

                cell = row.createCell(11, CellType.STRING);
                cell.setCellValue(tableDSHD.getModel().getValueAt(i, 10).toString());

            }

            // Tạo một đối tượng JFileChooser
            JFileChooser fileChooser = new JFileChooser();

            // Tạo một bộ lọc cho phép chỉ chọn các file có đuôi là .xlsx
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files (*.xlsx)", "xlsx");
            fileChooser.setFileFilter(filter);

            // Hiển thị hộp thoại chọn file, và kiểm tra xem người dùng có chọn một file hay không
            int result = fileChooser.showSaveDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                // Lấy đường dẫn file được chọn
                File selectedFile = fileChooser.getSelectedFile();

                try {
                    // Ghi dữ liệu vào file
                    FileOutputStream fis = new FileOutputStream(selectedFile + ".xlsx");
                    wordkbook.write(fis);
                    fis.close();

                    // Hiển thị thông báo thành công
                    JOptionPane.showMessageDialog(null, "In thành công tại: " + selectedFile.getAbsolutePath());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Loi mo file");
        }
    }//GEN-LAST:event_btInHDActionPerformed

    private void tableDSHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDSHDMouseClicked
        // TODO add your handling code here:
        int row = tableDSHD.getSelectedRow();
        if (row >= 0) {
            DefaultTableModel model = (DefaultTableModel) tableDSHD.getModel();
            txtSoHD.setText(model.getValueAt(row, 0).toString());
            txtMaKH.setText(model.getValueAt(row, 1).toString());
            txtHoTenKH.setText(model.getValueAt(row, 2).toString());
            txtCMND.setText(model.getValueAt(row, 3).toString());
            try {
                txtNgaySinh.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(row, 4).toString()));
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyHopDong.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtDiaChiKH.setText(model.getValueAt(row, 5).toString());
            txtSDTKH.setText(model.getValueAt(row, 6).toString());
            try {
                txtNgayLamHD.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(row, 7).toString()));
            } catch (ParseException ex) {
                Logger.getLogger(QuanLyHopDong.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtNoiLamHD.setText(model.getValueAt(row, 8).toString());
            txtMucDichKH.setText(model.getValueAt(row, 9).toString());
            cbMaDongHoHD.setSelectedItem(model.getValueAt(row, 10).toString());
        }
    }//GEN-LAST:event_tableDSHDMouseClicked

    private void btTimKiemHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTimKiemHDMouseClicked
        // TODO add your handling code here:
        loadData("SELECT sohopdong, hopdong.makh, hoten, cmnd, ngaysinh, diachi, sdt, ngaylamhd, noilamhd, mucdich, madh FROM hopdong, khachhang WHERE hopdong.makh = khachhang.makh and hoten like '%" + txtTimKiem.getText() + "%';");
    }//GEN-LAST:event_btTimKiemHDMouseClicked

    private void btTimKiemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTimKiemHDActionPerformed

    private void cbMaDongHoHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaDongHoHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaDongHoHDActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CMND;
    private javax.swing.JButton btInHD;
    private javax.swing.JButton btSuaHD;
    private javax.swing.JButton btThemHD;
    private javax.swing.JButton btTimKiemHD;
    private javax.swing.JButton btXoaHD;
    private javax.swing.JComboBox<String> cbMaDongHoHD;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDSHD;
    private org.jdesktop.animation.timing.TimingTargetAdapter timingTargetAdapter1;
    private org.jdesktop.animation.timing.TimingTargetAdapter timingTargetAdapter2;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDiaChiKH;
    private javax.swing.JTextField txtHoTenKH;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMucDichKH;
    private com.toedter.calendar.JDateChooser txtNgayLamHD;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JTextField txtNoiLamHD;
    private javax.swing.JTextField txtSDTKH;
    private javax.swing.JTextField txtSoHD;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
