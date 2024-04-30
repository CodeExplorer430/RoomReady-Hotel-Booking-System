/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.authentication.validation_samples;

import java.util.UUID;

/**
 *
 * @author Miguel
 */
public class UniqueIdGenerator {
    
    private String userId;
    
    public UniqueIdGenerator(){
        this.userId = generateUniqueId();
    }
    
    private String generateUniqueId(){
        return UUID.randomUUID().toString();
    }
    
    private String getUserId(){
        return userId;
    }
    
    
    public static void main (String[] args){
        
        UniqueIdGenerator uniqueId = new UniqueIdGenerator();
        
        System.out.println("Generated user ID: " + uniqueId.getUserId());
    }
}
