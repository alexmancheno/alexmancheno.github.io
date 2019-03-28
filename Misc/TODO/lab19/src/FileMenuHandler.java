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
        // Get the command name from the event
        String menuName = event.getActionCommand();

        // Print out the name of the button the user pressed
        System.out.println(menuName);      
        
        JFileChooser fc = new JFileChooser();
        
        // Show the open file dialogue and get the status code of which 
        // option the user chooses
        int returnVal = fc.showOpenDialog(null);

        // If user selected a file, create File object and pass it to
        // the gui's readFile method
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            // Get the file the user selected from the 'fc.showOpenDialogu(null)'
            File file = fc.getSelectedFile();
        }
        else if (returnVal == JFileChooser.CANCEL_OPTION)
        {
            System.out.println("Open command cancelled by user.");
        }
    } 
}