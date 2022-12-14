### Suppose you are writing a class that calls ServiceLoader and is trying to look up the Dragon implementation. Which line of code needs to be in your module-info.java?

``` java
package magic;
public interface Magic {
    String getPower();
    }

package dragon;
import magic.*;

public class Dragon implements Magic {
    public String getPower() {
        return "breathe fire";
    }
}

```
* A. uses dragon;
* B. uses dragon.Dragon;
* C. uses magic.Magic;
* D. uses dragon.Dragon as magic.Magic;
* E. uses dragon.Dragon with magic.Magic;
* F. None of the above

A service locator specifies the interface name, making option C correct.
Note that options D and E are trying to trick you by mixing up the provides directive syntax with the uses directive syntax.

### Suppose module puppy depends on module dog and module dog depends on module animal. Which two lines allow module puppy to access the animal.behavior package in module animal? (Choose two.)
```java
    module animal {
        exports animal.behavior to dog;
    }
    module dog {
        _______ animal;  // line S
    }
    module puppy {
            _______ dog;     // line T
    }
```
* A. require on line S
* B. require on line T
* C. requires on line S
* D. requires on line T
* E. require transitive on line S
* F. require transitive on line T
* G. requires transitive on line S
* H. requires transitive on line T

Options A, B, E, and F are incorrect because they refer to keywords that don’t exist.
The requires transitive keyword is used when specifying a module to be used by the requesting module and any other modules that use the requesting module.
Therefore, dog needs to specify the transitive relationship, and option G is correct.
The module puppy just needs to require dog, and it gets the transitive dependencies, making option D correct.

### Suppose you have a module named com.vet. Where could you place the following module-info.java file to create a valid module?

```java
    public module com.vet {
        exports com.vet;
    }
```
* A. At the same level as the com folder
* B. At the same level as the vet folder
* C. Inside the vet folder

If this were a valid module-info.java file, it would need to be placed at the root directory of the module, which is option A.
However, a module is not allowed to use the public access modifier. Option D is correct because the provided file does not compile regardless of placement in the project.
For more information, see Chapter 11.

# Suppose module puppy depends on module dog and module dog depends on module animal. Which fills in the blank to allow module puppy to access the animal.behavior package in module animal?

```java
   module animal {
    //__________________________
   }
    module dog {
        requires transitive animal;
    }
    module puppy {
            requires dog;
    }

```
* A. export animal.behavior for dog;
* B. export animal.behavior for puppy;
* C. export animal.behavior to dog;
* D. export animal.behavior to puppy;
* E. exports animal.behavior for dog;
* F. exports animal.behavior for puppy;
* G. exports animal.behavior to dog;
* H. exports animal.behavior to puppy;

Options A, B, C, and D are incorrect because the keyword is exports, not export.
Options E and F are incorrect because you export a package to a module.
Options G and H both are syntactically correct.
However, option H would require the puppy module to require the animal module. Since it does not, option G is correct.

### Suppose module puppy depends on module dog and module dog depends on module animal. Which two lines allow module puppy to access the animal.behavior package in module animal? (Choose two.)
```java
    module animal {
        exports animal.behavior to dog;
    }
    module dog {
        _______ animal;  // line S
    }
    module puppy {
        _______ dog;     // line T
    }

```
* A. require on line S
* B. require on line T
* C. requires on line S
* D. requires on line T
* E. require transitive on line S
* F. require transitive on line T
* G. requires transitive on line S
* H. requires transitive on line T

Options A, B, E, and F are incorrect because they refer to keywords that don’t exist.
The requires transitive keyword is used when specifying a module to be used by the requesting module and any other modules that use the requesting module.
Therefore, dog needs to specify the transitive relationship, and option G is correct.
The module puppy just needs to require dog, and it gets the transitive dependencies, making option D correct.

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
