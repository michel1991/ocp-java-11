### What modifiers are implicitly applied to all interface methods that do not declare a body? (Choose all that apply.)
* A. protected
* B. public
* C. static
* D. void
* E. abstract
* F. default

A method that does not declare a body is by definition abstract, making option E correct.
All abstract interface methods are assumed to be public, making option B correct.
Interface methods cannot be marked protected, so option A is incorrect.
Interface methods can be marked static or default, although if they are,
they must provide a body, making options C and F incorrect.
Finally, void is a return type, not a modifier, so option D is incorrect.

### Which modifiers are implicitly applied to all interface variables? (Choose all that apply.)
* A. protected
* B. final
* C. transient
* D. default
* E. const
* F. static
* G. None of the above

All interface variables are assumed to be public, static, and final, making options B and F correct.
The other modifiers, while all Java keywords,cannot be applied to interface variables.
Note that const is an unused keyword in Java.

### What is the best reason for marking an existing static method private within in an interface?
* A. It allows the method to be overridden in a subclass.
* B. It hides the secret implementation details from another developer using the interface.
* C. It improves the visibility of the method.
* D. It ensures the method is not replaced with an overridden implementation at runtime.
* E. It allows the method to be marked abstract.
* F. Trick question! All static methods are implicitly private within an interface.

Marking an interface method private improves the encapsulation
of the class, making option B correct.
Options A and D are incorrect as static methods cannot be overridden,
regardless if they are marked private. Option C is incorrect,
as adding private to a method reduces
the visibility of the method. Options E and F are flat out wrong.

#### Which set of modifiers, when added to a default method within an interface,
#### prevents it from being overridden by a class implementing the interface?
* A. const
* B. final
* C. static
* D. private
* E. private static
* F. None of the above

You Answered Incorrectly.
There is no modifier that can prevent a default method from
being overridden in a class implementing an interface, making option F correct.
