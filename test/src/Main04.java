import javax.swing.JOptionPane;

public class Main04 {
    public static void main(String[] args) {
        String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
        String isOrIsNot, inputWord;

        inputWord = JOptionPane.showInputDialog("Enter a word in all lower case:");
        while (!inputWord.equals("STOP")) {
            if (wordIsThere(inputWord, wordArray))
                isOrIsNot = "is";
            else
                isOrIsNot = "is not";
            JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
            inputWord = JOptionPane.showInputDialog("Enter another word:");
        }
    }

    public static boolean wordIsThere(String findMe, String[] theList) {
        for (int i = 0; i < theList.length; i++)
            if (findMe.equals(theList[i]))
                return true;
        return false;

    }
}
