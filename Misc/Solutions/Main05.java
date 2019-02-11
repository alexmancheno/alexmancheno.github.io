// Import libraries from the JDK so we can use them throughout the program
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main05 
{
    public static void main(String[] args) 
    {
        // Declare variables
        String[] wordArray = null;
        String isOrIsNot = null, inputWord = null;
        String file = null;

        /* Retrieve the input text filename from the parameter passed in 
         * when executing this program
         * when running: java -cp bin Main05 input05.txt
         * Note: input05.txt corresponds to args[0]!
         */
        file = args[0];

        // Use the static method from below to initialize our wordArray variable
        wordArray = inputFromFile(file);

        // This line asks the user for input by popping out a single window
        // with text input
        inputWord = JOptionPane.showInputDialog("Enter a word in all lower case:");

        // if the inputWord is contained within wordArray return true
        if (wordIsThere(inputWord, wordArray))
            isOrIsNot = "is"; // set to is if the word is on the list
        else
            isOrIsNot = "is not"; // set to is not if the word is not on the list

        // Output to a JOptionPane window whether the word is on the list or not
        JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
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

    // Read file using ArrayList
    public static String[] inputFromFile(String file) 
    {
        // Here, we use an ArrayList since it's a dynamic structure that 
        // we can keep adding elements to without worrying about it getting 
        // full. This helps us avoid worrying about how many lines is contained
        // in the input file.
        TextFileInput input = new TextFileInput(file);
        ArrayList<String> helper = new ArrayList<String>();
        String line = input.readLine();

        while (line != null)
        {
            helper.add(line);
            line = input.readLine(); // read next line
        }

        // Create the String array with the proper size
        String[] result = new String[helper.size()];

        // Convert ArrayList to String array
        result = helper.toArray(result);

        // Finally, return the converted String array
        return result;
    }

    // Read file without using ArrayList
    public static String[] inputFromFileAlternative(String file)
    {
        // Count how many lines there are in the file
        int count = 0;
        TextFileInput input = new TextFileInput(file);
        String line = input.readLine();
        while (line != null)
        {
            count++;
            line = input.readLine(); // read next line
        }

        // After finding out how many lines there are in file, declare 
        // and initialize the resulting array with proper size. Re-read
        // the file, but now storing the content of each line to the String
        // array.
        String[] result = new String[count];
        int i = 0;
        input = new TextFileInput(file);
        line = input.readLine();
        while (line != null)
        {
            result[i++] = line;
            line = input.readLine();
        }

        // Return the String array
        return result;
    }

    /* Q: What's wrong with this method?
     * A: The array is initialized to hold 4 variables, but only the first 3 are
     * initialized to point to String objects. When i = 3 in the for-loop below,
     * the length() method gets called on the uninitialized variable, which
     * causes the runtime error (NullPointerException).
     */
    public static void badFunc()
    {
        String[] a = new String[4];
        a[0] = "debug";
        a[1] = "me";
        a[2] = "plz";
        
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i].length());
        }
    }
}
