/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.authentication;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Miguel
 */
public class Admin implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String userId;
    private String username;
    private String password;
    private String fullName;
    private String gender;
    private String email;
    private String contactInfo;
    private String role;
    private String photoPath;
    
    
    public Admin (String username, String password, String fullName, String gender, String email,  String contactInfo, String role, String photoPath){
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
        this.contactInfo = contactInfo;
        this.role = role;
        this.photoPath = photoPath;
        
        // Generate a unique ID
        this.userId = generateUniqueId();
    }
    
    // Method to generate a unique ID using UUID
    private String generateUniqueId(){
        return UUID.randomUUID().toString();
    }
    
    // Getters and setters for all field
    // Omitted for brevity
    
    public String getUserId(){
        return userId;
    }
    
     public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getFullName(){
        return fullName;
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getContactInfo(){
        return contactInfo;
    }
    
    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }
    
    public String getRole(){
        return role;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
    public String getPhotoPath(){
        return photoPath;
    }
    
    public void setPhotoPath (String photoPath){
        this.photoPath = photoPath;
    }
}
