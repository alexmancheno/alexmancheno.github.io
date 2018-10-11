import java.util.Scanner;

import java.awt.GridLayout;

import javax.swing.JTextArea;
import javax.swing.JFrame;

public class Main12
{
    public static void main(String[] args)
    {
        Gui12 myGui = new Gui12("Lab 12 gui");
        myGui.showGui();
    }
}

class Gui12 extends JFrame
{
    // Instance variables
    private JTextArea leftTextArea;
    private JTextArea rightTextArea;
    private StringBuilder oddStringBuilder;
    private StringBuilder evenStringBuilder;

    // Default constructor
    public Gui12()
    {
        // Call the constructor below
        this("No title");
    }

    public Gui12(String title)
    {
        // Call the super class constructor to initialize the super
        // class variables before initializing this class's variables
        super(title);

        // Configure the JFrame
        // Configure the JFrame components we inherited
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 100);
        this.setLocation(200, 200);
        this.setLayout(new GridLayout(1, 2)); // layout is 1 row to columns

        // Initialize the StringBuilder variables that will be used to 
        // build the strings that will contain the even or odd numbers
        this.oddStringBuilder = new StringBuilder("Odd numbers:\n"); 
        this.evenStringBuilder = new StringBuilder("Even numbers:\n");

        // Initialize the JTextArea variables with the current StringBuilder's
        // string representation
        this.leftTextArea = new JTextArea(this.oddStringBuilder.toString(), 5, 20);
        this.rightTextArea = new JTextArea(this.evenStringBuilder.toString(), 5, 20);

        // Add the JTextArea's to the content pane
        this.getContentPane().add(this.leftTextArea);
        this.getContentPane().add(this.rightTextArea); 
    }

    public void showGui()
    {
        this.pack();
        this.setVisible(true);
    }
}