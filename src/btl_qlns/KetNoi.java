package btl_qlns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class KetNoi {

    private Connection connection;

    public KetNoi() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlnuocsach", "root", "");
        } catch (SQLException ex) {
            handleSQLException("Lỗi kết nối database", ex);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public int executeUpdate(String query) {
        try (Statement stmt = connection.createStatement()) {
            return stmt.executeUpdate(query);
        } catch (SQLException ex) {
            handleSQLException("Lỗi: " + ex.getMessage(), ex);
        }
        return -1;
    }

    public ResultSet executeQuery(String query) {
        try {
            Statement stmt = connection.createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException ex) {
            handleSQLException("Lỗi: " + ex.getMessage(), ex);
        }
        return null;
    }

    private void handleSQLException(String message, SQLException ex) {
        JOptionPane.showConfirmDialog(null, message, "Thông báo", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException ex) {
            handleSQLException("Lỗi khi đóng kết nối", ex);
        }
    }
}
