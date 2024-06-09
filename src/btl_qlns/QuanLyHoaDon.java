/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package btl_qlns;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author NGUYEN THI GIANG
 */
public class QuanLyHoaDon extends javax.swing.JInternalFrame {

    private KetNoi ketNoi = new KetNoi();

    /**
     * Creates new form QuanLyHoaDon
     */
    public QuanLyHoaDon() {
        initComponents();
        loadData("SELECT makh, hoten, cmnd, diachi, sdt FROM khachhang");
        loadDataHoaDon("SELECT mahd, madh, chisodau, chisocuoi, dongia, thanhtien, tienbangchu FROM hoadon");
    }

    private void loadData(String query) {
        DefaultTableModel model = (DefaultTableModel) tbDSKH.getModel();
        model.setRowCount(0);
        tbDSKH.setAutoCreateRowSorter(true);
        ResultSet rs = ketNoi.executeQuery(query);
        try {
            while (rs.next()) {
                Object[] rowData = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(rowData);
            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    private void loadDataHoaDon(String query) {
        DefaultTableModel model = (DefaultTableModel) tbDSHD.getModel();
        model.setRowCount(0);
        tbDSHD.setAutoCreateRowSorter(true);
        ResultSet rs = ketNoi.executeQuery(query);
        try {
            while (rs.next()) {
                Object[] rowData = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
                model.addRow(rowData);
            }

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbDSKH = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTenKhachHangHD = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtDiachiKhachHangHD = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSoTienHD = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtBangChuHD = new javax.swing.JTextField();
        txtchisocuoi = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtChiSoDauHD = new javax.swing.JTextField();
        btInKH = new javax.swing.JButton();
        btThemHD = new javax.swing.JButton();
        txtMadh = new javax.swing.JTextField();
        txtMakh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdongia = new javax.swing.JTextField();
        btTinh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSHD = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tbDSKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số CMT/CCCD", "Địa chỉ", "Số điện thoại"
            }
        ));
        tbDSKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSKHMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbDSKH);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hoá đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel17.setText("Số CMT/CCCD:");

        jLabel19.setText("Số điện thoại:");

        jLabel16.setText("Tên khách hàng:");

        jLabel18.setText("Địa chỉ:");

        jLabel21.setText("Số tiền:");

        txtSoTienHD.setEnabled(false);
        txtSoTienHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoTienHDActionPerformed(evt);
            }
        });

        jLabel22.setText("Viết bằng chữ:");

        txtBangChuHD.setEnabled(false);

        jLabel33.setText("Chỉ số cuối:");

        jLabel31.setText("Mã đồng hồ:");

        jLabel32.setText("Chỉ số đầu:");

        txtChiSoDauHD.setEnabled(false);

        btInKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btInKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/printer.png"))); // NOI18N
        btInKH.setText("In danh sách");
        btInKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInKHActionPerformed(evt);
            }
        });

        btThemHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btThemHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btThemHD.setText("Tạo hóa đơn");
        btThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemHDActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã khách hàng");

        jLabel2.setText("(VAT 5%)");

        jLabel3.setText("Đơn giá");

        btTinh.setText("Tính tiền");
        btTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenKhachHangHD)
                            .addComponent(txtDiachiKhachHangHD)
                            .addComponent(txtMadh)
                            .addComponent(txtChiSoDauHD)
                            .addComponent(txtSoTienHD, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCMND, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdongia)
                                    .addComponent(txtchisocuoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btThemHD, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btInKH, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBangChuHD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMakh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(txtTenKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(txtDiachiKhachHangHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel31)
                                .addComponent(txtMadh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel32)
                                .addComponent(txtChiSoDauHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(btThemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btInKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtchisocuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoTienHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtBangChuHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTinh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hoá đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tbDSHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HĐ", "Mã đồng hồ", "Chỉ số đầu", "Chỉ số cuối", "Đon giá", "Thành tiền", "Bằng chữ"
            }
        ));
        tbDSHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSHD);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbDSKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSKHMouseClicked
        int row = tbDSKH.getSelectedRow();
        if (row >= 0) {
            DefaultTableModel model = (DefaultTableModel) tbDSKH.getModel();
            txtMakh.setText(model.getValueAt(row, 0).toString());
            txtTenKhachHangHD.setText(model.getValueAt(row, 1).toString());
            txtCMND.setText(model.getValueAt(row, 2).toString());
            txtDiachiKhachHangHD.setText(model.getValueAt(row, 3).toString());
            txtSDT.setText(model.getValueAt(row, 4).toString());

            String makh = txtMakh.getText();

            String queryHopDong = "SELECT hopdong.madh FROM hopdong WHERE hopdong.makh = '" + makh + "'";
            ResultSet rsHopDong = ketNoi.executeQuery(queryHopDong);

            try {
                if (rsHopDong.next()) {
                    String madh = rsHopDong.getString("madh");
                    txtMadh.setText(madh);

                    // Thực hiện câu lệnh SQL để lấy chisodau từ bảng donghonuoc với điều kiện madh
                    String queryDongHoNuoc = "SELECT donghonuoc.chisodau FROM donghonuoc WHERE donghonuoc.madh = '" + madh + "'";
                    ResultSet rsDongHoNuoc = ketNoi.executeQuery(queryDongHoNuoc);

                    if (rsDongHoNuoc.next()) {
                        // Lấy giá trị chisodau từ kết quả truy vấn và gán lên txtChiSoDauHD
                        String chiSoDau = rsDongHoNuoc.getString("chisodau");
                        txtChiSoDauHD.setText(chiSoDau);
                    } else {
                        // Xử lý trường hợp không có kết quả
                        JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin đồng hồ nước", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    // Xử lý trường hợp không có kết quả
                    JOptionPane.showMessageDialog(null, "Không tìm thấy thông tin hợp đồng", "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_tbDSKHMouseClicked

    private void btTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTinhActionPerformed
        try {
            // Lấy giá trị từ các JTextField
            String chiSoCuoiText = txtchisocuoi.getText();
            String chiSoDauText = txtChiSoDauHD.getText();
            String dongiaText = txtdongia.getText();

            // Kiểm tra xem các trường có rỗng không
            if (chiSoCuoiText.isEmpty() || chiSoDauText.isEmpty() || dongiaText.isEmpty()) {
                // Hiển thị thông báo hoặc thực hiện xử lý phù hợp khi một trong các trường rỗng
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            } else {

                // Parse các giá trị vào kiểu double
                double chiSoCuoi = Double.parseDouble(chiSoCuoiText);
                double chiSoDau = Double.parseDouble(chiSoDauText);
                double dongia = Double.parseDouble(dongiaText);

                // Thực hiện tính toán theo công thức
                double soTienHD = (chiSoCuoi - chiSoDau) * dongia;
                double tong = soTienHD + (soTienHD * 0.05);

                // Gán giá trị vào JTextField txtSoTienHD
                txtSoTienHD.setText(String.valueOf(tong));
                // Chuyển đổi giá trị từ số sang chữ và gán vào txtBangChuHD
                String bangChuHD = convertToWords(tong);
                txtBangChuHD.setText(bangChuHD);
            }
        } catch (NumberFormatException ex) {
            // Xử lý trường hợp nhập không phải là số
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btTinhActionPerformed

    private String convertToWords(double number) {
        String[] unit = {"", "Nghìn", "Triệu", "Tỷ", "Nghìn Tỷ", "Triệu Tỷ"};
        String[] digit = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};

        // Split the number into integer and fractional parts
        long integerPart = (long) number;
        int fractionalPart = (int) ((number - integerPart) * 100);

        StringBuilder words = new StringBuilder();

        // Convert the integer part to words
        if (integerPart == 0) {
            words.append("Không");
        } else {
            int group = 0;
            do {
                int threeDigits = (int) (integerPart % 1000);
                if (threeDigits != 0) {
                    words.insert(0, convertGroupToWords(threeDigits, digit) + " " + unit[group] + " ");
                }
                group++;
                integerPart /= 1000;
            } while (integerPart > 0);
        }

        // Convert the fractional part to words (if any)
        if (fractionalPart > 0) {
            words.append("Phẩy ");
            words.append(convertGroupToWords(fractionalPart, digit));
        }

        return words.toString().trim();
    }

// Helper method to convert a three-digit group to words
    private String convertGroupToWords(int threeDigits, String[] digit) {
        int hundredDigit = threeDigits / 100;
        int tenDigit = (threeDigits % 100) / 10;
        int unitDigit = threeDigits % 10;

        StringBuilder groupWords = new StringBuilder();

        if (hundredDigit > 0) {
            groupWords.append(digit[hundredDigit]).append(" Trăm ");
        }

        if (tenDigit > 1) {
            groupWords.append(digit[tenDigit]).append(" Mươi ");
            if (unitDigit > 0) {
                groupWords.append(digit[unitDigit]);
            }
        } else if (tenDigit == 1) {
            groupWords.append("Mười ");
            if (unitDigit > 0) {
                groupWords.append(digit[unitDigit]);
            }
        } else if (unitDigit > 0) {
            groupWords.append(digit[unitDigit]);
        }

        return groupWords.toString();
    }

    private void btThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemHDActionPerformed
        // TODO add your handling code here:
        try {
            // Lấy giá trị từ các JTextField
            int makh = Integer.parseInt(txtMakh.getText());
            String hoten = txtTenKhachHangHD.getText();
            String diachi = txtDiachiKhachHangHD.getText();
            String sdt = txtSDT.getText();
            String cmnd = txtCMND.getText();
            String madh = txtMadh.getText();
            int chiSoDau = Integer.parseInt(txtChiSoDauHD.getText());
            int chiSoCuoi = Integer.parseInt(txtchisocuoi.getText());
            double dongia = Double.parseDouble(txtdongia.getText());
            double soTienHD = Double.parseDouble(txtSoTienHD.getText());
            String bangChuHD = txtBangChuHD.getText();

            // Sử dụng PreparedStatement để tránh SQL injection
            String insertQuery = "INSERT INTO hoadon (`makh`, `hoten`, `diachi`, `sdt`, `cmnd`, `madh`, `chisodau`, `chisocuoi`, `dongia`, `thanhtien`, `tienbangchu`) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (java.sql.PreparedStatement preparedStatement = ketNoi.getConnection().prepareStatement(insertQuery)) {
                preparedStatement.setInt(1, makh);
                preparedStatement.setString(2, hoten);
                preparedStatement.setString(3, diachi);
                preparedStatement.setString(4, sdt);
                preparedStatement.setString(5, cmnd);
                preparedStatement.setString(6, madh);
                preparedStatement.setInt(7, chiSoDau);
                preparedStatement.setInt(8, chiSoCuoi);
                preparedStatement.setDouble(9, dongia);
                preparedStatement.setDouble(10, soTienHD);
                preparedStatement.setString(11, bangChuHD);
                // Thực hiện truy vấn insert
                int rowsAffected = preparedStatement.executeUpdate();

                // Lấy giá trị của khóa tự tăng
                int mahd = -1;
                try (Statement statement = ketNoi.getConnection().createStatement()) {
                    ResultSet resultSet = statement.executeQuery("SELECT LAST_INSERT_ID()"); // Thay thế LAST_INSERT_ID() bằng hàm tương ứng của cơ sở dữ liệu
                    if (resultSet.next()) {
                        mahd = resultSet.getInt(1);
                    }
                }

                // Kiểm tra và thông báo kết quả
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Hóa đơn đã được thêm thành công. Mã hóa đơn: " + mahd, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Không thể thêm hóa đơn. Vui lòng kiểm tra lại thông tin.", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
                ketNoi.executeUpdate("UPDATE `donghonuoc` SET `chisodau`= `chisodau` + " + txtchisocuoi.getText() + " WHERE madh = '" + txtMadh.getText() + "'");
                loadDataHoaDon("SELECT mahd, madh, chisodau, chisocuoi, dongia, thanhtien, tienbangchu FROM hoadon");
            } catch (SQLException ex) {
                // Xử lý lỗi SQ
                JOptionPane.showMessageDialog(null, "Lỗi SQL: " + ex.getMessage(), "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            // Xử lý trường hợp nhập không phải là số
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ cho các trường số.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btThemHDActionPerformed

    private void btInKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInKHActionPerformed

    private void txtSoTienHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoTienHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoTienHDActionPerformed

    private void tbDSHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSHDMouseClicked
        // TODO add your handling code here:
//        int row = tbDSHD.getSelectedRow();
//        if (row >= 0) {
//            DefaultTableModel model = (DefaultTableModel) tbDSHD.getModel();
//            txtchisocuoi.setText(model.getValueAt(row, 3).toString());
//            txtdongia.setText(model.getValueAt(row, 4).toString());
//            txtSoTienHD.setText(model.getValueAt(row, 5).toString());
//            txtBangChuHD.setText(model.getValueAt(row, 6).toString());
//
//            String makh = txtMakh.getText();
//
//            String queryHopDong = "SELECT hopdong.madh FROM hopdong WHERE hopdong.makh = '" + makh + "'";
//            ResultSet rsHopDong = ketNoi.executeQuery(queryHopDong);
//        }
    }//GEN-LAST:event_tbDSHDMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInKH;
    private javax.swing.JButton btThemHD;
    private javax.swing.JButton btTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tbDSHD;
    private javax.swing.JTable tbDSKH;
    private javax.swing.JTextField txtBangChuHD;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtChiSoDauHD;
    private javax.swing.JTextField txtDiachiKhachHangHD;
    private javax.swing.JTextField txtMadh;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoTienHD;
    private javax.swing.JTextField txtTenKhachHangHD;
    private javax.swing.JTextField txtchisocuoi;
    private javax.swing.JTextField txtdongia;
    // End of variables declaration//GEN-END:variables
}
