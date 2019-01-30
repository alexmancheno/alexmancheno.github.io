# Lab 02
> Aim: To write your first "Hello, world!" Java program.

1. Download <a href="/Misc/TODO/lab02.zip" download>today's lab</a> and unzip it by right-clicking on the zipped folder and selecting "Extract here". 
2. Open up PowerShell and `cd` into the root directory of `lab02`.
3. Open Notepad++ (not regular Notepad). You can find it by searching for it in the search-bar on the bottom left corner of your screen. In Notepad++, on the top-left corner click on File -> Open Folder as Workspace. Find `lab02` (where you downloaded it), select it, and click Open. Notice that you see the project directory of `lab02` on the left side of Notepad++. The project directory view will change as you add, delete, or modify files in the folder you have open as your workspace.

4. Select `HelloWorld.java` (under `src`) and place the following inside:

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

**Note**: you can save all files with `Ctrl + Shift + S`.

5. Compile the program by typing in the following command into PowerShell (make sure it's ran from the root of `lab02`):
```
javac src/*.java -d bin
```

6. Run your compiled code by entering in the following into PowerShell:
```
java -cp bin HelloWorld
```
You should see the following output:
```
> java -cp bin HelloWorld
Hello, world!
```

7. To transfer your project to your account on the Mars server, enter in the following:
```
scp -r ../lab02 <username>@mars.cs.qc.cuny.edu:~/
```
**Note**: the double period in `../lab02` means that you step outside one directory and refer to `lab02` from the outside.

8. To retrieve it back from any computer, (Mac or Windows):
```
scp -r <username>@mars.cs.qc.cuny.edu:~/lab02 ./
```
**Note**: this will place the folder inside where you currently are with the PowerShell