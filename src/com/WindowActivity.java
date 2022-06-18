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
import javax.swing.JFrame;
import java.awt.Dimension;



public class WindowActivity extends JFrame {

    MainPanel mainpanel = new MainPanel();

    // Constructor 
    public WindowActivity() {
        super("Form1");                                  // set the title of the window 
        setSize(new Dimension(800, 400));        // set the size
        // setResizable(false);                                // not resizable
        setLocationRelativeTo(null);                        // make it appear on the center of the screen
        add(mainpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);         
    }

}
