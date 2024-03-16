### Which would best fill in the blank to complete the following code?

```java
    module __________ {
        exports com.unicorn.horn;
        exports com.unicorn.magic;
    }
```
* A. com
* B. com.unicorn
* C. com.unicorn.horn
* D. com.unicorn.magic
* E. The code does not compile.
* F. The code compiles, but none of these would be a good choice.

A module claims the packages underneath it.
Therefore, options C and D are not good module names.
Either would exclude the other package name.
Options A and B both meet the criteria of being a higher-level package.
However, option A would claim many other packages including com.sybex.
This is not a good choice, making option B the correct answer.

##### Suppose we have the following modules and that each contains code.
##### If you can compile them in any order you would like,
##### how many of these modules can you compile?

```java
    module cloud {
        exports cloud;
    }
    module water {
        exports water;
        requires rain;
        requires cloud;
    }
    module rain {
        exports rain;
        requires water;
    }
    module snow {
        exports snow;
        requires rain;
    }
```
* A. Zero
* B. One
* C. Two
* D. Three
* E. Four

The cloud module does not have any dependencies, so it can compile.
The water and rain modules depend on each other.
Since this is a cyclic dependency, neither can compile.
While the snow module is not involved in the cycle,
it cannot compile since the rain module cannot compile.
Since only one module can compile, option B is correct.

##### What is true of a module containing a file named
#### module-info.java with the following contents? (Choose all that apply.)

```java
    module com.food.supplier {
        }
```


*  A. All packages inside the module are automatically exported.
*  B. No packages inside the module are automatically exported.
*  C. A main method inside the module can be run.
*  D. A main method inside the module cannot be run since the class is not exposed.
*  E. The module-info.java file contains a compiler error.
*  F. The module-info.java filename is incorrect.

Packages inside a module are not exported by default, making option B correct and option A incorrect.
Exporting is necessary for other code to uses the packages;
it is not necessary to call the main method at the command line, making option C correct and option D incorrect.
The module-info.java file has the correct name and compiles, making options E and F incorrect.

### Which are true statements about the following module? (Choose all that apply.)
```java
    class dragon {
        exports com.dragon.fire;
        exports com.dragon.scales to castle;

    }
```

*  A. All modules can reference the com.dragon.fire package.
*  B. All modules can reference the com.dragon.scales package.
*  C. Only the castle module can reference the com.dragon.fire package.
*  D. Only the castle module can reference the com.dragon.scales package.
*  E. None of the above

There is a trick here.
A module definition uses the keyword module rather than class.
Since the code does not compile, option E is correct. If the code did compile,
options A and D would be correct.

#### Which of the following statements
#### are true in a module-info.java file? (Choose all that apply.)
*  A. The opens keyword allows the use of reflection.
*  B. The opens keyword declares an API is called.
*  C. The use keyword allows the use of reflection.
*  D. The use keyword declares an API is called.
*  E. The uses keyword allows the use of reflection.
*  F. The uses keyword declares an API is called.
*  G. The file can be empty (zero bytes).

Options C and D are incorrect because there is no use keyword.
Options A and F are correct because opens is for reflection
and uses declares an API that consumes a service.
Option G is also correct as the file can be completely empty.
This is just something you have to memorize.

##### Given the previous diagram and the following module-info.java
##### for the panda module, what change can be made to the requires statement?

``` java
    module panda {
        requires mammal;
    }

```

* A. exports transitive mammal;
* B. exports transitive mammal.eat;
* C. requires transitive animal;
* D. requires transitive animal.util;
* E. transitive requires animal;
* F. transitive requires animal.util;

The transitive keyword goes after requires,
ruling out all but options C and D. Just like requires,
requires transitive references a module name, narrowing it down to option C.

###### Given the diagram in question 43 and the correct
###### export statement to share only com.duckling,
###### which of the following should be included in the module-info.java
###### file of com.park to specify that com.park
###### should have access to the com.duckling and com.bread packages,
###### but not the com.egg package?

* A. require com.duck, com.bread;
* B. requires com.duck; com.bread;
* C. require com.duckling, com.bread;
* D. requires com.duckling; com.bread;
* E. None of the above

The correct way to specify this is requires com.duck; requires com.bread;.
There is no way to combine two module requires statements into one.
Additionally, note that the requires statement
works with a module name, not a package name.

#### Given the diagram, what statements need to be in module-info.java
#### for the mammal module? (Choose three.)
* A. exports mammal;
* B. exports mammal.eat;
* C. requires animal;
* D. requires animal.util;
* E. requires milk;
* F. requires milk.store;

[image](images/animal_mammal_milk.jpg)
The mammal module depends on two other modules.
Since requires references module names, options C and E are correct.
The module also has one package, which is referenced in the exports directive.
This makes option B correct as well.





