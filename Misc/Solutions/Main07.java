// Import libraries from the JDK so we can use them throughout the program
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main07 
{
    public static void main(String[] args) 
    {
        // Declare and initialize 'myArray'
        int[][] myArray = fillArray(args[0]);
        
        // Use methods to print out formatted output
        printArray(myArray);
        System.out.println(); // To seperate output
        printArrayEven(myArray);
    }


    private static void printArray(int[][] array) 
    {
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.printf("%d\t", array[i][j]); // '\t' is the special char for 'tab'
            }
            System.out.println(); // Go to next line after printing row                            
        }
    }

    private static void printArrayEven(int[][] array) 
    {
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[i].length; j++) 
            {
                if (array[i][j] % 2 == 0) // Print out if the current element is even
                    System.out.printf("%d\t", array[i][j]);
                else
                    System.out.print("*\t");
            }
            System.out.println(); // Go to next line after printing row
        }
    }

    // Read file using TextFileInput
    private static int[][] fillArray(String myFile) 
    {
        // Declare and initialize TextFileInput variable, tfi
        TextFileInput tfi = new TextFileInput(myFile);

        // The first line to the input is # of rows, the second
        // line of the input is # of columns.
        int row = Integer.parseInt(tfi.readLine()); // read first line
        int col = Integer.parseInt(tfi.readLine()); // read second line

        // Declare and initialize an array of integer arrays 
        int[][] result = new int[row][];

        // Manually initialize every element of 'result' to point to a new integer array
        for (int i = 0; i < row; i++)
            result[i] = new int[col];

        // Begin filling array with the remaining input
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++) 
            {
                // Use try-catch block try prevent the programming
                // from halting if an exception is thrown by the calling
                // Integer.parseInt() with an invalid string
                try 
                {
                    result[i][j] = Integer.parseInt(tfi.readLine());
                }
                catch (NumberFormatException e)
                {
                    result[i][j] = -1; // assign default value if there's an error converting string to int
                    e.printStackTrace(); // print the stack of function calls leading to the error
                }
            }
        }

        // Return the resulting two-dimensional array after filling it
        return result;
    }

    // This method does the exact same thing as the method above 
    // (minus the error checking when reading from the file)
    private static int[][] fillArrayAlternate(String myFile) 
    {
        // Declare variables and initialize them to null
        FileReader fr = null;
        Scanner reader = null;
        try 
        {
            fr = new FileReader(myFile); // Can throw FileNotFoundException
            reader = new Scanner(fr);
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
            return null; // there is no file to read from, so return null
        }

        // Get the number of rows and columns from input
        int row = reader.nextInt();
        int col = reader.nextInt();

        // Declare and initialize an array of integer arrays
        int[][] result = new int[row][];

        // Manually initialize every element of 'result' to point to a new integer array.
        for (int i = 0; i < row; i++)
            result[i] = new int[col];

        // Begin filling array with the remaining input
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                int num = reader.nextInt();
                result[i][j] = num;
            }
        }
        // Close the reader before ending the function
        reader.close();

        // Finally, return the result of filling in the array
        return result;
    }
}