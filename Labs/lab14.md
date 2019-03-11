# Lab 14

> Aim: Creating your own class, `Money`, and sorting `Money` objects

1. Download <a href="/Misc/TODO/lab14.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab14`. 

4. Open up `lab14` with Notepad++.

3. `cd` into your new project, `lab14`.

4. Open up `lab14` with Notepad++.

6. Create a class called `Money`, where each object from this class has two integer instance variables: `dollars` and `cents`.

7. Create two contructors for `Money`, one that takes in no parameters (default constructor), and one that takes in two parameters (for `dollars` and `cents`).

8. Add setter and getter methods for `dollars` and `cents`. Implement *some* error checking in the setter method(s). For example, should a user be able to set `dollars` or `cents` to a negative value? If not and the user does pass in a negative value, throw an *exception!*

9. Create a method, called `compareTo()`, which takes in a `Money` object. The method should return negative if the object the method is being called on is *less* than its parameter, return a positive number if it's greater than its parameter, or 0 if they're equal.

10. *Override* the `equals()` method that `Money` inherits from `Object` (remember, every class inherits from `Object`). The overridden version should return **true** if the *content* of object the method is being called on is **equal** to its parameter's content. Return false otherwise.

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
14. To transfer `lab14` to your Mars account:
```
scp -r ../lab14 <username>@mars.cs.qc.cuny.edu:~/
```
15. To retrieve `lab14` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab14 ./
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

## Example of passing parameters by value
See if you can trace and understand the output of <a href="/Misc/Other/Main14_1.java" target="_blank">this program</a>.