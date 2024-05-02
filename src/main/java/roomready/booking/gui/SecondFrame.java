package main.java.roomready.booking.gui;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author philipmathewbobis
 */
public class SecondFrame extends javax.swing.JFrame {
    // Declare variables to store the passed data
    private Object[] rowData;
 
    // Constructor with parameter to accept rowData
    public SecondFrame(Object[] rowData){
            initComponents();
            this.rowData = rowData; // Store the rowData in the instance variable 
            // CALL a method to display the rowData in the frame
            displayRoomDetails();
            initializeComponents();
    }
    
    // Method to display in the frame components
    public void displayRoomDetails(){
        // Assuming you have Jlabels to display the rowData, set their text accordingly
        roomNumber.setText(rowData[0].toString());
        roomAvailability.setText(rowData[1].toString());
        roomType.setText(rowData[2].toString());
    }
    
    /**
     * Creates new form SecondFrame
     */
    public SecondFrame() {
        initComponents();
        initializeComponents();
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
                    setDefaultCloseOperation(SecondFrame.DO_NOTHING_ON_CLOSE);
                } else {
                    // If validation process or yes, will close the window
                    setDefaultCloseOperation(SecondFrame.DISPOSE_ON_CLOSE);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        hour = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roomNumber = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roomAvailability = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roomType = new javax.swing.JLabel();
        confirmBooking = new javax.swing.JButton();
        cancelBooking = new javax.swing.JButton();
        calendar = new com.toedter.calendar.JCalendar();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(218, 215, 205));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fill Form");

        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Schedule Date and Time:");

        hour.setName("hour"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Choose how many hours to stay?");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Room No:");

        roomNumber.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        roomNumber.setForeground(new java.awt.Color(0, 0, 0));
        roomNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Room Availabilty:");

        roomAvailability.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        roomAvailability.setForeground(new java.awt.Color(0, 0, 0));
        roomAvailability.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Room Type:");

        roomType.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        roomType.setForeground(new java.awt.Color(0, 0, 0));
        roomType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        confirmBooking.setText("Confirm Booking");
        confirmBooking.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBookingActionPerformed(evt);
            }
        });

        cancelBooking.setText("Cancel Booking");
        cancelBooking.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(39, 39, 39)
                            .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomType, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(confirmBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(roomNumber))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(roomAvailability))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(roomType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        back.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(715, 715, 715)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void confirmBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBookingActionPerformed
        final String pathFile = "src/main/java/resources/data/Room Reservation.txt";
        final String DELIMITER = "|";
        
        int roomNo = Integer.parseInt(rowData[0].toString());
        String roomAvailable = rowData[1].toString();
        String type = rowData[2].toString();
        int selectedHour = (int) hour.getValue();
        Date date = calendar.getDate();
        // Convert the date to a string
        String dateString = date.toString();
        // Split the date string
        String[] dateParts = dateString.split(" ");
        // distribute each part to specific date components
        String dayInWeek = dateParts[0];
        String month = dateParts[1];
        String day = dateParts[2];
        String year = dateParts[5];
        String combineDate =  month + " " + day + ", " + year + " " + dayInWeek;
        String dateTofile = String.join("", dateParts[0] + dateParts[2] + dateParts[1] + dateParts[5]);
        
        // Use try-with-resources to automatically close the BufferedWriter
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile, true))){
            if (pathFile.length() > 0){
                writer.newLine();
            }
            writer.write(roomNo + DELIMITER + roomAvailable + DELIMITER + type + DELIMITER + 
                    selectedHour + DELIMITER + dateTofile + DELIMITER + dateParts[3]);
            
            JOptionPane.showMessageDialog(null, "Room no: " + roomNo +
                                                             "\nRoom Availability: " + roomAvailable + 
                                                              "\nRoom type: " + type +
                                                              "\nSelected hour: " + selectedHour +
                                                              "\nDate: " + combineDate +
                                                              "\nTime: " + dateParts[3], 
                                                              "Confirmation Booking", 
                                                              JOptionPane.INFORMATION_MESSAGE);
            hour.setValue(0);
            dispose(); // close the window after after the confirmation of booking
        }catch (IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_confirmBookingActionPerformed

    private void cancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingActionPerformed
        // Show a confirmation dialog
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?","Confirmation", JOptionPane.YES_NO_OPTION);
        
        // Check the user's choice
        if (choice == JOptionPane.YES_OPTION){
            dispose();
        }else if (choice == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Continue Filling the form","Back", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cancelBookingActionPerformed
    
    // Method to back to MainFrame or Rooms
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // Initialize MainFrame class to call that frame or window
        MainFrame backToMainFrame = new MainFrame();
        // Set visible true to display again the MainFrame Jframe
        backToMainFrame.setVisible(true);
        // Then dispose the current window or the secondframe
        dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.orback/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JButton cancelBooking;
    private javax.swing.JButton confirmBooking;
    private javax.swing.JSpinner hour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel roomAvailability;
    private javax.swing.JLabel roomNumber;
    private javax.swing.JLabel roomType;
    // End of variables declaration//GEN-END:variables
}
