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
> echo $null >> src/HelloWorld.java
```
5. Open `HelloWorld.java` with a text editor of your choice. Notepad++ is recommended, or you can try downloading one like [Visual Studio Code](https://code.visualstudio.com/download) (my go-to text editor). Place the following in `HelloWorld.java`:

```
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
    }
}
```
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