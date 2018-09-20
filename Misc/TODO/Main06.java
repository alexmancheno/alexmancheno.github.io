
// Import libraries from the JDK so we can use them throughout the program
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class Main06 
{
    public static void main(String[] args) 
    {
        // Declare our variables
        int[] inputArray;
        TextFileInput input;

        // TODO
    }

    public static boolean wordIsThere(String findMe, String[] theList) 
    {
        for (int i = 0; i < theList.length; i++) 
        {
            if (findMe.equals(theList[i]))
                return true;
        }
        return false;
    }

    public static int sum(int[] input)
    {
        // TODO
    }

    public static int average(int[] input)
    {
        // TODO
    }

    public static int[] inputFromFile(TextFileInput input) 
    {
        // TODO
    }

    // Sort an integer array from least to greatest
    public static void selectionSort(int[] input) 
    {
        for (int i = 0; i < input.length; i++) 
        {
            int smallestIndex = i;
            for (int j = i + 1; j < input.length; j++) 
            {
                if (input[j] < input[smallestIndex]) 
                {
                    smallestIndex = j;
                }
            }
            swap(input, i, smallestIndex);
        }
    }

    // Swap elements in an integer array
    public static void swap(int[] input, int i, int j) 
    {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
