### Which are true of the --module option? (Choose all that apply.)
*  A. It is an option on the javac command.
*  B. It is an option on the java command.
*  C. It is an option on the jar command.
*  D. It is an option on the jdeps command.
*  E. It has a short form of -m.
*  F. It has a short form of -p.

Option B is correct because the only command that has a --module option is java.
Option E is correct because -m is equivalent.


### Which commands take a --module-path parameter? (Choose all that apply.)
*  A. javac
*  B. java
*  C. jar
*  D. jdeps
*  E. jmod
*  F. None of the above

Options A and B are correct because the -p (--module-path)
option can be passed when compiling or running a program.
Option D is also correct because jdeps
can use the --module-path option when listing dependency information.

###### Fill in the blanks to complete this sentence:
###### The show-module-resolution option is on the _______ command,
###### and the summary option is on the _______ command.
* A. jar and java
* B. javac and java
* C. java and java
* D. jar and jdeps
* E. javac and jdeps
* F. java and jdeps
* G. None of the above

The only command that has a show-module-resolution option is java,
and the only command that has a summary option is jdeps.
Therefore, option F is correct.

### Which of the following statements are correct? (Choose all that apply.)
* A. The jar command allows adding exports as command-line options.
* B. The java command allows adding exports as command-line options.
* C. The jdeps command allows adding exports as command-line options.
* D. Adding an export at the command line is discouraged.
* E. Adding an export at the command line is recommended.

The java command has an --add-exports option that allows exporting a package at runtime.
However, it is not encouraged to use it, making options B and D the answer.

### Which statement is true about the jdeps command? (Choose all that apply.)
*  A. It can provide information about dependencies on the class level only.
*  B. It can provide information about dependencies on the package level only.
*  C. It can provide information about dependencies on the class or package level.
*  D. It can run only against a named module.
*  E. It can run against a regular JAR.

The jdeps command provides information about the class or package level
depending on the options passed, making option C correct.
It is frequently used to determine what dependencies you will need when converting to modules.
This makes it useful to run against a regular JAR, making option E correct.

##### Given the following command, which of the following
##### classes would be included for compilation? (Choose all that apply.)
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

The -d option is a shorthand for --describe-module on both the jar and java commands.
Therefore, option C is correct.


###### Which of the following options does not have a one-character shortcut
###### in any of the commands studied in this chapter? (Choose all that apply.)
* A. describe-module
* B. list-modules
* C. module
* D. module-path
* E. show-module-resolution
* F. summary

Option A is incorrect because describe-module has the d equivalent.
Option C is incorrect because module has the m equivalent.
Option D is incorrect because module-path has the p equivalent.
Option F is incorrect because summary has the s equivalent.
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


##### Which commands have the options -m and –s to represent modules and summary, respectively?
* A. javac and jar
* B. javac and jdeps
* C. javac and jmod
* D. java and jar
* E. java and jdeps
* F. java and jmod

Option E is correct because both java and jdeps meet the criteria.
The jar command does as well although the options mean different things than working with modules.


### Which are true of the --module-path option? (Choose all that apply.)
*  A. It is an option on the javac command.
*  B. It is an option on the java command.
*  C. It is an option on the jar command.
*  D. It is an option on the jdeps command.
*  E. It has a short form of -m.
*  F. It has a short form of -p.

Options A, B, and D are correct because the -module-path option is available on javac, java, and jdeps.
Option F is correct because -p is equivalent for the javac and java commands.
The jdeps command does not allow the short form.

#### What statements are true about requires mandated java.base? (Choose two.)
*  A. This output is expected when running the java --list-modules command.
*  B. This output is expected when running the java --show-module-resolution command.
*  C. This output is expected when running the jdeps command.
*  D. This output is expected when running the jmod command.
*  E. All modules will include this in the output.
*  F. Some modules will include this in the output.

The jdeps command outputs requires mandated java.base except
when run in summary mode, making option C correct.
Since this module is an implicit dependency in all modules, option E is also correct.

### Which of the following statements are true? (Choose two.)
*  A. It is a good practice to add the --add-exports option to your java command.
*  B. It is a permitted, but not recommended, to add the --add-exports option to your java command.
*  C. There is no --add-exports option on the java command.
*  D. It is a good practice to add the --add-requires option to your java command.
*  E. It is permitted, but not recommended, to add the --add-requires option to your java command.
*  F. There is no --add-requires option on the java command.

Nb: command to display info is (java -X, java --help-extra)
It is recommended to specify all exports directives in the module-info file.
While it is legal to use the --add-exports option, it is not recommended, making option B correct.
You do not need to know how to use it for the exam, just that it is not a good idea.
There is no equivalent option for requires, making option F correct.

#####  Assuming all referenced files and directories exist and are correct, what does this code do?
```txt
  javac -m mods -d mouse mouse/com/mouse/*.java mouse/module-info.java
  jar -cvf mods/com.mouse.jar -C mouse/ .
```
* A. Creates a JAR file representing the com.mouse module
* B. Creates a JAR file that is not a module
* C. Fails on the javac command
* D. Fails on the jar command

The javac command takes -p for the module path rather than -m.
Since there is no –m on the javac command, option C is the correct answer.






