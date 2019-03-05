# Lab 12

> Aim: JFrames, TextAreas, StringBuilder, and Scanner

0. If you haven't already, read [this](https://www.geeksforgeeks.org/this-reference-in-java/) article about the `this` keyword!

1. Download <a href="/Misc/TODO/lab12.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab12`. 

4. Open up `lab12` with Notepad++.

7. Fill in the constructors for `Gui12`. Make the default constructor call the constructor with a string as a parameter, and instantiate all the instance variables of `Gui12` in the constructor that takes in a string as a parameter.
The goal is to create a gui with a text area on the left side to display even numbers and a text area on the right side to display the odd numbers of some input file.<br/><br/> 
**Note:** Use the `StringBuilder` instance variables to hold the strings you want to display inside the `JTextArea` instance variables. You can call the `toString()` method on the `StringBuilder`s to convert them to a string and the `setText()` or `append()` methods on the `JTextArea` instance variables to update them.
8. Fill in the `displayEvenOddNumbers()` method to display the even numbers file to the left text area and the odd numbers to the right text area.<br/><br/>
**Note:** Using the `Scanner` class makes it easy to read *primitives* from a some source file. To read from a file with `Scanner`, you can pass a `File` object to its constructor, and then set up a while loop with `hasNextInt()` instance method to continue reading integers using the `nextInt()` instance method.

9. Create a `Gui12` instance inside the `main()` method. Make it appear on the screen by calling `showGui()` on it, and make it display the even/odd numbers on its text areas by calling `displayEvenAndOddNumbers()` on it by passing it a file.

10. Compile and run your program:
```
javac src/*.java -d bin
java -cp bin Main12 lab12input.txt
```

You should see a gui with the even numbers on the left side and the odd numbers on the right side.

14. To transfer `lab12` to your Mars account:
```
scp -r ../lab12 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab12` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab12 ./
```


## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main12.java" target="_blank">here</a>.