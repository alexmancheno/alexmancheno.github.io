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
       // TODO
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