# Lab 10

> Aim: Program commentary and Javadoc

## Intro to Javadoc
Providing commentary in your source code is an essential part of the programming process. Each method (function, subprogram,…) and important
sections in your code (a while loop, a sequence of initializations) should have comments
describing why that code is there (not what it does, but why it is there).

Java takes this idea one step further, and has a convenient tool called Javadoc for
providing HTML (web page) code for other users of your Class's methods to use as
documentation, similar to that found in the Java API library (hence, Java
documentation).

Javadoc comments are included in your source code. The compiler can tell the
difference.

Javadoc comments start with a slash and double asterisks:
```
/*
This is a normal comment in Java
*/

/**
This comment is javadoc, and will be included in separate
HTML (web page) format when the Javadoc tool is run
*/
```

Javadoc notation includes several tags which start with the "at" sign ("@") so the compiler
can recognize them and include them in the HTML document. 

Some common tags are:
```
@params, @return, @throws
```

Each parameter in a method should be documented to tell the reader what this parameter
is for and what (if any) the return type is. As you've seen in the Java API, it is important
to know what parameters a method needs. An example of using these tags is:
```
/**
* @param myFile the file to be read
* @param myChar the character to count in the file
* @return int the number of characters in the file
*/
public static int countChars(String myFile, char myChar) {
```

## Working with Javadoc
1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab10
└── src
    ├── Main10.java
└── bin
└── doc
```
You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab10; mkdir lab10/src; mkdir lab10/bin; mkdir lab10/doc; New-Item -Name "lab10/src/Main10.java" -ItemType "file"
```
 
3. `cd` into your new project, `lab10`.

4. Open up `lab10` with Notepad++.

5. Copy and paste the code from <a href="/Misc/TODO/Main10.java" target="_blank">here</a> into `Main10.java`.

6. Notice that there's already Javadoc written for `fillMatrix()`. Use a combination of the `@return` and `@param` tags to write Javadoc for the rest of the methods in `Main10`.

7. To generate Javadoc for your project, type in the following in the PowerShell while still in the root of `lab10`:
```
> javadoc src/*.java -d doc
```
This command generates *Javadoc* for all the source code inside the `src` folder and places the output inside the `doc` folder. 

8. Look inside the `doc` folder and find `index.html`. This HTML file is the *homepage* to your projects Javadoc. Open `index.html` by right clicking on `index.html` -> Open With -> Google Chrome (or whichever you prefer). This will open the HTML page showing the Javadoc you wrote for the project!

## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main10.java" target="_blank">here</a>.