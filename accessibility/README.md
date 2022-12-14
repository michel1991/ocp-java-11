### Which of the following statements is true?
* A. Package-private access is more lenient than protected access.
* B. A public class that has private fields and package-private methods is not visible to classes outside the package.
* C. You can use access modifiers so only some of the classes in a package see a particular package-private class.
* D. You can use access modifiers to allow access to all methods and not any instance variables.
* E. You can use access modifiers to restrict access to all classes that begin with the word Test.

### Which of the following are valid Java identifiers? (Choose all that apply.)
* A. _
* B. _helloWorld$
* C. true
* D. java.lang
* E. Public
* F. 1980_s
* G. _Q2_

Option A is invalid because a single underscore is no longer allowed as an identifier as of Java 9.
Option B is valid because you can use an underscore within identifiers and dollar sign ($) is also a valid character.
Option C is not a valid identifier because true is a Java reserved word.
Option D is not valid because a period (.) is not allowed in identifiers.
Option E is valid because Java is case sensitive.
Since Public is not a reserved word, it is allowed as an identifier, whereas public would not be allowed.
Option F is not valid because the first character is not a letter, dollar sign ($), or underscore (_).
Finally, option G is valid as identifiers can contain underscores (_) and numbers, provided the number does not start the identifier.

### Which statements about top-level and member inner types are correct? (Choose all that apply.)
* A. A public top-level interface may only be declared in a file that uses the same name as the interface.
* B. An interface may not be declared as a member of a class.
* C. A .java file may contain multiple top-level Java classes and interfaces.
* D. If a member inner class is marked private, it cannot be used outside the class.
* E. A member inner class may only be declared public or default (package-private).
* F. A member inner class cannot be marked abstract.

A .java file may contain multiple top-level classes or interfaces, although only one of them can be public.
If one of the types is public, then the name must match the filename.
For this reason, options A and C are correct.
Option B is incorrect, as a member inner type can be a class or an interface.
Option D is also incorrect, as this applies to all private members of a class.
Option E is incorrect, as that restriction applies to top-level classes, not member inner classes.
Finally, option F is incorrect, as member classes can be abstract or concrete.