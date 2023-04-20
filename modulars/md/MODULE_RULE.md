#### What is true of a module containing a file named module-info.java
#### with the following contents? (Choose all that apply.)
```java
module com.food.supplier {}
```
*  A. All packages inside the module are automatically exported.
*  B. No packages inside the module are automatically exported.
*  C. A main method inside the module can be run.
*  D. A main method inside the module cannot be run since the class is not exposed.
*  E. The module-info.java file contains a compiler error.
*  F. The module-info.java filename is incorrect.

Packages inside a module are not exported by default,
making option B correct and option A incorrect.
Exporting is necessary for other code to uses the packages;
it is not necessary to call the main method at the command line,
making option C correct and option D incorrect.
The module-info.java file has the correct name and compiles,
making options E and F incorrect.

###### Suppose you have a module named com.vet.
###### Where could you place the following module-info.java
###### file to create a valid module?

```java
    public module com.vet {
        exports com.vet;
    }
```
* A. At the same level as the com folder
* B. At the same level as the vet folder
* C. Inside the vet folder

If this were a valid module-info.java file,
it would need to be placed at the root directory of the module, which is option A.
However, a module is not allowed to use the public access modifier.
Option D is correct because the provided
file does not compile regardless of placement in the project.
For more information, see Chapter 11.


### Which two are required in any module? (Choose two.)
*  A. A file named module.java
*  B. A file named moduleInfo.java
*  C. A file named module-info.java
*  D. A file named module_info.java
*  E. Zero or more packages
*  F. One or more packages

All modules must contain a module-info.java file in the root directory,
making option C correct.
Additionally, a module is not allowed to be empty.
There must be at least one package. making option F the second correct answer.

### What is true about the following module-info.java file?
``` java
    module Book {
    }
```
* A. It does not compile because it is empty.
* B. It does not compile because the module name is uppercase.
* C. It does not compile because the module name has only one component.
* D. It does not compile for another reason.

Option E is correct as this code does compile. While it is uncommon,
a module is not required to have any directives in the body.
Similarly, module names are lowercase and have more than one component by convention.
None of these problems prevents the file from compiling, though.

### Which statement is true of the following module?

``` java

        zoo.staff
        |---zoo
        |-- staff
        |-- Vet.java

```

* A. The directory structure shown is a valid module.
* B. The directory structure would be a valid module if module.java were added directly underneath zoo.staff.
* C. The directory structure would be a valid module if module.java were added directly underneath zoo.
* D. The directory structure would be a valid module if module-info.java were added directly underneath zoo.staff.
* E. The directory structure would be a valid module if module-info.java were added directly underneath zoo.
* F. None of these changes would make this directory structure a valid module.

Modules are required to have a module-info.java
file at the root directory of the module.
Option D matches this requirement.


###### Given the diagram in question 78 and the following module-info.java for the panda module,
###### what is the result of including line m1?

``` java
    module panda {
        requires mammal;
        requires transitive mammal; // line m1
    }
```
*  A. Any modules that require mammal will automatically get panda as well.
*  B. Any modules that require panda will automatically get mammal as well.
*  C. There is no change in behavior.
*  D. The code does not compile.

Any requires directives must reference unique modules.
Using the transitive keyword does not change this requirement, making option D the correct answer.

##### Suppose we want to have two modules: com.ny and com.sf.
##### Which is true about the placement of the module-info.java file(s)?
[image](images/com.ny_com.sf.jpg)
* A. One module-info.java file is required in position Z.
* B. Two module-info.java files are required, in positions V and X.
* C. Two module-info.java files are required, in positions W and Y.
* D. Three module-info.java files are required, in positions V, X, and Z.
* E. Three module-info.java files are required, in positions W, Y, and Z.
* F. None of the above.

Each module is required to have its own module-info.java
file in the root directory of the module.
For module com.ny, that is location W,
and for module com.sf, that is location Y. Therefore, option B is correct.

### How many of the following are legal module-info.java files?
``` java
    module com.koala {
        exports cute;
    }
    module com-koala {
        exports cute;
    }
    public module com.koala {
        exports cute;
    }
    public module com-koala {
        exports cute;
    }
```
*  A. None
*  B. One
*  C. Two
*  D. Three
*  E. Four

Since Java does not allow dashes in identifier names,
the second and fourth declarations are invalid. Additionally,
access modifiers are not permitted in module declarations,
making the third and fourth declarations invalid.
The only one that is legal is the first declaration,
so option B is correct.

##### How many of these module declarations are valid?
```java
    module com.apple { exports com.apple; }
    module com.4apple { requires com.apple;}
    module com.apple4 { declares com.apple; }
    module com.apple-four { }
    module com.apple$ {}
```

* A. None.
* B. One.
* C. Two.
* D. Three.
* E. Four.
* F. Five.

This question is tricky because it mixes testing
valid identifier names with module concepts.
The com.apple module is valid and demonstrates a simple module.
Additionally, the com.apple$ module is valid since
$ characters are permitted in identifier names. The com.4apple
and com.apple-four modules are invalid because identifier or
identifier segments may not start with a digit nor contain a dash.
The com.apple4 module is invalid because declares is not a valid module directive.
Since only two are valid, option C is the answer.

#### How many of these module declarations are valid?

```java
    module com.leaf {}
    module com.leaf2 {}
    module com-leaf { }
    module LEAF {}
    module leaf2 {}
```
* A. Zero
* B. One
* C. Two
* D. Three
* E. Four
* F. Five

Module names are permitted to be any valid variable name with the addition of dot separators (.).
The only one that is problematic is com-leaf because dashes are not allowed, making option E correct.
As a reminder, numbers are permitted as long as they are not the first character in a segment.
Capital letters are discouraged but allowed.

#### Which of the following is true of the following module declaration?
``` java
    1: class com.mammal {
        2:    exports com.mammal.cat;
        3:    exports cat.mammal.mouse to com.mice;
        4:    uses com.animal;
        5: }

```

* A. The first line that fails to compile is line 1.
* B. The first line that fails to compile is line 2.
* C. The first line that fails to compile is line 3.
* D. The first line that fails to compile is line 4.
* E. The code compiles.

A module-info file is required to start with module rather than class.
Therefore, the first line doesn’t compile, and option A is correct.

### Which is the first line to contain a compiler error?
```java
module snake { //  1:
    exports com.snake.tail; // 2:
    exports com.snake.fangs to bird; //   3:
    requires skin; //    4:
    requires transitive skin; // 5:
} //  6:
```
* A. Line 1.
* B. Line 2.
* C. Line 3.
* D. Line 4.
* E. Line 5.
* F. The code does not contain any compiler errors.

The module name is valid as are the exports statements.
Lines 4 and 5 are tricky because each is valid independently.
However, the same module name is not allowed to be used in two requires statements.
The second one fails to compile on line 5, making option E the answer.



