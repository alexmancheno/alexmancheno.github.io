# Lab 19

> Aim: Creating a gui that can open and read files

1. Download <a href="/Misc/TODO/lab19.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract all".

2. Open up PowerShell and `cd` into the root directory of `lab19`. 

4. Open up `lab19` with Notepad++.

3. Take a look at the constructor in `Lab19Gui.java`. The `JMenuItem` buttons being created in there are *buttons* that will emit `actionEvent` objects when pressed on. These `actionEvent` objects should get handled by an associated `ActionListener` object, like our `FileMenuHandler` class. You associate a button with an action listener by calling the instance method `addActionListener()` on a button object (like `JMenuItem`) and passing in a `ActionListener` object.  

9. Take a look at the `actionPerformed()` method in `FileMenuhandler.java`. This method gets executed a *button* that the `FileMenuHandler` object is associated with emits an `actionEvent` object (when that button gets pressed). You can get a string containing the name of the button that emitted the `actionEvent` object by calling `getActionCommand()` on the `actionEvent` paremter inside `actionPerformed()`. The `actionPerformed()` method is where you write the logic you want to execute when the associated button gets presed.

10. Notice that the only constructor written inside `FileMenuHandler.java` is one that takes in a `Lab19Gui` reference as its only parameter, and then *saves* it as an instance variable. This means that after a `FileMenuHandler` object is created with this constructor, that object will have a way of accessing the `Lab19Gui` object it's associated with inside any instance method we write, including `actionPerformed()`.

10. Fill in the `actionPerformed()` method so that, when executed, it will either:<br>1) open a file a user has selected and then read the file by using the `readFile()` method inside `Lab19Gui.java`.<br>2) quit the program.<br>**Hints:** the classes you will need for this is `JFileChooser`, `File`, and `ActionEvent`.

12. Compile and run your program:
```
javac src/*.java -d bin
java -cp bin Main19
```
<br>You should see a gui with a menu bar and two menu items. Make sure the `Open` menu item can open and read a file selected by the user and that the `Quit` menu item exits the program when pressed.

13. **Bonus:** Add *another* menu item to your file menu that will, when pressed, output a message dialogue with any message.

14. To transfer `lab19` to your Mars account:
```
scp -r ../lab19 <username>@mars.cs.qc.cuny.edu:~/
```

15. To retrieve `lab19` from your Mars account from another machine (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab19 ./
```

## Solution
The completed code for `Lab19Gui.java` can be found <a href="/Misc/Solutions/Lab19/Lab19Gui.java" target="_blank">here</a>.

The completed code for `FileMenuHandler.java` can be found <a href="/Misc/Solutions/Lab19/FileMenuHandler.java" target="_blank">here</a>.