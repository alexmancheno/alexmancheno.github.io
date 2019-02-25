// Import libraries from the JDK so we can use them throughout the program
import java.util.StringTokenizer;
import java.lang.NumberFormatException;

public class Main08 
{

    public static void main(String[] args) 
    {
        // Initialize the global static variable, 'myArray'
        int[][] myArray = fillArray(args[0]);

        // Use methods to print out formatted output
        printArray(myArray);
    }

    private static void printArray(int[][] theArray) 
    {
        for (int i = 0; i < theArray.length; i++) 
        {
            for (int j = 0; j < theArray[i].length; j++)
            {
                System.out.printf("%d\t", theArray[i][j]); // '\t' is short for 'tab'
            }
            System.out.println(); // Go to next line after printing row
        }
    }

    private static int[][] fillArray(String myFile) 
    {
        // Declare and initialize our text file input object
        TextFileInput input = new TextFileInput(myFile);

        // The first line of the input contains the row and col
        String line = input.readLine();
        String delimiter = ",";

        // Tokenize the first line from input
        StringTokenizer tokenizer = new StringTokenizer(line, delimiter);
        
        // Read in the number of rows and columns from the first line
        int rows = Integer.parseInt(tokenizer.nextToken());
        int cols = Integer.parseInt(tokenizer.nextToken());

        // Declare and initialize our array of integer array references 
        int[][] result = new int[rows][];

        // Manually initialize every element inside result to store a reference
        // to a new integer array
        for (int i = 0; i < rows; i++)
        {
            result[i] = new int[cols];
        }

        /* Note: You can also use the much shorter hand way of declaring and 
         * intialize a 2D array by the following:
         *  int[][] result = new int[rows][cols];
         */

        // Begin filling in the resulting array from the remainder of the input file
        line = input.readLine();
        int i = 0, j = 0;
        while (line != null)
        {
            tokenizer = new StringTokenizer(line, delimiter);
            while (tokenizer.hasMoreTokens())
            {
                result[i][j] = Integer.parseInt(tokenizer.nextToken());
                j++;
            }
            j = 0;
            i++;
            line = input.readLine();
        }

        // Finally, return the resulting 2D array after filling it
        return result;
    }

    
}