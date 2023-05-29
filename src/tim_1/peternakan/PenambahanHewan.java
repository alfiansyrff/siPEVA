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
public class PenambahanHewan {
    private String id_hewan;
    private String KategoriHewan;
    private String JenisHewan;
    private Date TanggalMasukPeternakan;
    private String KategoriPenambahan;
    private String id_los;
    
    //getter
    public String getidHewan(){
        return id_hewan;
    }
    public String getKategoriHewan(){
        return KategoriHewan;
    }
    public String getJenisHewan(){
        return JenisHewan;
    }
    public Date getTanggalMasukPeternakan(){
        return TanggalMasukPeternakan;
    }
    public String getKategoriPenambahan(){
        return KategoriPenambahan;
    }
    public String getidLos(){
        return id_los;
    }
    
    //setter
    public void setidHewan(String idHewan){
        this.id_hewan = idHewan;
    }
    public void setKategoriHewan(String KategoriHewan){
        this.KategoriHewan = KategoriHewan;
    }
    public void setJenisHewan(String JenisHewan){
        this.JenisHewan = JenisHewan;
    }
    public void setTanggalMasukPeternakan(Date TanggalMasukPeternakan){
        this.TanggalMasukPeternakan = TanggalMasukPeternakan;
    }
    public void setKategoriPenambahan(String KategoriPenambahan){
        this.KategoriPenambahan = KategoriPenambahan;
    }
    public void setidLos(String idLos){
        this.id_los = idLos;
    }
}
