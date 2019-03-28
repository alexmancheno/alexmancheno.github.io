import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Lab19Gui extends JFrame
{
    public Lab19Gui(String title)
    {
        super(title);

        // Configure the size, location, and close operation of this gui
        this.setSize(200, 300);
        this.setLocation(400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create file menu objects
        JMenuItem open = new JMenuItem("Open");
        JMenuItem quit = new JMenuItem("Quit");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        FileMenuHandler fmh = new FileMenuHandler(this);

        // Add the action listener to the menu items
        open.addActionListener(fmh);
        quit.addActionListener(fmh);

        // Add the menu items to the file menu
        fileMenu.add(open);
        fileMenu.addSeparator();
        fileMenu.add(quit);

        // Add file menu to the menu bar, and set this gui's
        // menu bar to the menuBar we created above
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
    }

    public void displayGui()
    {
        // Make the gui visible
        this.setVisible(true);
    }

    // Plain old method to read and print every number from a file
    public void readFile(File file)
    {
        Scanner reader = null;
        try
        {
            reader = new Scanner(file);
            while (reader.hasNextInt())
            {
                System.out.println(reader.nextInt());
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}