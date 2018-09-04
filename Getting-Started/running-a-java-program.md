## Choosing your development tools
How you choose to develop your programs is up to you. However, learning how to create your own project directories and manually compiling/running Java programs with nothing more than a text editor and the bash terminal (Mac OS X or Linux) or the command prompt (Windows) can be a great benefit to your understanding of Java.

I recommend [Visual Studio Code](https://code.visualstudio.com/) for developing on your machine with a text editor and/or [this online compiler](https://repl.it/languages/java) if you want to develop on a browser. Visual Studio Code includes an integrated terminal (or command prompt if you're on Windows), which is quite a nice feature.  



## Creating a project folder structure
Open terminal/command prompt, and enter in the following to create the project's main directory:
```
> mkdir ~/Desktop/App
```

Change directory into the project's main directory:
```
> cd ~/Desktop/App
```

You are now in the **root directory** of your project. From here, create the following folder structure: 
```
.
└── src
    ├── Main.java
    ├── Library.java
└── bin
```
The above reads that the `src` and `bin` are folders inside your `App` folder. `Main.java` is inside `src` and will be the **entry** point to your program.

## Writing Java classes
Inside `Library.java`, write the following:
```
public class Library
{
    public static void sayHello()
    {
        System.out.println("Hello, from Library.java!");
    }

    public static int addTwoNumbers(int a, int b)
    {
        return a + b;
    }

    public static String returnGreeting(String name)
    {
        return "Greetings to " + name;
    }
}
```
The above class contains a few methods that we will call inside `Main.java`.

Inside `Main.java`, write the following:
```
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        // Use functions from Library.java
        Library.sayHello();

        int a = 123, b = 456;
        int result = Library.addTwoNumbers(123, 456);
        System.out.printf("%d + %d = %d %n", a, b, result);

        String name = "Alex";
        String getGreeting = Library.returnGreeting(name);
        System.out.printf("Result of Library.getGreeting(\"Alex\"): %s %n", getGreeting);
    }
}
```
The method `public static void main(String[] args)` is the **first** method called in your entire program. It is where *any* Java program will begin. 

## Compiling your code
Assuming you have the Java JDK properly installed, run the following in the terminal/command prompt from the root directory of your project, `App/`:
```
> javac src/*.java -d bin
```
The above compiles *everything* with the `.java` extension, e.g., `Main.java` and `Library.java`, and places their compiled counterparts in the `bin` folder. The project folder structure will now look like the following:
```
.
└── src
    ├── Main.java
    ├── Library.java
└── bin
    ├── Main.class
    ├── Library.class
```
The `.class` files contain the *bytecode* that the JVM interprets and turns into native machine code for execution.

## Running your code
From the root directory of your project, `App/`, enter the following into the terminal/command prompt:
```
> java -cp bin Main
```
The above invokes the JVM to load `Main.class` into the classpath and then executes it. You can read more about classpaths [here](https://docs.oracle.com/javase/tutorial/essential/environment/paths.html). Running the above command will generate the following output:
```
> java -cp bin Main
Hello, world!
Hello, from Library.java!
123 + 456 = 579
Result of Library.getGreeting("Alex"): Greetings to Alex
```
