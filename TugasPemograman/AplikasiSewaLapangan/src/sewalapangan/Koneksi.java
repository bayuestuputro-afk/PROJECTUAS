package sewalapangan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection mysqlkonek;
    
    public static Connection koneksiDB() {
        if (mysqlkonek == null) {
            try {
                // Menggunakan port 3307 sesuai XAMPP kamu
                String url = "jdbc:mysql://localhost:3307/db_sewa_lapangan"; 
                String user = "root";
                String pass = "";
                
                mysqlkonek = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                System.out.println("Koneksi Database Gagal: " + e.getMessage());
            }
        }
        return mysqlkonek;
    }
}