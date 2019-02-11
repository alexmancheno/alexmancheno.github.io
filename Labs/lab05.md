# Lab 05
> Aim: File input, arrays, and command line arguments

1. Download <a href="/Misc/TODO/lab05.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab05`. 

4. Open `lab05` with Notepad++ by clicking on the top left corner: File -> Open Folder as Workspace, and then find `lab05`.

4. Take a look at the source code in `TextFileInput.java`. On line 39, there's the single constructor of the class, which takes only a `String` as a parameter. This `String` represents the path to the file you want to read from. The method `readLine()` on line 76 returns a `String` representing a single line from the input text file. You'll need the constructor and `readLine()` to be able to read from a text file. 

5. Fill in the `inputFromFile()` method so that it returns a *String* array of the words from the input file. You'll want to *create* an instance of `TextFileInput` and then use that instance to read from the input file, `input05.txt`.

    **Note**: `TextFileInput` won't tell you how many lines there are in the input text file, so then how do you know what size you need to initialize the String array you're returning? You don't need to know if you use an `ArrayList`!

6. Change the code so that the `wordArray` variable points to a `String` array of the words from `input05.txt` by using the `inputFromFile()`.

7. Compile your code by running this from the **root** of `lab05`:
```
> javac src/*.java -d bin
```

8. Run your code:
```
> java -cp bin Main05 input05.txt
```
Notice we are passing in `input05.txt` as an *argument* to our program! `input05.txt` corresponds to `args[0]` in our `main(String[] args)` method.

    The program should run just like `lab04`!

9. Fill in the `inputFromFileAlternative()` method that does the same thing as `inputFromFile()`, but without using `ArrayList`. Try writing the method it in such a way that it won't fail on any input size.

9. Take a look at the last method in the bottom, `badFunc()`. The method compiles just fine, but a runtime error occurs if you call that method. What's wrong with the method?

## Solution
To look at the answer for this lab, click <a href="/Misc/Solutions/Main05.java" target="_blank">here</a>.