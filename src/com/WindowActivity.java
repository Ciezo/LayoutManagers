/* 
    Document   : WindowActivity.java
    Created on : June 18, 2022 
    Author     : Cloyd Van S. Secuya
    Description:
        This class is responsble for preparing the GUI elements and window 
*/



// PACKAGES
package com;



// IMPORT SECTION
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;



public class WindowActivity extends JFrame implements ActionListener {
    
    // Frame
    JFrame frame = new JFrame("Form1");

    // Panel
    JPanel datePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 2));

    // Label
    JLabel notes = new JLabel("Notes:");
    JLabel addDate = new JLabel("Add Date: ");
    JLabel modDate = new JLabel("Modified Date: ");
    JLabel initDate = new JLabel("Initial Date as Customer: ");

    // Comboxes
    // List of Dates
    String[] dates = {
        "1/24/2006",
        "8/7/2008",
        "3/26/2006"
    };
    JComboBox dateBox = new JComboBox<>(dates);
    JComboBox dateBox2 = new JComboBox<>(dates);
    JComboBox dateBox3 = new JComboBox<>(dates);

    // Wrapper
    JPanel wrapper = new JPanel(new BorderLayout(5, 10));

    // Main Panel
    MainPanel mainpanel = new MainPanel();
    
    // Text Field
    JTextArea textArea = new JTextArea();

    // Constructor 
    public WindowActivity() {
       // Set the title 
       super("Form1");                                  // set the title of the window 
       setSize(new Dimension(900, 405));        // set the size
       setResizable(false);                        // not resizable
       setLocationRelativeTo(null);                        // make it appear on the center of the screen
       // Add the main panel to the jframe
       add(mainpanel);

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);   

       // Add an action listener
       mainpanel.header.saveCust.addActionListener(this);
    }
    



    @Override
    public void actionPerformed(ActionEvent e) {
        // Dipose this screen
        this.dispose();

         // Wrapper panel and text area
        //  wrapper.setPreferredSize(new Dimension(500, 300));
         textArea.setPreferredSize(new Dimension(100, 100));

         // Selected dates
         dateBox2.setSelectedIndex(1);
         dateBox3.setSelectedIndex(2);

         // Date Panel
         datePanel.add(addDate);
         datePanel.add(dateBox);
         datePanel.add(modDate);
         datePanel.add(dateBox2);
         datePanel.add(initDate);
         datePanel.add(dateBox3);
         
         // Add components to wrapper
         wrapper.add(notes, BorderLayout.WEST);
         wrapper.add(textArea, BorderLayout.CENTER);
         wrapper.add(datePanel, BorderLayout.SOUTH);

        // Set up a new screen
        frame.setTitle("Form1");
        frame.add(wrapper);
        frame.setSize(new Dimension(900, 405)); 
        // frame.setResizable(false); 
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);   

    }

}
