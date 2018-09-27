> Aim: StringTokenizers and two-dimensional arrays

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab08
└── src
    ├── Main08.java
    ├── TextFileInput.java
    ├── Tokens.java
└── bin
├── lab08input.txt
├── animals.txt
```
You can do so by typing in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab08; mkdir lab08/src; mkdir lab08/bin; New-Item -Name "lab08/src/Main08.java" -ItemType "file"; New-Item -Name "lab08/src/TextFileInput.java" -ItemType "file"; New-Item -Name "lab08/src/Tokens.java" -ItemType "file"; New-Item -Name "lab08/lab08input.txt; New-Item -Name "lab08/animals.txt -ItemType "file"
```
 
3. `cd` into your new project, `lab08`.

4. Open up `lab08` with Notepad++.

5. Copy and paste the code from <a href="/Misc/TODO/Main08.java" target="_blank">here</a> into `Main08.java`.

6. Copy and paste the code from <a href="/Misc/Solutions/TextFileInput.java" target="_blank">here</a> into `TextFileInput.java`.

7. Copy and paste the code from <a href="/Misc/Other/Tokens.java" target="_blank">here</a> into `Tokens.java`.

8. Copy and paste the code from <a href="/Misc/Input/animals.txt" target="_blank">here</a> into `animals.txt`.

9. Copy and paste the code from <a href="/Misc/Input/lab08input.txt" target="_blank">here</a> into `lab08input.txt`.

10. Take a look at line 26 in `Tokens.java`. Here, we are now using another class, `StringTokenizer`, to be able to break up a line read from our `TextFileInput` object into *tokens*, where every token is a piece of the input string separated by the *delimiter*, ",". Documentation for `StringTokenizer` can be found [here](https://docs.oracle.com/javase/8/docs/api/java/util/StringTokenizer.html).

11. Take a look at line 32 in `Tokens.java`. Here, we are using an instance method `myTokens.countTokens()` to find out how big the `animals` array should be initialized to. 

12. At line 39 in `Tokens.java`, we use the instance method `myTokens.nextToken()` to read into the `animals` array a token from the string we gave to the tokenizer. The first call to `nextToken()` will return "cat", the second call will return "rat", third will return "dog", and so on.

13. Compile everything inside the `src` folder and place the *bytecode* in the `bin` folder:
```
javac src/*.java -d bin
```

14. Run `Tokens` and pass `animals.txt` as a parameter:
```
java -cp bin Tokens animals.txt
```
You should see the following output:
```
The input line is cat,rat,dog,hog,fish,rabbit,horse
There are 7 tokens in the line.
cat
rat
dog
hog
fish
rabbit
horse
```
15. Use `StringTokenizer` to fill in the `fillArray()` method over at `Main08`. 
**Note:** The format of the `lab08input.txt` is:
```
<number of rows>,<number of columns>
<number>,<number>,…,<number>
. . .
<number>,<number>,…,<number>
```
So the input file:
```
3,4
12,45,3,18
7,65,34,8
19,56,9,27
```
Creates the array:
```
12   45  3   18
7    65  34  8
19   56  9   27
```
16. Compile your code:
```
javac src/*.java -d bin
```
17. Run `Main08` and pass `lab08input.txt` as a parameter:
```
java -cp bin Main08 lab08input.txt
```
You should see the following output:
```
1       2       3       4       5       6
23      55      34      89      41      72
9       27      19      56      33      82
3       65      21      66      85      11
```

## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main08.java" target="_blank">here</a>.