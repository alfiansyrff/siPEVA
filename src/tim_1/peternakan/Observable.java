/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tim_1.peternakan;

/**
 *
 * @author alfia
 */
public interface Observable {
    public void addSubscriber(Object user);
    public void removeSubscriber(Object user);
    public void notify(String msg);   
}
