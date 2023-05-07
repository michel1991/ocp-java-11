### Top level type (class, interface, enum, annotation) cannot be (static)
### mean not creation, not implementation

### Which of the following is true about a concrete class? (Choose all that apply.)
* A. A concrete class can be declared as abstract.
* B. A concrete class must implement all inherited abstract methods.
* C. A concrete class can be marked as final.
* D. If a concrete class inherits an interface from one of its superclasses, then it must declare an implementation for all methods defined in that interface.
* E. A concrete method that implements an abstract method must match the method declaration of the abstract method exactly.

Concrete classes are, by definition, not abstract, so option A is incorrect.
A concrete class must implement all inherited abstract methods, so option B is correct.
Concrete classes can be optionally marked final, so option C is correct.
Option D is incorrect; a superclass may have already implemented an inherited interface method.
The concrete class only needs to implement the inherited abstract methods.
Finally, a method in concrete class that implements an inherited abstract method overrides the method.
While the method signature must match, the method declaration does not need to match,
such as using a covariant return type or changing the throws declaration.
For these reasons, option E is incorrect.

###### Which statements about Java classes are true? (Choose three.)
* A. A Java class file may include more than one package statement.
* B. A Java class file may include more than one import statement.
* C. A Java class file may contain more than one comment.
* D. Any instance fields within a class must be defined after the class name.
* E. Any instance fields within a class must be defined before the class name.
* F. Java supports macros, in which fragments of code within a class may be defined inside a Java file, separate from any top-level type declaration.

A Java class file may have at most one package statement and any number
of import statements and comments.
For this reason, option A is incorrect, and options B and C are correct.
When declaring a class, the name comes first, before instance declarations,
making option D correct and option E incorrect.
Finally, Java does not support fragments of code outside of a top-level type,
such as a class or interface, making option F incorrect.

#### Which statements about top-level and member inner classes are correct? (Choose three.)
* A. Both can be marked protected.
* B. Only top-level classes can be declared final.
* C. Both can declare constructors.
* D. Member inner classes cannot be marked private.
* E. Member inner classes can access private variables of the top-level class in which it is defined.
* F. Both can be marked abstract.

Top-level classes can be set only with public and package-private access,
making option A incorrect. On the other hand, member inner classes can be set with
any of the four access levels, making option D incorrect.
Both types of classes can be declared with final or abstract modifier,
making option B incorrect and option F correct. Both can also include constructors,
making option C correct. Finally, option E is correct and one of the primary features of inner classes.