# Lab 04
> Aim: Practice with arrays and introduction to reference variables

1. Download <a href="/Misc/TODO/lab04.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab04`. 

4. Open `lab04` with Notepad++ by clicking on the top left corner: File -> Open Folder as Workspace, and then find `lab04`.

5. Fill in the `wordIsThere()` method so that it returns true if the parameter `findMe` is in the String array `theList`.

6. Compile and run your program:
```
javac src/*.java -d bin
java -cp bin Main04
```

7. If you wrote the method from part 6 using `==`, notice that the method will always return false. The reason for this is because `==` compares the *reference* value (memory address) of the String variable. Instead, try using the `equals()` method. This will compare the *contents* of the String *objects* the variables refer to! Example:

    ```
    if (s1.equals(s2))
    {
        // TODO
    }
    ```

8. The program only checks for one word at a time. Wrap the above program in an infinite `while` loop that will stop when the word "STOP" is entered. If the word "STOP" is entered, exit the program by calling `System.exit(0)`.

9. Re-compile and run your program:
```
javac src/*.java -d bin
java -cp bin Main04
```

14. To transfer `lab04` to your Mars account:
```
scp -r ../lab04 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab04` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab04 ./
```

**Note**: This will place `lab04` where ever your PowerShell session currently is. 

## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main04.java" target="_blank">here</a>.