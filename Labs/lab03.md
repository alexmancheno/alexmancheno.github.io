# Lab 03
> Aim: To become familiar with Java variables, operators, conditional, and iteration statements.

1. Download <a href="/Misc/TODO/lab03.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab03`. 

4. Open `lab03` with Notepad++ by clicking on the top left corner: File -> Open Folder as Workspace, and then find `lab03`.  

5. *Declare* two local variables inside the *main* method of type *float* called `fahrenheit` and `centigrade`.

6. *Initialize* `fahrenheit` to 98.6

7. Create a *static* method that converts degrees in `fahrenheit` to `centigrade`. The formula to do so is:
    c = 5/9 (f - 32)

8. Use your static method to give your `centigrade` variable the result of converting your `fahrenheit` variable.

9. Use a *for* loop to convert numbers 0.0, 5.0, 10.0, 15.0, ..., 40.0 to centigrade and print to the console.

10. Use a *while* loop to get the same output as step 8.

11. Compile your program:
```
javac src/*.java -d bin
```

12. Run your program:
```
java -cp bin Main03
```

13. **Bonus:** write a method to convert `centigrade` to `fahrenheit`.

14. To transfer `lab03` to your Mars account:
```
scp -r ../lab03 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab03` from your Mars account:
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab03 ./
```

**Note**: This will place `lab03` where ever your PowerShell session currently is. 

## Solution
Solution for this lab can be found here <a href="/Misc/Solutions/Main03.java" target="_blank">here</a>.