
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
        // TODO
    }

    private static int[][] fillArray(String myFile) 
    {
        // TODO
    }
}