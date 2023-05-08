##### Which of the following operators are ranked in increasing
##### or the same order of precedence? Assume the + operator
##### is binary addition, not the unary form. (Choose all that apply.)
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
In option D, the assignment operator (=) is between two unary operators,
with the multiplication operator (*) incorrectly having the highest order or precedence.
In option F, the logical complement operator (&) has the highest order of precedence, so it should be last.
In option G, the assignment operators have the lowest order of precedence, not the highest,
so the last two operators should be first.

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

A while loop and do/while loop both require a boolean expression,
making options A and D correct and options B and E incorrect.
Option C is incorrect because
a for-each statement requires an assignment type and an object to iterate on.
Option F is correct and shows a traditional for loop with no arguments.

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

### Which of the following best describes the flow of execution in this for loop if beta always returns false?
```Java
    for (alpha; beta; gamma) {
        delta;
    }
```
*  A. alpha
*  B. alpha, beta
*  C. alpha, beta, gamma
*  D. alpha, gamma
*  E. alpha, gamma, beta
*  F. None of the above

The initializer, which is alpha, runs first. Then Java checks the condition,
which is beta, to see whether loop execution should start.
Since beta returns false, the loop is never entered, and option B is correct.

##### Which statements about loops are correct? (Choose three.)
* A. A do/while loop requires a body.
* B. A while loop cannot be exited early with a return statement.
* C. A while loop requires a conditional expression.
* D. A do/while loop executes the body (if present) at least once.
* E. A do/while loop cannot be exited early with a return statement.
* F. A while loop executes the body (if present) at least once.

A do/while loop requires a body, making option A correct.
Options B and E are incorrect, as both types of
while loops can be exited early with a return statement.
Both also require a conditional expression, making option C correct.
What distinguishes a do/while loop
from a while loop is that it executes
its body at least once, making option D correct and option F incorrect.

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

##### Which are true statements comparing for-each and traditional for loops? (Choose two.)
* A. Both can iterate through an array starting with the first element.
* B. Only the for-each loop can iterate through an array starting with the first element.
* C. Only the traditional for loop can iterate through an array starting with the first element.
* D. Both can iterate through an array starting from the end.
* E. Only the for-each loop can iterate through an array starting from the end.
* F. Only the traditional for loop can iterate through an array starting from the end.

A traditional for loop gives you full control over the order of iteration.
This means you can iterate through the array backward or forward.
By contrast, with a for-each loop, the iteration order is determined for you.
With an array, this means starting with index 0. Options A and F match this scenario.


##### Fill in the blanks: The operators !=, _______, _______, _______,
##### and ++ are listed in the same or increasing level of operator precedence. (Choose two.)
* A. ==, *, !
* B. /, %, *
* C. *, --, /
* D. !, *, %
* E. +=, &&, *
* F. *, ˂, /

Option A is correct and lists the operators in the same
or increasing level of operator precedence. In option B,
the three operators actually have the same operator precedence,
so it is correct. Option C is incorrect, as division (/)
has a lower precedence than the decrement operator (--).
Option D is incorrect because the logical complement operator (!) has
a higher order of precedence than the other two operators.
Option E lists the operators in the correct order,
but they don’t fit within not equals (!=) and the increment operator (++) as listed in the question.
In particular, compound addition operator (+=) and short-circuit logical operator (&&)
have a lower precedence than the not equals operator (!=).
Finally, option F is incorrect because the relational operator
(<) does not fit between multiplication operator (*)
and the division operator (/) in order of precedence.

### Fill in the blanks: The operators +=, ______, ______, _______, _______, and --
#### are listed in increasing or the same level of operator precedence. (Choose two.)
* A. ^, *, =, ++
* B. %, *, /, &&
* C. =, +, /, *
* D. ^, *, ==, ++
* E. *, /, %, ++
* F. ˂=, ˃=, !=, !

In option A, the assignment operator (=) incorrectly
comes after the multiplication (*) operator.
In option B, the short-circuit logical operator (&&) incorrectly comes after the division (/) operator.
In option D, the equality operator (==) incorrectly comes after the multiplication (*)
operator. In option F, the not equals operator (!=) incorrectly comes
after the relational operators, (˂= and ˃=).
This leaves options C and E as the correct answers.
For these answers, it may help to remember that the modulus operator (%),
multiplication operator (*), and division operator (/) have the same operator precedence.


