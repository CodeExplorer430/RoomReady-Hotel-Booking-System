/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.room;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Miguel
 */
public class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String roomId;
    private int roomNo;
    private String roomType;
    private String capacity;
    private String floor;
    private String roomImage;
    private boolean occupied;
    private boolean underMaintenance;
   
    // Constructor
    public Room (String roomId, int roomNo, String roomType, String capacity, String floor, String roomImage){
        this.roomId = roomId;
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.capacity = capacity;
        this.floor = floor;
        this.roomImage = roomImage;
        this.occupied = false;
        this.underMaintenance = false;
    }
    
    // Getters and setters
    // Omitted for brevity
    
    public String getRoomId(){
        return roomId;
    }
    
    public int getRoomNo(){
        return roomNo;
    }
    
    public void setRoomNo(int roomNo){
        this.roomNo = roomNo;
    }
    
    public String getRoomType(){
        return roomType;
    }
    
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    
    public String getCapacity(){
        return capacity;
    }
    
    public void setCapacity(String capacity){
        this.capacity = capacity;
    }

    public String getFloor(){
        return floor;
    }
    
    public void setFloor(String floor){
        this.floor = floor;
    }
    
    public String getRoomImage(){
        return roomImage;
    }
    
    public void setRoomImage(String roomImage){
        this.roomImage = roomImage;
    }
    
    public boolean isOccupied(){
        return occupied;
    }
    
    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }
    
    public boolean isUnderMaintenance(){
        return underMaintenance;
    }
    
    public void setUnderMaintenance(boolean underMaintenance){
        this.underMaintenance = underMaintenance;
    }
    
    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomType='" + roomType + '\'' +
                ", capacity=" + capacity +
                ", occupied=" + occupied +
                ", underMaintenance=" + underMaintenance +
                ", floor=" + floor + 
                ", roomImage=" + roomImage +
                '}';
    }
}
