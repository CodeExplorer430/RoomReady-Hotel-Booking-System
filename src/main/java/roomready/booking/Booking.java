/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.booking;

import java.time.LocalDate;

/**
 *
 * @author Miguel
 */
public class Booking {
    private String bookingId;
    private String roomId;
    private String guestName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    
    
    // Constructor
    public Booking(String bookingId, String roomId, String guestName, LocalDate checkInDate, LocalDate checkOutDate){
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    
    // Getters and Setters for all properties
    // Omitted for brevity
    
    public String getBookingId(){
        return bookingId;
    }
    
    public void setBookingId(String bookindId){
        this.bookingId = bookingId;
    }
    
    public String roomId(){
        return roomId;
    }
    
    public void setRoomId(String roomId){
        this.roomId = roomId;
    }
    
    public String getGuestName (){
        return guestName;
    }
    
    public void setGuestName(String guestName){
        this.guestName = guestName;
    }
    
    public LocalDate getCheckInDate (){
        return checkInDate;
    }
    
    public void setCheckInDate(LocalDate checkInDate){
        this.checkInDate = checkInDate;
    }
    
    public LocalDate getCheckOutDate(){
        return checkOutDate;
    }
    
    public void setCheckOutDate(LocalDate checkOutDate){
        this.checkOutDate = checkOutDate;
    }
}
