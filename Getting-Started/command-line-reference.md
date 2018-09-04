> Here are some commands you may refer to when using the command line.

## PowerShell (Windows)
* `New-Item`: can create files. Example usage:
```
> New-Item -Path . -Name "sample.txt" -ItemType "file"
```
* `mkdir`: creates a directory (folder). Example usage:
```
> mkdir App
> mkdir App/src
> mkdir App/bin
```
The above creates the following folder structure:
```
App
└── src
└── bin
```
* `cd`: change into a directory. Example:
```
> cd H:/lab01
```

* `dir` shows the content of your current directory.

## Java CLI
* The `javac` command compiles `.java` files to `.class` files.

The following compiles `HelloWorld.java` from the current directory and places `HelloWorld.class` in the same directory:
```
> javac HelloWorld.java
```

The following compiles `HelloWorld.java` from the **src** folder and places `HelloWorld.class` in the **bin** folder. 
```
> javac src/HelloWorld.java -d bin
```

The following compiles *everything* with the `.java` from the **src** extension and places their compiled counterparts in **bin** folder:
```
> javac src/*.java -d bin
```

* The `java`command is used to execute `.class` files.

The following executes `HelloWorld.class` from the current directory:
```
> java HelloWorld
```

The following compiles everything inside the **bin** folder with `HelloWorld.class` being the main class (must contain the **main()** method):
```
> java -cp bin HelloWorld
```