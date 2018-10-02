// Last updated: 10:30pm at 10/1/18 (not finished)

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class Main11
{
    public static void main(String[] args)
    {
        Gui11 gui = new Gui11();
        gui.showGui();
    }
}

class Gui11 extends JFrame
{
    private JScrollPane scrollPane;
    private JTextArea matrixDisplay;
    private JLabel sumDisplay; 

    // Default constructor
    public Gui11()
    {
        this("No title");
    }

    // Constructor with a single parameter
    public Gui11(String title)
    {
        // Configure the main JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 100);
        this.setLocation(200, 200);
        this.setLayout(new GridLayout(2, 1)); // set the layout

        // Initialize this gui's instance variables
        this.matrixDisplay = new JTextArea("The matrix should print here:\n", 5, 20);
        this.scrollPane = new JScrollPane(this.matrixDisplay);
        this.sumDisplay = new JLabel("The sum of the matrix is:\n");

        // Add this gui's instance variables to the main frame of the gui
        this.getContentPane().add(this.scrollPane);
        this.getContentPane().add(this.sumDisplay);
    }

    // Make the gui visible
    public void showGui()
    {
        this.pack();
        this.setVisible(true);
    }

}