# Lab 23

> Aim: Recursive programming

## What is Recursion?
1. The process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called as recursive function. The idea behind recursion is that you keep calling the function repeatedly, reducing the size of the problem, until you hit a **base case**. Once you hit a base case, then the solutions to the bigger problems can finally be found. 

2. In coming up with a recursive solution to a problem, it helps to think about some of the key ingredients that make up a recursive algorithm:<br>
    **1. What is the easiest problem we can be asked to solve that we can give the solution to right away? In other words, what is the base case?**<br>
    **2. How can we break the problem into smaller and smaller pieces? In other words, how should we keep making recursive calls?** 

3. Examples:
    1. Factorial:
        ```
        public static int factorial(int n) 
        {
            // Base case
            if (n == 0) return 1;

            // Break problem into smaller pieces
            return n * factorial(n - 1);
        }
        ```
    2. Fibonacci:
        ```
        public static int fibonacci(int n)
        {
            // Base case
            if (n == 0 || n == 1) return n;

            // Break problem into smaller pieces
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        ```   


## Practice
1. Download <a href="/Misc/TODO/lab23.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab23`. 

4. Open up `lab23` with Notepad++.

5. Take a look at `Main23.java` and write a method called `isPalindromeRecursive()` that takes as its input a string and returns whether or not the input string is a palindrome.

6. Write a method called `findMaxRecursive()` that takes as its input an integer array and returns the max numberfrom the input array. **Hint:** you need to write an *overloaded* version of `findMaxRecursive()` that takes as its input the array, current position in the array, and the current maximum of the array.

7. Write a method called `sumOfDigits()` that takes as its input a non-negative integer and returns the sum of every digit of that integer.

8. Compile and run your code:
```
javac src/*.java -d bin
java -cp bin Main23
```
You should see the following output:
```
---- Palindrome test cases ---
aba is palindrome: true
abaa is palindrome: false
abba is palindrome: true
a is palindrome: true
aa is palindrome: true
ab is palindrome: false
--- Finding max test cases ---
array1: [-3, 0, 4, 7, 5, 6, -1, 8, 2]
max of array1: 8
--- Sum of digits test cases ---
1104 sum of digits is: 6
1357010 sum of digits is: 17
```
## Solution
The completed code for `Main23.java` can be found <a href="/Misc/Solutions/Main23.java" target="_blank">here</a>.