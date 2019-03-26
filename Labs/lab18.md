# Lab 18

> Aim: Inserting Money objects into a sorted linked list

1. Download <a href="/Misc/TODO/lab18.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab18`. 

4. Open up `lab18` with Notepad++.

9. Now that `lab18` is set up, let's quickly review some bits of the classes we have worked with so far:<br>
1) `Money` is a class where each of its objects contain two variables, `dollars` and `cents`. These two fields are used in the class's `compareTo()` method to help determine whether one `Money` object is either less than, equal to, or greater than another `Money` object.<br>
2) `Node` is a class where each of its objects contain two variables, `data` and `next`. `data` is a variable to a *string* object, but we can change its type to be a variable of whatever we want. `next` is simply a variable to another `Node` object.<br>
3) `LinkedList` is a class where each of its objects contain two `Node` variables, `head` and `tail`. The easiest kind of linked list to work with is one where `head` always points to a *dummy* `Node` object, and `head.next` points to the first *real* `Node` object of the linked list. `tail` points to the last `Node` object of the linked list.`SortedLinkedList` will follow this approach.<br>

10. Currently, `Node` holds strings. Update `Node` so that its objects store `Money` objects instead of strings.

11. Create a method called `insert()` in `SortedLinkedList` so that it takes a `Money` object as a parameter and inserts based on *ascending* order.<br>**Hint:** you'll need to use `compareTo()` from the `Money` class.<br><br>
**In general, inserting into a sorted linked list can be done in 6 steps. Suppose we have the following linked list of `Money` objects:**<br>
<img src="svg/insert0.svg" alt="My Awesome SVG" style="height:180px"><br>
**Let's insert `$4.75`:**<br>
**1) Create and set a `Node` variable, `n`, to point to a new `Node` object containing the data being inserted**<br>
<img src="svg/insert1.svg" alt="My Awesome SVG" style="height:180px"><br>
**2) Create and set a `Node` variable, `i`, to `head`**.<br>
<img src="svg/insert2.svg" alt="My Awesome SVG" style="height:180px"><br>
**3) If `i.next` is not *null* and `n.data` is greater than `i.next.data`, set `i` to `i.next`.**<br>
<img src="svg/insert3.svg" alt="My Awesome SVG" style="height:180px"><br>
**4) Repeat step 3 until the condition in step 3 is false.**<br>
<img src="svg/insert4-0.svg" alt="My Awesome SVG" style="height:180px"><br>
**5) Set `n.next` to `i.next`.**<br>
<img src="svg/insert5.svg" alt="My Awesome SVG" style="height:180px"><br>
**6) Set `i.next` to `n`.**<br>
**Note: if `i` is equal to `head` or `tail`, then we need update `tail` to `n`.**<br> 
<img src="svg/insert6.svg" alt="My Awesome SVG" style="height:180px"><br>
**When the function call ends, the linked list will look like the following:**<br>
<img src="svg/insert-final.svg" alt="My Awesome SVG" style="height:180px"><br>

12. Compile and run your code:
```
javac src/*.java -d bin
java -cp bin Main18
```
You should see the following output:
```
Linked list before inserting: null
Inserting $2.44: ($2.44)->null
Inserting $6.01: ($2.44)->($6.01)->null
Inserting $3.99: ($2.44)->($3.99)->($6.01)->null
Inserting $4.50: ($2.44)->($3.99)->($4.50)->($6.01)->null
Inserting $0.44: ($0.44)->($2.44)->($3.99)->($4.50)->($6.01)->null
```

14. To transfer `lab18` to your Mars account:
```
scp -r ../lab18 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab18` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab18 ./
```

## Solution
The completed code for `SortedLinkedList.java` can be found <a href="/Misc/Solutions/Lab18/SortedLinkedList.java" target="_blank">here</a>.