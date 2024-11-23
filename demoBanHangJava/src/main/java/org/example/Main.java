package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/demobanhang";
        Connection con = DriverManager.getConnection(url, "root", "");
        System.out.println("Haha");

        String sqlSelect = "SELECT * FROM sanpham";
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);
        while (rs.next()) {
            System.out.println("Id: " + rs.getInt(1) + ", Ten san pham: " + rs.getString(2) + ", Gia san pham: " + rs.getFloat(3) + ", Mô tả: " + rs.getString(4));
        }
    }
}