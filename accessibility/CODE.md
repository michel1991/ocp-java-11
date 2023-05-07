### My  Rule Protected in Different package
* prior static analysis at the left side(1)
* While Reference type(at left) is current Reference type of current child it is ok for method that hold accessibility protected


##### Suppose we have the following class in the file /my/directory/named/A/Bird.java.
#### Which of the answer options replaces INSERT CODE HERE when added independently
#### if we compile from /my/directory? (Choose all that apply.)
```java
 //INSERT CODE HERE
  public class Bird {
  }
```
* A. package my.directory.named.a;
* B. package my.directory.named.A;
* C. package named.a;
* D. package named.A;
* E. package a;
* F. package A;

The package name represents any folders underneath the current path, which is named.A in this case.
Option B is incorrect because package names are case sensitive, just like variable names and other identifiers.


### Which of the following can fill in the blank in this code to make it compile? (Choose all that apply.)
```java
public class Ant {
    _____ void method() {}
    }
```
* A. default
* B. final
* C. private
* D. Public
* E. String
* F. zzz:

The keyword void is a return type.
Only the access modifier or optional specifiers are allowed before the return type.
Option C is correct, creating a method with private access.
Option B is also correct, creating a method with default access and the optional specifier final.
Since default access does not require a modifier, we get to jump right to final.
Option A is incorrect because default access omits the access modifier rather than specifying default.
Option D is incorrect because Java is case sensitive.
It would have been correct if public were the choice.
Option E is incorrect because the method already has a void return type.
Option F is incorrect because labels are not allowed for methods.

### Which can fill in the blank to create a properly encapsulated class? (Choose all that apply.)

```java
    public class Rabbits {
        _____ int numRabbits = 0;
        _____ void multiply() {
            numRabbits *= 6;
        }
        ______ int getNumberOfRabbits() {
            return numRabbits;
        }
    }
```


* A. private, public, and public
* B. private, protected, and private
* C. private, private, and protected
* D. public, public, and public
* E. None of the above since multiply() does not begin with set
* F. None of the above for a reason other than the multiply() method

Instance variables must the private access modifier,
making option D incorrect. While it is common for methods to be public, this is not required.
Options A, B, and C are all correct, although some are more useful than others.
Since the class can be written to be encapsulated, options E and F are incorrect.

### What can fill in the blank so the play() method can be called from all classes in the com.mammal and com.mammal.eland package, but not the com.mammal.gopher package?
```java
    package com.mammal;

    public class Enrichment {
        _____  void play() {}
    }

```
*  A. Leave it blank.
*  B. private
*  C. protected
*  D. public
*  E. None of the above.

If only the com.mammal class needed access, option A would be correct.
Access modifiers cannot be used to grant access to a list of packages.
The Java Platform Module Framework can do this, but it is not an option in this question. Therefore, option E is correct.



#### What can fill in the blank so the play() method can be called
#### from all classes in the com.mammal package, but not the com.mammal.gopher package?

``` java
    package com.mammal;

    public class Enrichment {
        _____  void play() {}
    }

```
* A. Leave it blank.
* B. private
* C. protected
* D. public
* E. None of the above.

Since only one package needs access and it is the same package the class is in, option A is correct.






