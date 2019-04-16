# Lab 25

> Aim: More practice with linked lists 

## The "Runner" Technique
This technique is from [Cracking the Coding Interview](https://www.amazon.com/Cracking-Coding-Interview-Programming-Questions/dp/0984782850/ref=sr_1_1?ie=UTF8&qid=1543421265&sr=8-1&keywords=cracking+the+coding+interview):

**The "runner" (or fast pointer) technique is used in many linked list problems. The runner technique means that you iterate through the linked list with two pointers simultaneously, with one pointer iterating faster than the other pointer. The "fast" pointer might be ahead by a fixed amount, or it might be iterating past multiple nodes for each
one node that the "slow" node iterates through.**

## Practice problems
1. Download <a href="/Misc/TODO/lab25.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab25`. 

4. Open up `lab25` with Notepad++.

7. Fill in the static method for `LinkedList` called `equal()` which takes in two linked lists and returns whether the two lists are equal. Two linked lists are equal if they have the same length and every adjacent pair of nodes contain equal data.

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