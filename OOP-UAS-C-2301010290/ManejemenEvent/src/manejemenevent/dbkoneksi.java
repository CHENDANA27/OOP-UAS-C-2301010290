package manejemenevent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LAB F
 */
public class dbkoneksi {
private static final String URL = "jdbc:mysql://localhost:3306/manajemen_event"; // Ganti dengan nama DB kamu
    private static final String USER = "root"; // Ganti jika username bukan root
    private static final String PASSWORD = ""; // Ganti jika ada password MySQL

    public static Connection getConnection() {
        Connection koneksi = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver MySQL
            koneksi = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi berhasil!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return koneksi;
    }
}
