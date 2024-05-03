/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.booking;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 *
 * @author Miguel
 */
public class BookingManager {
    private List<Booking>bookings;
    private static final String BOOKINGS_FILE = "src/main/java/resources/data/bookings.txt";
    private static final String DELIMITER = "|";
    
    // Constructor
    public BookingManager(){
        this.bookings = new ArrayList<>();
        // Load bookings from file when the manager is created
        loadBookingsFromFile();
    }
    
    
    // Method to search for available rooms based on criteria like check-ins and check-out dates
    public List<String> searchAvailableRooms(LocalDate checkInDate, LocalDate checkOutDate){
        
        // TODO: Implement room search logic
        // Return a list of available room IDs
        // For demo purposes, return a list of dummy room IDs
        List<String> availableRooms = new ArrayList<>();
        availableRooms.add("Room101");
        availableRooms.add("Room102");
        availableRooms.add("Room103");
        return null;
    }
    
    // Method to make a reservation
    public boolean makeReservation(Booking booking){
        // Add the booking to the list of bookings
        boolean added = bookings.add(booking);
        // Save bookings to file
        saveBookingsToFile();
        return false;
    }
    
    // Method to cancel a reservation
    public boolean cancelReservation(String bookingId){
        // Remove the booking with the specified ID from the list of bookings
        boolean removed = bookings.removeIf(booking -> booking.getBookingId().equals(bookingId));
        // Save bookings to file
        saveBookingsToFile();
        return removed;
    }
    
    // Method to retrieve a list of bookings
    public List<Booking> getBooking(){
        // Return the list of bookings
        return bookings;
    }
    
    // Method to load bookings from file
    private void loadBookingsFromFile(){
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOKINGS_FILE))){
            String line;
            while ((line = reader.readLine())!=null){
                String[] parts = line.split("\\" + DELIMITER);
                String bookingId = parts[0];
                String roomId = parts[1];
                String guestName = parts[2];
                LocalDate checkInDate = LocalDate.parse(parts[3]);
                LocalDate checkOutDate = LocalDate.parse(parts[4]);
                // Create a new booking object and add it to the list
                bookings.add(new Booking(bookingId, roomId, guestName, checkInDate, checkOutDate));
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
   // Method to save bookings to file
   private void saveBookingsToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BOOKINGS_FILE))){
            for (Booking booking :  bookings){
                writer.write(booking.getBookingId() + DELIMITER + booking.roomId() + DELIMITER + booking.getGuestName() + DELIMITER + booking.getCheckInDate() + DELIMITER + booking.getCheckOutDate() + "\n");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
