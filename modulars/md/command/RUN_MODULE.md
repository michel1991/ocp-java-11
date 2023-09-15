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

##### Suppose you have the commands javac, java, and jar.
##### How many of them support a --show-module-resolution option?
* A. 0
* B. 1
* C. 2
* D. 3

The java command uses this option to print information when the program loads.
You might think jar does the same thing since it runs a program too.
Alas, this parameter does not exist on jar.