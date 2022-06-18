/* 
    Document   : MainPanel.java
    Created on : June 18, 2022 
    Author     : Cloyd Van S. Secuya
    Description:
        For using layout managers and positioning objects and components for 
        the main window to render and show  
*/



// PACKAGES
package com;



// IMPORT SECTION
import javax.swing.*;
import java.awt.*;



public class MainPanel extends JPanel {
    // Instantiate and prepare attributes
    public MainPanel() {

        super(new GridLayout(3,0));

        /** ATTRIBUTES */
        // Container
        Container page1; 
        Container page2; 



        // Panels
        JPanel customerHeader = new JPanel(new GridLayout(1, 3));
            JPanel selCust = new JPanel();
            JPanel custBut = new JPanel(); 
        JPanel customerMeta = new JPanel(); 
        JPanel customerBody = new JPanel();
        JPanel filter = new JPanel();
        JPanel preferences = new JPanel();
        JPanel personal = new JPanel();



        // Labels
        JLabel custHeader = new JLabel("Select Customer or Contact"); 
        JLabel title = new JLabel("Title"); 
        JLabel f_name = new JLabel("First Name: "); 
        JLabel l_name = new JLabel("Last Name: "); 
        JLabel custType = new JLabel("Customer Type: "); 
        JLabel primAct = new JLabel("Primary Activity:"); 
        JLabel secAct = new JLabel("Secondary Activity:"); 
        JLabel primDest = new JLabel("Primary Destination"); 
        JLabel secDest = new JLabel("Secondary Destination"); 
        JLabel bday = new JLabel("Birth Date"); 
        JLabel diet = new JLabel("Dietary Restrictions"); 
        JLabel height = new JLabel("Height"); 
        JLabel weight = new JLabel("Weight"); 



        // Buttons
        JRadioButton custButton = new JRadioButton("Customers Only");
        JRadioButton tripButton = new JRadioButton("Customers on a Trip");
        JRadioButton contButton = new JRadioButton("All Contacts");
        JButton newCust = new JButton("New Customer");
        JButton saveCust = new JButton("Save Customer");
        


        // Text field, Text area and editor pane
        JTextField getTitleField = new JTextField(); 
        JTextField getFnameField = new JTextField(); 
        JTextField getLnameField = new JTextField(); 
        JTextField getHeightField = new JTextField(); 
        JTextField getWeightField = new JTextField(); 
        JTextField getDiet = new JTextField(); 
        
        
        
        // Combo boxes
        String[] custList = {
                "Alderson, George"
        };
        JComboBox custBox = new JComboBox<>(custList);
        custBox.setSelectedIndex(0);

        String[] cType = {
                "Standard",
                "Economy",
                "Luxury",
                "Private"
        };
        JComboBox custTypeList = new JComboBox<>(cType);
        custTypeList.setSelectedIndex(0);

        String[] activies = {
                "Walking Tours",
                "Canoing", 
                "Swimming",
                "Hiking",  
                "Island Hopping" 
        };
        JComboBox primaryActList = new JComboBox<>(activies);
        primaryActList.setSelectedIndex(0);
        JComboBox secActList = new JComboBox<>(activies);
        secActList.setSelectedIndex(1);

        String[] dest = {
                "Indonesia",
                "Iceland", 
                "Palawan", 
                "El Nido", 
                "Cebu"
        };
        JComboBox primaryDestList = new JComboBox<>(dest);
        primaryDestList.setSelectedIndex(0);
        JComboBox secDestList = new JComboBox<>(dest);
        secDestList.setSelectedIndex(1);

    }

}
