# Lab 21

> Aim: Interfaces, generics, and SortedLinkedList of generic objects

## Interfaces
Interfaces in Java are like *abstract classes*, except that all of its methods are abstract (methods that contain no bodies). Another difference is that variables in an interface are by default `final` and `static`. To have a class use an interface, you use the `implements` keyword rather than the `extends` keyword. Example:<br>
```
interface Animal
{
    public void move();
    public void eat();
}

class Dog implements Animal
{
    @Override
    public void move() 
    {
        System.out.println("Dog is moving!");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog is eating!");
    }
}

class Cat implements Animal
{
    @Override
    public void move() 
    {
        System.out.println("Cat is moving!");
    }

    @Override
    public void eat()
    {
        System.out.println("Cat is eating!");
    }
}
```
Given these set of classes, we can declare *variables* from the interface and assign them to point to either Cat or Dog *objects*. Then, we can take advantage of Dynamic Method Dispatch (or Runtime Polymorphism) to execute the version of the methods that come from the *object*. Example:<br>

```
public static void main(String[] args)
{
    Animal dog = new Dog();
    Animal cat = new Cat();
    dog.move();
    cat.move();
    dog.eat();
    cat.eat();
}
```

This will produce the following output:
```
Dog is moving!
Cat is moving!
Dog is eating!
Cat is eating!
```
Interfaces are used when you want to achieve *abstraction* among classes that are related (perhaps they share method signatures, but differ in implementation). Thus, interfaces can be though of as a *contract* that any class implementing the interface will either implement every method or remain abstract.<br><br>
**Here's a summary of some important points about interfaces:**
1. Interfaces summarize what the classes that implement the interface must do, but not how.
2. If a class implements an interface but does not override every method, then that class must be abstract.
3. You cannot create instances (objects) from an interface.
4. A class can implement one or more interfaces, where a class an only extend from a single class.
5. All methods in an interface are public and abstract by default.
6. All variables in an interface are public, static, and final by default.

## Generics
Say that you're writing a data structure, perhaps a `Node` class for a `LinkedList` that stores strings:
```
class Node
{
    public String data;
    public Node next;
}
```
Perhaps you might write a program using this class to create linked lists that store strings. But what if you needed your linked lists to store `String` or `Money` objects? Without generics, you would have to create a `Node` class for each of these types.<br><br>
Generics allow your data structures (arrays, ArrayLists, LinkedLists, etc.) to be flexible in the kind of data they store. To use generics, use the `<>` operator to specify the kinds of data you're generic class will use. Example:
``` 
class Node<T>
{
    public T data;
    public Node<T> next;
}
```
Creating objects from this class would look like the following:
```
    Node<String> node1 = new Node<String>();
    Node<Money> node2 = new Node<Money>();
```
You can also specify more than one type inside the `<>` operator:
```
class Node<T, V>
{
    public T data1;
    public V data2;
    public Node<T, V> next;
}
```
Creating objects from this class would look like the following:
```
    Node<String, Integer> node1 = new Node<String, Integer>();
    Node<Money, String> node2 = new Node<Money, String>();
```
**Here's a summary of some important advantages of generics:**
1. Code reusability: you can write methods, classes, and interfaces once and use any type of data. 
2. Type safety: generics make errors appear at compile time rather than runtime (which is harder to debug). Example:
```
List list = new ArrayList();
list.add("hello");
String s = (String) list.get(0); // cast
```
This will compile *whether or not* `list.get(0)` is actually a string! This issue vanishes in the following example with the use of generics:
```
List<String> list = new ArrayList<String>();
list.add("hello");
String s = list.get(0);   // no cast
```
3. Implementing generic algorithms: you can write implementations of algorithms that work on any kind of data and still have type safety. Example:

```
public static <T> void selectionSort(T[] input)
{
    // use selection sort algorithm
}

public static <T> T returnLargest(T[] input)
{
    // return the largest element of the input array
}
```

## Revisiting SortedLinkedList
> Goal: make the Node and SortedLinkedList class from Lab 18 generic. 

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab21
└── src
    ├── Main21.java
    ├── SortedLinkedList.java
    ├── Node.java
    ├── Money.java
└── bin
```

You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab21; mkdir lab21/src; mkdir lab21/bin; New-Item -Name "lab21/src/Main21.java" -ItemType "file"; New-Item -Name "lab21/src/SortedLinkedList.java" -ItemType "file"; New-Item -Name "lab21/src/Node.java" -ItemType "file"; New-Item -Name "lab21/src/Money.java" -ItemType "file"
```

3. `cd` into your new project, `lab21`.

4. Copy and paste the code from <a href="/Misc/TODO/Lab21/Main21.java" target="_blank">here</a> into `Main21.java`.

5. Copy and paste the code from <a href="/Misc/TODO/Lab21/SortedLinkedList.java" target="_blank">here</a> into `SortedLinkedList.java`.

6. Copy and paste the code from <a href="/Misc/TODO/Lab21/Node.java" target="_blank">here</a> into `Node.java`.

7. Copy and paste the code from <a href="/Misc/TODO/Lab21/Money.java" target="_blank">here</a> into `Money.java`.

8. Open `Node.java` and use the `<>` operator to make the class generic.

9. Open `SortedLinkedList.java` and use the `<>` operator to make the class generic.

10. Open `Money.java` and *implement* the `Comparable` interface so that `Money` is also of type `Comparable`. You can read the documentation on `Comparable` right [here](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html).

11. Open `Main21.java` and change the code there so that it properly uses `SortedLinkedList`.

12. Compile and run your code:
```
javac src/*.java -d bin
java -cp bin Main21
```
You should still see about the same output as in `lab 18`:
```
Linked list of Money objects before inserting: null
Inserting $2.44: ($2.44)->null
Inserting $6.01: ($2.44)->($6.01)->null
Inserting $3.99: ($2.44)->($3.99)->($6.01)->null
Inserting $4.50: ($2.44)->($3.99)->($4.50)->($6.01)->null
Inserting $0.44: ($0.44)->($2.44)->($3.99)->($4.50)->($6.01)->null
```

## Solution
The completed code for `SortedLinkedList.java` can be found <a href="/Misc/Solutions/Lab21/SortedLinkedList.java" target="_blank">here</a>.

The completed code for `Node.java` can be found <a href="/Misc/Solutions/Lab21/Node.java" target="_blank">here</a>.

The completed code for `Money.java` can be found <a href="/Misc/Solutions/Lab21/Money.java" target="_blank">here</a>.

The completed code for `Main21.java` can be found <a href="/Misc/Solutions/Lab21/Main21.java" target="_blank">here</a>.