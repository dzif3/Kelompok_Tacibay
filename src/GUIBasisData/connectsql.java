package GUIBasisData;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUF GAMING
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectsql {
    private static Connection koneksi;
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String connectionUrl = "jdbc:sqlserver://DESKTOP-MO1PL9O:1433;databaseName=guesthouse;user=radityasql;password=holmshinyu15048;encrypt=true;trustServerCertificate=true";
                DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
                koneksi = DriverManager.getConnection(connectionUrl);
                System.out.println("Koneksi berhasil");
            } catch (SQLException e) {
                System.out.println("Koneksi error / tidak berhasil");
                e.printStackTrace();
            }
        }
        return koneksi;
    }
}