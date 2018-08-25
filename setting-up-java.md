## Downloading the Java 8 JDK
Java 8 is recommended. The Java 8 JDK can be found [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).

## Windows Setup
The steps to setup the Java environment on Windows are pretty well written at https://www.geeksforgeeks.org/setting-environment-java. I recommend this guide or one like it.

## Mac OS X Setup
After installing Java 8, open Terminal and enter:
```
cd /Library/Java/JavaVirtualMachines
```
This is where the JDK you installed should be. You can view the ones installed by entering in:
```
ls
```
You should see at least one JDK installed, named similar to "jdk1.8.0_181.jdk". The next step is to add the JDK to your PATH.

To add the JDK to your path, enter in the terminal the following:
```
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/bin
```
If you ended up installing a different version of Java, make sure to enter in the right path to the JDK when you export the path.

