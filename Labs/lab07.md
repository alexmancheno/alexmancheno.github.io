# Lab 07

> Aim: Two-dimensional arrays, input files, and try-catch block

0. We'll be learning about the `try-catch` block. To read more about it, go [here](https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/)

1. Download <a href="/Misc/TODO/lab07.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab07`. 

3. Open `lab07` with Notepad++ by clicking on the top left corner: File -> Open Folder as Workspace, and then find `lab07`.

4. `cd` into your new project, `lab07`.

4. Open up `lab07` with Notepad++.

8. Fill in the `fillArray()` method. The method should return an m x n matrix containing every number **after the second** number of the input file. The first number in the input file represents the number of **rows** in the array being returned, while the second number in the input file represents the number of **columns**.

    **Note**: passing a string containing a character that isn't a digit to `Integer.parseInt()` will cause your program to halt (runtime error). Use a `try-catch` block to prevent your program from halting in such a case. If such a string is encountered, assign a default value of `-1`. 

10. Fill in the `printArrayEven()` method. The method should print only the even numbers of the array. For example, an array like:
```
    1 2 3
    4 5 6
    7 8 9
```
Should print as:
```
    * 2 *
    4 * 6
    * 8 * 
```

11. Compile and run your program:
```
javac src/*.java -d bin
java -cp bin Main07 input07.txt
```

    You should see the following output:
    ```
    1       3       5       7       -1
    34      56      78      21      44
    36      77      29      87      48
    77      25      65      77      2

    *       *       *       *       *
    34      56      78      *       44
    36      *       *       *       48
    *       *       *       *       2
    ```

13. **Bonus**: create another method called `fillArrayAlternate()` that does the exact same thing as `fillArray()`, but using the `Scanner` and `FileReader` class. 

14. To transfer `lab07` to your Mars account:
```
scp -r ../lab07 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab07` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab07 ./
```

**Note**: This will place `lab07` where ever your PowerShell session currently is. 

## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main07.java" target="_blank">here</a>.