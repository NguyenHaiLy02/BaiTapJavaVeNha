package dao;

import java.sql.*;

public class JDBCConnection {

    public static Connection getJDBCConnection() throws SQLException {
        final String url = "jdbc:sqlserver://DESKTOP-PIKNVLI:1433;databaseName =QLBanHang";
        final String userName = "sa";
        final String password = "12345";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
