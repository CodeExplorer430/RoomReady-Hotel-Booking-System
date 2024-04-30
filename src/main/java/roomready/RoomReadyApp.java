/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.java.roomready;

import main.java.roomready.gui.LoginMenu;

/**
 *
 * @author Miguel
 */
public class RoomReadyApp {

    public static void main(String[] args) {
      // Create and display the login menu
      java.awt.EventQueue.invokeLater(() -> {
        new LoginMenu().setVisible(true);
        });
    } 
}
