### Which of the following are true statements? (Choose all that apply.)
* A. do while loops can execute the loop body exactly zero times.
* B. do while loops contain an increment clause.
* C. Traditional for loops can execute the loop body exactly zero times.
* D. Traditional for loops contain an increment clause.
* E. while loops can execute the loop body exactly zero times.
* F. while loops contain an increment clause.

Options B and F are incorrect because only traditional for loops have an increment clause.
Other loops can increment a variable inside the loop,
but this is not a clause that is part of the loop construct.
Option A is incorrect because do while loops check
the condition after the first loop execution.

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