# Lab 11

> Aim: JFrames and TextAreas

1. Open up PowerShell and `cd` into your `H:\` drive.

2. Create the following folder structure:
```
lab11
└── src
    ├── Main11.java
    ├── HelloWorldSwing.java
    ├── HelloWorldMore.java
└── bin
```
You can do so by entering in the following into the PowerShell while in the root of your `H:\` drive:
```
mkdir lab11; mkdir lab11/src; mkdir lab11/bin; New-Item -Name "lab11/src/Main11.java" -ItemType "file"; New-Item -Name "lab11/src/HelloWorldSwing.java" -ItemType "file"; New-Item -Name "lab11/src/HelloWorldMore.java" -ItemType "file"
```
 
3. `cd` into your new project, `lab11`.

4. Open up `lab11` with Notepad++.

5. Copy and paste the code from <a href="/Misc/TODO/Main11.java" target="_blank">here</a> into `Main11.java`.

6. Copy and paste the code from <a href="/Misc/Other/HelloWorldSwing.java" target="_blank">here</a> into `HelloWorldSwing.java`.

7. Copy and paste the code from <a href="/Misc/Other/HelloWorldMore.java" target="_blank">here</a> into `HelloWorldMore.java`.

8. Compile your code and run `HelloWorldSwing` as your main class:
```
javac src/*.java -d bin; java -cp bin HelloWorldSwing
```
You should get a small JFrame with a label "Hello world!". Think of the JFrame object as the *main container*, where everything else will be inside of via its *content pane*.

9. Take a look at `HelloWorldMore.java`. See that it is almost the same as `HelloWorldSwing.java`, but after the JFrame is
set to visible, an input dialog is opened for more text, and that text is put into the *JLabel*. Notice that when we enter in text, the label to the JFrame is set to the input text.

10. Run `HelloWorldMore`:
```
java -cp bin HelloWorldMore
```

11. Take a look at `Main11.java`. There, you'll see two classes, `Main11` and `Gui11`. The goal is two create your own custom *gui* object. Notice the first thing we do is *extend* from the `JFrame` class, inheriting to `Gui` all of `JFrame`'s non-private methods and variables.

12. *Initialize* all of the instance variables inside the constructors of `Gui11`.

13. Fill in `showGui()` so that, once initialized, will *show* `Gui11` to the screen.


## Solution
The completed code for this lab can be found <a href="/Misc/Solutions/Main11.java" target="_blank">here</a>.
