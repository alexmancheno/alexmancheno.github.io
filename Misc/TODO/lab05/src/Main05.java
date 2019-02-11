// Import libraries from the JDK so we can use them throughout the program
import javax.swing.JOptionPane;

public class Main05 
{
    public static void main(String[] args) 
    {
        // Declare variables
        String[] wordArray = null;
        String isOrIsNot = null, inputWord = null;
        String file = null;

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
        // TODO
        return null;
    }

    // Read file without using ArrayList
    public static String[] inputFromFileAlternative(String file)
    {
        // TODO
        return null;
    }

    /* Q: What's wrong with this method?
     * A: 
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
