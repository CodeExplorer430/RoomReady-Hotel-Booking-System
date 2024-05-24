package main.java.roomready.booking.gui;

import main.java.roomready.utils.ImageRenderer;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import main.java.roomready.room.*;
import main.java.roomready.room.RoomManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author philipmathewbobis
 */
public class MainFrame extends javax.swing.JFrame {

    private final String pathFile = "src\\main\\java\\resources\\data\\Rooms.txt";
    private AdminBookingManagement adminBooking;
    private RoomManager roomManager;

    
    public MainFrame() {
        initComponents();
        initializeComponents();
        adminBooking = new AdminBookingManagement();
        roomManager = new RoomManager();
        loadRooms();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        submitRoomNo = new javax.swing.JButton();
        enterRoom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wow Hotel");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(218, 215, 205));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 29, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Room Reservation");

        jPanel4.setBackground(new java.awt.Color(154, 51, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Available Rooms");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        roomTable.setBackground(new java.awt.Color(218, 215, 205));
        roomTable.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        roomTable.setForeground(new java.awt.Color(0, 0, 0));
        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room no.", "Availability", "Type", "Room Capacity", "Floor level", "Room Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        roomTable.setRowHeight(30);
        roomTable.setShowHorizontalLines(false);
        roomTable.setShowVerticalLines(false);
        roomTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                roomTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(roomTable);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enter Room No.");

        submitRoomNo.setBackground(new java.awt.Color(154, 51, 35));
        submitRoomNo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submitRoomNo.setForeground(new java.awt.Color(255, 255, 255));
        submitRoomNo.setText("Submit");
        submitRoomNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitRoomNo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitRoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRoomNoActionPerformed(evt);
            }
        });

        enterRoom.setBackground(new java.awt.Color(255, 255, 255));
        enterRoom.setForeground(new java.awt.Color(0, 0, 0));
        enterRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 297, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(submitRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean buttonClicked = false;
    
    
    public void loadRooms(){
        List<Room> rooms = roomManager.loadRooms();
        displayRooms(rooms);
    }
    
    public void displayRooms(List<Room> rooms){
        DefaultTableModel model = (DefaultTableModel) roomTable.getModel();
        model.setRowCount(0);
        
        for(Room room : rooms){
            model.addRow(new Object[]{
                room.getRoomNo(),
                roomStatus(room),
                room.getRoomType(),
                room.getCapacity(),
                room.getFloor(),
                createImageIcon(room.getRoomImage())
            });
        }
        
        roomTable.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
    }
    
    private ImageIcon createImageIcon(String imagePath){
        if(imagePath != null && !imagePath.isEmpty()){
            ImageIcon imageIcon = new ImageIcon(imagePath);
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            return new ImageIcon(image);
        }
        return null;
    }
    
    private String roomStatus(Room room){
        if(room.isOccupied()){
            return "Occupied";
        }else if (room.isUnderMaintenance()){
            return "Maintenance";
        }else{
            return "Available";
        }
    }
    
    private void setupEnterKeyHandling(){
        // Add action listener to the Enter Room no.
        enterRoom.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                submitRoomNo.doClick();
            }
        });
    }
    
    private void roomTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_roomTablePropertyChange
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        
        // Set the default cell renderer for all columns
        roomTable.setDefaultRenderer(Object.class, dtcr);
        
        // Set the renderer for the first column
        roomTable.getColumnModel().getColumn(0).setCellRenderer(dtcr);
        
        // Set the preferred width for specific columns
        roomTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        roomTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        roomTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        roomTable.getColumnModel().getColumn(3).setPreferredWidth(120);
        roomTable.getColumnModel().getColumn(4).setPreferredWidth(120);
        roomTable.getColumnModel().getColumn(5).setPreferredWidth(200);
    }//GEN-LAST:event_roomTablePropertyChange
    
    private void submitRoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRoomNoActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) roomTable.getModel();
        String selectedValue = enterRoom.getText();
        boolean foundRoom = false;
        boolean isAvailable = false;
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();
        
           
        if(!selectedValue.isEmpty()){
            for (int row = 0;row < rowCount;row++){
            // Get the room number value from the first column of the current row
            Object cellValue = model.getValueAt(row, 0);
            if (cellValue != null && cellValue.toString().equals(selectedValue)){
                foundRoom = true; // update the found flag
                Object roomAvailabilty = model.getValueAt(row, 1);
                if (roomAvailabilty != null && roomAvailabilty.toString().equalsIgnoreCase("Available")){
                    isAvailable = true; // update available room
                    // Return an array conataining the data of the row
                    Object[] rowData = new Object[columnCount];
                    for (int i = 0;i < columnCount;i++){
                        rowData[i] = model.getValueAt(row, i);
                    }
                    Object rateType = model.getValueAt(row, 2);
                       if (rateType != null && rateType.toString().equalsIgnoreCase("Deluxe 1 / Deluxe Double")){
                           JOptionPane.showMessageDialog(null, "Room no. " + rowData[0] +
                                                                      "\nRoom availability: " + rowData[1] +
                                                                      "\nRoom type: " + rowData[2]+ 
                                                                      "\nRates: 3hrs 395 pesos" + 
                                                                      "\n\t\t 6hrs 595 pesos" + 
                                                                      "\n\t\t 12hrs 995 pesos" + 
                                                                      "\n\t\t 24hrs 1,495 pesos" + 
                                                                      "\n\t\t OT 132 pesos","Selected Room",JOptionPane.INFORMATION_MESSAGE);
                
                       }
                       if (rateType != null && rateType.toString().equalsIgnoreCase("Deluxe 2 / Deluxe Twin")){
                           JOptionPane.showMessageDialog(null, "Room no. " + rowData[0] +
                                                                      "\nRoom availability: " + rowData[1] +
                                                                      "\nRoom type: " + rowData[2]+ 
                                                                      "\nRates: 3hrs 495 pesos" + 
                                                                      "\n\t\t 6hrs 695 pesos" + 
                                                                      "\n\t\t 12hrs 1,100 pesos" + 
                                                                      "\n\t\t 24hrs 1,595 pesos" + 
                                                                      "\n\t\t OT 165 pesos","Selected Room",JOptionPane.INFORMATION_MESSAGE);
                
                       }
                       if (rateType != null && rateType.toString().equalsIgnoreCase("superior")){
                           JOptionPane.showMessageDialog(null, "Room no. " + rowData[0] +
                                                                      "\nRoom availability: " + rowData[1] +
                                                                      "\nRoom type: " + rowData[2]+ 
                                                                      "\nRates: 3hrs 695 pesos" + 
                                                                      "\n\t\t 6hrs 895 pesos" + 
                                                                      "\n\t\t 12hrs 1,195 pesos" + 
                                                                      "\n\t\t 24hrs 1,695 pesos" + 
                                                                      "\n\t\t OT 265 pesos","Selected Room",JOptionPane.INFORMATION_MESSAGE);
                
                       }
                       if(rateType != null && rateType.toString().equalsIgnoreCase("Business Class / Studio Suite")){
                           JOptionPane.showMessageDialog(null, "Room no. " + rowData[0] +
                                                                      "\nRoom availability: " + rowData[1] +
                                                                      "\nRoom type: " + rowData[2]+ 
                                                                      "\nRates: 12 Hours 1295 " + 
                                                                      "\n24 Hours 1796","Selected Room",JOptionPane.INFORMATION_MESSAGE);
                       }
                    // Open the next window here 
                SecondFrame fillForm = new SecondFrame(rowData);
                fillForm.setVisible(true);
                // Dispose the current window
                dispose();
                break;
                }else {
                    if (!isAvailable && roomAvailabilty.toString().equalsIgnoreCase("Occupied")){
                JOptionPane.showMessageDialog(null, "Room is occupied.", "Not Available!!", JOptionPane.WARNING_MESSAGE);
                    }
                    if (!isAvailable && roomAvailabilty != null && roomAvailabilty.toString().equalsIgnoreCase("Maintenance")){
                JOptionPane.showMessageDialog(null, "Room is under maintenance.", "Not Available!!", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }
            if (!foundRoom){
                JOptionPane.showMessageDialog(null, "No Matching room number found", "Room not found", JOptionPane.WARNING_MESSAGE);
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "Field is empty. Enter room number.","Required!!", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_submitRoomNoActionPerformed

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded
    // Declare a boolean variable to track whether the enter key has been pressed
    private boolean enterKey = false;
    
    private void enterRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterRoomActionPerformed
        // Check if enter key handling setup is needed
        if (!enterKey){
            setupEnterKeyHandling();
        }
        // Set enter key to true to indicate that setup has been done
        enterKey = true;
    }//GEN-LAST:event_enterRoomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField enterRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable roomTable;
    private javax.swing.JButton submitRoomNo;
    // End of variables declaration//GEN-END:variables
}
