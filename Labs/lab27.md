# Lab 26

> Aim: TreeMap and Binary Search Trees

## TreeMap
TreeMap in java is an implementation of the [Map interface](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html). Maps store key-value pairs, and TreeMap is sorted by its keys. There are two ways of using TreeMap:
1. Using a [Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html):
```
    public static void main(String[] args)
    {
        // TreeMap using Comparator
        TreeMap<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String left, String right)
            {
                // Return an integer representing the comparison between the two strings
                return left.compareTo(right);
            }
        });

        map.put("abc", 2);
        map.put("abb", 1);
        map.put("bbc", 3);
        map.put("dbc", 4);
        
        // Iterate through entry set, printout values
        System.out.println("Key value pairs:");
        for (Map.Entry<String, Integer> entry: map.entrySet())
        {
            System.out.printf("%s, %s\n", entry.getKey(), entry.getValue());
        }

        // Iterate through key set, looking up the value for each iteration
        System.out.println("\nAnother way of iterating through keys:");
        for (String key : map.keySet())
        {
            System.out.printf("%s, %s\n", key, map.get(key));
        }
    }
```

    Running the code will get you the following output:
    ```
    Key value pairs:
    abb, 1
    abc, 2
    bbc, 3
    dbc, 4

    Another way of iterating through keys:
    abb, 1
    abc, 2
    bbc, 3
    dbc, 4
    ```

2. Having Keys implement the [Comparable](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) interface. The following example uses the [Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html) wrapper class for integer primitives. Notice that `Integer` implements `Comparable`. An example:
```
    public static void main(String[] args)
    {
        // TreeMap using keys that the implement Comparable interface
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(4, "Three");
        map.put(3, "Two");
        map.put(2, "Three");
        
        // Iterate through entry set, printout values
        System.out.println("Key value pairs:");
        for (Map.Entry<Integer, String> entry: map.entrySet())
        {
            System.out.printf("%s, %s\n", entry.getKey(), entry.getValue());
        }

        // Iterate through key set, looking up the value for each iteration
        System.out.println("\nAnother way of iterating through keys:");
        for (Integer key : map.keySet())
        {
            System.out.printf("%s, %s\n", key, map.get(key));
        }
    }
```

    Running the above code will get you the following output:
    ```
    Key value pairs:
    1, One
    2, Three
    3, Two
    4, Three

    Another way of iterating through keys:
    1, One
    2, Three
    3, Two
    4, Three
    ```

## Binary Search Trees
1. **A binary search tree is a data structure that consists of nodes with the following properties:**
    1. The left node is the subtree containing nodes with keys less than the current node's key
    2. The right node is the subtree containing nodes with keys greater than the current node's key
    3. Either subtree must not contain duplicates keys

Most methods written for a binary search tree are implemented recursively! 


2. The `Node` class for a binary search tree would typically look like the following:
```
    public class Node
    {
        public Node left;
        public Node right;
        public int data;

        public Node(int data)
        {
            this.data = data;
        } 
    }
```

3. To practice with Binary Search Trees, download <a href="/Misc/TODO/lab27.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab27`. 

4. Open up `lab27` with Notepad++.

7. Fill in the `insert()` method. The method should insert an integer into the tree and maintain the properties of a binary search tree.

8. Fill in the `getMin()` method. The method should return the smallest integer of the tree. If the tree is empty, throw an exception.

9. Fill in the `contains()` method. It should return true if the parameter passed in is in the tree, false otherwise.

10. Fill in the `preOrder()` method. For every recursive call, the method should execute the following in order:
    1. Print the current integer.
    2. Recur to the left node.
    3. Recur to the right node.

11. Fill in the `inOrder()` method. For every recursive call, the method should execute the following in order:
    1. Recur to the left node.
    2. Print the current integer.
    3. Recur to the right node.

12. Fill in the `postOrder()` method. For every recursive call, the method should execute the following in order:
    1. Recur to the left node.
    2. Recur to the right node. 
    3. Print the current integer.

13. Compile and run your code:
```
javac src/*.java -d bin
java -cp bin Main27
```
You should see the following output:
```
Pre-order traversal: 3 2 1 6 5 8
In-order traversal: 1 2 3 5 6 8
Post-order traversal: 1 2 5 8 6 3
Minimum of BST: 1
Contains 4: false
Contains 5: true
```

## Solution
The completed code for `BST.java` can be found <a href="/Misc/Solutions/Lab27/BST.java" target="_blank">here</a>.

The example for `TreeMap` using keys that implement the `Comparable` interface can be found <a href="/Misc/Solutions/Lab27/TreeMapExample1.java" target="_blank">here</a>.

The example for `TreeMap` a `Comparator` can be found <a href="/Misc/Solutions/Lab27/TreeMapExample2.java" target="_blank">here</a>.