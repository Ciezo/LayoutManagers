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


public class MainPanel extends JPanel {
    customerHeader header = new customerHeader();
    customerMeta meta = new customerMeta();
    customerBody body = new customerBody();

    // Instantiate and prepare attributes
    public MainPanel() {
        // Set the Layout Manager of this panel class
        // super(new BorderLayout());
        add(header);
        add(meta);
        add(body);
    }
}
