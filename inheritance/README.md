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