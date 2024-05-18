/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.room;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
                if(roomInfo.length == 9){
                    Room room = new Room(
                            roomInfo[0], Integer.parseInt(roomInfo[1]), 
                            roomInfo[2], roomInfo[3], 
                            roomInfo[4], roomInfo[5]
                    );
                    room.setOccupied(Boolean.parseBoolean(roomInfo[6]));
                    room.setUnderMaintenance(Boolean.parseBoolean(roomInfo[7]));
                    rooms.add(room);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return rooms;
    }
    
    // Method to save rooms to file
    public void saveRooms (List<Room> rooms, LocalDateTime timestamp){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ROOMS_FILE))){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTimestamp = timestamp.format(formatter);
            for (Room room : rooms){
                writer.write(
                        room.getRoomId() + DELIMITER + 
                        room.getRoomNo() + DELIMITER +
                        room.getRoomType() + DELIMITER + 
                        room.getCapacity() + DELIMITER + 
                        room.getFloor() + DELIMITER + 
                        room.getRoomImage() + DELIMITER + 
                        room.isOccupied() + DELIMITER +
                        room.isUnderMaintenance() + DELIMITER +
                        formattedTimestamp + "\n"
                );
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    // Method to add a new room
    public void addRoom(Room room){
        List<Room> rooms = loadRooms();
        rooms.add(room);
        saveRooms(rooms, LocalDateTime.now());
    }
    
    // Method to update room details
    public void updateRoom(Room room){
        List<Room> rooms = loadRooms();
        for(Room r : rooms){
            if(r.getRoomId().equals(room.getRoomId())){
                r.setRoomType(room.getRoomType());
                r.setCapacity(room.getCapacity());
                r.setFloor(room.getFloor());
                r.setRoomImage(room.getRoomImage());
                r.setOccupied(room.isOccupied());
                r.setUnderMaintenance(room.isUnderMaintenance());
                break;
            }
        }
        saveRooms(rooms, LocalDateTime.now());
    }
    
    // Method to delete a room
    public boolean deleteRoom(String roomId){
        List<Room> rooms = loadRooms();
        boolean removed = rooms.removeIf(room -> room.getRoomId().equals(roomId));
        if(removed){
            saveRooms(rooms, LocalDateTime.now());
        }
        return removed;
    }
    
    public Room getRoomById(String roomId){
        List<Room> rooms = loadRooms();
        for(Room room : rooms){
            if(room.getRoomId().equals(roomId)){
                return room;
            }
        }
        return null;
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
        saveRooms(rooms, LocalDateTime.now());
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
        saveRooms(rooms, LocalDateTime.now());
    }
    
    // Method to mark a room as available
    public boolean isRoomNumberDuplicate(String roomNo){
        List<Room> rooms = loadRooms();
        for(Room room : rooms){
            if(room.getRoomId().equals(roomNo)){
                return true;
            }
        }
        return false;
    }
    
    // Method to search for rooms
    public List<Room>searchRooms(String query){
        List<Room>result = new ArrayList<>();
        List<Room> rooms = loadRooms();
        for(Room room : rooms){
            if(room.getRoomId().contains(query) || room.getRoomType().contains(query)){
                result.add(room);
            }
        }
        return result;
    }
    
    // Method to filter rooms by occupancy status
    public List<Room>filterRoomsByStatus(boolean occupied){
        List<Room>result = new ArrayList<>();
        List<Room>rooms = loadRooms();
        for(Room room : rooms){
            if(room.isOccupied() == occupied){
                result.add(room);
            }
        }
        return result;
    }
}
