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

### Given the diagram, how many of the classes shown in the diagram can call the display()  method?
* A. Zero
* B. One
* C. Two
* D. Three
* E. Four

The display()  method has protected access. [image](./accessibility.jpg)
This means it can be accessed by instance methods in the same package and any subclasses.
There are no subclasses in this example, so we only need to count
the classes in the same package. Option C is correct because Flashlight and Phone are in the package.

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

### Which of the following statements is not true?
* A. An instance of one class may access an instance of another class’s attributes if it has a reference to the instance and the attributes are declared public.
* B. An instance of one class may access package-private attributes in a parent class, provided the parent class is not in the same package.
* C. An instance of one class may access an instance of another class’s attributes if both classes are located in the same package and marked protected.
* D. Two instances of the same class may access each other’s private attributes.
* E. All of the above are true.

Options A, C, and D are true statements. Option A is correct because public allows any class to access it.
Option C is true because protected access also provides package-private access.
Option D allows us to write the equals() methods between two objects that compare private attributes of the class.
Option B is false. Package-private attributes are visible only if the two classes are in the same package,
regardless of whether one extends the other.

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

##### Given the diagram, how many classes can write code that references the light variable?
* A. None
* B. One
* C. Two
* D. Three
* E. Four

[image](./images/color_light_blue.jpg)
This variable has protected access, which means code in the same package
can access it in addition to subclasses.
There are two classes in the com.color package
and one class that subclasses it, making option D the answer.