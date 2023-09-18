### My  Rule Protected in Different package
* prior static analysis at the left side(1)
* While Reference type(at left) is current Reference type of current child it is ok for method that hold accessibility protected


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



### What can fill in the blank so the play() method can be called from
### all classes in the com.mammal and com.mammal.eland package,
### but not the com.mammal.gopher package?
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
The Java Platform Module Framework can do this,
but it is not an option in this question.
Therefore, option E is correct.



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

Since only one package needs access
and it is the same package the class is in, option A is correct.

##### Fill in the blanks: The ___________________ access modifier allows access
##### to everything the ___________________ access modifier does and more.
* A. package-private, protected
* B. private, package-private
* C. private, protected
* D. private, public
* E. public, private
* F. None of the above

The public access modifier allows access to members in the same class,
package, subclass, or even classes in other packages,
while the private modifier allows access only to members in the same class.
Therefore, the public access modifier allows access to everything
the private access modifier does, and more, making option E the correct answer.
Options A, B, C, and D are incorrect because
the first term is a more restrictive access modifier than the second term.


##### Fill in the blanks: The ___________________ access modifier allows access to everything
##### the ___________________ access modifier does and more.
* A. package-private, private
* B. private, protected
* C. protected, public
* D. private, package-private
* E. None of the above

Package-private allows access by code within the same package,
while the private modifier allows access only to members in the same class.
This makes option A the correct answer.
Options B, C, and D are incorrect because
the first term is a more restrictive access modifier than the second term.

##### Fill in the blanks: The ___________________ access modifier
###### allows access to everything the ___________________ access modifier does and more. (Choose three.)
* A. package-private, protected
* B. package-private, public
* C. protected, package-private
* D. protected, public
* E. public, package-private
* F. public, protected

The public access modifier is the broadest, making options E and F correct.
Package-private access limits references to those in the same package.
The protected access modifier adds on subclass access, making option C correct.

## Which of the following modifiers can be applied to an abstract method? (Choose two.)
*  A. final
*  B. private
*  C. public
*  D. default
*  E. protected
*  F. concrete

An abstract method cannot include the final or private modifier.
If a method contained either of these modifiers,
then no concrete subclass would ever be able to override it with an implementation.
For these reasons, options A and B are incorrect.
Option D is also incorrect because the default keyword applies to concrete interface methods,
not abstract methods. Option F is incorrect because there is no concrete modifier.
That leaves options C and E as the correct answer.
The protected, package-private, and public access modifiers can each be applied to abstract methods.

### Assume there is a class Bouncer with a protected variable. Methods in which class can access this variable?
*  A. Any subclass of Bouncer or any class in the same package as Bouncer
*  B. Any superclass of Bouncer
*  C. Only subclasses of Bouncer
*  D. Only classes in the same package as Bouncer
*  E. None of the above

The protected modifier allows access by any subclass or class that is in the same package;
therefore, option A is the correct answer.

##### What access modifier is used to mark class members package-private?
* A. default
* B. friend
* C. protected
* D. private
* E. None of the above

In Java, the lack of an access modifier indicates that the member is package-private;
therefore, option E is correct.
Note that the default keyword is used for interfaces, annotations,
and switch statements, and is not an access modifier.






