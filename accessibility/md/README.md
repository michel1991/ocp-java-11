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



### Given the diagram, how many of the classes shown in the diagram can call the display()  method?
* A. Zero
* B. One
* C. Two
* D. Three
* E. Four

The display()  method has protected access. [image](./accessibility.jpg)
This means it can be accessed by instance methods in the same package and any subclasses.
There are no subclasses in this example, so we only need to count
the classes in the same package.
Option C is correct because Flashlight and Phone are in the package.


### Which of the following statements is not true?
* A. An instance of one class may access an instance of another class’s attributes if it has a reference to the instance and the attributes are declared public.
* B. An instance of one class may access package-private attributes in a parent class, provided the parent class is not in the same package.
* C. An instance of one class may access an instance of another class’s attributes if both classes are located in the same package and marked protected.
* D. Two instances of the same class may access each other’s private attributes.
* E. All of the above are true.

Options A, C, and D are true statements.
Option A is correct because public allows any class to access it.
Option C is true because protected access also provides package-private access.
Option D allows us to write the equals() methods between two objects that compare private attributes of the class.
Option B is false. Package-private attributes are visible only if the two classes are in the same package,
regardless of whether one extends the other.



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

#### Which statements can accurately fill in the blanks in this table? (Choose two.)
Variable Type	Can Be Called Within the Class from What Type of Method? [image](./images/variable-type-can-be-called.png)
Instance	      Blank 1: _____________
static	       Blank 2: _____________

* A. Blank 1: an instance method only
* B. Blank 1: a static method only
* C. Blank 1: an instance or static method
* D. Blank 2: an instance method only
* E. Blank 2: a static method only
* F. Blank 2: an instance or static method


An instance variable can be referenced only from instance methods in the class,
making option A correct. A static variable can be referenced from any method.
Therefore, option F is correct.