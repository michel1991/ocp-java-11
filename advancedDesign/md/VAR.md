### Which of the following statements about var are true? (Choose all that apply.)
*  A. A var can be used as a constructor parameter.
*  B. The type of var is known at compile time.
*  C. A var cannot be used as an instance variable.
*  D. A var can be used in a multiple variable assignment statement.
*  E. The value of var cannot change at runtime.
*  F. The type of var cannot change at runtime.
*  G. The word var is a reserved word in Java.

A var cannot be used for a constructor or method parameter or for an instance or class variable,
making option A incorrect and option C correct.
The type of var is known at compile time and the type cannot be changed at runtime,
although its value can change at runtime.
For these reasons, options B and F are correct, and option E is incorrect.
Option D is incorrect, as var is not permitted in multiple-variable declarations.
Finally, option G is incorrect, as var is not a reserved word in Java.

##### Which statements about a variable with a type of var are true? (Choose two.)
* A. The variable can be assigned null at any point in the program.
* B. The variable can be assigned null only after initial initialization.
* C. The variable can never be assigned null.
* D. Only primitives can be used with the variable.
* E. Only objects can be used with the variable.
* F. Either a primitive or an object can be used with the variable.

The type is determined based on the value at initialization.
It cannot be null at that point, but the variable can be assigned as null later,
making option B correct. Both primitives and objects can be used with var,
making option F correct.
