# Lab 16

> Aim: Working with linked lists

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab16
└── src
    ├── Main16.java
    ├── LinkedList.java
    ├── Node.java
└── bin
```
You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab16; mkdir lab16/src; mkdir lab16/bin; New-Item -Name "lab16/src/Main14.java" -ItemType "file"; New-Item -Name "lab16/src/LinkedList.java" -ItemType "file"; New-Item -Name "lab16/src/Node.java" -ItemType "file" 
```
3. Copy and paste the code from <a href="/Misc/TODO/Main16.java" target="_blank">here</a> into `Main16.java`.

4. Copy and paste the code from <a href="/Misc/TODO/LinkedList.java" target="_blank">here</a> into `LinkedList.java`.

5. Copy and paste the code from <a href="/Misc/Other/Node.java" target="_blank">here</a> into `Node.java`.

6. `cd` into your new project, `lab16`.

7. Open up `lab16` with Notepad++.

8. Open `Node.java`. Notice that the class has two private properties, `next` and `data`. This mean that each Node object has their own copies of these two variables. The first variable, `data`, stores a reference to a *string* object, and `next` stores a reference to *another* `Node` object!

9. Open `LinkedList.java`. Notice that there are three instance variables.<br/><br/>The first two instance variables, `head` and `tail`, are private. The reason for this is because we don't want users of this class to access the internal nodes of a linked list and make potentially grave changes to the linked list!<br/><br/>The third instance variable, `length`, is public. We leave this public since it may be a property of the linked list a user may need to know. However, a user is able to modify this property. To get around this, simply make the length property *private*, and write a getter instance method for `LinkedList`

10. Take a look at the constructor for `LinkedList`. We set the `head` and `tail` instance variables to *point* to a **dummy node** (a node that doesn't contain any useful data). This makes it easier to add to a list because we never have to worry about `head` being *null*.<br><br>This means that when a linked list is first created, we have something that looks like the following:<br>
<img src="svg/1.svg" alt="My Awesome SVG" style="height:180px">

11. Fill in the `append()` method. The goal of the method is to take the string we get as a parameter and add it to the end of the linked list. Adding to the end of a linked list can be done in three steps:<br>
    **1) Create the new node, call it `newNode`:**<br><img src="svg/2.svg" alt="My Awesome SVG" style="height:220px"><br>
    **2) Set the `tail.next` to `newNode`:**<br>
    <img src="svg/3.svg" alt="My Awesome SVG" style="height:180px"><br>
    **3) Set `tail` to `newNode`:**<br><img src="svg/4.svg" alt="My Awesome SVG" style="height:170px"><br>
12. Fill in the `prepend()` method. The goal of this method is to take the string we get as a parameter and add it to the beginning of the list. Adding to the beginning of a linked list can be done in three steps:<br>
    **1) Create the new node, call it `newNode`:**<br><img src="svg/2.svg" alt="My Awesome SVG" style="height:220px"><br>
    **2) Set `newNode.next` to `head.next` (remember, `head.next` is the first *real* node of the linked list):**<br><img src="svg/6.svg" alt="My Awesome SVG" style="height:180px"><br>
    **3) Set `head.next` to `newNode`:**<br><img src="svg/7.svg" alt="My Awesome SVG" style="height:180px"><br>
    **Note: If you're prepending the first node of the linked list (when `tail` == `head`), you need to set `tail` to the new node** 

10. Override the `toString()` method we inherit from the `Object` class. The method should return a string that looks like the following:
```
(A)->(B)->(C)->null
```
<br>
To accomplish this, implement the following algorithm:<br>
    1) Create a `Node` *variable* (not an object), `i`, and set it to point to the first real node of the linked list (`head.next`).<br>
    2) Create an empty string (or StringBuilder), `result`.<br>
    3) Take the string that's currently inside `i` (which is `i.data`) and add it to the end of `result`, followed by the string "->".<br>
    4) Set the *variable* `i` to its next node (`i.next`).<br>
    5) Repeat steps 3 and 4 until `i` points to *null* (this happens when you finished iterating through the linked list).<br>
    6) Add the string "null" to the end of `result`.<br>
    7) Return `result`.

13. Compile and run your program:
```
javac src/*.java -d bin
java -cp bin Main16
```
You should see the following output:
```
Contents of linked list before inserting: null
Prepended 'a': (a)->null
Appended  'b': (a)->(b)->null
Appended  'c': (a)->(b)->(c)->null
Prepended 'd': (d)->(a)->(b)->(c)->null
Appended  'e': (d)->(a)->(b)->(c)->(e)->null
Prepended 'f': (f)->(d)->(a)->(b)->(c)->(e)->null
Prepended 'g': (g)->(f)->(d)->(a)->(b)->(c)->(e)->null
```

## Solution
The completed code for `LinkedList.java` can be found <a href="/Misc/Solutions/LinkedList.java" target="_blank">here</a>.
