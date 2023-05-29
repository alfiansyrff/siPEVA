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
public class PemberianMakan {
    private String id_PemberianMakan;
    private String JenisPakan;
    private Date WaktuPemberianMakan;
    
    //getter
    public String getidPemberianMakan(){
        return id_PemberianMakan;
    }
    public String getJenisPakan(){
        return JenisPakan;
    }
    public Date getWaktuPemberianMakan(){
        return WaktuPemberianMakan;
    }
    
    //setter
    public void setidPemberianMakan(String idPemberianMakan){
        this.id_PemberianMakan = idPemberianMakan;
    }
    public void setJenisPakan(String JenisPakan){
        this.JenisPakan = JenisPakan;
    }
    public void setWaktuPemberianMakan(Date WaktuPemberianMakan){
        this.WaktuPemberianMakan = WaktuPemberianMakan;
    }
    
    
    //kirim notifikasi()
    //kelolapakan()
}
