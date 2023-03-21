### What is true of a module containing a file named module-info.java with the following contents? (Choose all that apply.)
```java
module com.food.supplier {}
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

Modules are required to have a module-info.java file at the root directory of the module. Option D matches this requirement.

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
The only one that is legal is the first declaration, so option B is correct.

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

Each module is required to have its own module-info.java file in the root directory of the module.
For module com.ny, that is location W, and for module com.sf, that is location Y. Therefore, option B is correct.


