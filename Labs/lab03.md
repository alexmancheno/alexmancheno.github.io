> Aim: To become familiar with Java variables, operators, conditional, and iteration statements.

1. Open up PowerShell and `cd` into your `H:\` drive:
```
> cd H:\
```
2. Create the following folder structure:
```
lab03
└── src
    ├── Main.java
└── bin
```
You can do so by typing in the following into the PowerShell:
```
> mkdir lab03
> mkdir lab03/src
> mkdir lab03/bin
> New-Item -Name "lab03/src/Main.java" -ItemType "file"
```

3. `cd` into your new project:
```
> cd lab03
```
4. Open `lab03` with Notepad++ by clicking on the top left corner: File -> Open Folder as Workspace, and then find `lab03` in your `H:\` drive.  

5. *Declare* two local variables inside the *main* method of type *float* called `fahrenheit` and `centigrade`.

6. *Initialize* `fahrenheit` to 98.6

7. Create a *static* method that converts degrees in `fahrenheit` to `centigrade`. The formula to do so is:
    c = 5/9 (f - 32)

8. Use your static method to give your `centigrade` variable the result of converting your `fahrenheit` variable.

9. Use a *for* loop to convert numbers 0.0, 5.0, 10.0, 15.0, ..., 40.0 to centigrade and print to the console.

10. Use a *while* loop to get the same output as part 8.

11. Compile your program:
```
> javac src/*.java -d bin
```

12. Run your program:
```
> java -cp bin Main
```

13. **Bonus:** write a method to convert `centigrade` to `fahrenheit`.