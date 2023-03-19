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
