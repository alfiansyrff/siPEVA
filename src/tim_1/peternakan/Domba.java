/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_1.peternakan;
import java.time.LocalDate;
import java.util.Vector;

/**
 *
 * @author alfia
 */
public class Domba implements Hewan, Observable{
    private String id;
    private String jenisSapi;
    private String idLoss;
    private Integer usia;
    private LocalDate tglMasukPeternakan;
    private double totalBiayaPerawatan;
    private Integer jmlVaksin;
    private Boolean kesehatan;
    private Integer jmlPerawatan;
    private Vector<Object> subscribers;
    

    @Override
    public void intro() {
        System.out.println("Ini Domba");   
    }
    
    public void cariHewan() {
        System.out.println("Cari Domba");
    }
    
    public void makan() {
        System.out.println("Kasih makan domba");
    }

    @Override
    public void addSubscriber(Object user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeSubscriber(Object user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void notify(String msg) {
    System.out.println(this.id + " posted a new video!");
    String constructedMessage = String.format("%s: %s", this.id, msg);
    for(Object user : subscribers) {
//      user.receiveNotification(constructedMessage);
    }
   }
}
