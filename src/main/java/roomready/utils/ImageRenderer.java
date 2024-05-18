/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.roomready.utils;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

/**
 *
 * @author Miguel
 */
public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        if(value instanceof ImageIcon){
            ImageIcon imageIcon = (ImageIcon) value;
            JLabel label = new JLabel(imageIcon);
            label.setHorizontalAlignment(JLabel.CENTER);
            
            // Adjust the row height to fit the image
            if(imageIcon.getIconHeight() > table.getRowHeight(row)){
                table.setRowHeight(row, imageIcon.getIconHeight());
            }
            return label;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
