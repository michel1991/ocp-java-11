###  Which of the following statements about finally blocks are true? (Choose all that apply.)
* A. A finally block is never required with a regular try statement.
* B. A finally block is required when there are no catch blocks in a regular try statement.
* C. A finally block is required when the program code doesn’t terminate on its own.
* D. A finally block is never required with a try-with-resources statement.
* E. A finally block is required when there are no catch blocks in a try-with-resources statement.
* F. A finally block is required in order to make sure all resources are closed in a try-with-resources statement.
* G. A finally block is executed before the resources declared in a try-with-resources statement are closed.
A regular try statement is required to have a catch clause and/or finally clause.

If a regular try statement does not have any catch clauses, then it must have a finally block,
making option B correct and option A incorrect.
Alternatively, a try-with-resources block is not required to have a catch
or finally block, making option D correct and option E incorrect.
Option C is incorrect, as there is no requirement a program must terminate.
Option F is also incorrect.
A try-with-resources statement automatically closes all declared resources.
While additional resources can be created or declared in a try-with-resources statement,
none are required to be closed by a finally block.
Option G is also incorrect.
The implicit or hidden finally block created by the JVM
when a try-with-resources statement is declared is executed first,
followed by any programmer-defined finally block.

### Which of the following statements about finally blocks are true? (Choose two.)
* A. Every line of the finally block is guaranteed to be executed.
* B. The finally block is executed only if the related catch block is also executed.
* C. The finally statement requires curly braces, {}.
* D. A finally block cannot throw an exception.
* E. The first line of a finally block is guaranteed to be executed.
* F. A finally block can only throw unchecked exceptions.

A finally block requires curly braces, making option C correct.
A finally block can throw an exception in which case not every
line of the finally block will be executed.
For this reason, option E is correct, and options A and D are incorrect.
Option B is incorrect because a finally block is called regardless
of whether the related catch block is executed.
A finally block can throw both checked and unchecked exceptions, making option F incorrect.
If the exception is checked, then it must be handled or declared in the method in which the finally block is used.

##### Which of the following are true statements
##### about exception handling in Java? (Choose all that apply.)
* A. A traditional try statement without a catch block requires a finally block.
* B. A traditional try statement without a finally block requires a catch block.
* C. A traditional try statement with only one statement can omit the {}.
* D. A try-with-resources statement without a catch block requires a finally block.
* E. A try-with-resources statement without a finally block requires a catch block.
* F. A try-with-resources statement with only one statement can omit the {}.

A try-with-resources statement does not require a catch or finally block.
A traditional try statement requires at least one of the two.
Neither statement can be written without a body encased in braces, {}.
A, B are correct

##### Which statements are true for a traditional try statement
##### (not a try-with-resources statement)? (Choose all that apply.)
* A. If a try statement has a catch clause, it is required to have a finally clause.
* B. If a try statement does not have a catch clause, it is required to have a finally clause.
* C. If a try statement has a finally clause, it is required to have exactly one catch clause.
* D. If a try statement has a finally clause, it is required to have at least one catch clause.
* E. A try statement can exist without a catch and a finally clause.
* F. A try statement can have both a catch and a finally clause.

A traditional try statement must have a finally clause and/or one or more catch clauses.


###### Fill in the blanks: A try statement ______________ a catch
###### or a finally block, while a try-with-resources statement ______________.
*  A. is not required to contain, is not required to contain either
*  B. is not required to contain, must contain one of them
*  C. must contain, is not required to contain either
*  D. must contain, must contain a catch block
*  E. None of the above.

Unlike a try-with-resources statement, in which the catch and finally blocks are optional,
a traditional try statement requires a catch or finally block to be used, or both.
For this reason, option C is correct.

###### If a try statement has catch blocks for both ClassCastExceptionand
###### RuntimeException, then which of the following statements is correct?
*  A. The catch blocks for these two exception types can be declared in any order.
*  B. A try statement cannot be declared with these two catch block types because they are incompatible.
*  C. The catch block for ClassCastException must appear before the catch block for RuntimeException.
*  D. The catch block for RuntimeException must appear before the catch block for ClassCastException.
*  E. None of the above.

ClassCastException is a subclass of RuntimeException,
so it must appear first in any related catch blocks. For this reason, option C is correct.

#### Given the following keywords, in which order could they be used? (Choose two.)
* A. try, finally
* B. catch, try, finally
* C. try, catch, catch, finally
* D. finally, catch, try
* E. try, finally, catch
* F. try, catch, finally, finally

The correct order of blocks is try, catch, and finally.
For a traditional try/catch block at least one catch or finally must be used.
In addition, multiple catch blocks are allowed,
although at most one finally block is allowed.
For these reasons, options A and C are correct, and the rest are incorrect.
