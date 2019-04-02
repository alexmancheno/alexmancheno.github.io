# Lab 20

> Aim: Checked vs. unchecked exceptions in Java

1. Download <a href="/Misc/TODO/lab20.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab20`. 

4. Open up `lab20` with Notepad++.

6. In Java, there are two kinds of exceptions:<br>
    1. **Checked exceptions:** these kinds of exceptions are checked when you compile your program. All subclasses of `Exception` are checked exceptions, except the class `RuntimeException` and any subclass of `RuntimeException`. To make your own checked exception class, simply make your new exception class extend from `Exception`. If some block of code can throw a checked exception, then you must either:
        1. wrap that block of code with a `try-catch` block. Example:
        ```
        public static void readFile(String s)
        {
                try 
                {
                    File f = new File(s);

                    // This line throws a 'FileNotFoundException' if the file cannot be found
                    Scanner reader = new Scanner(f);
            
                    // read file..
                }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
        } 
        ```
        2. mark the enclosing method of that block of code with the `throws` keyword, specifying the checked exception the method may throw. Example:
        ```
        public static void readFile(String s) throws FileNotFoundException
        {
                File f = new File(s);

                // This line throws a 'FileNotFoundException' if the file cannot be found
                Scanner reader = new Scanner(f);
            
                // read file..

        }
        ```
    2. **Unchecked exceptions:** these kinds of exceptions are not checked at compile time. All subclasses of the class `RuntimeException` are unchecked exceptions. To make your own unchecked exception class, simply make your new exception class extend from `RuntimeException`. Your program will still compile if there are blocks of code that can throw unchecked exceptions and not handle them (meaning the block of code is not wrapped with a `try-catch` block or the enclosing method is not marked with the `throws` keyword). Instead, the program will *halt* if an exception is thrown during execution.
7. Create `myCheckedException.java`. Make this class a.. *checked exception!*

8. Create `myUncheckedException.java`. Make this class an.. *unchecked exception!*

9. Take a look at `Main20.java`. There are two methods below the `main()` method, `divide()` and `sqrt()`. Make `divide()` throw a `myCheckedException` object if an attempt to divide by zero is made, and make `sqrt()` throw a `myUncheckedException` object if an attempt to take the square root of a negative number is made.

10. Change the main method so that the code will compile and run. When ran, you should see the following output:
```
    50 divided by 1 is 50.000000
    Square root of 1 is 1.000000
    I print no matter what!

    50 divided by -2 is -25.000000
    Cannot take square root of a negative number: -2
    I print no matter what!

    50 divided by 5 is 10.000000
    Square root of 5 is 2.236068
    I print no matter what!

    50 divided by -6 is -8.333333
    Cannot take square root of a negative number: -6
    I print no matter what!

    Cannot divide by zero!
    I print no matter what!

    50 divided by -8 is -6.250000
    Cannot take square root of a negative number: -8
    I print no matter what!

    Cannot divide by zero!
    I print no matter what!
```

12. Compile and run your program:
```
javac src/*.java -d bin
java -cp bin Main20
```

14. To transfer `lab20` to your Mars account:
```
scp -r ../lab20 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab20` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab20 ./
```

## Solution
The completed code for `Main20.java` can be found <a href="/Misc/Solutions/Lab20/Main20.java" target="_blank">here</a>.

The completed code for `myCheckedException.java` can be found <a href="/Misc/Solutions/Lab20/myCheckedException.java" target="_blank">here</a>.

The completed code for `myUncheckedException.java` can be found <a href="/Misc/Solutions/Lab20/myUncheckedException.java" target="_blank">here</a>.