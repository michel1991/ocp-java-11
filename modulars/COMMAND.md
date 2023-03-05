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

### What is true about the -d option?
* A. It can be used with the jar command, but not the java command.
* B. It can be used with the java command, but not the jar command.
* C. It can we used the jar and java command and serves the same purpose for both.
* D. It can be used with the jar and java commands, but means “directory” for the former and “describe module” for the later.
* E. None of the above.

The -d option is a shorthand for --describe-module on both the jar and java commands. Therefore, option C is correct.

### What command is the simplest way to list what modules a JAR depends on without listing package names?
*  A. jdeps cookie.jar
*  B. jdeps –s cookie.jar
*  C. jdeps –jdkinternals cookie.jar
*  D. jdeps --jdkinternals cookie.jar
*  E. jdeps -jdk-unsupported cookie.jar
*  F. jdeps --jdk-unsupported cookie.jar

Without any command line flags, jdeps lists packages and module dependencies.
The -s flag provides a summary omitting the package name, which means option B is the correct answer.

### Which options are valid on the java command without considering module options? (Choose all that apply.)
*  A. -c
*  B. -C
*  C. -cp
*  D. -d
*  E. -f
*  F. -p

When running a program using java, you specify the classpath with -cp, making option C correct.
Options D and E are incorrect because -d and -p are used for modules.
Options A and B are not valid options on the java command.

### Which command can you run to determine whether you have any code in your JAR file that depends on unsupported internal APIs and does not suggest an alternative?
*  A. jdeps -internal-jdk
*  B. jdeps --internaljdk
*  C. jdeps --internal-jdk
*  D. jdeps -s
*  E. jdeps -unsupported
*  F. jdeps –unsupportedapi
*  G. jdeps –unsupported-api
*  H. None of the above

Option D is correct because it prints jdk.unsupported but does not print a table with a suggested alternative.
Option C is incorrect because it does print a suggested alternative.
Options A, B, E, F, and G are incorrect because those options do not exist.

### Which command can you run to determine whether you have any code in your JAR file that depends on unsupported internal APIs and suggests an alternative?
* A. jdeps -internal-jdk
* B. jdeps --internaljdk
* C. jdeps --internal-jdk
* D. jdeps -s
* E. jdeps -unsupported
* F. jdeps –unsupportedapi
* G. jdeps –unsupported-api
* H. None of the above

The jdeps command has an option --internal-jdk that lists any code using unsupported/internal APIs and prints a table with suggested alternatives.
Option D is incorrect because it does not print out the table with a suggested alternative.
Options A, B, C, E, F, and G are incorrect because those options do not exist.
For options A,B, and C, the options are reversed and should be “jdk-internals”.

### Which of the following options does not have a one-character shortcut in any of the commands studied in this chapter? (Choose all that apply.)
* A. describe-module
* B. list-modules
* C. module
* D. module-path
* E. show-module-resolution
* F. summary

Option A is incorrect because describe-module has the d equivalent.
Option C is incorrect because module has the m equivalent.
Option D is incorrect because module-path has the p equivalent. Option F is incorrect because summary has the s equivalent.
Options B and E are the correct answers because they do not have equivalents.

### Which options are valid on the jar command without considering module options? (Choose all that apply.)
* A. -c
* B. -C
* C. -cp
* D. -d
* E. -f
* F. -p

When creating a jar file, you use the options -cf or -cvf, making options A and E correct.
It also allows the specification of a directory using -C, making option B correct.
Options D and E are incorrect because -d and -p are used for modules.

### Fill in the blanks so this command to run the program is correct:
java
_______ zoo.animal.talks/zoo/animal/talks/Peacocks
_______ modules

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

### Which are true of the --module-path option? (Choose all that apply.)
*  A. It is an option on the javac command.
*  B. It is an option on the java command.
*  C. It is an option on the jar command.
*  D. It is an option on the jdeps command.
*  E. It has a short form of -m.
*  F. It has a short form of -p.

Options A, B, and D are correct because the -module-path option is available on javac, java, and jdeps.
Option F is correct because -p is equivalent for the javac and java commands. The jdeps command does not allow the short form.

