# Lab 02
> Aim: To write your first "Hello, world!" Java program.

1. Open up PowerShell (or command prompt)
2. Change directory to your private drive with the following:
```
> cd H:/
```
3. Create the following folder:
```
> mkdir lab02
```
Then cd into that folder.
4. Create the following folder structure:
```
.
└── src
    ├── HelloWorld.java
└── bin
```
You can create the above folder structure by typing in the following three commands into PowerShell:
```
> mkdir src
> mkdir bin
> New-Item -Name "src/HelloWorld.java" -ItemType "file"
```
5. Open Notepad++ (not regular Notepad). You can find it by searching for it in the search-bar on the bottom left corner of your screen. In Notepad++, on the top-left corner click on File -> Open Folder as Workspace. Find `lab02` inside your `H:\` drive, select it, and click Open. Notice that you see the project directory of `lab02` on the left side of Notepad++. The project directory view will change as you add, delete, or modify files in the folder you have open as your workspace.

6. Select `HelloWorld.java` (under `src`) and place the following inside:

```
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
    }
}
```
Make sure to save your file! 

Note: you can save all files with `Ctrl + Shift + S`.

6. Compile the program by typing in the following command into PowerShell:
```
> javac src/*.java -d bin
```

7. Run your compiled code by entering in the following into PowerShell:
```
> java -cp bin HelloWorld
```
You should see the following output:
```
> java -cp bin HelloWorld
Hello, world!
```