/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_1.peternakan;

/**
 *
 * @author alfia
 */
public class HewanFactory {
    public Hewan getInstance(String jenisHewan) {
        if (jenisHewan.equals("Sapi")) {
            return new Sapi();
        } else if(jenisHewan.equals("Kambing")) {
            return new Kambing();
        } else if (jenisHewan.equals("Domba")){
            return new Domba();
        }
        return null;
    }
}
