# Lab 25

> Aim: More practice with linked lists 

## The "Runner" Technique
This technique is from [Cracking the Coding Interview](https://www.amazon.com/Cracking-Coding-Interview-Programming-Questions/dp/0984782850/ref=sr_1_1?ie=UTF8&qid=1543421265&sr=8-1&keywords=cracking+the+coding+interview):

**The "runner" (or second pointer) technique is used in many linked list problems. The runner technique means that you iterate through the linked list with two pointers simultaneously, with one ahead of the other. The "fast" node might be ahead by a fixed amount, or it might be hopping multiple nodes for each
one node that the "slow" node iterates through.**

## Practice problems
1. Let's get some practice in. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab25
└── src
    ├── Main25.java
    ├── Node.java
    ├── LinkedList.java
└── bin
```
You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab25; mkdir lab25/src; mkdir lab25/bin; New-Item -Name "lab25/src/Main25.java" -ItemType "file"; New-Item -Name "lab25/src/Node.java" -ItemType "file"; New-Item -Name "lab25/src/LinkedList.java" -ItemType "file"
```

3. `cd` into your new project, `lab25`.

4. Copy and paste the code from <a href="/Misc/TODO/lab25/Main25.java" target="_blank">here</a> into `Main25.java`.

5. Copy and paste the code from <a href="/Misc/TODO/lab25/Node.java" target="_blank">here</a> into `Node.java`.

6. Copy and paste the code from <a href="/Misc/TODO/lab25/LinkedList.java" target="_blank">here</a> into `LinkedList.java`.

7. Fill in the static method for `LinkedList` called `equal()` which takes in two linked lists and returns whether they are equal. Two linked lists are equal if they have two distinct linked lists with equal content.

8. Fill in the static method for `LinkedList` called `middleNode()` that takes in a linked list and returns the middle node of the linked list. If two nodes are middle nodes, return the second one.

9. Fill in the static method for `LinkedList` called `isPalindrome()` that takes in a linked list and returns whether the linked list is a palindrome. Modifications to the input linked list are allowed.

10. Compile and run your code against the test cases from `Main25.java`:
```
javac src/*.java -d bin
java -cp bin Main25
```

You should see the following output:
```
list1: (1)->(2)->(1)->null
list2: (1)->(2)->(2)->null
list1 equal to list2: false

list3: (1)->(2)->(3)->null
list4: (1)->(2)->(3)->null
list3 equal to list4: true

list5: (1)->(2)->(3)->null
middle of list5: (2)

list6: (1)->(3)->(5)->(7)->null
middle of list6: (5)
list7: (1)->(2)->(1)->null
Is list7 a palindrome: true

list8: (1)->(2)->(2)->(1)->null
Is list8 a palindrome: true

list9: (1)->(2)->(1)->(1)->null
Is list9 a palindrome: false
```

## Solution
The completed code for `LinkedList.java` can be found <a href="/Misc/Solutions/Lab25/LinkedList.java" target="_blank">here</a>.