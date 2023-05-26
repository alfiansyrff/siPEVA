/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_1.peternakan;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Penjualan {
    private String id_penjualan;
    private String id_hewan;
    private String KategoriHewan;
    private String JenisHewan;
    private int JumlahHewan;
    private Date LamaWaktudiPeternakan;
    private String KategoriPenjualan;
    private Date TanggalPenjualan;
    private Date TanggalPengiriman;
    private String LokasiPengiriman;
    
    //getter
    public String getidPenjualan(){
        return id_penjualan;
    }
    public String getidHewan(){
        return id_hewan;
    }
    public String getKategoriHewan(){
        return KategoriHewan;
    }
    public String getJenisHewan(){
        return JenisHewan;
    }
    public int getJumlahHewan(){
        return JumlahHewan;
    }
    public Date getLamaWaktudiPeternakan(){
        return LamaWaktudiPeternakan;
    }
    public String getKategoriPenjualan(){
        return KategoriPenjualan;
    }
    public Date getTanggalPenjualan(){
        return TanggalPenjualan;
    }
    public Date getTanggalPengiriman(){
        return TanggalPengiriman;
    }
    public String getLokasiPengiriman(){
        return LokasiPengiriman;
    }
    
    //setter
    public void setidPenjualan(String idPenjualan){
        this.id_penjualan = idPenjualan;
    }
    public void setidHewan(String idHewan){
        this.id_hewan = idHewan;
    }
    public void setKategoriHewan(String KategoriHewan){
        this.KategoriHewan = KategoriHewan;
    }
    public void setJenisHewan(String JenisHewan){
        this.JenisHewan = JenisHewan;
    }
    public void setJumlahHewan(int JumlahHewan){
        this.JumlahHewan = JumlahHewan;
    }
    public void setLamaWaktudiPeternakan(Date LamaWaktudiPeternakan){
        this.LamaWaktudiPeternakan = LamaWaktudiPeternakan;
    }
    public void setKategoriPenjualan(String KategoriPenjualan){
        this.KategoriPenjualan = KategoriPenjualan;
    }
    public void setTanggalPenjualan(Date TanggalPenjualan){
        this.TanggalPenjualan = TanggalPenjualan;
    }
    public void setTanggalPengiriman(Date TanggalPengiriman){
        this.TanggalPengiriman = TanggalPengiriman;
    }
    public void setLokasiPengiriman(String LokasiPengiriman){
        this.LokasiPengiriman = LokasiPengiriman;
    }
}
