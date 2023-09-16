### Which of the following are true about Java operators and statements? (Choose three.)
* A. Both right-hand sides of the ternary expression are evaluated at runtime.
* B. A switch statement may contain at most one default statement.
* C. The post-increment operator (++) returns the value of the variable before the addition is applied.
* D. The logical operators (|) and (||) are interchangeable, producing the same results at runtime.
* E. The complement operator (!) operator may be applied to numeric expressions.
* F. An assignment operator returns a value that is equal to the value of the expression being assigned.

The ternary operator (? :) evaluates only one of the two right-hand expressions at runtime,
so option A is incorrect.A switch statement may contain at most one optional default statement,
making option B correct. The post-increment operator increments the variable
and returns the original value, making option C correct.
The logical operator (|) operator will evaluate both operands,
while the disjunctive short-circuit (||) operator will only
evaluate the right-hand side of the expression if the left-hand side evaluates to false.
Therefore, they may produce different results if the left operand is true, and option D is incorrect.
Option E is incorrect as the complement operator (!) is applied to boolean values.
Finally, option F is correct and allows the assignment operator
to be used in a conditional expression, such as part of a loop condition.

### Which statements about decision structures are true? (Choose all that apply.)
* A. A for-each loop can be executed on any Collections Framework object.
* B. The body of a while loop is guaranteed to be executed at least once.
* C. The conditional expression of a for loop is evaluated before the first execution of the loop body.
* D. A switch statement with no matching case statement requires a default statement.
* E. The body of a do/while loop is guaranteed to be executed at least once.
* F. An if statement can have multiple corresponding else statements.

A for-each loop can be executed on any Collections object that implements java.lang.Iterable,
such as List or Set, but not all Collections classes, such as Map, so option A is incorrect.
The body of a do/while loop is executed one or more times, while the body
of a while loop is executed zero or more times, making option E correct and option B incorrect.
The conditional expression of for loops is evaluated at the start of the loop execution,
meaning the for loop may execute zero or more times, making option C correct.
Option D is incorrect, as a default statement is not required in a switch statement.
In the case that no case statements match and there is no default statement,
the application will exit the switch statement without executing any branches.
Finally, each if statement has at most one matching else statement, making option F incorrect.
You can chain multiple if and else statements together, but each else
statement requires a new if statement.