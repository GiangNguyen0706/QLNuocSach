/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package btl_qlns;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NGUYEN THI GIANG
 */
public class Main extends javax.swing.JFrame {

    private static KetNoi ketNoi = new KetNoi();

    private static int dongHoCount;

    private static int khachHangCount;
    private static int khachHangDaThanhToanCount;
    private static int khachHangChuaThanhToanCount;
    private static int tongChiSoDongHoCount;
    private static double tongDoanhThuCount;

    /**
     * Creates new form TrangChu
     */
    public Main() {
        initComponents();

        updateDongHoCount();
        updateKhachHangCount();
        updateKhachHangDaThanhToanCount();
        updateKhachHangChuaThanhToanCount();
        updateTongChiSoDongHoCount();
        updateTongDoanhThuCount();
    }

    public static int updateKhachHangDaThanhToanCount() {
        khachHangDaThanhToanCount = countRecordsWithCondition("khachhang", "thanhtoan = 1");
        return khachHangDaThanhToanCount;
    }
    public static int updateKhachHangChuaThanhToanCount() {
        khachHangChuaThanhToanCount = countRecordsWithCondition("khachhang", "thanhtoan = 0");
        return khachHangChuaThanhToanCount;
    }
    private static int countRecordsWithCondition(String tableName, String condition) {
        int count = 0;
        String countQuery = "SELECT COUNT(*) FROM " + tableName + " WHERE " + condition;
        ResultSet rs = ketNoi.executeQuery(countQuery);

        try {
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return count;
    }
    private static int countRecords(String tableName) {
        int count = 0;
        String countQuery = "SELECT COUNT(*) FROM " + tableName;
        ResultSet rs = ketNoi.executeQuery(countQuery);

        try {
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return count;
    }
    public static int updateTongChiSoDongHoCount() {
        // Assuming "chisocuoi" and "chisodau" are the column names for end and start indexes in the "hoadon" table.
        String sumQuery = "SELECT SUM(chisocuoi - chisodau) FROM hoadon";
        ResultSet rs = ketNoi.executeQuery(sumQuery);
        try {
            if (rs.next()) {
                tongChiSoDongHoCount = rs.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return tongChiSoDongHoCount;
    }
    public static double updateTongDoanhThuCount() {
        // Assuming "chisocuoi" and "chisodau" are the column names for end and start indexes in the "hoadon" table.
        String sumQuery = "SELECT SUM(thanhtien) FROM hoadon";
        ResultSet rs = ketNoi.executeQuery(sumQuery);
        try {
            if (rs.next()) {
                tongDoanhThuCount = rs.getDouble(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Lỗi: " + ex.getMessage(), "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return tongDoanhThuCount;
    }
    
    public static int getDongHoCount() {
        return dongHoCount;
    }

    public static int getKhachHangCount() {
        return khachHangCount;
    }

    public static void updateDongHoCount() {
        dongHoCount = countRecords("donghonuoc");
    }

    public static void updateKhachHangCount() {
        khachHangCount = countRecords("khachhang");
    }
    public static int getTongChiSoDongHoCount() {
        return tongChiSoDongHoCount;
    }
    public static double getTongDoanhThuCount() {
        return tongDoanhThuCount;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btTrangChu = new javax.swing.JButton();
        btQLHopDong = new javax.swing.JButton();
        btQLKhachHang = new javax.swing.JButton();
        btQLDongHoDo = new javax.swing.JButton();
        btQLHoaDon = new javax.swing.JButton();
        btBaoCaoThongKe = new javax.swing.JButton();
        btDangXuat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HỆ THỐNG QUẢN LÝ NƯỚC SẠCH");
        jLabel8.setAlignmentX(0.5F);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        jLabel7.setBackground(new java.awt.Color(0, 0, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clean-water.png"))); // NOI18N
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        btTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-button.png"))); // NOI18N
        btTrangChu.setText("Trang chủ");
        btTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrangChuActionPerformed(evt);
            }
        });

        btQLHopDong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btQLHopDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/contract (2).png"))); // NOI18N
        btQLHopDong.setText("Quản lý hợp đồng");
        btQLHopDong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLHopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLHopDongActionPerformed(evt);
            }
        });

        btQLKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btQLKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/relationship.png"))); // NOI18N
        btQLKhachHang.setText("Quản lý khách hàng");
        btQLKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLKhachHangActionPerformed(evt);
            }
        });

        btQLDongHoDo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btQLDongHoDo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/performance.png"))); // NOI18N
        btQLDongHoDo.setText("Quản lý đồng hồ đo");
        btQLDongHoDo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLDongHoDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLDongHoDoActionPerformed(evt);
            }
        });

        btQLHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btQLHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/order-fulfillment.png"))); // NOI18N
        btQLHoaDon.setText("Quản lý hoá đơn");
        btQLHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btQLHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQLHoaDonActionPerformed(evt);
            }
        });

        btBaoCaoThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btBaoCaoThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/stats (1).png"))); // NOI18N
        btBaoCaoThongKe.setText("Báo cáo thống kê");
        btBaoCaoThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btBaoCaoThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBaoCaoThongKeActionPerformed(evt);
            }
        });

        btDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        btDangXuat.setText("Đăng xuất");
        btDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangXuatActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png"))); // NOI18N
        jButton1.setText("Quản lý tài khoản");
        jButton1.setMaximumSize(new java.awt.Dimension(185, 38));
        jButton1.setMinimumSize(new java.awt.Dimension(185, 38));
        jButton1.setPreferredSize(new java.awt.Dimension(185, 38));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btQLHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btQLKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
            .addComponent(btQLDongHoDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btQLHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btBaoCaoThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQLHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQLKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQLDongHoDo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btQLHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBaoCaoThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(305, 305, 305))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.JInternalFrame currentForm;

    private void openChildForm(javax.swing.JInternalFrame childForm) {
        if (currentForm != null) {
            currentForm.dispose(); // Đóng form con hiện tại nếu có
        }

        currentForm = childForm; // Gán form con mới là form con hiện tại
        jDesktopPane1.add(childForm).setVisible(true);
        try {
            childForm.setMaximum(true); // form con full man hinh
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        openChildForm(new TrangChu());
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrangChuActionPerformed
        openChildForm(new TrangChu());
    }//GEN-LAST:event_btTrangChuActionPerformed

    private void btQLHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLHopDongActionPerformed
        openChildForm(new QuanLyHopDong());
    }//GEN-LAST:event_btQLHopDongActionPerformed

    private void btQLKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLKhachHangActionPerformed
        openChildForm(new QuanLyKhachHang());
    }//GEN-LAST:event_btQLKhachHangActionPerformed

    private void btQLDongHoDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLDongHoDoActionPerformed
        openChildForm(new QuanLyDongHo());
    }//GEN-LAST:event_btQLDongHoDoActionPerformed

    private void btQLHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQLHoaDonActionPerformed
        openChildForm(new QuanLyHoaDon());
    }//GEN-LAST:event_btQLHoaDonActionPerformed

    private void btBaoCaoThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBaoCaoThongKeActionPerformed
        openChildForm(new QuanLy());
    }//GEN-LAST:event_btBaoCaoThongKeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        openChildForm(new TrangChu());
    }//GEN-LAST:event_formWindowOpened

    private void btDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangXuatActionPerformed
        // Hiển thị cửa sổ đăng nhập
        DangNhap dangNhapForm = new DangNhap();
        dangNhapForm.setVisible(true);

        // Đóng cửa sổ hiện tại (đăng xuất và đóng cửa sổ main)
        this.dispose();
    }//GEN-LAST:event_btDangXuatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        openChildForm(new QuanLyTaiKhoan());
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main mainForm = new Main(); // Tạo một lớp Main
                mainForm.setVisible(true); // Make the Main form visible
                mainForm.openChildForm(new TrangChu());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBaoCaoThongKe;
    private javax.swing.JButton btDangXuat;
    private javax.swing.JButton btQLDongHoDo;
    private javax.swing.JButton btQLHoaDon;
    private javax.swing.JButton btQLHopDong;
    private javax.swing.JButton btQLKhachHang;
    private javax.swing.JButton btTrangChu;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
