# Lab 06

> Aim: File input, selection sort, and command line arguments

1. Download <a href="/Misc/TODO/lab06.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab06`. 

4. Open `lab06` with Notepad++ by clicking on the top left corner: File -> Open Folder as Workspace, and then find `lab06`.

3. `cd` into your new project, `lab06`.

4. Open up `lab06` with Notepad++.

8. Fill in the `sum()` and `average()` static methods.

9. Fill in the `inputFromFile()` so that it returns an integer array of the numbers read from `input06.txt`.

    **Note:**
    To convert a `String` to an `int`:
    ```
    String s = "123";
    int a = Integer.parseInt(s);
    ```

10. Use the `selectionSort()` to sort the integer array that was read from `input06.txt`. 

11. Fill in the `main()` method so that when the program runs, the output appears as follows:
```
Before sorting: [123, 75, 43, 221, 325, 6, 117, 763, 83, 785, 21, 775, 425, 647]
After sorting: [6, 21, 43, 75, 83, 117, 123, 221, 325, 425, 647, 763, 775, 785]
Sum: 4409
Average: 314
```
**Note**: You can use code like the following to get a `String` representation of an array:
```
int[] array = {1, 2, 3};
String s = Arrays.toString(array);
System.out.println(s) // prints: [1, 2, 3]
```

10. Compile and run your program:
```
javac src/*.java -d bin
java -cp bin Main06 input06.txt
```

14. To transfer `lab06` to your Mars account:
```
scp -r ../lab06 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab06` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab06 ./
```

**Note**: This will place `lab06` where ever your PowerShell session currently is. 

## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main06.java" target="_blank">here</a>.