/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_1.peternakan;

/**
 *
 * @author ASUS
 */
public class Person {
    private String nama;
    private String email;
    private String password;
    private String address;
    private String contactNumber;
    private String role;
    
//    public Person(String nama, String email, String password, String address, String contactNumber){
//        this.address = address;
//        this.contactNumber = contactNumber;
//        this.email = email;
//        this.nama = nama;
//        this.password = password;
//    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getRole() {
        return role;
    }
    
    
    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    public void intro() {
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAddress());
        System.out.println("Nomor: " + getContactNumber());
    }
    
}
