# Lab 12

> Aim: JFrames, TextAreas, StringBuilder, and Scanner

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab12
└── src
    ├── Main12.java
└── bin
├── lab12input.txt
```
You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab12; mkdir lab12/src; mkdir lab12/bin; New-Item -Name "lab12/src/Main12.java" -ItemType "file"; New-Item -Name "lab12/lab12input.txt" -ItemType "file"
```

3. `cd` into your new project, `lab12`.

4. Open up `lab12` with Notepad++.

5. Copy and paste the code from <a href="/Misc/TODO/Main12.java" target="_blank">here</a> into `Main12.java`.

6. Copy and paste the code from <a href="/Misc/Input/lab12input.txt" target="_blank">here</a> into `lab12input.txt`.

7. Fill in the constructors for `Gui12`. Make the default constructor call the constructor with a string as a parameter, and instantiate all the instance variables of `Gui12` inside latter constructor.
The goal is to create a gui with a text area on the left side to display even numbers and a text area on the right side to display the odd numbers of some input file.<br/><br/> 
**Note:** Use the `StringBuilder` instance variables to hold the strings you want to display inside the `JTextArea` instance variables. You can call the `toString()` method on the `StringBuilder`s to convert them to a string and the `setText()` method on the `JTextArea` instance variables to display them.
8. Fill in the `displayEvenOddNumbers()` method to display the even numbers file to the left text area and the odd numbers to the right text area.<br/><br/>
**Note:** Using the `Scanner` class makes it easy to read *primitives* from a some source. To read from a file with `Scanner`, you can pass a `File` object to its constructor, and then set up a while loop with `hasNextInt()` instance method to continue reading integers using the `nextInt()` instance method.

9. Create a `Gui12` instance inside the `main()` method. Make it appear on the screen by calling `showGui()` on it, and make it display the even/odd numbers on its text areas by calling `displayEvenAndOddNumbers()` on it by passing it a file.

10. Compile and run your program:
```
javac src/*.java -d bin
java -cp bin Main12 lab12input.txt
```

You should see a gui with the even numbers on the left side and the odd numbers on the right side.

## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main12.java" target="_blank">here</a>.