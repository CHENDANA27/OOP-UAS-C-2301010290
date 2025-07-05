/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokobucket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sakbana
 */
public class koneksi {
    public static Connection con;
    public static Statement stm;

    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/db_tokobucket";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
        return con;
    }
}
