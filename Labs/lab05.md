> Aim: File input and command line arguments

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab05
└── src
    ├── Main.java
    ├── TextFileInput.java
└── bin
├── lab05_input.txt
```
You can do so by typing in the following into the PowerShell while in the root of your `H:\` drive:
```
> mkdir lab05
> mkdir lab05/src
> mkdir lab05/bin
> New-Item -Name "lab05/src/Main.java" -ItemType "file"
> New-Item -Name "lab05/src/TextFileInput.java" -ItemType "file"
> New-Item -Name "lab05/lab05_input.txt"
```
 
3. `cd` into your new project, `lab05`.

4. Open `lab05` as part of your workspace with Notepad++. Place the following in `Main.java`:

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
            for (int i = 0; i < theList.length; i++)
            {
                if (findMe.equals(theList[i]))
                    return true;
            }
            return false;
        }

        public static String[] inputFromFile(TextFileInput input)
        {
            // TODO
        } 
    }
    ```
Place the following in `lab05_input.txt`:
```
hello
goodbye
cat
dog
red
green
sun
moon
```
You can get the code for `TextFileInput.java` from either BlackBoard or <a href="/Misc/TextFileInput.java" target="_blank">here</a>.

5. Fill in the `inputFromFile` method so that it returns a *String* array of the words from the input file.

6. Use either the existing `wordArray` or create a *new* String array by using the `inputFromFile` method to do the same thing we did in `lab04`.

7. Compile your code by running this from the **root** of `lab05`:
```
> javac src/*.java -d bin
```

8. Run your code:
```
> java -cp bin Main lab05_input.txt
```
Notice we are passing in `lab05_input.txt` as an *argument* to our program! `lab05_input.txt` corresponds to `args[0]` in our `main(String[] args)` method.

## Solution
To look at the answer for this lab, click <a href="/Misc/Solutions/Main05.java" target="_blank">here</a>.