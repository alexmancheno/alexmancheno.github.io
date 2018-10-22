# Lab 14

> Aim: Creating your own class, `Money`

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab14
└── src
    ├── Main14.java
└── bin
```
You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab14; mkdir lab14/src; mkdir lab14/bin; New-Item -Name "lab14/src/Main14.java" -ItemType "file"
```

3. `cd` into your new project, `lab14`.

4. Open up `lab14` with Notepad++.

5. Copy and paste the code from <a href="/Misc/TODO/Main14.java" target="_blank">here</a> into `Main14.java`.

6. Create a class called `Money`, where each object from this class has two integer instance variables: `dollars` and `cents`.

7. Create two contructors for `Money`, one that takes in no parameters (default constructor), and one that takes in two parameters (for `dollars` and `cents`).

8. Add setter and getter methods for `dollars` and `cents`. Implement *some* error checking in the setter method(s). For example, should a user be able to set `dollars` or `cents` to a negative value? If not and the user does pass in a negative value, throw an *exception!*

9. Create a method, called `compareTo()`, which takes in a `Money` object. The method should return negative if the object the method is being called on is *less* than its parameter, return a positive number if it's greater than its parameter, or 0 if they're equal.

10. *Override* the `equals()` method that `Money` inherits from `Object` (remember, every class inherits from `Object`). The overridden version should return **true** if the content of object the method is being called on is **equal** to its parameter's content. Return false otherwise.

11. *Override* the `toString()` method `Money` inherits from the `Object` class. The overridden version should return a string representation of a `Money` object. An example can be:
```
$12.32
```

12. Compile and run `Main14`. You should see the following output from the test cases in the `main()` method:
```
m1: $0.00
m2: $6.05
m3: $-3.32
m4: $6.52
m1 cents: 0
m2 dollars: 6
m1.compareTo(m2): -6
m2.compareTo(m4): -47
m1.equals(m2): false
```

### Bonus ###
13. Use the `compareTo()` method from the class to write `selectionSort()`, which takes as its input a `Money` array and sorts from least to greatest.

14. Store `m1`, `m2`, `m3`, and `m4` inside a `Money` array. Print out the results from before and after calling `selectionSort()`. 

15. Compile and run `Main14`. The output should now look similar to the following:
```
m1: $0.00
m2: $6.05
m3: $-3.32
m4: $6.52
m1 cents: 0
m2 dollars: 6
m1.compareTo(m2): -6
m2.compareTo(m4): -47
m1.equals(m2): false
before sorting: [$0.00, $6.05, $-3.32, $6.52]
after sorting: [$-3.32, $0.00, $6.05, $6.52]
```

## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main14.java" target="_blank">here</a>.