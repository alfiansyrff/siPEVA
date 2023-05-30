/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_1.peternakan;

import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;


/**
 *
 * @author alfia
 */
public class Main {
    public static void main(String[] args) {
        HewanFactory hf = new HewanFactory();
//        Hewan h1 = hf.getInstance("Kambing");
//        h1.intro();
//        
//        Hewan h2 = hf.getInstance("Sapi");
//        h2.intro();
//        
        Hewan h3 = hf.getInstance("Domba");
        h3.makan();
        
         Database.getInstance().printConnection();
         
        List<Person> persons = new ArrayList<>();
        try {
            persons = Database.getInstance().getListPerson();
            for (Person person : persons) {
                System.out.println(person.getNama() + " " + person.getAddress() + " " + person.getContactNumber());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
    }
}
