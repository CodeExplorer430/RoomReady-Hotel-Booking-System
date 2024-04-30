/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.authentication.validation_samples;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Miguel
 */
public class DateValidator {
    public static boolean isValidDateFormat(String date) {
        try {
            // Try parsing the input string to LocalDate
            LocalDate.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            // If parsing fails, return false
            return false;
        }
    }
    
     public static void main(String[] args) {
        String userInput = "uyiuyiu"; // Example user input
        
        // Validate the user input format
        if (!isValidDateFormat(userInput)) {
            System.out.println("Invalid date format");
        } else {
            System.out.println("Valid date format");
        }
    }
}
