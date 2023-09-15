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