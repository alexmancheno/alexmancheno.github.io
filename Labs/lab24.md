# Lab 24

> Aim: More practice with recursion 

## Turning iterative algorithms into recursive ones
1. In `lab23`, we went over how to approach recursive solutions by figuring out two things: 1) the base case(s) and 2) how to break the problem into smaller subpieces (the recursive calls). For today's lab, we'll look into coming up with solutions for algorithms that can be done iteratively, but *recursively* instead. 

2. Converting iterative algorithms into their recursive implementations can be done by doing the following:
    1. Identify the candidate loop. The loop should modify one or more scoped local variables, and then return a result based on their final values.
    2. Move the loop into a new *recursive* function that accepts the local variables needed for the loop. 
    3. This new recursive method should take the *stopping condition* of the loop as its base case(s). The body of the loop should be how you make the recursive calls. 

    3. An example:
        1. A iterative method that returns the sum of an array may be:
        ```
        public static int sum(int[] array)
        {
                int sum = 0;
                for (int i = 0; i < array.length; i++)
                {
                    sum += array[i];
                }
                return sum;
        }
        ```
        2. The recursive implementation can be the following:
        ```
        public static int sum(int[] array) // keep the signature as from above
        {
                // call the recursive method, passing in the array and starting index
                return sum(array, 0);  
        }

        public static int sum(int[] array, int index)
        {
                // Means we finished iterating through array
                if (index >= array.length) return 0;

                // Keep adding the current element to the sum
                return array[index] + sum(array, ++index);
        }
        ```

## Practice problems
1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab24
└── src
    ├── Main24.java
    ├── Node.java
    ├── SortedLinkedList.java
└── bin
```
You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab24; mkdir lab24/src; mkdir lab24/bin; New-Item -Name "lab24/src/Main24.java" -ItemType "file"; New-Item -Name "lab24/src/Node.java" -ItemType "file"; New-Item -Name "lab24/src/SortedLinkedList.java" -ItemType "file"
```

3. `cd` into your new project, `lab24`.

4. Copy and paste the code from <a href="/Misc/TODO/Lab24/Main24.java" target="_blank">here</a> into `Main24.java`.

5. Copy and paste the code from <a href="/Misc/TODO/Lab24/Node.java" target="_blank">here</a> into `Node.java`.

6. Copy and paste the code from <a href="/Misc/TODO/Lab24/SortedLinkedList.java" target="_blank">here</a> into `SortedLinkedList.java`.

7. Fill in the instance method for `SortedLinkedList` called `printFirstToLast()` that takes no parameters and prints a linked list from the first element to the last element in the following format:
```
(1)->(2)->(3)->(4)->null
```

8. Fill in the instance method for `SortedLinkedList` called `printLastToFirst()` that takes no parameters and prints a linked list from the last element to the first element in the following format:
```
(4)->(3)->(2)->(1)->null
```

9. Fill in the instance method for `SortedLinkedList` called `sum()` that takes no parameters and returns the sum of every integer in the linked list.

10. Fill in the instance method for `SortedLinkedList` called `reverse()` that takes no parameters and reverses the linked list that the method is called on.

11. Compile and run your code against the test cases from `Main24.java`:
```
javac src/*.java -d bin
java -cp bin Main24
```
You should see the following output:
```
List from first to last: (1)->(2)->(3)->(4)->null
List from last to first: (4)->(3)->(2)->(1)->null
Sum of all integers in list: 10
Before reversing: (1)->(2)->(3)->(4)->null
After reversing: (4)->(3)->(2)->(1)->null
Adding 5, 6, and 7 to list
Before reversing: (4)->(3)->(2)->(1)->(5)->(6)->(7)->null
After reversing: (7)->(6)->(5)->(1)->(2)->(3)->(4)->null
```

## Solution
The completed code for `SortedLinkedList.java` can be found <a href="/Misc/Solutions/Lab24/SortedLinkedList.java" target="_blank">here</a>.