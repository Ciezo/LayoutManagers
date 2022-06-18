package com;

import javax.swing.*;
import java.awt.*;

public class customerBody extends JPanel {
    // Labels 
    JLabel primAct, secAct, primDest, secDest, bday, diet, height, weight; 

    // Textfield
    JTextField getDietField, getHeightField, getWeightField;

    // Panels 
    JPanel preferences, personal;

    // Combo-box
    JComboBox primActList, secActList, primDestList, secDestList, bdayList;

    public customerBody() {
        // Set the layout manager for this class
        super(new GridLayout(1, 2, 20, 5));
        // setBorder(BorderFactory.createLineBorder(Color.gray));

        /** INSTANTIATE PANELS */
        preferences = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personal = new JPanel(new GridLayout(8, 2, 20, 5));

        preferences.setPreferredSize(new Dimension(350, 202));
        personal.setPreferredSize(new Dimension(200, 202));

        /** INSTANTIATE LABELS */
        primAct = new JLabel("Primary Activity:"); 
        secAct = new JLabel("Secondary Activity:"); 
        primDest = new JLabel("Primary Destination:"); 
        secDest = new JLabel("Secondary Destination:"); 
        bday = new JLabel("Birth Date:"); 
        diet = new JLabel("Dietary Restrictions"); 
        height = new JLabel("Height"); 
        weight = new JLabel("Weight"); 

        /** INSTANTIATE COMBOBOXES */
        // List of activities in a String array
        String[] activies = {
            "Walking Tours",
            "Canoing", 
            "Swimming",
            "Hiking",  
            "Island Hopping" 
        };

        // List of destinations in a String array
        String[] dest = {
            "Indonesia",
            "Iceland", 
            "Palawan", 
            "El Nido", 
            "Cebu"
        };

        // List of Bday 
        String[] bdayArr = {
            "27/02/2022"
        };

        // Instantiate comboboxes
        primActList = new JComboBox<>(activies);
        secActList = new JComboBox<>(activies);
        primDestList = new JComboBox<>(dest);
        secDestList = new JComboBox<>(dest);
        bdayList = new JComboBox<>(bdayArr);

        // Set the size of the combo boxes
        primActList.setPreferredSize(new Dimension(150, 20));
        secActList.setPreferredSize(new Dimension(150, 20));
        primDestList.setPreferredSize(new Dimension(150, 20));
        secDestList.setPreferredSize(new Dimension(150, 20));
        bdayList.setPreferredSize(new Dimension(150, 20));

        // Text fields
        getDietField = new JTextField(); 
        getHeightField = new JTextField(); 
        getWeightField = new JTextField();

        // Set the size of the text fields
        getDietField.setPreferredSize(new Dimension(150, 20));
        getHeightField.setPreferredSize(new Dimension(150, 20));
        getWeightField.setPreferredSize(new Dimension(150, 20));

        /** ADD TO THE RESPECTIVE PANELS */
        // Preferences panel
        preferences.setBorder(BorderFactory.createTitledBorder("Preferences"));
        preferences.add(primAct);
        preferences.add(primActList);
        preferences.add(secAct);
        preferences.add(secActList);
        preferences.add(primDest);
        preferences.add(primDestList);
        preferences.add(secDest);
        preferences.add(secDestList);


        // Personal panel
        personal.setBorder(BorderFactory.createTitledBorder("Personal"));
        personal.add(bday);
        personal.add(bdayList);
        personal.add(diet);
        personal.add(getDietField);
        personal.add(height);
        personal.add(getHeightField);
        personal.add(weight);
        personal.add(getWeightField);

        

        // Add to the main panel
        add(preferences);
        add(personal);

    }

    // public static void main(String[] args) {
    //     customerBody cb = new customerBody(); 
    //     JFrame frame = new JFrame(); 
    //     frame.add(cb);
    //     frame.pack();
    //     frame.setVisible(true);
    // }
}
