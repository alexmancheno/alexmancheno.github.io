# Lab 08

> Aim: StringTokenizer and two-dimensional arrays

1. Download <a href="/Misc/TODO/lab08.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab08`. 

3. Open `lab08` with Notepad++ by clicking on the top left corner: File -> Open Folder as Workspace, and then find `lab08`.

4. `cd` into your new project, `lab08`.

4. Open up `lab08` with Notepad++.

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
16. Compile and run your code:
```
javac src/*.java -d bin
java -cp bin Main08 input08.txt
```
You should see the following output:
```
1       2       3       4       5       6
23      55      34      89      41      72
9       27      19      56      33      82
3       65      21      66      85      11
```

14. To transfer `lab08` to your Mars account:
```
scp -r ../lab08 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab08` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab08 ./
```

**Note**: This will place `lab08` where ever your PowerShell session currently is. 

## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main08.java" target="_blank">here</a>.