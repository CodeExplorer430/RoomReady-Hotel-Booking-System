/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.authentication.validation_samples;

import main.java.roomready.authentication.CustomerAuthenticationManager;

/**
 *
 * @author Miguel
 */
public class ContactValidator {
    
    public static void main(String[] args) {
    // Create an instance of the CustomerAuthenticationManager
    CustomerAuthenticationManager authManager = new CustomerAuthenticationManager();

    // Test cases for contact numbers
    String contactNumber1 = "09569051015";        // Valid: 10 digits without any separators
    String contactNumber2 = "123-456-7890";      // Valid: 10 digits with hyphens
    String contactNumber3 = "123 456 7890";      // Valid: 10 digits with spaces
    String contactNumber4 = "123-4567890";       // Invalid: Missing separator
    String contactNumber5 = "1234-567-890";      // Invalid: Too many digits in the first group

    // Validate contact numbers
    System.out.println(contactNumber1 + " is valid: " + authManager.isValidContactInfo(contactNumber1));
    System.out.println(contactNumber2 + " is valid: " + authManager.isValidContactInfo(contactNumber2));
    System.out.println(contactNumber3 + " is valid: " + authManager.isValidContactInfo(contactNumber3));
    System.out.println(contactNumber4 + " is valid: " + authManager.isValidContactInfo(contactNumber4));
    System.out.println(contactNumber5 + " is valid: " + authManager.isValidContactInfo(contactNumber5));
    }
}
