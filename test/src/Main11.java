
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class Main11
{
    public static void main(String[] args) 
    {
        // The array to display to gui
        int[][] array = { 
            { 1, 2, 3 }, 
            { 4, 5, 6 }, 
            { 7, 8, 9 } 
        };

        // Create and run the gui
        Gui11 gui = new Gui11();
        gui.showGui();
        gui.printMatrix(array);
    }
}

class Gui11 extends JFrame 
{
    // Private instance variables
    private JScrollPane scrollPane;
    private JTextArea matrixDisplay;
    private JLabel sumDisplay;

    // Default constructor
    public Gui11() 
    {
        this("No title"); // this calls the constructor below this one
    }

    // Constructor with a single parameter
    public Gui11(String title) 
    {
        // Call the super constructor to instantiate the super class variables
        super(title);

        // Configure the JFrame components we inherited
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 100);
        this.setLocation(200, 200);
        this.setLayout(new GridLayout(2, 1)); // set the layout

        // Initialize this gui's instance variables
        this.matrixDisplay = new JTextArea("The matrix should print here:\n", 5, 20);
        this.scrollPane = new JScrollPane(this.matrixDisplay);
        this.sumDisplay = new JLabel("The sum of the matrix is:\n");

        // Add this gui's instance variables to the main content pane of the gui
        this.getContentPane().add(this.scrollPane);
        this.getContentPane().add(this.sumDisplay);
    }

    // Make the gui visible
    public void showGui()
    {
        // TODO
    }

    public void printMatrix(int[][] input)
    {
        // TODO
    }


     // Get string representation of 2D matrix
    private String getMatrixString(int[][] input)
    {
        // Building strings with the StringBuilder is much more efficient
        // then concatenating strings! 
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++)
        {
            for (int j = 0; j < input[i].length; j++)
            {
                sb.append(Integer.toString(input[i][j]) + "\t");
            }
            sb.append("\n"); // append the linebreaker
        }

        // Finally, return the StringBuilder as a string
        return sb.toString();
    }

    // Get string representation of the sum of matrix
    private String getSumString(int[][] input)
    {
        int sum = 0;
        for (int i = 0; i < input.length; i++)
        {
            for (int j = 0; j < input[i].length; j++)
            {
                sum += input[i][j];
            }
        }
        return Integer.toString(sum);
    }
}