# Which statements about inheritance are correct? (Choose all that apply.)
A. A class can extend multiple interfaces.
B. Java supports multiple inheritance of parent classes.
C. A class inherits at most one class.
D. An interface may extend multiple interfaces.
E. A class can extend multiple classes.
F. A class can implement multiple interfaces.

Classes do not extend interfaces, but they can implement multiple interfaces, making option A incorrect and option F correct.
Java supports single inheritance of objects, making option B incorrect and option E incorrect.
While Java supports single inheritance, a class can inherit multiple classes.
For example, RuntimeException inherits Exception, which inherits Error, and finally Object.
For this reason, option C is incorrect.
An interface can extend multiple interfaces, making option D correct.

# Which of the following statements about methods are true? (Choose all that apply.)
A. Overloaded methods must have the same signature.
B. Overridden methods must have the same signature.
C. Hidden methods must have the same signature.
D. Overloaded methods must have the same return type.
E. Overridden methods must have the same return type.
F. Hidden methods must have the same return type.

Overloaded methods have the method name but a different signature (the method parameters differ), making option A incorrect.
Overridden instance methods and hidden static methods must have the same signature (the name and method parameters must match),
making options B and C correct.
Overloaded methods can have different return types, while overridden and hidden methods can have covariant return types.
None of these methods are required to use the same return type, making options D, E, and F incorrect.

# Which statements about top-level types and member inner classes are correct? (Choose all that apply.)
A. A member inner class can be marked final.
B. A top-level type can be marked protected.
C. A member inner class cannot be marked public since that would make it a top-level class.
D. A top-level type must be stored in a .java file with a name that matches the class name.
E. If a member inner class is marked private, then it can be referenced only in the outer class for which it is defined.

An inner class can be marked abstract or final, just like a regular class, making option A correct.
A top-level type, such as a class, interface, or enum, can only be marked public or default (package-private), making option B incorrect.
Option C is incorrect, as a member inner class can be marked public, and this would not make it a top-level class.
A .java file may contain multiple top-level classes, making option D incorrect. The precise rule is that there is at most one public top-level type, and that type is used in the file name.
Finally, option E is correct. When a member inner class is marked private, it behaves like any other private members and can be referenced only in the class in which it is defined.