### Which of the following operators are ranked in increasing or the same order of precedence? Assume the + operator is binary addition, not the unary form. (Choose all that apply.)
* A. +, *, %, --
* B. ++, (int), *
* C. =, ==, !
* D. (short), =, !, *
* E. *, /, %, +, ==
* F. !, ||, &
* G. ^, +, =, +=

Options A and C show operators in increasing or the same order of precedence.
Options B and E are in decreasing or the same order of precedence.
Options D, F, and G are in neither increasing or decreasing order of precedence.
In option D, the assignment operator (=) is between two unary operators, with the multiplication operator (*) incorrectly having the highest order or precedence.
In option F, the logical complement operator (&) has the highest order of precedence, so it should be last.
In option G, the assignment operators have the lowest order of precedence, not the highest, so the last two operators should be first.

### Which statements about classes and its members are correct? (Choose all that apply.)
* A. A variable declared in a loop cannot be referenced outside the loop.
* B. A variable cannot be declared in an instance initializer block.
* C. A constructor argument is in scope for the life of the instance of the class for which it is defined.
* D. An instance method can only access instance variables declared before the instance method declaration.
* E. A variable can be declared in an instance initializer block but cannot be referenced outside the block.
* F. A constructor can access all instance variables.
* G. An instance method can access all instance variables.

The question is primarily about variable scope. A variable defined in a statement such as a loop or initializer block is accessible only inside that statement.
For this reason, options A and E are correct. Option B is incorrect because variables can be defined inside initializer blocks.
Option C is incorrect, as a constructor argument is accessible only in the constructor itself, not for the life of the instance of the class.
Constructors and instance methods can access any instance variable, even ones defined after their declaration, making option D incorrect and options F and G correct.

### Which of the following are true statements? (Choose all that apply.)
* A. do while loops can execute the loop body exactly zero times.
* B. do while loops contain an increment clause.
* C. Traditional for loops can execute the loop body exactly zero times.
* D. Traditional for loops contain an increment clause.
* E. while loops can execute the loop body exactly zero times.
* F. while loops contain an increment clause.

Options B and F are incorrect because only traditional for loops have an increment clause.
Other loops can increment a variable inside the loop, but this is not a clause that is part of the loop construct.
Option A is incorrect because do while loops check the condition after the first loop execution.

## Which of the following statements compile and create infinite loops at runtime? (Choose three.)
*  A. while (!false) {}
*  B. do {}
*  C. for( : ) {}
*  D. do {} while (true);
*  E. while {}
*  F. for( ; ; ) {}

A while loop and do/while loop both require a boolean expression, making options A and D correct and options B and E incorrect.
Option C is incorrect because a for-each statement requires an assignment type and an object to iterate on.
Option F is correct and shows a traditional for loop with no arguments.
