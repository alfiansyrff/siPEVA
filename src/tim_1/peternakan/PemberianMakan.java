/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_1.peternakan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Timestamp;


/**
 *
 * @author ASUS
 */
public class PemberianMakan {
    private String id_PemberianMakan;
    private String JenisPakan;
    private LocalDateTime WaktuPemberianMakan;
    private String id_hewan;
    
    //getter
    public String getidPemberianMakan(){
        return id_PemberianMakan;
    }
    public String getJenisPakan(){
        return JenisPakan;
    }
    public LocalDateTime getWaktuPemberianMakan(){
        return WaktuPemberianMakan;
    }

    public String getId_hewan() {
        return id_hewan;
    }
    
    
    //setter
    public void setidPemberianMakan(String idPemberianMakan){
        this.id_PemberianMakan = idPemberianMakan;
    }
    public void setJenisPakan(String JenisPakan){
        this.JenisPakan = JenisPakan;
    }
    public void setWaktuPemberianMakan(LocalDateTime WaktuPemberianMakan){
        this.WaktuPemberianMakan = WaktuPemberianMakan;
    }
    
    public void setId_hewan(String id_hewan) {
        this.id_hewan = id_hewan;
    }
     
       // Method untuk menambahkan data ke tabel PemberianPakan di database
    public void tambahDataPemberianPakan() {
        try {
            // Mengatur koneksi ke database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vrinfarm", "root", "");

            // Membuat query untuk menambahkan data
            String query = "INSERT INTO PemberianPakan (id_PemberianMakan, JenisPakan, WaktuPemberianMakan, id_Hewan) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            // Mengatur nilai parameter
            statement.setString(1, id_PemberianMakan);
            statement.setString(2, JenisPakan);
            statement.setTimestamp(3, Timestamp.valueOf(WaktuPemberianMakan));
            statement.setString(4, id_hewan); // Menambahkan id_Hewan sebagai parameter

            // Menjalankan query untuk menambahkan data
            statement.executeUpdate();

            // Menutup statement dan koneksi
            statement.close();
            connection.close();

            System.out.println("Data pemberian pakan berhasil ditambahkan ke tabel PemberianPakan");
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat tambah data pemberian pakan: " + e.getMessage());
        }
    }
    
    //kirim notifikasi()
    //kelolapakan()

   
}
