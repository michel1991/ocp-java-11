##### Which statement about encapsulation is not true?
* A. Encapsulation allows putting extra logic in the getter and setter methods.
* B. Encapsulation can use immutable instance variables in the implementation.
* C. Encapsulation causes two classes to be more tightly tied together.
* D. Encapsulation makes it easier to change the instance variables in the future.

Encapsulation doesn’t allow callers access to the instance variables,
which makes it easier to change the code. The instance variables can be any type,
which means they can be mutable or immutable.
There are not constraints on the implementation of methods.
The purpose of encapsulation is to lessen how tightly tied or coupled the classes are.
Option C is the opposite of this, making it the answer.

#### Which statement is true about encapsulation while providing the broadest access allowed?
* A. Variables are private, and methods are private.
* B. Variables are private, and methods are public.
* C. Variables are public, and methods are private.
* D. Variables are public, and methods are public.
* E. None of the above.

If the variables are public, the class is not encapsulated because callers have direct access to them.
This rules out options C and D.
Having private methods doesn’t allow the callers to use the data,
making option A an undesirable answer.
Option B is correct and the classic definition
of encapsulation where the data is not exposed directly.