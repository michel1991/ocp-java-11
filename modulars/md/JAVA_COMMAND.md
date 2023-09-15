##### Fill in the blanks to list a way of getting a
##### lot of information useful in debugging modules:

``` txt
    _______ -m x -p y --______________
```

* A. jar and -show-modules
* B. jar and -show-module-detail
* C. jar and -show-module-resolution
* D. java and -show-modules
* E. java and -show-module-detail
* F. java and -show-module-resolution

The first clue is that the -m and -p options are on the java command.
Beyond that, you need to memorize the name of the --show-module-resolution option.

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

### Which of the following are legal commands to run a modular program? (Choose all that apply.)
*  A. java -p x -m x/x
*  B. java -p x-x -m x/x
*  C. java -p x -m x-x/x
*  D. java -p x -m x/x-x
*  E. java -p x -m x.x
*  F. java -p x.x -m x.x
*  G. None of the above

The -p specifies the module path. This is just a directory, so all of the options have a legal module path.
The -m specifies the module, which has two parts separated by a slash.
Options E and F are incorrect since there is no slash.
The first part is the module name. It is separated by periods (.)
rather than dashes (-), making option C incorrect.
The second part is the package and class name, again separated by periods.
The package and class names must be legal Java identifiers.
Dashes (-) are not allowed, ruling out option D.
This leaves options A and B as the correct answers.


##### Which options are valid on the java command without
##### considering module options? (Choose all that apply.)
*  A. -c
*  B. -C
*  C. -cp
*  D. -d
*  E. -f
*  F. -p

When running a program using java, you specify the classpath with -cp, making option C correct.
Options D and E are incorrect because -d and -p are used for modules.
Options A and B are not valid options on the java command.



#### What command could you run to print output like the following?

``` txt
    java.base@11.0.2
    java.compiler@11.0.2
    java.datatransfer@11.0.2
    java.desktop@11.0.2
    ...
```
* A. java --all-modules
* B. java --describe-modules
* C. java --list-modules
* D. java --output-modules
* E. java --show-modules
* F. None of the above

The java command has an option to list all the modules that come with the JDK.
Option C is correct since that option is called --list-modules.
The other options are not supported by the java command.
Options B and E are similar to options that exist:
--describe-module and --show-module-resolution.
But neither gives a list of all the modules that come with the JDK.



