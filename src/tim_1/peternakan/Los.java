/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_1.peternakan;

/**
 *
 * @author ASUS
 */
public class Los {
    private String id_Los;
    private int JumlahHewan;
    private int SlotMaks;
    private int SlotSisa;
    
    //getter
    public String getidLos(){
        return id_Los;
    }
    public int getJumlahHewan(){
        return JumlahHewan;
    }
    public int getSlotMaks(){
        return SlotMaks;
    }
    public int getSlotSisa(){
        return SlotSisa;
    }
    
    //setter
    public void setidLos(String idLos){
        this.id_Los = idLos;
    }
    public void setJumlahHewan(int JumlahHewan){
        this.JumlahHewan = JumlahHewan;
    }
    public void setSlotMaks(int SlotMaks){
        this.SlotMaks = SlotMaks;
    }
    public void setSlotSisa(int SlotSisa){
        this.SlotSisa = SlotSisa;
    }
}
