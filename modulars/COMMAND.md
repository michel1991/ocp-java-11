### Fill in the blanks so this command to run the program is correct:
```sh
    java
    _______ zoo.animal.talks/zoo/animal/talks/Peacocks
    _______ modules
```
*  A. -d and -m
*  B. -d and -p
*  C. -m and -d
*  D. -m and -p
*  E. -p and -d
*  F. -p and -m
*  G. None of the above

The -m or --module option is used to specify the module and class name.
The -p or -module-path option is used to specify the location of the modules.
Option D would be correct if the rest of the command were correct.
However, running a program requires specifying the package name with periods (.) instead of slashes.
Since the command is incorrect, option G is correct.

### Which are valid calls to list a summary of the dependencies? (Choose all that apply.)
* A. jdeps flea.jar
* B. jdeps -s flea.jar
* C. jdeps -summary flea.jar
* D. jdeps --summary flea.jar
* E. None of the above

Option A will run, but it will print details rather than a summary.
Options B and C are both valid options for the jdeps command.
Remember that -summary uses a single dash (-).

### Which of the following are legal commands to run a modular program where n is the package name and c is the class name? (Choose all that apply.)
* A. java –module-path x -m n.c
* B. java --module-path x -p n.c
* C. java --module-path x -m n/c
* D. java --module-path x -p n/c
* E. java --module-path x -m n c
* F. java --module-path x -p n c
* G. None of the above

The -p option is a shorter form of --module-path. Since the same option cannot be specified
twice, options B, D, and F are incorrect. The module name and class name are separated with a slash (/).
However, the question supplies a package name, not a module name, making option G the answer.

### Which are true of the --module option? (Choose all that apply.)
*  A. It is an option on the javac command.
*  B. It is an option on the java command.
*  C. It is an option on the jar command.
*  D. It is an option on the jdeps command.
*  E. It has a short form of -m.
*  F. It has a short form of -p.

Option B is correct because the only command that has a --module option is java. Option E is correct because -m is equivalent.

### Which commands can list dependencies? (Choose all that apply.)
* A. jdeps flea.jar
* B. jdeps -d flea.jar
* C. jdeps -detail flea.jar
* D. jdeps --detail flea.jar

Option A is correct because it prints the details of the dependencies.
Options B, C, and D try to fool you with an invalid option.
The jdeps command uses command-line options to restrict the output to the summary level.

### Which commands take a --module-path parameter? (Choose all that apply.)
*  A. javac
*  B. java
*  C. jar
*  D. jdeps
*  E. jmod
*  F. None of the above

Options A and B are correct because the -p (--module-path) option can be passed when compiling or running a program.
Option D is also correct because jdeps can use the --module-path option when listing dependency information.

### Given the following command, which of the following classes would be included for compilation? (Choose all that apply.)
```sh
 javac *.java
```

* A. Hyena.java
* B. Warthog.java
* C. land/Hyena.java
* D. land/Warthog.java
* E. Hyena.groovy
* F. Warthog.groovy

The wildcard is configured for files ending in .java, making options E and F incorrect.
Additionally, wildcards aren’t recursive, making options C and D incorrect.
Therefore, options A and B are correct.
