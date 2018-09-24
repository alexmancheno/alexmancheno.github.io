> Aim: File input and command line arguments

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab06
└── src
    ├── Main.java
    ├── TextFileInput.java
└── bin
├── lab06input.txt
```
You can do so by typing in the following into the PowerShell while in the root of your `H:\` drive:
```
> mkdir lab06
> mkdir lab06/src
> mkdir lab06/bin
> New-Item -Name "lab06/src/Main06.java" -ItemType "file"
> New-Item -Name "lab06/src/TextFileInput.java" -ItemType "file"
> New-Item -Name "lab06/lab06input.txt"
```
 
3. `cd` into your new project, `lab06`.

4. Open up `lab06` with Notepad++.

5. Copy and paste the code from <a href="/Misc/TODO/Main06.java" target="_blank">here</a> into `Main06.java`.

6. Copy and paste the code from <a href="/Misc/Solutions/TextFileInput.java" target="_blank">here</a> into `TextFileInput.java`.

7. Copy and paste the input numbers from <a href="/Misc/Input/lab06input.txt" target="_blank">here</a> into `lab06input.txt`.

8. Fill in the `sum()` and `average()` static methods.

9. Fill in the `inputFromFile()` method. Notice that the return type is an *integer* array!

10. Print out the output from using the above methods.

## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main06.java" target="_blank">here</a>.