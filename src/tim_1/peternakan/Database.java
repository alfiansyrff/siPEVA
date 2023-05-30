/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_1.peternakan;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Database implements Serializable{
    public static Database instance;
    
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "vrinfarm";
    private final String DB_USER = "root";
    private final String DB_PASS = "";
//    private ArrayList<Mahasiswa> data = new ArrayList<>();
    
    private Database(){       
    }
    
    public static synchronized Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER,DB_PASS);
    }
    
    public void printConnection() {
      try {
          Connection conn = getConnection();
          System.out.println(DB_NAME + "Connected!");
      } catch (SQLException e) {
          System.out.println("Failed to establish a database connection: " + e.getMessage());
          // Handle or log the exception as needed
    }
}
    
    public List<Person> getListPerson() throws SQLException {
    List<Person> persons = new ArrayList<>();
    Connection conn = getConnection();
    try {
        String sql = "SELECT * FROM users";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Person person = new Person();
            person.setNama(rs.getString("name"));
            person.setAddress(rs.getString("address"));
            person.setContactNumber(rs.getString("contact"));
            persons.add(person);
        }
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());     
    }
    return persons;
    }
}
