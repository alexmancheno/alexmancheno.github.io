
public class Main07 
{

    // Global static variable
    public static int[][] myArray;

    public static void main(String[] args) 
    {
        // Initialize the global static variable, 'myArray'
        myArray = fillArray(args[0]);
        
        // Use methods to print out formatted output
        printArray(myArray);
        System.out.println(); // To seperate output
        printArrayEven(myArray);
    }

    private static void printArray(int[][] theArray) 
    {
        for (int i = 0; i < theArray.length; i++) 
        {
            for (int j = 0; j < theArray[i].length; j++)
                System.out.printf("%d\t", theArray[i][j]); // '\t' is short for 'tab'

            System.out.println(); // Go to next line after printing row                            
        }
    }

    private static void printArrayEven(int[][] theArray) 
    {
        // TODO
    }

    private static int[][] fillArray(String myFile) 
    {
        // TODO
    }
}