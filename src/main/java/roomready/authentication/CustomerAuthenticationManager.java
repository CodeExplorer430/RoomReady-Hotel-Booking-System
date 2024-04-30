/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.authentication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Miguel
 */
public class CustomerAuthenticationManager {
    private static final String USER_FILE = "src/main/java/resources/data/customers.txt";
    private static final String DELIMITER  = "|";
    
    public CustomerAuthenticationManager(){
        // Create the user file if it doesn't exist
        try{
            FileWriter fw = new FileWriter(USER_FILE, true);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public void registerUser(Customer user, LocalDateTime registrationTimestamp){
        // Write user information along with registration timestamp to the user file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedTimestamp = registrationTimestamp.format(formatter);
            writer.write(user.getUsername() + DELIMITER + user.getPassword() + DELIMITER + user.getFullName() + DELIMITER + user.getGender() + DELIMITER + user.getEmail() + DELIMITER + user.getContactInfo() + DELIMITER + user.getDOB().toString() + DELIMITER + user.getPhotoPath() + DELIMITER + formattedTimestamp + "\n");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public boolean authenticateUser(String username, String password){
        // Check if user exists in the user file
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] userInfo = line.split("\\" + DELIMITER); // Use the delimiter to split the line
                if (userInfo.length == 9 && userInfo[0].trim().equals(username) && userInfo[1].trim().equals(password)){
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public String getCustomerFullName(String username){
        String fullName = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] userInfo = line.split("\\" + DELIMITER); // Use the delimiter to split the line
                if (userInfo.length == 9 && userInfo[0].trim().equals(username)){
                    fullName = userInfo[2];
                    reader.close();
                    break; // Stop searchin once the customer is found
                }
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return fullName;
    }
    
    public boolean isUserRegistered(String username){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(USER_FILE));
            String line;
            while((line = reader.readLine()) != null){
                String[] userInfo = line.split("\\" + DELIMITER);
                if (userInfo.length > 0 && userInfo[0].trim().equals(username)){
                    return true; // Username found in the file
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return false; // Username not found in the file
    }
    
    public boolean isUserAdult(LocalDate dateOfBirth){   
        // Calculate the age based on the current date
        LocalDate currentDate = LocalDate.now();
        Period ageDifference = Period.between(dateOfBirth, currentDate);
        int age = ageDifference.getYears();
        
        // Check if the age is 18 or older
        return age >= 18;
    }
    
    public boolean isValidDateFormat(String dateOfBirth){   
       try {
           // Attempt to parse the input string into a LocalDate object
           LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
           return true; // Date format is valid
       } catch (DateTimeParseException e){
          return false; // Date format is invalid
       }
    }
    
    public boolean isValidEmail(String email){
        // Define a regular expression pattern for basic email verification
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // Compile the pattern into a regular expression
        Pattern pattern = Pattern.compile(emailRegex);
        // Match the email against the pattern
        Matcher matcher =  pattern.matcher(email);
        // Return true if the email matches the pattern, otherwise return false
        return matcher.matches();
    }
    
    public boolean isValidFullName(String fullName){
        // Define a regular expression pattern for basic full name validation
        String fullNameRegex =  "^[A-Za-z]+(?:\\s[A-Za-z]+)+\\.?(\\s[A-Za-z]+\\.?)?(\\s[A-Za-z]+\\.?(?:\\s(Jr\\.|Sr\\.|I|II|III|IV|V|VI|VII|VIII|IX))?)?$";
        // Compile the pattern into a regular expression
        Pattern pattern = Pattern.compile(fullNameRegex);
        // Match the full name against the pattern
        Matcher matcher = pattern.matcher(fullName);
        // Return true if the full name matches the pattern, otherwise return false
        return matcher.matches();
    }
    
    public boolean isValidContactInfo(String contactInfo) {
        // Define a regular expression pattern for Philippine contact number validation
        String contactInfoRegex = "^(\\+?\\d{1,3}[-\\s]?)?(\\(\\d{1,4}\\)|\\d{1,4})[-\\s]?\\d{3,4}[-\\s]?\\d{4}$";
        // Compile the pattern into a regular expression
        Pattern pattern = Pattern.compile(contactInfoRegex);
        // Match the contact number against the pattern
        Matcher matcher = pattern.matcher(contactInfo);
        // Return true if the contact number matches the pattern, otherwise return false
        return matcher.matches();
    }

    public boolean isValidPassword(String password){
        // Define the criteria for password validation
        int minLength = 8; // Minimum length of the password
        boolean hasLetter = false; // Flag to track the presenceo of letters
        boolean hasDigit = false; // Flag to track presence of digits
        boolean hasSpecialChar = false; // Flag to track the presence of special characters
        
        // Check length
        if (password.length() < minLength){
            return false;
        }
        
        // Check for letters, digits, and special characters
        for (char ch: password.toCharArray()){
            if (Character.isLetter(ch)){
                hasLetter = true;
            } else if (Character.isDigit(ch)){
                hasDigit = true;
            } else if (!Character.isWhitespace(ch)){
                hasSpecialChar = true;
            }
        }
        
        // Return true if password meets all criteria, otherwise return false;
        return hasLetter && hasDigit && hasSpecialChar;
    }
}
