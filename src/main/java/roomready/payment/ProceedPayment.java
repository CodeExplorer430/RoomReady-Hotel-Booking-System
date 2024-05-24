/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.roomready.payment;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import main.java.roomready.authentication.CustomerAuthenticationManager;
import main.java.roomready.booking.gui.MainFrame;

/**
 *
 * @author philipmathewbobis
 */
public class ProceedPayment extends javax.swing.JFrame {

    private CustomerAuthenticationManager authManager;
    int roomNo;
    int hoursStay;
    String type;
    String combineDate;
    String floorLevel;
    double totalCost = 0;
    int remainingHours = 0;
    static String username;
    
    public ProceedPayment(int roomNo,int hoursStay,String type,String combineDate,String floorLevel) {
        initComponents();
        initializeComponents();
        this.roomNo = roomNo;
        this.hoursStay = hoursStay;
        this.type = type;
        this.combineDate = combineDate;
        this.floorLevel = floorLevel;
        authManager = new CustomerAuthenticationManager();
        displayDetails();
    }
    
    public ProceedPayment(String username){
        this.username = username;
    }
    
    public void displayDetails(){
        String roomNum = String.valueOf(roomNo);
        String stay = String.valueOf(hoursStay);
        roomNumber.setText(roomNum);
        roomType.setText(type);
        hours.setText(stay);
        date.setText(combineDate);
        level.setText(floorLevel);
        
        
        switch (type) {
            case "Deluxe 1 / Deluxe Double":
                if (hoursStay >= 1 && hoursStay <=5) {
                    totalCost += 395;
                }
                if (hoursStay >= 6 && hoursStay <=11) {
                    totalCost += 595;
                }   
                if (hoursStay >= 12 && hoursStay <=23) {
                    totalCost += 995;
                }  
                if (hoursStay == 24) {
                    totalCost += 1495;
                }
                if (hoursStay > 24){
                    totalCost += (hoursStay / 24) * 1495;
                    remainingHours = hoursStay % 24;
                    if (remainingHours >= 1 && remainingHours <=5) {
                    totalCost += 395;
                    }
                    if (remainingHours >= 6 && remainingHours <=11) {
                    totalCost += 595;
                    }   
                    if (remainingHours >= 12 && remainingHours <=23) {
                    totalCost += 995;
                    } 
                }
                break;
            case "Deluxe 2 / Deluxe Twin":
                if (hoursStay >= 1 && hoursStay <=5) {
                    totalCost += 495;
                }
                if (hoursStay >= 6 && hoursStay <=11) {
                    totalCost += 695;
                }   
                if (hoursStay >= 12 && hoursStay <=23) {
                    totalCost += 1100;
                }  
                if (hoursStay == 24) {
                    totalCost += 1595;
                } 
                if (hoursStay > 24){
                    totalCost += (hoursStay / 24) * 1595;
                    remainingHours = hoursStay % 24;
                    if (remainingHours >= 1 && remainingHours <=5) {
                    totalCost += 495;
                    }
                    if (remainingHours >= 6 && remainingHours <=11) {
                    totalCost += 695;
                    }   
                    if (remainingHours >= 12 && remainingHours <=23) {
                    totalCost += 1100;
                    } 
                }
                break;
            case "Superior":
                if (hoursStay >= 1 && hoursStay <=5) {
                    totalCost += 695;
                }
                if (hoursStay >= 6 && hoursStay <=11) {
                    totalCost += 895;
                }   
                if (hoursStay >= 12 && hoursStay <=23) {
                    totalCost += 1195;
                }  
                if (hoursStay == 24) {
                    totalCost += 1695;
                }
                if (hoursStay > 24){
                    totalCost += (hoursStay / 24) * 1695;
                    remainingHours = hoursStay % 24;
                    if (remainingHours >= 1 && remainingHours <=5) {
                    totalCost += 695;
                    }
                    if (remainingHours >= 6 && remainingHours <=11) {
                    totalCost += 895;
                    }   
                    if (remainingHours >= 12 && remainingHours <=23) {
                    totalCost += 1195;
                    } 
                }
                break;
            case "Business Class / Studio Suite":
                    if (hoursStay  == 12){
                        totalCost += 1295;
                    }
                    if (hoursStay == 24){
                        totalCost += 1796;
                    }
                break;
        }
        
        String convertPayment = String.valueOf(totalCost);
        totalPayment.setText(convertPayment);
    }
    
    private void initializeComponents(){
        // Initialize components here
        
        // Add a WindowlListener to the frame
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                // Call your validation here 
                boolean isValid = validateBeforeClose();
                if (!isValid){
                    // If validation fails or the user do unnecessary, cancel the window close operation
                    setDefaultCloseOperation(MainFrame.DO_NOTHING_ON_CLOSE);
                } else {
                    // If validation process or yes, will close the window
                    setDefaultCloseOperation(MainFrame.DISPOSE_ON_CLOSE);
                }
            }
        });
    }
    
    private boolean validateBeforeClose(){
            
       // Get the choice of the user if want to close the window or frame
       int choice = JOptionPane.showConfirmDialog(this, "Do you want to close?","Confirmation",JOptionPane.YES_NO_OPTION);
       return choice == JOptionPane.YES_OPTION; // return the value of choice of equal to YES_OPTION 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roomNumber = new javax.swing.JLabel();
        hours = new javax.swing.JLabel();
        roomType = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        totalPayment = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 244, 225));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hours Stay:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Room no");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Total Cost:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Room Type:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Date:");

        roomNumber.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        roomNumber.setForeground(new java.awt.Color(0, 0, 0));
        roomNumber.setText("Room no");

        hours.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        hours.setForeground(new java.awt.Color(0, 0, 0));
        hours.setText("Hours Stay:");

        roomType.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        roomType.setForeground(new java.awt.Color(0, 0, 0));
        roomType.setText("Room Type:");

        date.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setText("Date:");

        totalPayment.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        totalPayment.setForeground(new java.awt.Color(0, 0, 0));
        totalPayment.setText("Total Cost:");

        level.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        level.setForeground(new java.awt.Color(0, 0, 0));
        level.setText("Floor level:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Floor level:");

        jPanel4.setBackground(new java.awt.Color(154, 51, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Payment Processing");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setBackground(new java.awt.Color(154, 51, 35));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pay Online");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(154, 51, 35));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pay Cash");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roomType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(359, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String toPayFile = "src/main/java/resources/data/Payments.txt";
        String fullName = authManager.getCustomerFullName(username); // getting the full name of user that currently logged in
        String DELIMITER = "|";
        String paymentStatus = "Pending Payment";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(toPayFile,true))){
            writer.write(username + DELIMITER + fullName + DELIMITER + roomNo + DELIMITER + type + DELIMITER + hoursStay + DELIMITER + 
                    floorLevel + DELIMITER + combineDate + DELIMITER + totalCost + DELIMITER + paymentStatus);
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Please proceed to hotel for payment.","Payment Pending",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Booking details:" + 
                    "\nRoom no. " + roomNo + 
                    "\nRoom type: " + type + 
                    "\nHours stay: " + hoursStay +
                    "\nDate on: " + combineDate);
        dispose();
            
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error processing file.",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Define the regex pattern for validating Philippine phone numbers
        String regex = "(^\\+(\\d){12}$)|(^\\d{11}$)";
        // Compile the regex pattern into a Pattern object
        Pattern pattern = Pattern.compile(regex);
        // Use array for options 
        long gcashNumber;
        double payment = 0;
        String[] options = {"Gcash"};
        int choice = JOptionPane.showOptionDialog(null, // parent component
                "Choose your payment method?", // Message
                "Payment Options", // Title
                JOptionPane.DEFAULT_OPTION, // Option type
                JOptionPane.INFORMATION_MESSAGE, // Message type
                null, // icon (theme)
                options, // options for button
                options[0]); // initial value
        boolean successPayment = false;
        
        if(choice == 0){
          String input = JOptionPane.showInputDialog(null,"Please Enter Gcash number? ",
                  "Gcash Number",JOptionPane.INFORMATION_MESSAGE);
          String amount = JOptionPane.showInputDialog(null,"Please enter amount to pay? ",
                  "Enter Amount",JOptionPane.INFORMATION_MESSAGE);
          // Create a matcher object by applying the pattern to the current string
          Matcher matcher = pattern.matcher(input);
          // Check if the input string matches the regex pattern
          if(matcher.matches()){
              // Remove All non-digit characters from the input string 
              String numericString = input.replaceAll("\\D", "");
              
              try{
                  // Parse the amount string to double value
                  payment = Double.parseDouble(amount);
                  // Parse the numeric string into a Long value
                  gcashNumber = Long.parseLong(numericString);
                  
                  while(payment < totalCost){
                      amount = JOptionPane.showInputDialog(null,"Please add: " + (totalCost - payment),
                              "Add",JOptionPane.INFORMATION_MESSAGE);
                      
                      if (amount == null){
                          // Handle case where user cancels the input dialog
                        JOptionPane.showMessageDialog(null, "Payment cancelled.", "Cancelled", JOptionPane.WARNING_MESSAGE);
                        break;
                      }
                      
                      try {
                          // Parse the additional amount
                        double additionalPayment = Double.parseDouble(amount);
                        
                        if(additionalPayment <= 0){
                            JOptionPane.showMessageDialog(null,"Invalid Payment, Please Enter a positive number",
                                    "Invalid input",JOptionPane.ERROR_MESSAGE);
                        } else {
                            payment += additionalPayment;
                        }

                      }catch (NumberFormatException e){
                              JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.", 
                                      "Invalid Input", JOptionPane.ERROR_MESSAGE);
                      }
                  }
                  
                  if(payment >= totalCost){
                      if (payment > totalCost){
                          JOptionPane.showMessageDialog(null,"Change: " + (payment - totalCost),
                        "Payment Successfull",JOptionPane.INFORMATION_MESSAGE);
                      }else {
                          JOptionPane.showMessageDialog(null, "Payment Successful.", 
                        "Successful", JOptionPane.INFORMATION_MESSAGE);
                      }
                      successPayment = true;
                  }
                  
              }catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null, "Number too large to fit in a long " + numericString,
                          "Invalid",JOptionPane.ERROR_MESSAGE);
                  return;
              }
          }else{
              JOptionPane.showMessageDialog(null, "Invalid Phone Number, PLease enter (09XXXXXXXXX)","Invalid",JOptionPane.WARNING_MESSAGE);
              return;
          }
          if(successPayment){
            JOptionPane.showMessageDialog(null, "You've have successfully booked." + 
                    "\nRoom no. " + roomNo + 
                    "\nRoom type: " + type + 
                    "\nHours stay: " + hoursStay +
                    "\nDate on: " + combineDate + 
                    "\nGcash no. " + gcashNumber);
            processPayment(roomNo,type,hoursStay,combineDate,payment,gcashNumber);
                dispose();    
            }
        }else {
            JOptionPane.showMessageDialog(null, "Payment Process was not completed",
                    "Not Completed",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public void processPayment(int roomNo, String roomType,int hours, String date,double payment,long gcashNumber){
        String toPayFile = "src/main/java/resources/data/Payments.txt";
        String fullName = authManager.getCustomerFullName(username); // getting the full name of user that currently logged in
        String DELIMITER = "|";
        String statusPayment = "Paid";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(toPayFile,true))){
            writer.write(username + DELIMITER + fullName + DELIMITER + roomNo + DELIMITER + type + DELIMITER + hoursStay + DELIMITER + 
                    floorLevel + DELIMITER + combineDate + DELIMITER + totalCost + DELIMITER + statusPayment + DELIMITER + gcashNumber);
            writer.newLine();
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error processing file","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProceedPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProceedPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProceedPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProceedPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProceedPayment(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel hours;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel level;
    private javax.swing.JLabel roomNumber;
    private javax.swing.JLabel roomType;
    private javax.swing.JLabel totalPayment;
    // End of variables declaration//GEN-END:variables
}
