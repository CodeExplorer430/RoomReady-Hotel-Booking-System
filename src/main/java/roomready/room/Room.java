/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.room;

import java.io.Serializable;

/**
 *
 * @author Miguel
 */
public class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String roomId;
    private String roomType;
    private int capacity;
    private boolean occupied;
    
    // Constructor
    public Room (String roomId, String roomType, int capacity){
        this.roomId = roomId;
        this.roomType = roomType;
        this.capacity = capacity;
        this.occupied = false;
    }
    
    // Getters and setters
    // Omitted for brevity
    
    public String getRoomId(){
        return roomId;
    }
    
    public String getRoomType(){
        return roomType;
    }
    
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public boolean isOccupied(){
        return occupied;
    }
    
    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }
    
    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomType='" + roomType + '\'' +
                ", capacity=" + capacity +
                ", occupied=" + occupied +
                '}';
    }
}
