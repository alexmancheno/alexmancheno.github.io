## Creating a JAR file
**Note:** The following guides are to learn how to work with JAR files with the command line. Instructions on how to do so with Eclipse are on BlackBoard under Dr. Lord's section.

Use the following schema to create your JAR file:
```
jar cvfe <project name>.jar <Project's main class> -C bin . -C src . 
```
Picking up from our `App` example from the previous guides, the command would look like the following:
```
jar cvfe App.jar Main -C bin . -C src .
```
The above command creates a JAR file named `App.jar` with `Main.class` being the entry point to the program. It also adds all the contents inside the `bin` and `src` folders into the JAR file, which can be extracted afterwards.

## Running a JAR file
Use the following schema to run your JAR file:
```
java -jar <project name>.jar 
```
To run the JAR file we created above, we can run:
```
java -jar App.jar
```
You should see the following output:
```
> java -jar App.jar
Hello, world!
Hello, from Library.java!
123 + 456 = 579
Result of Library.getGreeting("Alex"): Greetings to Alex
```

## Extracting the contents of a JAR file
This section may be useful if you want to double-check your projects before submission. Running the following will extract the contents of `App.jar` and place them where your terminal/command prompt window currently is:
```
jar xf App.jar
```
After running this command, you will see all the `.class` and `.java` files that we put into it from the previous guides.