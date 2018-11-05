# Lab 19

> Aim: Creating a gui that can open and read files

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab19
└── src
    ├── Main19.java
    ├── FileMenuHandler.java
    ├── Lab19Gui.java
└── bin
├── lab19input.txt
```
You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab19; mkdir lab19/src; mkdir lab19/bin; New-Item -Name "lab19/src/Main19.java" -ItemType "file"; New-Item -Name "lab19/src/FileMenuHandler.java" -ItemType "file"; New-Item -Name "lab19/src/Lab19Gui.java" -ItemType "file"; New-Item -Name "lab19/lab19input.txt" -ItemType "file"
```

3. `cd` into your new project, `lab19`.

4. Open up `lab19` with Notepad++.

5. Copy and paste the code from <a href="/Misc/TODO/Main19.java" target="_blank">here</a> into `Main19.java`.

6. Copy and paste the code from <a href="/Misc/TODO/FileMenuHandler.java" target="_blank">here</a> into `FileMenuHandler.java`.

7. Copy and paste the code from <a href="/Misc/TODO/Lab19Gui.java" target="_blank">here</a> into `Lab19Gui.java`.

8. Place some random numbers in `lab19input.txt` so that we can test the gui with later.

9. Take a look at `FileMenuhandler.java`. Notice that the only constructor written there is one that takes in a `Lab19Gui` variable as its only parameter, and then *saves* it as an instance variable. This means that after a `FileMenuHandler` object is created with this constructor, it will have a way of accessing the `Lab19Gui` its associated inside any instance method we write, including `actionPerformed()`.

10. Fill in the `actionPerformed()` method so that, when executed, it will either:<br>1) open a file a user has selected and then read the file.<br>2) quit the program.  <br>**Hints:** the classes you will need for this is `JFileChooser` and `ActionEvent`.

11. Fill in the constructor for `Lab19Gui`. The constructor should create the menu bar of the gui. To do this, you will need to use the following classes: `JMenuBar`, `JMenu`, `JMenuItem`, and `FileMenuHandler`. <br><br>The menu bar should include two menu items. The first one should open and read a file the user has selected. The second one should quit the program. <br>**Hint:** use `FileMenuHandler` for this.

12. Compile and run your program:
```
javac src/*.java -d bin
java -cp bin Main19
```
<br>You should see a gui with a menu bar and two menu items. Make sure the `Open` menu item can open and read a file selected by the user and that the `Quit` menu item exits the program when pressed.

## Solution
The completed code for `Lab19Gui.java` can be found <a href="/Misc/Solutions/Lab19/Lab19Gui.java" target="_blank">here</a>.

The completed code for `FileMenuHandler.java` can be found <a href="/Misc/Solutions/Lab19/FileMenuHandler.java" target="_blank">here</a>.