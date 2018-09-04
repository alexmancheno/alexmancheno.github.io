> Aim: To practice with arrays and writing your own methods

1. Open up PowerShell and `cd` into your `H:\` drive:
```
> cd H:\
```
2. Create the following folder structure:
```
lab04
└── src
    ├── Main.java
└── bin
```
You can do so by typing in the following into the PowerShell:
```
> mkdir lab04
> mkdir lab04/src
> mkdir lab04/bin
> New-Item -Name "lab04/src/Main.java" -ItemType "file"
```

3. `cd` into your new project:
```
> cd lab04
```

4. Open `lab04` with Notepad++ by clicking on the top left corner: File -> Open Folder as Workspace, and then find `lab04` in your `H:\` drive.

5. PLace the following in `Main.java`:

    ```
    import javax.swing.*;

    public class Main 
    {
        public static void main(String[] args) 
        {
            String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
            String isOrIsNot, inputWord;
                
            // This line asks the user for input by popping out a single window
            // with text input
            inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
            
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
            // TODO
        } 
    }
    ```

6. Compile and run your program:
```
> javac src/*.java -d bin
> java -cp bin Main
```

7. If you wrote the method from part 6 using `==`, notice that the method will always return false. The reason for this is because `==` compares the *reference* value (memory address) of the String variable. Instead, try using the `equals` method. This will compare the *contents* of the String *objects* the variables refer to! Example:

    ```
    if (s1.equals(s2))
    {
        // TODO
    }
    ```

8. The program only checks for one word at a time. Wrap the above program in an infinite `while` loop that will stop when the word "STOP" is entered. If the word "STOP" is entered, exit the program by calling `System.exit(0)`.