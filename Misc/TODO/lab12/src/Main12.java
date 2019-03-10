import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

import java.awt.GridLayout;

import javax.swing.JTextArea;
import javax.swing.JFrame;

public class Main12
{
    public static void main(String[] args)
    {
        // TODO: Declare and initialize a Gui12 object. Call instance
        // instance methods needed to display gui with even numbers on
        // one side and odd numbers on other side.
    }
}


// Create a custom gui class
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
        // TODO
    }

    // Constructor with a string as a parameter. Instantiate all the instance
    // variables and configure the JFrame here
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

        // TODO: Initialize instance variables
        

        // TODO: Place instance variables into the content pane of this gui
    }

    // Make the gui visible
    public void showGui()
    {
        this.pack();
        this.setVisible(true);
    }

    // Print even numbers on the left side and odd numbers on the right side
    public void displayEvenAndOddNumbers(String file)
    {
        // TODO
    }
}