> Aim: Inserting Money objects into a sorted linked list

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab18
└── src
    ├── Main18.java
    ├── LinkedList.java
    ├── Node.java
    ├── Money.java
└── bin
```
You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab18; mkdir lab18/src; mkdir lab18/bin; New-Item -Name "lab18/src/Main17.java" -ItemType "file"; New-Item -Name "lab18/src/LinkedList.java" -ItemType "file"; New-Item -Name "lab18/src/Node.java" -ItemType "file"; New-Item -Name "lab18/src/Money.java" -ItemType "file"
```

3. `cd` into your new project, `lab18`.

4. Open up `lab18` with Notepad++.

5. Copy and paste the code from <a href="/Misc/TODO/Main18.java" target="_blank">here</a> into `Main18.java`.

6. Copy and paste the code from <a href="/Misc/Solutions/LinkedList.java" target="_blank">here</a> into `LinkedList.java`.

7. Copy and paste the code from <a href="/Misc/Other/Node.java" target="_blank">here</a> into `Node.java`.

8. Copy and paste the code from <a href="/Misc/Other/Money.java" target="_blank">here</a> into `Money.java`.

9. Now that `lab18` is set up, let's quickly review some bits of the classes we have worked with so far:<br>
1) `Money` is a class where each object contains two variables, `dollars` and `cents`. These two fields are used in the class's `compareTo()` method to help determine whether one `Money` object is either less than, equal to, or greater than another `Money` object.<br>
2) `Node` is a class where each object contains two variables, `data` and `next`. `data` is a variable to a *string* object, but we can change its type to be a variable of whatever we want. `next` is simply a variable to another `Node` object.<br>
3) `LinkedList` is a class where each object contains two `Node` variables, `head` and `tail`. By convention, `head` points to a dummy `Node` object, and `head.next` points to the first *real* `Node` object of the linked list. `tail` points to the last `Node` object of the linked list.<br>

10. 


