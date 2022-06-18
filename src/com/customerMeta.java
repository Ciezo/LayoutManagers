package com;

import javax.swing.*;
import java.awt.*;

public class customerMeta extends JPanel {
    // Label
    JLabel title, custType, f_name, l_name; 
    
    // Text
    JTextField getTitleField, getfnameField, getlnamefield; 

    // Combo box
    JComboBox custList;

    // Panel
    JPanel panel1, panel2;

    public customerMeta() {
        // Set the layout manager
        super(new GridLayout(2, 0));
        // setBorder(BorderFactory.createLineBorder(Color.gray));
        // Instantiate labels 
        title = new JLabel("Title:");
        custType = new JLabel("Customer Type:"); 
        f_name = new JLabel("First Name:"); 
        l_name = new JLabel("Last Name:"); 

        // Textfield
        getTitleField = new JTextField();
        getfnameField = new JTextField();
        getlnamefield = new JTextField();
        getTitleField.setPreferredSize(new Dimension(150, 20)); 
        getfnameField.setPreferredSize(new Dimension(200, 20)); 
        getlnamefield.setPreferredSize(new Dimension(200, 20)); 

        // Customer List
        String[] cType = {
            "Standard",
            "Economy",
            "Luxury",
            "Private"
        };
        custList = new JComboBox<>(cType);
        custList.setPreferredSize(new Dimension(150, 20));

        // Panels
        panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 2)); 
        panel1.add(title);
        panel1.add(getTitleField);
        panel1.add(f_name);
        panel1.add(getfnameField);
        panel1.add(l_name);
        panel1.add(getlnamefield);
        // panel1.add(custType); 
        // panel1.add(custList); 

        panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 2));
        panel2.add(custType);
        panel2.add(custList);
        

        // add to the main panel
        add(panel1); 
        add(panel2);
    }

    // public static void main(String[] args) {
    //     customerMeta  cm = new customerMeta();
    //     JFrame frame = new JFrame();

    //     frame.add(cm);
    //     frame.pack();
    //     frame.setVisible(true);
        
    // }
}
