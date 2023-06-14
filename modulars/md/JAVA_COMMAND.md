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

##### Suppose we have module com.bird that contains package
##### com.bird.tweet and class Tweety with a main() method.
##### Which of the following can fill in the blank to run this program?

``` ssh
    java --module-path mods –module _____________
```

*  A. com.bird.Tweety
*  B. com.bird.tweety.Tweety
*  C. com.bird/Tweety
*  D. com.bird.tweet/Tweety
*  E. com.bird/com.bird.tweet.Tweety
*  F. com.bird.tweet/com.bird.Tweety

When running a module, the module name is listed before the slash,
and the fully qualified class name is after the slash.
Option E is the only one that meets this criterion.

### Fill in the blanks so this command to run the program is correct:
``` txt
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

##### Which of the following are legal commands to run a modular
##### program where n is the package name and c is the class name? (Choose all that apply.)
* A. java –module-path x -m n.c
* B. java --module-path x -p n.c
* C. java --module-path x -m n/c
* D. java --module-path x -p n/c
* E. java --module-path x -m n c
* F. java --module-path x -p n c
* G. None of the above

The -p option is a shorter form of --module-path.
Since the same option cannot be specified
twice, options B, D, and F are incorrect.
The module name and class name are separated with a slash (/).
However, the question supplies a package name,
not a module name, making option G the answer.

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


##### Suppose you have the commands javac, java, and jar.
##### How many of them support a --show-module-resolution option?
* A. 0
* B. 1
* C. 2
* D. 3

The java command uses this option to print information when the program loads.
You might think jar does the same thing since it runs a program too.
Alas, this parameter does not exist on jar.


