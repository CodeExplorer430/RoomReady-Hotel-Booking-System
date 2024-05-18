/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.payment;

/**
 *
 * @author Miguel
 */
public class Payment {
    
    int hour;
    int roomNo;
    String date;
    String type;
    
    public Payment(int hour, int roomNo, String date, String type) {
        this.hour = hour;
        this.roomNo = roomNo;
        this.date = date;
        this.type = type;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
