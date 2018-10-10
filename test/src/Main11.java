// Last updated: 10:30am at 10/3/18 (finished)
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class Main11
{
    public static void main(String[] args)
    {
        // The array we want to display
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
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

        // Configure the main JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 100);
        this.setLocation(200, 200);
        this.setLayout(new  GridLayout(2, 1)); // set the layout

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

    public void printMatrix(int[][] input)
    {
        // Get the formatted strings from the helper methods from below
        String matrixString = getMatrixString(input);
        String sumString = getSumString(input);

        // Set the text to the displays with the text that's already there
        // concatenated with the matrix and sum strings
        this.matrixDisplay.setText(this.matrixDisplay.getText() + matrixString);
        this.sumDisplay.setText(this.sumDisplay.getText() + sumString);
    }

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