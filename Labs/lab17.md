# Lab 17

> Aim: Inheritance and polymorphism with the Money class

0. This lab involves practice with Java concepts/mechanics and keywords including:<br>
1) The `abstract` keyword. Read more about it [here](https://www.geeksforgeeks.org/abstract-keyword-in-java/).<br>
2) The `instanceof` operator. Read more about it [here](https://www.geeksforgeeks.org/java-instanceof-and-its-applications/).<br>
3) `Dynamic Method Dispatch` (incredibly important). Read more about it [here](https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/).<br>
4) `Inheritance in Java`. Read more about it [here](https://www.geeksforgeeks.org/inheritance-in-java/).

1. Download <a href="/Misc/TODO/lab17.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab17`. 

4. Open up `lab17` with Notepad++.

6. First take a look at the `Money` class inside `Main17.java`. Notice the `abstract` keyword at the top of the class. This means that it is not possible to create an object from this class. If you try do so, you will get a compiler error. 
<br><br>
There are three ways to make a class *abstract*:<br>
1) Use the `abstract` keyword on the **class**.<br>
2) Use the `abstract` keyword on an **instance method** of the class.<br> 
3) Inherit from a class containing an abstract instance method and **not overriding it**.

7. Take a look at the rest of the classes underneath `Money`: `Single`, `Quarter`, `Dime`, `Nickel`, and `Penny`. They all *extend* from `Money`, which means they inherit everything from the `Money` class, but only have access to anything that's non-public.<br><br>
Notice that they all call the **super** constructor of `Money`, which means that the `value` variable each of these classes inherit will be instantiated to either 100, 25, 10, 5, or 1 (depending on the subclass). The only way we can access this value is by using the *get* method that's inherited from `Money`.

8. The goal of this lab exercise is to fill in the `Wallet` class. The class should store all the `Money` objects added to it, be able to print the contents inside the `Wallet`, and have a string representation of the *value* inside the wallet.

9. Compile and run `Main17.java`:
```
javac src/*.java -d bin
java -cp bin Main17
```
    <br>
    You should see the following output:

    ```
    Wallet value: $1.61
    This wallet has: 1 penny(s), 2 nickel(s), 0 dime(s), 2 quarter(s), and 1 single(s)
    m1 is a: dime object
    m1 is a: nickel object
    m1 is a: single object
    Wallet value: $2.76
    ```

14. To transfer `lab17` to your Mars account:
```
scp -r ../lab17 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab17` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab17 ./
```

## Solution
The completed code for `Main17.java` can be found <a href="/Misc/Solutions/Wallet.java" target="_blank">here</a>.
