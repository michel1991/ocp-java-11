### Which statements about classes and its members are correct? (Choose all that apply.)
* A. A variable declared in a loop cannot be referenced outside the loop.
* B. A variable cannot be declared in an instance initializer block.
* C. A constructor argument is in scope for the life of the instance of the class for which it is defined.
* D. An instance method can only access instance variables declared before the instance method declaration.
* E. A variable can be declared in an instance initializer block but cannot be referenced outside the block.
* F. A constructor can access all instance variables.
* G. An instance method can access all instance variables.

The question is primarily about variable scope.
A variable defined in a statement such as a loop or initializer
block is accessible only inside that statement.
For this reason, options A and E are correct.
Option B is incorrect because variables
can be defined inside initializer blocks.
Option C is incorrect, as a constructor argument is accessible
only in the constructor itself, not for the life of the instance of the class.
Constructors and instance methods can access any instance variable,
even ones defined after their declaration, making option D incorrect and options F and G correct.

### Variables declared as which of the following are never permitted in a switch statement? (Choose two.)
*  A. var
*  B. double
*  C. int
*  D. String
*  E. char
*  F. Object

A switch statement supports the primitive types byte, short, char,
and int and the wrapper classes Character, Byte, Short, and Integer.
It also supports String and enumerated types.
Finally, it permits var if it can be resolved to one of the previous types.
Floating-point types like float and double are not supported;
therefore, option B is correct.
Object is also not supported since it could include any class,
making option F correct as well.


#### Which expressions about enums used in switch statements are correct? (Choose two.)
* A. The name of the enum type must not be used in each case statement.
* B. A switch statement that takes a enum value may not use ordinal() numbers as case statement matching values.
* C. The name of the enum type must be used in each case statement.
* D. Every value of the enum must be present in a case statement.
* E. A switch statement that takes a enum value can use ordinal() numbers as case statement matching values.
* F. Every value of the enum must be present in a case statement unless a default branch is provided.

A switch statement that uses an enum must include case statements
that reference the value of the enum, without the enum type.
For this reason, option A is correct and option C is incorrect.
The ordinal() value or position cannot be used in case statements
when the switch statement takes an enum value, making option B correct and option E incorrect.
Finally, not every value in enum must be present in the case statement,
regardless of whether a default branch is present, making options D and F incorrect.






