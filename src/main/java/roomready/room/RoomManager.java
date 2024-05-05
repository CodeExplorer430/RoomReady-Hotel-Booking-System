/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class RoomManager implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final String ROOMS_FILE = "src/main/java/resources/data/rooms.txt";
    private static final String DELIMITER = "|";
    
    // Method to load existing rooms from file
    public List<Room> loadRooms(){
        List<Room> rooms = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ROOMS_FILE))){
            String line;
            while((line = reader.readLine()) != null){
                String[] roomInfo = line.split("\\" + DELIMITER);
                if(roomInfo.length == 4){
                    Room room = new Room(roomInfo[0], roomInfo[1], Integer.parseInt(roomInfo[2]));
                    room.setOccupied(Boolean.parseBoolean(roomInfo[3]));
                    rooms.add(room);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return rooms;
    }
    
    // Method to save rooms to file
    public void saveRooms (List<Room> rooms){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ROOMS_FILE))){
            for (Room room : rooms){
                writer.write(room.getRoomId() + DELIMITER + room.getRoomType() + DELIMITER + room.getCapacity() + DELIMITER + room.isOccupied() + "\n");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    // Method to add a new room
    public void addRoom(Room room){
        List<Room> rooms = loadRooms();
        rooms.add(room);
        saveRooms(rooms);
    }
    
    // Method to update room details
    public void updateRoom(Room room){
        List<Room> rooms = loadRooms();
        for(Room r : rooms){
            if(r.getRoomId().equals(room.getRoomId())){
                r.setRoomType(room.getRoomType());
                r.setCapacity(room.getCapacity());
                r.setOccupied(room.isOccupied());
                break;
            }
        }
        saveRooms(rooms);
    }
    
    // Method to mark a room as occupied
    public void markRoomOccupied(String roomId){
        List<Room> rooms = loadRooms();
        for(Room room : rooms){
            if(room.getRoomId().equals(roomId)){
                room.setOccupied(true);
                break;
            }
        }
        saveRooms(rooms);
    }
    
    // Method to mark a room as available
    public void markRoomAvailable(String roomId){
        List<Room> rooms = loadRooms();
        for(Room room : rooms){
            if(room.getRoomId().equals(roomId)){
                room.setOccupied(false);
                break;
            }
        }
        saveRooms(rooms);
    }
}
