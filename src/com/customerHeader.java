package com;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class customerHeader extends JPanel {
    // Labels
    JLabel custHeader, padd1, padd2;

    // Button 
    JRadioButton custButton, tripButton, contButton;
    JButton newCust, saveCust;

    // Combo box
    JComboBox custDropDown, custTripDropDown; 

    // Panels
    JPanel headerPanel, filter, buttonPanel;

    public customerHeader() {
        // Set the layout manager for this panel class 
        super(new GridLayout(1, 3, 5, 5)); 
        setBorder(BorderFactory.createLineBorder(Color.gray));


         /** INSTANTIATE PANELS */
         headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
         filter = new JPanel(new GridLayout(3, 2)); 
         buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));

         // Setting the preferred size of the panel
         headerPanel.setPreferredSize(new Dimension(100, 100));
         filter.setPreferredSize(new Dimension(300, 100));
         buttonPanel.setPreferredSize(new Dimension(150, 100));

        /** INSTANTIATE LABELS */
        custHeader = new JLabel("Select Customer or Contact");
        padd1 = new JLabel(" ");
        padd2 = new JLabel(" ");

        // Instantiate buttons
        custButton = new JRadioButton("Customers Only");
        tripButton = new JRadioButton("Customers on a Trip");
        contButton = new JRadioButton("All Contacts");
        newCust = new JButton("New Customer");
        saveCust = new JButton("Save Customer");

        // Set the size of some buttons
        // newCust.setPreferredSize(new Dimension(100, 100));
        // saveCust.setPreferredSize(new Dimension(100, 100));

        /** INSTANTIATE COMBOBOXES */
        // List of Customer/Contact
        String[] contactList ={
            "Alderson, George",
            "Secuya, Cloyd Van"
        };

        // List of customers on a trip
        String[] custTripList = {
            "On Vacation",
            "Away from home"
        };

        // Instantiate comboxes
        custDropDown = new JComboBox<>(contactList);
        custTripDropDown = new JComboBox<>(custTripList);

        // Set the size of combo boxes
        // custDropDown.setPreferredSize(new Dimension(150, 20));
        // custTripDropDown.setPreferredSize(new Dimension(150, 20));

        /** ADD TO THE RESPECTIVE PANELS */
        // headerPanel
        headerPanel.add(custHeader);
        headerPanel.add(custDropDown);

        // Filter panel
        filter.setBorder(BorderFactory.createTitledBorder("Filter"));
        filter.add(custButton);
        filter.add(padd1);
        filter.add(tripButton);
        filter.add(custTripDropDown);
        filter.add(contButton);
        filter.add(padd2);

        // Button panel
        buttonPanel.add(newCust);
        buttonPanel.add(saveCust);


        
        // Add to the main panel
        add(headerPanel);
        add(filter);
        add(buttonPanel);

    }
    
    // public static void main(String[] args) {
    //     customerHeader ch = new customerHeader(); 
    //     JFrame frame = new JFrame(); 
    //     frame.add(ch);
    //     frame.pack();
    //     frame.setVisible(true);
    // }
}
