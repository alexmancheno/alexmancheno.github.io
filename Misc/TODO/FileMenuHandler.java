import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

import java.io.File;

public class FileMenuHandler implements ActionListener 
{

    // Save the reference to the gui object this FileMenuHandler is 
    // associated with
    private Lab19Gui gui;
   
    // Constructor that takes as its paramaeter the gui associated 
    // with this FileMenuHandler
    public FileMenuHandler(Lab19Gui gui) 
    {
        this.gui = gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        // TODO
    } 
}