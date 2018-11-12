# Lab 20

> Aim: Checked vs. unchecked exceptions in Java

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab20
└── src
    ├── Main20.java
    ├── myCheckedException.java
    ├── UnmyCheckedException.java
└── bin
```
You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab20; mkdir lab20/src; mkdir lab20/bin; New-Item -Name "lab20/src/Main20.java" -ItemType "file"; New-Item -Name "lab20/src/myCheckedException.java" -ItemType "file"; New-Item -Name "lab20/src/UnmyCheckedException.java" -ItemType "file"
```

3. `cd` into your new project, `lab20`.

5. Copy and paste the code from <a href="/Misc/TODO/Main20.java" target="_blank">here</a> into `Main20.java`.

6. In java, there are two kinds of exceptions:<br>
    1. **Checked exceptions:** these kinds of exceptions are checked when you compile your program. All sublcasses of the class `Exception` are checked exceptions, except the class `RuntimeException`. To make your own checked exception class, simply make your new exception class extend from `Exception`. If some block of code can throw a checked exception, then you must either:
        1. mark the enclosing method of that block of code with the `throws` keyword, specifying the kind of exception(s) the method may throw. Example:<br>
        ```
        public static int convertToInt(String s) throws NumberFormatException
        {
                // This will throw a NumberFormatException if 'n' is not a number
                int r = Integer.parseInt(s); 

                return r;
        } 
        ```
        2. wrap that block of code with a `try-catch` block. Example:
        ```
        public static int convertToInt(String s)
        {
                try 
                {
                    int r = Integer.parseInt(s);
                    return r;
                }
                catch (NumberFormatException e)
                {
                    // do something with the exception
                    System.out.println(e.getMessage());

                    return 0;
                }
        } 
        ```
    2. **Unchecked exceptions:** these kinds of exceptions are not checked at compiled time. All subclasses of the class `RuntimeException` are unchecked exceptions. To make your own unchecked exception class, simply make your new exception class extend from `RuntimeException`. Your program will still compile if there are blocks of code that can throw unhandled unchecked exceptions (meaning the block of code is not wrapped with a `try-catch` block or the enclosing method is not marked with the `throws` keyword). Instead, the program will *halt* if an exception is thrown during execution.
7. Fill in `myCheckedException.java`. Make this class a.. *checked exception!*

8. Fill in `UnmyCheckedException.java`. Make this class an.. *unchecked exception!*

9. Take a look at `Main20.java`. There are two methods below the `main()` method, `divide()` and `sqrt()`. `divide()` will throw a `myUncheckedException` if you attempt to divide by zero, and `sqrt()` will throw a `myCheckedException` if you attempt to take the square root of a negative number.

10. Compile and run your code:
```
javac src/*.java -d bin
java -cp bin Main20
```
Can you trace what the output of the program is?


11. The program currently halts.. at some point in the `for-loop`. Prevent the program from haulting! So that the following output is produced:<br>
```
    50 divided by 1 is 50.000000
    Square root of 1 is 1.000000
    Executing 'finally' block

    50 divided by -2 is -25.000000
    Cannot take square root of a negative number: -2
    Executing 'finally' block

    50 divided by 5 is 10.000000
    Square root of 5 is 2.236068
    Executing 'finally' block

    50 divided by -6 is -8.333333
    Cannot take square root of a negative number: -6
    Executing 'finally' block

    Cannot divide by zero!
    Executing 'finally' block

    50 divided by -8 is -6.250000
    Cannot take square root of a negative number: -8
    Executing 'finally' block

    Cannot divide by zero!
    Executing 'finally' block
```

## Solution
The completed code for `Main20.java` can be found <a href="/Misc/Solutions/Lab20/Main20.java" target="_blank">here</a>.

The completed code for `myCheckedException.java` can be found <a href="/Misc/Solutions/Lab20/myCheckedException.java" target="_blank">here</a>.

The completed code for `myUncheckedException.java` can be found <a href="/Misc/Solutions/Lab20/myUncheckedException.java" target="_blank">here</a>.