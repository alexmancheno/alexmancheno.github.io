## Creating an archive JAR file
**Note:** The following guides are to learn how to work with JAR files with the command line. Instructions on how to do so with Eclipse are on BlackBoard under Dr. Lord's section.

To create the archive JAR file, use the following template command with PowerShell (or bash terminal) from the **root** of your project (one level outside of `bin` and `src`):
```
jar cf <project name>.jar -C src .
```

The following command creates a JAR file called `Project0.jar` and places the content from `src` into the JAR file.
```
jar cf Project0.jar -C src .
```

## Extracting from a JAR file
To extract the contents of an archive JAR file, use the following template command:
```
jar xf <project name>.jar 
```
The following command extracts the contents of `Project0.jar` and places it in the same location as where the PowerShell (or bash terminal) session is:
```
jar xf Project0.jar
```

## Creating a runnable JAR file
Use the following template to create your JAR file:
```
jar cvfe <project name>.jar <Project's main class> -C bin . -C src . 
```
Picking up from our `App` example from the previous guides, the command would look like the following:
```
jar cvfe App.jar Main -C bin . -C src .
```
The above command creates a JAR file named `App.jar` with `Main.class` being the entry point to the program. It also adds all the contents inside the `bin` and `src` folders into the JAR file, which can be extracted afterwards.

## Running a JAR file
Use the following template to run your JAR file:
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