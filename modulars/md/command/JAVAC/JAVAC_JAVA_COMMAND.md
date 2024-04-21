#### What option names are equivalent to -p and -cp on the javac command? (Choose two.)
* A. --module-path and -classpath
* B. --module-path and -class-path
* C. --module-path and --class-path
* D. --path and -classpath
* E. --path and -class-path
* F. --path and --class-path

The javac command uses -p and --module-path to supply the module path.
There are two valid long forms of the classpath option:
-classpath and --class-path. Options A and C match these.

### Which two options when inserted independently
### can fill in the blank to compile the code? (Choose two.)


``` txt
javac ______ mods -d birds com-bird/*.java *.java
```

* A. -cp
* B. -m
* C. -p
* D. -classpath
* E. --classpath
* F. --module-path

The javac command takes a --module-path parameter.
You need to memorize that the short form of this option is -p.
This makes options C and F the answer.

#### Which of the following are valid command line options and
#### their one character shortcuts related to the Java module system?

* A. --module -p
* B. --module-path -p
* C. --module-source-path -s
* D. ---module-source-path -m
* E. --list-modules -l
* F. --show-module-resolution -s
* G. --module -m

You should remember the following command line options:
Module options applicable for java as well as javac:
--module or -m : used to run or compile only the specified module.
--module-path or -p: used to specify the paths where java or javac will look for module definitions.

Module options applicable only for javac:
--module-source-path has no shortcut. Used by javac to look for source module definitions.
-d: used to specify output directory where the class files will be created after compilation.

Module options applicable only for java:
--list-modules has no shortcut. It lists observable modules and exits.
--show-module-resolution has no shortcut. It shows module resolution output during startup.
--describe-module or -d: It describes a module and exits.

Note that -d works differently in java and javac. Further, -d is very different from -D,
which is used while running a java program to specify name-value pairs of properties at the command line.
correct(B, G)

