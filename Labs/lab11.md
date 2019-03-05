# Lab 11

> Aim: JFrames, TextAreas, and the 'this' keyword

0. We'll be going over the `this` keyword, which you can read more about [here](https://www.geeksforgeeks.org/this-reference-in-java/)

1. Download <a href="/Misc/TODO/lab11.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab11`. 

4. `cd` into your new project, `lab11`.

4. Open up `lab11` with Notepad++.

8. Compile your code and run `HelloWorldSwing`:
```
javac src/*.java -d bin;
java -cp bin HelloWorldSwing
```
You should get a small JFrame with a label "Hello world!". Think of the JFrame object as the *main container*, where everything else will be inside of via its *content pane*.

9. Take a look at `HelloWorldMore.java`. See that it is almost the same as `HelloWorldSwing.java`, but after the JFrame is
set to visible, an input dialog is opened for more text, and that text is put into the *JLabel*. Notice that when we enter in text, the label to the JFrame is set to the input text.

10. Run `HelloWorldMore`:
```
java -cp bin HelloWorldMore
```

11. Take a look at `Main11.java`. There, you'll see two classes, `Main11` and `Gui11`. The goal is two create your own custom *gui* object. Notice the first thing we do is *extend* from the `JFrame` class, which means `Gui11` has access to all of `JFrame`'s non-private variables and methods.

12. Notice that the instance variables of `Gui11` are initialized inside the constructor that takes in only a string as a parameter. The default constructor (no parameters) simply calls the constructor with the string as its only parameter. <br><br> The point of constructors are to initialize the instance variables of the object. It would be considered bad practice to do so somewhere else. <br><br>The `this` keyword is a way of accessing instance variables from either the constructor or an instance method.

13. Fill in `showGui()` so that, once initialized, will *show* `Gui11` object to the screen.

14. Fill in `printMatrix(input)` so that it will display to the gui the matrix to the `matrixDisplay` and the sum of the matrix to `sumDisplay` private instance variables.
**Hint:** you need to access the object's instance variables. 
**Note:** putting all the logic for the `printMatrix(input)` method can make the method pretty large and hard to read. Try abstracting some of the logic to helper functions that constructs the string for `matrixDisplay` and the string for the `sumDisplay`.

15. Finally, compile and run your code:
```
javac src/*.java -d bin
java -cp bin Main11 
```
You should see a gui with the matrix formatted on the top half and the sum of the matrix on the bottom half of the gui.

14. To transfer `lab11` to your Mars account:
```
scp -r ../lab11 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab11` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab11 ./
```

## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main11.java" target="_blank">here</a>.
