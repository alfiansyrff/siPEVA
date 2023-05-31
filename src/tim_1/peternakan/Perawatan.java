/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_1.peternakan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *
 * @author alfia
 */
public class Perawatan {
    private String id_perawatan;
    private String id_hewan;
    private String tipe_perawatan;
    private LocalDateTime tgl_perawatan;

    public String getId_hewan() {
        return id_hewan;
    }

    public String getId_perawatan() {
        return id_perawatan;
    }

    public LocalDateTime getTgl_perawatan() {
        return tgl_perawatan;
    }

    public String getTipe_perawatan() {
        return tipe_perawatan;
    }

    public void setId_hewan(String id_hewan) {
        this.id_hewan = id_hewan;
    }

    public void setId_perawatan(String id_perawatan) {
        this.id_perawatan = id_perawatan;
    }

    public void setTgl_perawatan(LocalDateTime tgl_perawatan) {
        this.tgl_perawatan = tgl_perawatan;
    }

    public void setTipe_perawatan(String tipe_perawatan) {
        this.tipe_perawatan = tipe_perawatan;
    }
    
    
    
    public void tambahDataPemberianPakan() {
        try {
            // Mengatur koneksi ke database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vrinfarm", "root", "");

            // Membuat query untuk menambahkan data
            String query = "INSERT INTO perawatan (id, tgl_perawatan, tipe_perawatan , id_Hewan) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Mengatur nilai parameter
            statement.setString(1, id_perawatan);
            statement.setTimestamp(2, Timestamp.valueOf(tgl_perawatan));
            statement.setString(3, tipe_perawatan);
            statement.setString(4, id_hewan); // Menambahkan id_Hewan sebagai parameter

            // Menjalankan query untuk menambahkan data
            statement.executeUpdate();

            // Menutup statement dan koneksi
            statement.close();
            connection.close();

            System.out.println("Data perawatan berhasil ditambahkan ke tabel PemberianPakan");
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat tambah data perawatan: " + e.getMessage());
        }
    }
}
